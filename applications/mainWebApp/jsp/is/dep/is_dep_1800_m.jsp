<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1800_MDataSet ds = (IS_DEP_1800_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	try {
		/****** TEAMLIST BEGIN */
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "teamlist"		, "");
		
		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_DEP_1800_MTEAMLISTRecord rec = (IS_DEP_1800_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		/****** TEAMLIST END */


		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "partlist_temp"		, "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_DEP_1800_MPARTLISTRecord rec = (IS_DEP_1800_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** PARTLIST END */
		
		
		/****** TEAMLIST BEGIN */
		recordSet			= rx.add(formData	, "teamlist2"		, "");
		
		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_DEP_1800_MTEAMLISTRecord rec = (IS_DEP_1800_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		/****** TEAMLIST END */


		/****** PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "partlist2"		, "");
		
		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_DEP_1800_MPARTLISTRecord rec = (IS_DEP_1800_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** PARTLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
