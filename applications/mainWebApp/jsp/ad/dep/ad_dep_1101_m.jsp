<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_1101_MDataSet ds = (AD_DEP_1101_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		int cb_medi_clsf = rx.add( tempData , "cb_medi_clsf" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_DEP_1101_MCURLISTRecord rec = (AD_DEP_1101_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( cb_medi_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm);
			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
