<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.ddemp.rec.*
	,	chosun.ciis.hd.ddemp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DDEMP_1107_MDataSet ds = (HD_DDEMP_1107_MDataSet)request.getAttribute("ds");
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
		rx.add(dataSet, "xx_job_clsf_00", ds.getXx_job_clsf_00());
		rx.add(dataSet, "xx_cd_clsf_010", ds.getXx_cd_clsf_010());
		rx.add(dataSet, "xx_cd_clsf_020", ds.getXx_cd_clsf_020());
		rx.add(dataSet, "xx_job_clsf_03", ds.getXx_job_clsf_03());
		rx.add(dataSet, "xx_cd_clsf_030", ds.getXx_cd_clsf_030());
		rx.add(dataSet, "xx_medi_cd_010", ds.getXx_medi_cd_010());
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

<% /* 작성시간 : Mon Feb 13 14:00:37 KST 2012 */ %>