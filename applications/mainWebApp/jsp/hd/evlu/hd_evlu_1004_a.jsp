<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_1004_ADataSet ds = (HD_EVLU_1004_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	try {
		int msgData = rx.add(resData, "msgData", "");
		rx.add(msgData, "rsltcode", "");
		rx.add(msgData, "rsltmsg", "success");
	}
	catch (Exception e) {
		int msgData = rx.add(resData, "msgData", "");
		rx.add(msgData, "rsltcode", ds.errcode);
		rx.add(msgData, "rsltmsg", ds.errmsg);
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Mar 25 10:18:34 KST 2009 */ %>