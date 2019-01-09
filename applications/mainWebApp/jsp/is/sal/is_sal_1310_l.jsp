<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1310_LDataSet ds = (IS_SAL_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData1", "");
	
	try {
		/****** CURLIST BEGIN */
		for(int i=0; i<ds.curlist.size(); i++){  
			IS_SAL_1310_LCURLISTRecord rec = (IS_SAL_1310_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData, "record" , "");
			rx.add ( record, "basi_dt", rec.basi_dt );
			rx.add ( record, "mang_frdt", rec.mang_frdt );
			rx.add ( record, "mang_todt", rec.mang_todt ); 
			rx.add ( record, "clos_proc_dt", rec.clos_proc_dt );
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
