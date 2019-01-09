<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1024_SDataSet ds = (FC_ACCT_1024_SDataSet)request.getAttribute("ds");
	
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	int acctData = 0;
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	tempData = rx.add(root, "tempData", "");

	rx.add(tempData, "insd_acct_cd", ds.new_acct_cd);
	
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>

<% /* 작성시간 : Fri Jun 13 16:35:20 KST 2014 */ %>