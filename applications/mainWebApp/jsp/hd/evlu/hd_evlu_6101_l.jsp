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
	HD_EVLU_6101_LDataSet ds = (HD_EVLU_6101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	int tms1_done_cnt = rx.add(dataSet, "tms1_done_cnt", ds.tms1_done_cnt);
	int tms1_doing_cnt = rx.add(dataSet, "tms1_doing_cnt", ds.tms1_doing_cnt);
	int tms2_done_cnt = rx.add(dataSet, "tms2_done_cnt", ds.tms2_done_cnt);
	int tms2_doing_cnt = rx.add(dataSet, "tms2_doing_cnt", ds.tms2_doing_cnt);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_6101_LCURLISTRecord rec = (HD_EVLU_6101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "tms1_dept_nm", rec.tms1_dept_nm);
			rx.add(record, "tms1_emp_no", rec.tms1_emp_no);
			rx.add(record, "tms1_nm_korn", rec.tms1_nm_korn);
			rx.add(record, "tms1_dty_nm", rec.tms1_dty_nm);
			rx.add(record, "tms2_dept_nm", rec.tms2_dept_nm);
			rx.add(record, "tms2_emp_no", rec.tms2_emp_no);
			rx.add(record, "tms2_nm_korn", rec.tms2_nm_korn);
			rx.add(record, "tms2_dty_nm", rec.tms2_dty_nm);
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

<% /* 작성시간 : Mon Jun 08 21:40:52 KST 2009 */ %>