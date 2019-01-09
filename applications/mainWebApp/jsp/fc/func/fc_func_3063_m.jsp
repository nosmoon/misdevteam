<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_3063_MDataSet ds = (FC_FUNC_3063_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_newsp_rate_cash", ds.getXx_newsp_rate_cash());
		rx.add(dataSet, "xx_newsp_rate_90", ds.getXx_newsp_rate_90());
		rx.add(dataSet, "xx_newsp_rate_120", ds.getXx_newsp_rate_120());
		rx.add(dataSet, "xx_newsp_rate_125", ds.getXx_newsp_rate_125());
		rx.add(dataSet, "xx_publis_rate_cash", ds.getXx_publis_rate_cash());
		rx.add(dataSet, "xx_publis_rate_90", ds.getXx_publis_rate_90());
		rx.add(dataSet, "xx_publis_rate_120", ds.getXx_publis_rate_120());
		rx.add(dataSet, "xx_publis_rate_125", ds.getXx_publis_rate_125());
		rx.add(dataSet, "xx_newsp_sale_dd", ds.getXx_newsp_sale_dd());
		rx.add(dataSet, "xx_publis_sale_dd", ds.getXx_publis_sale_dd());
		rx.add(dataSet, "xx_lent_proceeds_dd", ds.getXx_lent_proceeds_dd());
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

<% /* 작성시간 : Thu Jan 05 14:12:55 KST 2012 */ %>