<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2581_LDataSet ds = (FC_ACCT_2581_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2581_LCURLIST2Record rec = (FC_ACCT_2581_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			//rx.add(record, "incmg_emp_no", rec.incmg_emp_no);
			//rx.add(record, "incmg_emp_nm", rec.incmg_emp_nm);
			//rx.add(record, "rmks1", rec.rmks1);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_nm", rec.budg_nm);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "mang_clsf_nm", rec.mang_clsf_nm);
			//rx.add(record, "drcr_clsf", rec.drcr_clsf);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			rx.add(record, "incmg_emp_no", StringUtil.replaceToXml(rec.incmg_emp_no));
			rx.add(record, "incmg_emp_nm", StringUtil.replaceToXml(rec.incmg_emp_nm));
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			rx.add(record, "mang_clsf_nm", StringUtil.replaceToXml(rec.mang_clsf_nm));
			rx.add(record, "drcr_clsf", StringUtil.replaceToXml(rec.drcr_clsf));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2581_LCURLIST1Record rec = (FC_ACCT_2581_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			rx.add(record, "mang_clsf_cdnm", rec.mang_clsf_cdnm);
			rx.add(record, "prvdd_bal", rec.prvdd_bal);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "curdd_bal", rec.curdd_bal);
			rx.add(record, "withdraw", rec.withdraw);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "incmg_dt", StringUtil.replaceToXml(rec.incmg_dt));
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
			//rx.add(record, "mang_clsf_cdnm", StringUtil.replaceToXml(rec.mang_clsf_cdnm));
			//rx.add(record, "prvdd_bal", StringUtil.replaceToXml(rec.prvdd_bal));
			//rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			//rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			//rx.add(record, "curdd_bal", StringUtil.replaceToXml(rec.curdd_bal));
			//rx.add(record, "withdraw", StringUtil.replaceToXml(rec.withdraw));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_acct_2581_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<incmg_emp_no/>
				<incmg_emp_nm/>
				<rmks1/>
				<budg_cd/>
				<budg_nm/>
				<mang_clsf_cd/>
				<mang_clsf_nm/>
				<drcr_clsf/>
				<dr_amt/>
				<crdt_amt/>
				<boks_dlco_nm/>
				<rmks2/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2581_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2581_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<incmg_dt/>
				<acct_cd/>
				<mang_clsf_cd/>
				<mang_clsf_cdnm/>
				<prvdd_bal/>
				<dr_amt/>
				<crdt_amt/>
				<curdd_bal/>
				<withdraw/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2581_l>
*/
%>

<% /* 작성시간 : Tue Aug 11 16:06:45 KST 2009 */ %>