<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2031_LDataSet ds = (FC_ACCT_2031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2031_LCURLISTRecord rec = (FC_ACCT_2031_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "chrg_emp_no", rec.chrg_emp_no);
			rx.add(record, "chrg_emp_no_nm", rec.chrg_emp_no_nm);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "clam_amt", rec.clam_amt);
			rx.add(record, "hj_incmg_emp_no", rec.hj_incmg_emp_no);
			rx.add(record, "hj_incmg_emp_no_nm", rec.hj_incmg_emp_no_nm);
			rx.add(record, "hj_slip_aprv_yn", rec.hj_slip_aprv_yn);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "emp_no_nm", rec.emp_no_nm);
			rx.add(record, "emp_dept_cd_nm", rec.emp_dept_cd_nm);
			rx.add(record, "dest", rec.dest);
			rx.add(record, "amt", rec.amt);
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
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<budg_yymm/>
			<clam_dept_cd/>
			<chrg_emp_no/>
			<chrg_emp_no_nm/>
			<rmks/>
			<clam_amt/>
			<hj_incmg_emp_no/>
			<hj_incmg_emp_no_nm/>
			<hj_slip_aprv_yn/>
			<slip_arow_no/>
			<emp_no/>
			<emp_no_nm/>
			<emp_dept_cd_nm/>
			<dest/>
			<amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 06 16:24:45 KST 2009 */ %>