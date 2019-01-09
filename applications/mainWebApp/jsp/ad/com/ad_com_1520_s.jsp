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
	AD_COM_1520_SDataSet ds = (AD_COM_1520_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resForm = rx.add(root, "resForm", "");
	try {
	
		rx.add(resForm, "yyyy", ds.yyyy);
		rx.add(resForm, "seq", ds.seq);
		rx.add(resForm, "rcv_plac", ds.rcv_plac);
		rx.add(resForm, "zip1", ds.zip1);
		rx.add(resForm, "zip2", ds.zip2);
		rx.add(resForm, "addr", ds.addr);
		rx.add(resForm, "dtls_addr", ds.dtls_addr);
		rx.add(resForm, "tel_no", ds.tel_no);
		rx.add(resForm, "fax_no", ds.fax_no);
		rx.add(resForm, "send_plac", ds.send_plac);
		rx.add(resForm, "titl", ds.titl);
		rx.add(resForm, "cont", ds.cont);
		rx.add(resForm, "flag", "");
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
