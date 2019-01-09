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
	HD_INFO_1084_MDataSet ds = (HD_INFO_1084_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_cd_030", ds.getXx_cd_030());
		rx.add(dataSet, "xx_cd_040", ds.getXx_cd_040());
		rx.add(dataSet, "xx_cd_050", ds.getXx_cd_050());
		rx.add(dataSet, "xx_cd_060", ds.getXx_cd_060());
		rx.add(dataSet, "xx_cd_070", ds.getXx_cd_070());
		rx.add(dataSet, "xx_cd_080", ds.getXx_cd_080());
		rx.add(dataSet, "xx_cd_090", ds.getXx_cd_090());
		rx.add(dataSet, "xx_cd_100", ds.getXx_cd_100());
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

<% /* 작성시간 : Thu Jan 19 17:52:55 KST 2012 */ %>