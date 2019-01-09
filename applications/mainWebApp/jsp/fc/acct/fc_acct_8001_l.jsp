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
	FC_ACCT_8001_LDataSet ds = (FC_ACCT_8001_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_8001_LCURLIST2Record rec = (FC_ACCT_8001_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "diff_amt", rec.diff_amt);
			rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_8001_LCURLISTRecord rec = (FC_ACCT_8001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			//rx.add(record, "slip", rec.slip);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			//rx.add(record, "pay_tot_amt", rec.pay_tot_amt);
			//rx.add(record, "need_cost", rec.need_cost);
			//rx.add(record, "incm_amt", rec.incm_amt);
			//rx.add(record, "rate", rec.rate);
			//rx.add(record, "incm_tax", rec.incm_tax);
			//rx.add(record, "res_tax", rec.res_tax);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "incm_pers", rec.incm_pers);
			//rx.add(record, "incm_pers_prn", rec.incm_pers_prn);
			//rx.add(record, "incm_pers_addr", rec.incm_pers_addr);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "setoff_slip_occr_dt", rec.setoff_slip_occr_dt);
			//rx.add(record, "setoff_slip_clsf_cd", rec.setoff_slip_clsf_cd);
			//rx.add(record, "setoff_slip_seq", rec.setoff_slip_seq);
			//rx.add(record, "setoff_slip_sub_seq", rec.setoff_slip_sub_seq);
			//rx.add(record, "setoff_slip_arow_no", rec.setoff_slip_arow_no);
			//rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			rx.add(record, "slip", StringUtil.replaceToXml(rec.slip));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			rx.add(record, "pay_tot_amt", StringUtil.replaceToXml(rec.pay_tot_amt));
			rx.add(record, "need_cost", StringUtil.replaceToXml(rec.need_cost));
			rx.add(record, "incm_amt", StringUtil.replaceToXml(rec.incm_amt));
			rx.add(record, "rate", rec.rate);
			//rx.add(record, "rate", StringUtil.replaceToXml(rec.rate));
			rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "incm_pers", StringUtil.replaceToXml(rec.incm_pers));
			rx.add(record, "incm_pers_prn", StringUtil.replaceToXml(rec.incm_pers_prn));
			rx.add(record, "incm_pers_addr", StringUtil.replaceToXml(rec.incm_pers_addr));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "setoff_slip_occr_dt", StringUtil.replaceToXml(rec.setoff_slip_occr_dt));
			rx.add(record, "setoff_slip_clsf_cd", StringUtil.replaceToXml(rec.setoff_slip_clsf_cd));
			rx.add(record, "setoff_slip_seq", StringUtil.replaceToXml(rec.setoff_slip_seq));
			rx.add(record, "setoff_slip_sub_seq", StringUtil.replaceToXml(rec.setoff_slip_sub_seq));
			rx.add(record, "setoff_slip_arow_no", StringUtil.replaceToXml(rec.setoff_slip_arow_no));
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
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
<fc_acct_8001_l>
	<dataSet>
		<CURLIST2>
			<record>
				<diff_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_8001_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_8001_l>
	<dataSet>
		<CURLIST>
			<record>
				<incm_clsf_cd/>
				<slip/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<pay_tot_amt/>
				<need_cost/>
				<incm_amt/>
				<rate/>
				<incm_tax/>
				<res_tax/>
				<use_dept_cd/>
				<incm_pers/>
				<incm_pers_prn/>
				<incm_pers_addr/>
				<budg_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<fisc_dt/>
				<setoff_slip_occr_dt/>
				<setoff_slip_clsf_cd/>
				<setoff_slip_seq/>
				<setoff_slip_sub_seq/>
				<setoff_slip_arow_no/>
				<acct_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_8001_l>
*/
%>

<% /* 작성시간 : Thu Jul 30 10:21:50 KST 2009 */ %>