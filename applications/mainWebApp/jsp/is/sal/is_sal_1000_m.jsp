<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.sal.rec.*
	,	chosun.ciis.is.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SAL_1000_MDataSet ds = (IS_SAL_1000_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	try {
		/****** TEAMLIST BEGIN */
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "teamlist"		, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_SAL_1000_MTEAMLISTRecord rec = (IS_SAL_1000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		/****** TEAMLIST END */
	
		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "partlist_temp"		, "");

		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_SAL_1000_MPARTLISTRecord rec = (IS_SAL_1000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** PARTLIST END */	
	
		/****** CURLIST1 BEGIN(증빙유형) */
		recordSet			= rx.add(formData	, "curlist"			, "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SAL_1000_MCURLIST1Record rec = (IS_SAL_1000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST1 END */	
	
		/****** CURLIST2 BEGIN(재발생사유) */
		recordSet			= rx.add(formData	, "curlist2"			, "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			IS_SAL_1000_MCURLIST2Record rec = (IS_SAL_1000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST2 END */
	
		/****** CURLIST3 BEGIN(전자세금계산서업체) */
		recordSet			= rx.add(formData	, "curlist3"			, "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			IS_SAL_1000_MCURLIST3Record rec = (IS_SAL_1000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST3 END */
	
		/****** CURLIST4 BEGIN(사업장코드) */
		recordSet			= rx.add(formData	, "curlist4"			, "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			IS_SAL_1000_MCURLIST4Record rec = (IS_SAL_1000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST4 END */

		/****** CURLIST5 BEGIN(전표구분) */
		recordSet			= rx.add(formData	, "curlist5"			, "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			IS_SAL_1000_MCURLIST5Record rec = (IS_SAL_1000_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST5 END */
		

		/****** CURLIST1 BEGIN(수금통장) */
		recordSet			= rx.add(formData	, "curlist8"			, "");

		
		for(int i = 0; i < ds.curlist6.size(); i++) {
			IS_SAL_1000_MCURLIST6Record rec = (IS_SAL_1000_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.addCData(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
	
		}
		/****** CURLIST1 END */	
		
		
		
		/****** CURLIST4 BEGIN(탭2.사업장코드) */
		recordSet			= rx.add(formData	, "curlist6"			, "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			IS_SAL_1000_MCURLIST4Record rec = (IS_SAL_1000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST4 END */
		
		/****** CURLIST1 BEGIN(탭2.증빙유형) */
		recordSet			= rx.add(formData	, "curlist7"			, "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SAL_1000_MCURLIST1Record rec = (IS_SAL_1000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		/****** CURLIST1 END */			


		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
