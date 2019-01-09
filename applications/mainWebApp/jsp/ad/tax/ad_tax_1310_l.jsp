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
	AD_TAX_1310_LDataSet ds = (AD_TAX_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData1", "");

	try {

		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_1310_LCURLISTRecord rec = (AD_TAX_1310_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData, "record" , "");
			rx.add ( record, "basi_dt", rec.basi_dt );
			rx.add ( record, "mang_frdt", rec.mang_frdt );
			rx.add ( record, "mang_todt", rec.mang_todt ); 
			rx.add ( record, "clos_proc_dt", rec.clos_proc_dt );
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>