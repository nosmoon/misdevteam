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
	FC_ACCT_3256_LDataSet ds = (FC_ACCT_3256_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** SLIP_LIST BEGIN */
		recordSet = rx.add(dataSet, "slip_list", "");

		for(int i = 0; i < ds.slip_list.size(); i++) {
			FC_ACCT_3256_LSLIP_LISTRecord rec = (FC_ACCT_3256_LSLIP_LISTRecord)ds.slip_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.addCData(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "sum_dr_amt", rec.sum_dr_amt);
			rx.add(record, "sum_crdt_amt", rec.sum_crdt_amt);		
			rx.add(record, "diff_amt", rec.diff_amt);		
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "clam_dept_nm", rec.clam_dept_nm);			
			rx.add(record, "incmg_emp_no", rec.incmg_emp_no);
			rx.add(record, "incmg_emp_nm", rec.incmg_emp_nm); 			
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "setoff_slip_clsf_cd", rec.setoff_slip_clsf_cd);
			rx.add(record, "fisc_seq", rec.fisc_seq);
			rx.add(record, "fisc_no", rec.fisc_no);
			rx.add(record, "reso_amt", rec.reso_amt);
			
			String	slip_aprv_yn = "";
			if("1".equals(rec.slip_aprv_yn)) 		slip_aprv_yn = "미승인";
			else if("2".equals(rec.slip_aprv_yn)) 	slip_aprv_yn = "승인";
			rx.add(record, "slip_aprv_yn", slip_aprv_yn);
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
