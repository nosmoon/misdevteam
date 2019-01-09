<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1306_MDataSet ds = (HD_VACA_1306_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_pr_job_clsf_23", ds.getXx_pr_job_clsf_23());
		rx.add(dataSet, "xx_annc_clsf", ds.getXx_annc_clsf());
		rx.add(dataSet, "xx_proc_stat", ds.getXx_proc_stat());
		rx.add(dataSet, "xx_dept_cd_head", ds.getXx_dept_cd_head());
		rx.add(dataSet, "xx_qq_month_010", ds.getXx_qq_month_010());
		rx.add(dataSet, "xx_qq_month_020", ds.getXx_qq_month_020());
		rx.add(dataSet, "xx_qq_month_030", ds.getXx_qq_month_030());
		rx.add(dataSet, "xx_qq_month_040", ds.getXx_qq_month_040());
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

<% /* 작성시간 : Thu Feb 02 18:53:11 KST 2012 */ %>