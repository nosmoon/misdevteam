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
	HD_VACA_1506_MDataSet ds = (HD_VACA_1506_MDataSet)request.getAttribute("ds");
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
		rx.add(dataSet, "xx_qq_month_010", ds.getXx_qq_month_010());
		rx.add(dataSet, "xx_qq_month_020", ds.getXx_qq_month_020());
		rx.add(dataSet, "xx_qq_month_030", ds.getXx_qq_month_030());
		rx.add(dataSet, "xx_qq_month_040", ds.getXx_qq_month_040());
		rx.add(dataSet, "xx_qq_day_010", ds.getXx_qq_day_010());
		rx.add(dataSet, "xx_qq_day_020", ds.getXx_qq_day_020());
		rx.add(dataSet, "xx_qq_day_030", ds.getXx_qq_day_030());
		rx.add(dataSet, "xx_qq_day_040", ds.getXx_qq_day_040());
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

<% /* 작성시간 : Fri Feb 03 10:15:11 KST 2012 */ %>