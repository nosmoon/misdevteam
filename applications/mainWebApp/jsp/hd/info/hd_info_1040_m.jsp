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
	HD_INFO_1040_MDataSet ds = (HD_INFO_1040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cls_cd_010", ds.getXx_cls_cd_010());
		rx.add(dataSet, "xx_cls_cd_020", ds.getXx_cls_cd_020());
		rx.add(dataSet, "xx_army_clsf_cd_010", ds.getXx_army_clsf_cd_010());
		rx.add(dataSet, "xx_army_clsf_cd_020", ds.getXx_army_clsf_cd_020());
		rx.add(dataSet, "xx_rsv_forc_form_cd", ds.getXx_rsv_forc_form_cd());
		rx.add(dataSet, "xx_job_clsf_01", ds.getXx_job_clsf_01());
		rx.add(dataSet, "xx_clsf_cd_010", ds.getXx_clsf_cd_010());
		rx.add(dataSet, "xx_clsf_cd_020", ds.getXx_clsf_cd_020());
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

<% /* 작성시간 : Thu Jan 19 15:22:58 KST 2012 */ %>