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
	FC_ACCT_2125_SDataSet ds = (FC_ACCT_2125_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_2125_SCURLIST4Record rec = (FC_ACCT_2125_SCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			//rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			//rx.add(record, "rcpm_slip_no2", rec.rcpm_slip_no2);
			//rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "rcpm_shet_kind", StringUtil.replaceToXml(rec.rcpm_shet_kind));
			rx.add(record, "rcpm_shet_no", StringUtil.replaceToXml(rec.rcpm_shet_no));
			rx.add(record, "rcpm_slip_no2", StringUtil.replaceToXml(rec.rcpm_slip_no2));
			rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_ACCT_2125_SCURLIST3Record rec = (FC_ACCT_2125_SCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "g3_rcpm_sub_seq", rec.g3_rcpm_sub_seq);
			//rx.add(record, "g3_budg_cd", rec.g3_budg_cd);
			//rx.add(record, "g3_budg_cd_nm", rec.g3_budg_cd_nm);
			//rx.add(record, "g3_rcpm_amt", rec.g3_rcpm_amt);
			//rx.add(record, "g3_whco_slip_clsf", rec.g3_whco_slip_clsf);
			//rx.add(record, "g3_whco_slip_no", rec.g3_whco_slip_no);
			rx.add(record, "g3_rcpm_sub_seq", StringUtil.replaceToXml(rec.g3_rcpm_sub_seq));
			rx.add(record, "g3_budg_cd", StringUtil.replaceToXml(rec.g3_budg_cd));
			rx.add(record, "g3_budg_cd_nm", StringUtil.replaceToXml(rec.g3_budg_cd_nm));
			rx.add(record, "g3_rcpm_amt", StringUtil.replaceToXml(rec.g3_rcpm_amt));
			rx.add(record, "g3_whco_slip_clsf", StringUtil.replaceToXml(rec.g3_whco_slip_clsf));
			rx.add(record, "g3_whco_slip_no", StringUtil.replaceToXml(rec.g3_whco_slip_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2125_SCURLIST2Record rec = (FC_ACCT_2125_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "g2_rcpm_sub_seq", rec.g2_rcpm_sub_seq);
			//rx.add(record, "g2_note_no", rec.g2_note_no);
			//rx.add(record, "g2_rcpm_amt", rec.g2_rcpm_amt);
			//rx.add(record, "g2_note_clsf_cd", rec.g2_note_clsf_cd);
			//rx.add(record, "g2_bank_cd", rec.g2_bank_cd);
			//rx.add(record, "g2_bank_cd_nm", rec.g2_bank_cd_nm);
			//rx.add(record, "g2_issu_pers_nm", rec.g2_issu_pers_nm);
			//rx.add(record, "g2_issu_cmpy_clsf_cd", rec.g2_issu_cmpy_clsf_cd);
			//rx.add(record, "g2_comp_dt", rec.g2_comp_dt);
			//rx.add(record, "g2_mtry_dt", rec.g2_mtry_dt);
			//rx.add(record, "g2_rcpm_acct", rec.g2_rcpm_acct);
			//rx.add(record, "g2_sale_aprv_no", rec.g2_sale_aprv_no);
			rx.add(record, "g2_rcpm_sub_seq", StringUtil.replaceToXml(rec.g2_rcpm_sub_seq));
			rx.add(record, "g2_note_no", StringUtil.replaceToXml(rec.g2_note_no));
			rx.add(record, "g2_rcpm_amt", StringUtil.replaceToXml(rec.g2_rcpm_amt));
			rx.add(record, "g2_note_clsf_cd", StringUtil.replaceToXml(rec.g2_note_clsf_cd));
			rx.add(record, "g2_bank_cd", StringUtil.replaceToXml(rec.g2_bank_cd));
			rx.add(record, "g2_bank_cd_nm", StringUtil.replaceToXml(rec.g2_bank_cd_nm));
			rx.add(record, "g2_issu_pers_nm", StringUtil.replaceToXml(rec.g2_issu_pers_nm));
			rx.add(record, "g2_issu_cmpy_clsf_cd", StringUtil.replaceToXml(rec.g2_issu_cmpy_clsf_cd));
			rx.add(record, "g2_comp_dt", StringUtil.replaceToXml(rec.g2_comp_dt));
			rx.add(record, "g2_mtry_dt", StringUtil.replaceToXml(rec.g2_mtry_dt));
			rx.add(record, "g2_rcpm_acct", StringUtil.replaceToXml(rec.g2_rcpm_acct));
			rx.add(record, "g2_sale_aprv_no", StringUtil.replaceToXml(rec.g2_sale_aprv_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2125_SCURLIST1Record rec = (FC_ACCT_2125_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "g1_rcpm_slip_seq", rec.g1_rcpm_slip_seq);
			//rx.add(record, "g1_rcpm_dt", rec.g1_rcpm_dt);
			//rx.add(record, "g1_rcpm_amt", rec.g1_rcpm_amt);
			//rx.add(record, "g1_rcpm_pers_nm", rec.g1_rcpm_pers_nm);
			//rx.add(record, "g1_deps_psbk", rec.g1_deps_psbk);
			//rx.add(record, "g1_coms", rec.g1_coms);
			//rx.add(record, "g1_frex_clsf", rec.g1_frex_clsf);
			//rx.add(record, "g1_exrate", rec.g1_exrate);
			//rx.add(record, "g1_frex_amt", rec.g1_frex_amt);
			//rx.add(record, "biz_reg_no", rec.biz_reg_no);
			//rx.add(record, "bank_id", rec.bank_id);
			//rx.add(record, "acct_num", rec.acct_num);
			//rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "g1_rcpm_slip_seq", StringUtil.replaceToXml(rec.g1_rcpm_slip_seq));
			rx.add(record, "g1_rcpm_dt", StringUtil.replaceToXml(rec.g1_rcpm_dt));
			rx.add(record, "g1_rcpm_amt", StringUtil.replaceToXml(rec.g1_rcpm_amt));
			rx.add(record, "g1_rcpm_pers_nm", StringUtil.replaceToXml(rec.g1_rcpm_pers_nm));
			rx.add(record, "g1_deps_psbk", StringUtil.replaceToXml(rec.g1_deps_psbk));
			rx.add(record, "g1_coms", StringUtil.replaceToXml(rec.g1_coms));
			rx.add(record, "g1_frex_clsf", StringUtil.replaceToXml(rec.g1_frex_clsf));
			rx.add(record, "g1_exrate", StringUtil.replaceToXml(rec.g1_exrate));
			rx.add(record, "g1_frex_amt", StringUtil.replaceToXml(rec.g1_frex_amt));
			rx.add(record, "biz_reg_no", StringUtil.replaceToXml(rec.biz_reg_no));
			rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			rx.add(record, "tran_date_seq", StringUtil.replaceToXml(rec.tran_date_seq));
			rx.add(record, "current_clsf", "");
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2125_SCURLISTRecord rec = (FC_ACCT_2125_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
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
<fc_acct_2125_s>
	<dataSet>
		<CURLIST4>
			<record>
				<rcpm_shet_kind/>
				<rcpm_shet_no/>
				<rcpm_slip_no2/>
				<rcpm_amt/>
			</record>
		</CURLIST4>
	</dataSet>
</fc_acct_2125_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2125_s>
	<dataSet>
		<CURLIST3>
			<record>
				<g3_rcpm_sub_seq/>
				<g3_budg_cd/>
				<g3_budg_cd_nm/>
				<g3_rcpm_amt/>
				<g3_whco_slip_clsf/>
				<g3_whco_slip_no/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_acct_2125_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2125_s>
	<dataSet>
		<CURLIST2>
			<record>
				<g2_rcpm_sub_seq/>
				<g2_note_no/>
				<g2_rcpm_amt/>
				<g2_note_clsf_cd/>
				<g2_bank_cd/>
				<g2_bank_cd_nm/>
				<g2_issu_pers_nm/>
				<g2_issu_cmpy_clsf_cd/>
				<g2_comp_dt/>
				<g2_mtry_dt/>
				<g2_rcpm_acct/>
				<g2_sale_aprv_no/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2125_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2125_s>
	<dataSet>
		<CURLIST1>
			<record>
				<g1_rcpm_slip_seq/>
				<g1_rcpm_dt/>
				<g1_rcpm_amt/>
				<g1_rcpm_pers_nm/>
				<g1_deps_psbk/>
				<g1_coms/>
				<g1_frex_clsf/>
				<g1_exrate/>
				<g1_frex_amt/>
				<biz_reg_no/>
				<bank_id/>
				<acct_num/>
				<tran_date_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2125_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2125_s>
	<dataSet>
		<CURLIST>
			<record>
				<rcpm_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2125_s>
*/
%>

<% /* 작성시간 : Fri Aug 14 15:33:12 KST 2009 */ %>