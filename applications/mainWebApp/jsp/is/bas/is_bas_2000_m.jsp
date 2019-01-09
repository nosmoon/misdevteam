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
	IS_BAS_2000_MDataSet ds = (IS_BAS_2000_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	try {
		/****** �˻����� �޺�_����   */
		/****** TEAMLIST BEGIN */
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "teamlist"			, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_BAS_2000_MTEAMLISTRecord rec = (IS_BAS_2000_MTEAMLISTRecord)ds.teamlist.get(i);
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
			IS_BAS_2000_MPARTLISTRecord rec = (IS_BAS_2000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "supr_dept_cd", StringUtil.replaceToXml(rec.supr_dept_cd));
		}
		/****** �˻����� �޺�_����   */
		
		
		/****** �����ͱ׸��� �޺�_����   */
		/****** TEAMLIST BEGIN */
		recordSet			= rx.add(formData	, "dg_teamlist"			, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_BAS_2000_MTEAMLISTRecord rec = (IS_BAS_2000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		/****** TEAMLIST END */

		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "dg_partlist"		, "");

		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_BAS_2000_MPARTLISTRecord rec = (IS_BAS_2000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** �����ͱ׸��� �޺�_����   */
		
		
		/****** �����ͱ׸���(�ڵ����) �޺�_����   */
		/****** TEAMLIST BEGIN */
		recordSet			= rx.add(formData	, "dg2_teamlist"			, "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_BAS_2000_MTEAMLISTRecord rec = (IS_BAS_2000_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		/****** TEAMLIST END */

		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "dg2_partlist"		, "");

		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_BAS_2000_MPARTLISTRecord rec = (IS_BAS_2000_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** �����ͱ׸���(�ڵ����) �޺�_����   */
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>