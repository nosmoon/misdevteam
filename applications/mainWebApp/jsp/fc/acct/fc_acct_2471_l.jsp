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
	FC_ACCT_2471_LDataSet ds = (FC_ACCT_2471_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2471_LCURLISTRecord rec = (FC_ACCT_2471_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "x", rec.x);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.addCData(record, "rmks1", rec.rmks1);
			rx.addCData(record, "rmks2", rec.rmks2);
			rx.addCData(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "clam_dept_nm", rec.clam_dept_nm);
			rx.add(record, "chrg_emp_no", rec.chrg_emp_no);
			rx.add(record, "chrg_emp_nm", rec.chrg_emp_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "fisc_seq", rec.fisc_seq);
			rx.addCData(record, "dtls_medi_cdnm", rec.dtls_medi_cdnm);
			rx.add(record, "chnl_clsf_cd", rec.chnl_clsf_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			
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
			<x/>
			<slip_arow_no/>
			<budg_cd/>
			<budg_nm/>
			<dr_amt/>
			<crdt_amt/>
			<rmks1/>
			<rmks2/>
			<boks_dlco_nm/>
			<use_dept_cd/>
			<prop_equip_cd/>
			<medi_cd/>
			<medi_nm/>
			<dtls_medi_cd/>
			<budg_yymm/>
			<clam_dept_cd/>
			<clam_dept_nm/>
			<chrg_emp_no/>
			<chrg_emp_nm/>
			<dept_nm/>
			<fisc_dt/>
			<incmg_dt/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<fisc_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Feb 23 20:00:07 KST 2009 */ %>