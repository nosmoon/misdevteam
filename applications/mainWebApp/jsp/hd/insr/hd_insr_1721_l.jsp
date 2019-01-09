<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml(); 
	HD_INSR_1721_LDataSet ds = (HD_INSR_1721_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String emp_no = ds.emp_no;
	String nm_korn = ds.nm_korn;
	String dept_nm = ds.dept_nm;
	String dty_nm = ds.dty_nm;
	String posi_nm = ds.posi_nm;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "emp_no", emp_no);
		rx.add(dataSet, "nm_korn", nm_korn); 
		rx.add(dataSet, "dept_nm", dept_nm); 
		rx.add(dataSet, "dty_nm", dty_nm); 
		rx.add(dataSet, "posi_nm", posi_nm);
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

<% /* 작성시간 : Tue May 19 15:16:25 KST 2009 */ %>