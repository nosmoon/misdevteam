<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dwnwrk.rec.*
	,	chosun.ciis.hd.dwnwrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DWNWRK_1200_LDataSet ds = (HD_DWNWRK_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DWNWRK_1200_LCURLISTRecord rec = (HD_DWNWRK_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "erl_prsnt_bgn_tm", rec.erl_prsnt_bgn_tm);
			rx.add(record, "erl_prsnt_end_tm", rec.erl_prsnt_end_tm);
			rx.add(record, "erl_prsnt_duty_tm", rec.erl_prsnt_duty_tm);
			rx.add(record, "prsnt_tm", rec.prsnt_tm);
			rx.add(record, "finish_tm", rec.finish_tm);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "duty_resn", rec.duty_resn);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "slip_proc_mang_dt", rec.slip_proc_mang_dt);
			rx.add(record, "slip_proc_mang_seq", rec.slip_proc_mang_seq);
			rx.add(record, "db_status", rec.db_status);
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
			<posi_nm/>
			<duty_dt/>
			<erl_prsnt_bgn_tm/>
			<erl_prsnt_end_tm/>
			<erl_prsnt_duty_tm/>
			<prsnt_tm/>
			<finish_tm/>
			<finish_dd_clsf/>
			<duty_resn/>
			<proc_stat/>
			<dept_cd/>
			<slip_proc_mang_dt/>
			<slip_proc_mang_seq/>
			<db_status/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jul 07 09:38:17 KST 2009 */ %>