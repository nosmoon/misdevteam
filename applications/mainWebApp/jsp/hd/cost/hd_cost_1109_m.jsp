<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1109_MDataSet ds = (HD_COST_1109_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_clsf_010", ds.getXx_proc_clsf_010());
		rx.add(dataSet, "xx_proc_clsf_020", ds.getXx_proc_clsf_020());
		rx.add(dataSet, "xx_proc_clsf_030", ds.getXx_proc_clsf_030());
		rx.add(dataSet, "xx_proc_clsf_040", ds.getXx_proc_clsf_040());
		rx.add(dataSet, "xx_proc_clsf_050", ds.getXx_proc_clsf_050());
		rx.add(dataSet, "xx_proc_clsf_060", ds.getXx_proc_clsf_060());
		rx.add(dataSet, "xx_proc_clsf_070", ds.getXx_proc_clsf_070());
		rx.add(dataSet, "xx_proc_clsf_080", ds.getXx_proc_clsf_080());
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

<% /* 작성시간 : Thu Feb 09 19:48:08 KST 2012 */ %>