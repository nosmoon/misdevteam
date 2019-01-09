<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1101_MDataSet ds = (HD_DUTY_1101_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_emp_no_010", ds.getXx_emp_no_010());
		rx.add(dataSet, "xx_duty_proc_stat_010", ds.getXx_duty_proc_stat_010());
		rx.add(dataSet, "xx_duty_proc_stat_020", ds.getXx_duty_proc_stat_020());
		rx.add(dataSet, "xx_finish_dd_clsf_010", ds.getXx_finish_dd_clsf_010());
		rx.add(dataSet, "xx_finish_dd_clsf_020", ds.getXx_finish_dd_clsf_020());
		rx.add(dataSet, "xx_pr_job_clsf_20", ds.getXx_pr_job_clsf_20());
		rx.add(dataSet, "xx_annc_clsf", ds.getXx_annc_clsf());
		
		/****** XX_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_CD_LIST", "");

		for(int i = 0; i < ds.xx_cd_list.size(); i++) {
			HD_DUTY_1101_MXX_CD_LISTRecord rec = (HD_DUTY_1101_MXX_CD_LISTRecord)ds.xx_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_cd_list.size());
		/****** XX_CD_LIST END */
		
		/****** XX_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "HODY_LIST", "");

		for(int i = 0; i < ds.hody_list.size(); i++) {
			HD_DUTY_1101_MHODY_LISTRecord rec = (HD_DUTY_1101_MHODY_LISTRecord)ds.hody_list.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		/****** XX_CD_LIST END */
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

<% /* 작성시간 : Mon Jan 30 17:58:58 KST 2012 */ %>