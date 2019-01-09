<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1806_MDataSet ds = (HD_DALON_1806_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_dept_cd", ds.getXx_dept_cd());
		rx.add(dataSet, "xx_dept_nm", ds.getXx_dept_nm());
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020", ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_proc_stat_030", ds.getXx_proc_stat_030());
		rx.add(dataSet, "xx_proc_stat_040", ds.getXx_proc_stat_040());
		rx.add(dataSet, "xx_proc_stat_050", ds.getXx_proc_stat_050());
		rx.add(dataSet, "xx_proc_stat_060", ds.getXx_proc_stat_060());
		rx.add(dataSet, "xx_finish_dd_clsf_010", ds.getXx_finish_dd_clsf_010());
		rx.add(dataSet, "xx_finish_dd_clsf_020", ds.getXx_finish_dd_clsf_020());
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

<% /* 작성시간 : Wed Feb 01 14:29:38 KST 2012 */ %>