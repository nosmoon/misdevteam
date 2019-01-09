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
	HD_VACA_1706_MDataSet ds = (HD_VACA_1706_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		rx.add(dataSet, "xx_proc_stat_020", ds.getXx_proc_stat_020());
		rx.add(dataSet, "xx_vaca_clsf_010", ds.getXx_vaca_clsf_010());
		rx.add(dataSet, "xx_vaca_clsf_020", ds.getXx_vaca_clsf_020());
		rx.add(dataSet, "xx_vaca_clsf_030", ds.getXx_vaca_clsf_030());
		rx.add(dataSet, "xx_vaca_clsf_040", ds.getXx_vaca_clsf_040());
		rx.add(dataSet, "xx_vaca_clsf_050", ds.getXx_vaca_clsf_050());
		rx.add(dataSet, "xx_vaca_clsf_060", ds.getXx_vaca_clsf_060());
		rx.add(dataSet, "xx_vaca_clsf_070", ds.getXx_vaca_clsf_070());
		rx.add(dataSet, "xx_vaca_clsf_080", ds.getXx_vaca_clsf_080());
		rx.add(dataSet, "xx_vaca_clsf_090", ds.getXx_vaca_clsf_090());
		rx.add(dataSet, "xx_vaca_clsf_100", ds.getXx_vaca_clsf_100());
		rx.add(dataSet, "xx_vaca_clsf_110", ds.getXx_vaca_clsf_110());
		rx.add(dataSet, "xx_vaca_clsf_120", ds.getXx_vaca_clsf_120());
		rx.add(dataSet, "xx_vaca_clsf_130", ds.getXx_vaca_clsf_130());
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_vaca_dtls_clsf_010", ds.getXx_vaca_dtls_clsf_010());
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

<% /* 작성시간 : Fri Feb 03 17:55:06 KST 2012 */ %>