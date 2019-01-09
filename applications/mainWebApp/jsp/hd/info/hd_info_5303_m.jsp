<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5303_MDataSet ds = (HD_INFO_5303_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020", ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_proc_stat_030", ds.getXx_proc_stat_030());
		rx.add(dataSet, "xx_proc_stat2_010", ds.getXx_proc_stat2_010());
		rx.add(dataSet, "xx_proc_stat2_020", ds.getXx_proc_stat2_020());
		rx.add(dataSet, "xx_proc_stat2_030", ds.getXx_proc_stat2_030());
		rx.add(dataSet, "xx_proc_stat2_040", ds.getXx_proc_stat2_040());
		rx.add(dataSet, "xx_proc_stat2_050", ds.getXx_proc_stat2_050());
		rx.add(dataSet, "xx_proc_stat2_060", ds.getXx_proc_stat2_060());
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

<% /* 작성시간 : Wed Jan 25 13:10:51 KST 2012 */ %>