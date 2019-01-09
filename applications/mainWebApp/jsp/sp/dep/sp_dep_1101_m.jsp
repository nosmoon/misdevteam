<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.dep.rec.*
	,	chosun.ciis.sp.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_DEP_1101_MDataSet ds = (SP_DEP_1101_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		int cb_medi_clsf = rx.add( tempData , "cb_medi_clsf" , "");		
		for(int i=0; i<ds.curlist.size(); i++){ 
			SP_DEP_1101_MCURLISTRecord rec = (SP_DEP_1101_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( cb_medi_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm);
			
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>