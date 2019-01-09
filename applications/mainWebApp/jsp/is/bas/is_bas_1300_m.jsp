<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.bas.rec.*
	,	chosun.ciis.is.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_BAS_1300_MDataSet ds = (IS_BAS_1300_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	try {
		/****** CURLIST1 BEGIN(거래처구분) */
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "curlist"			, "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_BAS_1300_MCURLIST1Record rec = (IS_BAS_1300_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN(전자세금계산서업체) */
		recordSet			= rx.add(formData	, "curlist2"			, "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			IS_BAS_1300_MCURLIST2Record rec = (IS_BAS_1300_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST2 END */
		
		/****** CURLIST3 BEGIN(계약상태) */
		recordSet			= rx.add(formData	, "curlist3"			, "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			IS_BAS_1300_MCURLIST3Record rec = (IS_BAS_1300_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST3 END */
		
		/****** CURLIST4 BEGIN(전단물류창고) */
		recordSet			= rx.add(formData	, "curlist4"			, "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			IS_BAS_1300_MCURLIST4Record rec = (IS_BAS_1300_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST4 END */
		
		/****** CURLIST5 BEGIN(사용S/W) */
		recordSet			= rx.add(formData	, "curlist5"			, "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			IS_BAS_1300_MCURLIST5Record rec = (IS_BAS_1300_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST5 END */
		
		/****** CURLIST6 BEGIN(담당업무) */
		recordSet			= rx.add(formData	, "curlist6"			, "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			IS_BAS_1300_MCURLIST6Record rec = (IS_BAS_1300_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST6 END */
		
		/****** CURLIST7 BEGIN(유지보수계약구분) */
		recordSet			= rx.add(formData	, "curlist7"			, "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			IS_BAS_1300_MCURLIST7Record rec = (IS_BAS_1300_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST7 END */
		
		/****** CURLIST8 BEGIN(지로종류) */
		recordSet			= rx.add(formData	, "curlist8"			, "");

		for(int i = 0; i < ds.curlist8.size(); i++) {
			IS_BAS_1300_MCURLIST8Record rec = (IS_BAS_1300_MCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST8 END */
		
		/****** CURLIST9 BEGIN(수금방법) */
		recordSet			= rx.add(formData	, "curlist9"			, "");

		for(int i = 0; i < ds.curlist9.size(); i++) {
			IS_BAS_1300_MCURLIST9Record rec = (IS_BAS_1300_MCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST9 END */
		
		/****** CURLIST10 BEGIN(은행) */
		recordSet			= rx.add(formData	, "curlist10"			, "");

		for(int i = 0; i < ds.curlist10.size(); i++) {
			IS_BAS_1300_MCURLIST10Record rec = (IS_BAS_1300_MCURLIST10Record)ds.curlist10.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST10 END */
		
		/****** CURLIST11 BEGIN(조우회계좌) */
		recordSet			= rx.add(formData	, "curlist11"			, "");

		for(int i = 0; i < ds.curlist11.size(); i++) {
			IS_BAS_1300_MCURLIST11Record rec = (IS_BAS_1300_MCURLIST11Record)ds.curlist11.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** CURLIST11 END */
		
		/****** TEAMLIST BEGIN */
		recordSet			= rx.add(formData	, "teamlist"			, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_BAS_1300_MTEAMLISTRecord rec = (IS_BAS_1300_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		/****** TEAMLIST END */

		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "partlist_temp"		, "");

		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_BAS_1300_MPARTLISTRecord rec = (IS_BAS_1300_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
		}

		/****** CS_TEAMLIST BEGIN */
		recordSet			= rx.add(formData	, "cs_teamlist"			, "");

		for(int i = 0; i < ds.cs_teamlist.size(); i++) {
			IS_BAS_1300_MCS_TEAMLISTRecord rec = (IS_BAS_1300_MCS_TEAMLISTRecord)ds.cs_teamlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		/****** CS_TEAMLIST END */

		/****** CS_PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "cs_partlist"			, "");

		for(int i = 0; i < ds.cs_teamlist.size(); i++) {
			IS_BAS_1300_MCS_PARTLISTRecord rec = (IS_BAS_1300_MCS_PARTLISTRecord)ds.cs_partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
		}
		/****** CS_PARTLIST END */		

		/****** CS_AREALIST BEGIN */
		recordSet			= rx.add(formData	, "cs_arealist"			, "");

		for(int i = 0; i < ds.cs_arealist.size(); i++) {
			IS_BAS_1300_MCS_AREALISTRecord rec = (IS_BAS_1300_MCS_AREALISTRecord)ds.cs_arealist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			//rx.add(record, "area_cd", StringUtil.replaceToXml(rec.area_cd));
			//rx.add(record, "area_nm", StringUtil.replaceToXml(rec.area_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
		}
		/****** CS_AREALIST END */
				
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
