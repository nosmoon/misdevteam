<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3601_LDataSet ds = (HD_EVLU_3601_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int self_done_cnt = rx.add(dataSet, "self_done_cnt", ds.self_done_cnt);
	int self_doing_cnt = rx.add(dataSet, "self_doing_cnt", ds.self_doing_cnt);
	int asst_done_cnt = rx.add(dataSet, "asst_done_cnt", ds.asst_done_cnt);
	int asst_doing_cnt = rx.add(dataSet, "asst_doing_cnt", ds.asst_doing_cnt);
	int tms1_done_cnt = rx.add(dataSet, "tms1_done_cnt", ds.tms1_done_cnt);
	int tms1_doing_cnt = rx.add(dataSet, "tms1_doing_cnt", ds.tms1_doing_cnt);
	int tms2_done_cnt = rx.add(dataSet, "tms2_done_cnt", ds.tms2_done_cnt);
	int tms2_doing_cnt = rx.add(dataSet, "tms2_doing_cnt", ds.tms2_doing_cnt);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_3601_LCURLISTRecord rec = (HD_EVLU_3601_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "email_id", rec.email_id);
			rx.add(record, "asst_dept_nm", rec.asst_dept_nm);
			rx.add(record, "asst_emp_no", rec.asst_emp_no);
			rx.add(record, "asst_nm_korn", rec.asst_nm_korn);
			rx.add(record, "asst_dty_nm", rec.asst_dty_nm);
			rx.add(record, "asst_posi_nm", rec.asst_posi_nm);
			rx.add(record, "asst_ptph_no", rec.asst_ptph_no);
			rx.add(record, "asst_email_id", rec.asst_email_id);
			rx.add(record, "tms1_dept_nm", rec.tms1_dept_nm);
			rx.add(record, "tms1_emp_no", rec.tms1_emp_no);
			rx.add(record, "tms1_nm_korn", rec.tms1_nm_korn);
			rx.add(record, "tms1_dty_nm", rec.tms1_dty_nm);
			rx.add(record, "tms1_posi_nm", rec.tms1_posi_nm);
			rx.add(record, "tms1_ptph_no", rec.tms1_ptph_no);
			rx.add(record, "tms1_email_id", rec.tms1_email_id);
			rx.add(record, "tms2_dept_nm", rec.tms2_dept_nm);
			rx.add(record, "tms2_emp_no", rec.tms2_emp_no);
			rx.add(record, "tms2_nm_korn", rec.tms2_nm_korn);
			rx.add(record, "tms2_dty_nm", rec.tms2_dty_nm);
			rx.add(record, "tms2_posi_nm", rec.tms2_posi_nm);
			rx.add(record, "tms2_ptph_no", rec.tms2_ptph_no);
			rx.add(record, "tms2_email_id", rec.tms2_email_id);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<asst_dept_nm/>
			<asst_emp_no/>
			<asst_nm_korn/>
			<asst_dty_nm/>
			<tms1_dept_nm/>
			<tms1_emp_no/>
			<tms1_nm_korn/>
			<tms1_dty_nm/>
			<tms2_dept_nm/>
			<tms2_emp_no/>
			<tms2_nm_korn/>
			<tms2_dty_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jun 04 14:50:27 KST 2009 */ %>