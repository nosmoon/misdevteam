<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_3332_MDataSet ds = (HD_SALY_3332_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_saly_no_010", ds.getXx_saly_no_010());
		rx.add(dataSet, "xx_saly_no_020", ds.getXx_saly_no_020());
		rx.add(dataSet, "xx_proc_clsf_010", ds.getXx_proc_clsf_010());
		rx.add(dataSet, "xx_proc_clsf_020", ds.getXx_proc_clsf_020());
		rx.add(dataSet, "xx_proc_clsf_030", ds.getXx_proc_clsf_030());
		rx.add(dataSet, "xx_emp_no_010", ds.getXx_emp_no_010());
		rx.add(dataSet, "xx_salary_dt", ds.getXx_salary_dt());
		rx.add(dataSet, "xx_pgm_path", ds.getXx_pgm_path());
		rx.add(dataSet, "xx_pgm_path_020", ds.getXx_pgm_path_020());
		rx.add(dataSet, "xx_pgm_path_030", ds.getXx_pgm_path_030());
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

<% /* �ۼ��ð� : Thu Feb 09 10:37:37 KST 2012 */ %>