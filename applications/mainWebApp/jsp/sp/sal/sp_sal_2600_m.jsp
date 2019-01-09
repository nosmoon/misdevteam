<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_2600_MDataSet ds = (SP_SAL_2600_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	try {
		
		formData			= rx.add(root		, "comboSet"		, "");
		recordSet			= rx.add(formData	, "cs_teamlist"		, "");

		/****** CS_TEAMLIST BEGIN */
		for(int i = 0; i < ds.cs_teamlist.size(); i++) {
			SP_SAL_2600_MCS_TEAMLISTRecord rec = (SP_SAL_2600_MCS_TEAMLISTRecord)ds.cs_teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		/****** CS_TEAMLIST END */
		
		
		
		/****** CS_PARTLIST BEGIN */
		recordSet			= rx.add(formData	, "cs_partlist"		, "");
		for(int i = 0; i < ds.cs_partlist.size(); i++) {
			SP_SAL_2600_MCS_PARTLISTRecord rec = (SP_SAL_2600_MCS_PARTLISTRecord)ds.cs_partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** CS_PARTLIST END */
		

		/****** CS_AREALIST BEGIN */
		recordSet			= rx.add(formData	, "cs_arealist"		, "");
		for(int i = 0; i < ds.cs_arealist.size(); i++) {
			SP_SAL_2600_MCS_AREALISTRecord rec = (SP_SAL_2600_MCS_AREALISTRecord)ds.cs_arealist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
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
