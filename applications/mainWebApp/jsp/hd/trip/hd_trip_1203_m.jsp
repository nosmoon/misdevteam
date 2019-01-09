<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.trip.rec.*
	,	chosun.ciis.hd.trip.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_TRIP_1203_MDataSet ds = (HD_TRIP_1203_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_mode_gubun_010",ds.getXx_mode_gubun_010());
		rx.add(dataSet, "xx_mode_gubun_020",ds.getXx_mode_gubun_020());
		rx.add(dataSet, "xx_mode_gubun_030",ds.getXx_mode_gubun_030());
		rx.add(dataSet, "xx_proc_stat_010",ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020",ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_proc_stat_030",ds.getXx_proc_stat_030());
		rx.add(dataSet, "xx_proc_stat_040",ds.getXx_proc_stat_040());
		rx.add(dataSet, "xx_proc_stat_050",ds.getXx_proc_stat_050());
		rx.add(dataSet, "xx_proc_stat_060",ds.getXx_proc_stat_060());
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

<% /* 작성시간 : Mon Feb 06 15:12:32 KST 2012 */ %>