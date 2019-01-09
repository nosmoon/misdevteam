<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.com.rec.*
	,	chosun.ciis.hd.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COM_1110_LDataSet ds = (HD_COM_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		int RESULT_DATA = rx.add(dataSet, "result_data", "");
		rx.add(RESULT_DATA, "dept_cnt", ds.dept_cnt);
		rx.add(RESULT_DATA, "dept_cd", ds.dept_cd);
		rx.add(RESULT_DATA, "dept_nm", ds.dept_nm);
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Fri Apr 29 14:08:58 KST 2011 */ %>