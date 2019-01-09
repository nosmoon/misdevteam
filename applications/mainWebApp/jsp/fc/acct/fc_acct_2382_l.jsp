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
	FC_ACCT_2382_LDataSet ds = (FC_ACCT_2382_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2382_LCURLISTRecord rec = (FC_ACCT_2382_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "drcr_clsf", rec.drcr_clsf);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "setoff_slip_occr_dt", rec.setoff_slip_occr_dt);
			rx.add(record, "setoff_slip_clsf_cd", rec.setoff_slip_clsf_cd);
			rx.add(record, "setoff_slip_seq", rec.setoff_slip_seq);
			rx.add(record, "setoff_slip_sub_seq", rec.setoff_slip_sub_seq);
			rx.add(record, "setoff_slip_arow_no", rec.setoff_slip_arow_no);
			rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			rx.add(record, "obj_acct_nm", rec.obj_acct_nm);
			rx.add(record, "obj_dt", rec.obj_dt);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "etc_in", rec.etc_in);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
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
			<slip_arow_no/>
			<budg_cd/>
			<budg_nm/>
			<drcr_clsf/>
			<dr_amt/>
			<crdt_amt/>
			<intg_dlco_cd/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
			<boks_dlco_nm/>
			<mang_clsf_cd/>
			<mang_no/>
			<incm_clsf_cd/>
			<medi_cd/>
			<comp_dt/>
			<mtry_dt/>
			<unit/>
			<qunt/>
			<tax_stmt_no/>
			<setoff_slip_occr_dt/>
			<setoff_slip_clsf_cd/>
			<setoff_slip_seq/>
			<setoff_slip_sub_seq/>
			<setoff_slip_arow_no/>
			<obj_acct_cd/>
			<obj_acct_nm/>
			<obj_dt/>
			<obj_amt/>
			<rmks1/>
			<rmks2/>
			<etc_in/>
			<use_dept_cd/>
			<use_dept_nm/>
			<prop_equip_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 25 14:09:14 KST 2009 */ %>