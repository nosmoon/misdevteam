<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dwnwrk.rec.*
	,	chosun.ciis.hd.dwnwrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DWNWRK_1105_MDataSet ds = (HD_DWNWRK_1105_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_emp_no_010", ds.getXx_emp_no_010());
		rx.add(dataSet, "xx_pr_job_clsf_22", ds.getXx_pr_job_clsf_22());
		rx.add(dataSet, "xx_annc_clsf", ds.getXx_annc_clsf());
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

<% /* 작성시간 : Thu Feb 02 10:52:16 KST 2012 */ %>