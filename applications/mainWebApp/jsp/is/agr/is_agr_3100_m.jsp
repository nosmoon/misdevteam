<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.agr.rec.*
	,	chosun.ciis.is.agr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_AGR_3100_MDataSet ds = (IS_AGR_3100_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	try {
		/****** TEAMLIST BEGIN */
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "teamlist"		, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_AGR_3100_MTEAMLISTRecord rec = (IS_AGR_3100_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		/****** TEAMLIST END */

		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "partlist_temp"		, "");

		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_AGR_3100_MPARTLISTRecord rec = (IS_AGR_3100_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** PARTLIST END */

		/****** CURLIST1 BEGIN */
		recordSet			= rx.add(formData	, "curlist1"		, "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_AGR_3100_MCURLIST1Record rec = (IS_AGR_3100_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST1 END */

		/****** CURLIST2 BEGIN */
		recordSet			= rx.add(formData	, "curlist2"		, "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			IS_AGR_3100_MCURLIST2Record rec = (IS_AGR_3100_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST2 END */

		/****** CURLIST3 BEGIN */
		recordSet			= rx.add(formData	, "curlist3"		, "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			IS_AGR_3100_MCURLIST3Record rec = (IS_AGR_3100_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST3 END */

		/****** CURLIST4 BEGIN */
		recordSet			= rx.add(formData	, "curlist4"		, "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			IS_AGR_3100_MCURLIST4Record rec = (IS_AGR_3100_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST4 END */

		/****** CURLIST5 BEGIN */
		recordSet			= rx.add(formData	, "curlist5"		, "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			IS_AGR_3100_MCURLIST5Record rec = (IS_AGR_3100_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST5 END */

		/****** plan_chrg_ptph_no BEGIN */
		recordSet			= rx.add(formData	, "plan_chrg_ptph_no"		, "");

		for(int i = 0; i < 1; i++) {
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "plan_chrg_ptph_no", ds.plan_chrg_ptph_no);
		}
		/****** plan_chrg_ptph_no END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>