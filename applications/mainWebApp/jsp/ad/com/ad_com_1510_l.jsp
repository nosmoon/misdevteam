<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.com.rec.*
	,	chosun.ciis.ad.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_COM_1510_LDataSet ds = (AD_COM_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_COM_1510_LCURLISTRecord rec = (AD_COM_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "doc_no", rec.doc_no);
			rx.add(record, "rcv_plac", rec.rcv_plac); 
			rx.add(record, "titl", rec.titl);
			rx.add(record, "make_dt", rec.make_dt); 
			rx.add(record, "make_pers", rec.make_pers); 
			rx.add(record, "yyyy", rec.yyyy);
			rx.add(record, "seq", rec.seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
