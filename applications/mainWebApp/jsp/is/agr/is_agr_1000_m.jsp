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
	IS_AGR_1000_MDataSet ds = (IS_AGR_1000_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	try {
		

		/****** CURLIST1 BEGIN(��������) */
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "curlist"			, "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_AGR_1000_MCURLIST1Record rec = (IS_AGR_1000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST1 END */

		/****** CURLIST2 BEGIN(���ⱸ��) */
		recordSet			= rx.add(formData	, "curlist2"			, "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			IS_AGR_1000_MCURLIST2Record rec = (IS_AGR_1000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST2 END */

		/****** CURLIST3 BEGIN(Ư�����ⱸ��) */
		recordSet			= rx.add(formData	, "curlist3"			, "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			IS_AGR_1000_MCURLIST3Record rec = (IS_AGR_1000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST3 END */

		/****** CURLIST4 BEGIN(������������) */
		recordSet			= rx.add(formData	, "curlist4"			, "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			IS_AGR_1000_MCURLIST4Record rec = (IS_AGR_1000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST4 END */

		/****** CURLIST5 BEGIN(�ΰ�������) */
		recordSet			= rx.add(formData	, "curlist5"			, "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			IS_AGR_1000_MCURLIST5Record rec = (IS_AGR_1000_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST5 END */

		/****** CURLIST6 BEGIN(���ݱ���) */
		recordSet			= rx.add(formData	, "curlist6"			, "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			IS_AGR_1000_MCURLIST6Record rec = (IS_AGR_1000_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST6 END */

		/****** CURLIST7 BEGIN(�ܰ�����) */
		recordSet			= rx.add(formData	, "curlist7"			, "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			IS_AGR_1000_MCURLIST7Record rec = (IS_AGR_1000_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST7 END */

		/****** TEAMLIST BEGIN(��1.���) */
		recordSet			= rx.add(formData	, "teamlist"			, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_AGR_1000_MTEAMLISTRecord rec = (IS_AGR_1000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		/****** TEAMLIST END */
		
		/****** PARTLIST BEGIN(��1.���) */
		recordSet			= rx.add(formData	, "partlist_temp"		, "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_AGR_1000_MPARTLISTRecord rec = (IS_AGR_1000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
		}
		/****** PARTLIST END */
		
		/****** TEAMLIST BEGIN(��2.��Ȳ) */
		recordSet			= rx.add(formData	, "teamlist2"			, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_AGR_1000_MTEAMLISTRecord rec = (IS_AGR_1000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		/****** TEAMLIST END */
		
		/****** PARTLIST BEGIN(��2.���) */
		recordSet			= rx.add(formData	, "partlist_temp2"		, "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_AGR_1000_MPARTLISTRecord rec = (IS_AGR_1000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
		}
		/****** PARTLIST END */
		
		/****** CURLIST1 BEGIN(��2.������Ȳ) */
		recordSet			= rx.add(formData	, "curlist11"			, "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_AGR_1000_MCURLIST1Record rec = (IS_AGR_1000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST1 END */

		/****** CURLIST2 BEGIN(���ⱸ��) */
		recordSet			= rx.add(formData	, "curlist12"			, "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			IS_AGR_1000_MCURLIST2Record rec = (IS_AGR_1000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST2 END */

		/****** CURLIST3 BEGIN(Ư�����ⱸ��) */
		recordSet			= rx.add(formData	, "curlist13"			, "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			IS_AGR_1000_MCURLIST3Record rec = (IS_AGR_1000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST3 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
