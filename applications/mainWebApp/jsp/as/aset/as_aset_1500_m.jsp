<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1500_MDataSet ds = (AS_ASET_1500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_budg_cd", ds.getXx_budg_cd());
		rx.add(dataSet, "xx_budg_nm", ds.getXx_budg_nm());
		rx.add(dataSet, "xx_mang_cd_4", ds.getXx_mang_cd_4());
		rx.add(dataSet, "xx_job_clsf_02", ds.getXx_job_clsf_02());
		rx.add(dataSet, "xx_cd_clsf", ds.getXx_cd_clsf());
		rx.add(dataSet, "xx_occr_slip_clsf", ds.getXx_occr_slip_clsf());
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

<% /* �ۼ��ð� : Mon Feb 27 10:18:44 KST 2012 */ %>