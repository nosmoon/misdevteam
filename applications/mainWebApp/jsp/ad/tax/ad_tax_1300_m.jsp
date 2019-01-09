<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_TAX_1300_MDataSet ds = (AD_TAX_1300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	try {
		
		int work_clsf = rx.add( tempData , "work_clsf" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_TAX_1300_MCURLISTRecord rec = (AD_TAX_1300_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( work_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd_abrv_nm);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>