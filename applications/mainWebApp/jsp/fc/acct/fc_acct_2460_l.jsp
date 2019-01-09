<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,  chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2460_LDataSet ds = (FC_ACCT_2460_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int gridData = 0;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** SLIP_LIST BEGIN */
		recordSet = rx.add(dataSet, "SLIP_LIST", "");

		for(int i = 0; i < ds.slip_list.size(); i++) {
			FC_ACCT_2460_LSLIP_LISTRecord rec = (FC_ACCT_2460_LSLIP_LISTRecord)ds.slip_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "clam_dept_nm", rec.clam_dept_nm);
			rx.add(record, "clam_dept_cdnm", rec.clam_dept_cdnm);
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "incmg_emp_no", rec.incmg_emp_no);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "incmg_emp_nm", rec.incmg_emp_nm);
			rx.add(record, "incmg_emp_nonm", rec.incmg_emp_nonm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "setoff_slip_clsf_cd", rec.setoff_slip_clsf_cd);
			rx.add(record, "fisc_seq", rec.fisc_seq);
			rx.add(record, "fisc_no", rec.fisc_no);
			rx.add(record, "sum_dr_amt", rec.sum_dr_amt);
			rx.add(record, "sum_crdt_amt", rec.sum_crdt_amt);
			rx.add(record, "reso_amt", rec.reso_amt);
		}
		rx.add(recordSet, "totalcnt", ds.slip_list.size());
		/****** SLIP_LIST END */

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
	<SLIP_LIST>
		<record>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_no/>
			<clam_dept_cd/>
			<clam_dept_nm/>
			<clam_dept_cdnm/>
			<rmks1/>
			<incmg_emp_no/>
			<fisc_dt/>
			<incmg_emp_nm/>
			<incmg_emp_nonm/>
			<incmg_dt/>
			<setoff_slip_clsf_cd/>
			<fisc_seq/>
			<fisc_no/>
			<sum_dr_amt/>
			<sum_crdt_amt/>
			<reso_amt/>
		</record>
	</SLIP_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 20 11:04:25 KST 2009 */ %>
