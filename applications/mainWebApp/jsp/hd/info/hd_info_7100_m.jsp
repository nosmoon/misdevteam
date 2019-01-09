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
	HD_INFO_7100_MDataSet ds = (HD_INFO_7100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int recordSet2 = 0;
	int comboSet = 0;
	int initData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "chrg_posk", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_7100_MCURLIST1Record rec = (HD_INFO_7100_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		/****** CURLIST1 END */
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "curlist2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INFO_7100_MCURLIST2Record rec = (HD_INFO_7100_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST1 END */
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "supr_dept_cd", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INFO_7100_MCURLIST3Record rec = (HD_INFO_7100_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
			rx.add(record, "pcode", "");
		}
		/****** CURLIST3 END */
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "dept_cd", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_INFO_7100_MCURLIST4Record rec = (HD_INFO_7100_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
			rx.add(record, "pcode", rec.mang_cd);
		}
		/****** CURLIST4 END */
		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "medi_cd", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_INFO_7100_MCURLIST5Record rec = (HD_INFO_7100_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
		}
		/****** CURLIST5 END */
		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd", "");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_INFO_7100_MCURLIST6Record rec = (HD_INFO_7100_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
			rx.add(record, "pcode", rec.mang_cd);
		}
		/****** CURLIST6 END */			
		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "incm_clsf_cd", "");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_INFO_7100_MCURLIST7Record rec = (HD_INFO_7100_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.addCData(record, "label", rec.cdnm);
		}
		/****** CURLIST7 END */			
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

<% /* 작성시간 : Wed Jan 18 11:34:16 KST 2012 */ %>