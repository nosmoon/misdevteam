<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.job.rec.*
	,	chosun.ciis.co.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_JOB_3030_SDataSet ds = (CO_JOB_3030_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resForm = rx.add( root , "resForm" , "");

	try {
		rx.add(resForm, "titl", StringUtil.replaceToXml(ds.titl));
		rx.add(resForm, "cont", ds.cont);
		rx.add(resForm, "seq", ds.seq);
		rx.add(resForm, "eis_fix", ds.eis_fix);
		rx.add(resForm, "sys_clsf", ds.sys_clsf);
	}
	catch (Exception e) {
	}  
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>