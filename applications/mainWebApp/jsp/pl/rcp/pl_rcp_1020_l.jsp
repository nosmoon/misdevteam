<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.rcp.rec.*
	,	chosun.ciis.pl.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_rcp_1020_l.jsp
* 기능 : 
* 작성일자 : 2009-04-15
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_RCP_1020_LDataSet ds = (PL_RCP_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "RCPM_LISTDTL", "");

	try {
		/****** CLOSINFOCUR BEGIN */
		int CLOSINFOCUR = rx.add(dataSet, "CLOSINFOCUR", "");
		for(int i = 0; i < ds.closinfocur.size(); i++) {
			PL_RCP_1020_LCLOSINFOCURRecord rec = (PL_RCP_1020_LCLOSINFOCURRecord)ds.closinfocur.get(i);
			int record = rx.add(CLOSINFOCUR, "record", "");
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_clsf_nm", StringUtil.replaceToXml(rec.medi_clsf_nm));
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "thmm_bal", rec.thmm_bal);
			rx.add(record, "meda_bal", rec.meda_bal);
			rx.add(record, "tot_bal", rec.tot_bal);
		}
		/****** CLOSINFOCUR END */

		/****** DR_PTCRCUR BEGIN */
		int DR_PTCRCUR = rx.add(dataSet, "DR_PTCRCUR", "");
		for(int i = 0; i < ds.dr_ptcrcur.size(); i++) {
			PL_RCP_1020_LDR_PTCRCURRecord rec = (PL_RCP_1020_LDR_PTCRCURRecord)ds.dr_ptcrcur.get(i);
			int record = rx.add(DR_PTCRCUR, "record", "");
			rx.add(record, "d_rcpm_type", rec.rcpm_type);
			rx.add(record, "d_amt", rec.amt);
			rx.add(record, "d_rmtt_dt", rec.rmtt_dt);
			rx.add(record, "d_rmtt_plac", rec.rmtt_plac);
			rx.add(record, "d_acct_mang_no", rec.acct_mang_no);
			rx.add(record, "d_note_no", rec.note_no);
			rx.add(record, "d_note_clsf_cd", rec.note_clsf_cd);
			rx.add(record, "d_bank_cd", rec.bank_cd);
			rx.add(record, "d_bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			rx.add(record, "d_issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			rx.add(record, "d_issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "d_comp_dt", rec.comp_dt);
			rx.add(record, "d_mtry_dt", rec.mtry_dt);
			rx.add(record, "d_slip_clsf", rec.slip_clsf);
			rx.add(record, "d_seq", rec.seq);
			rx.add(record, "d_subseq", rec.subseq);
			rx.add(record, "d_dd_clos_yn", rec.dd_clos_yn);
			rx.add(record, "d_remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "d_biz_reg_no", rec.biz_reg_no);
			rx.add(record, "d_bank_id", rec.bank_id);
			rx.add(record, "d_acct_num", rec.acct_num);
			rx.add(record, "d_tran_date", rec.tran_date);
			rx.add(record, "d_tran_date_seq", rec.tran_date_seq);
			rx.add(record, "d_current_clsf", "D");
		}
		/****** DR_PTCRCUR END */

		/****** CRDT_PTCRCUR BEGIN */
		int CRDT_PTCRCUR = rx.add(dataSet, "CRDT_PTCRCUR", "");
		for(int i = 0; i < ds.crdt_ptcrcur.size(); i++) {
			PL_RCP_1020_LCRDT_PTCRCURRecord rec = (PL_RCP_1020_LCRDT_PTCRCURRecord)ds.crdt_ptcrcur.get(i);
			int record = rx.add(CRDT_PTCRCUR, "record", "");
			rx.add(record, "c_budg_clsf", rec.budg_clsf);
			rx.add(record, "c_basi_yymm", rec.basi_yymm);
			rx.add(record, "c_amt", rec.amt);
			rx.add(record, "c_slip_clsf", rec.slip_clsf);
			rx.add(record, "c_seq", rec.seq);
			rx.add(record, "c_subseq", rec.subseq);
			rx.add(record, "c_dd_clos_yn", rec.dd_clos_yn);
			rx.add(record, "c_remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** CRDT_PTCRCUR END */

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
	<CRDT_PTCRCUR>
		<record>
			<budg_clsf/>
			<basi_yymm/>
			<amt/>
			<slip_clsf/>
			<seq/>
			<subseq/>
			<dd_clos_yn/>
			<remk/>
		</record>
	</CRDT_PTCRCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CLOSINFOCUR>
		<record>
			<medi_clsf/>
			<medi_clsf_nm/>
			<basi_yymm/>
			<cyov_bal/>
			<sale_amt/>
			<rcpm_amt/>
			<thmm_bal/>
			<meda_bal/>
			<tot_bal/>
		</record>
	</CLOSINFOCUR>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<DR_PTCRCUR>
		<record>
			<rcpm_type/>
			<amt/>
			<rmtt_dt/>
			<rmtt_plac/>
			<acct_mang_no/>
			<note_no/>
			<note_clsf_cd/>
			<bank_cd/>
			<bank_nm/>
			<issu_pers_nm/>
			<issu_cmpy_clsf_cd/>
			<comp_dt/>
			<mtry_dt/>
			<slip_clsf/>
			<seq/>
			<subseq/>
			<dd_clos_yn/>
			<remk/>
			<biz_reg_no/>
			<bank_id/>
			<acct_num/>
			<tran_date/>
			<tran_date_seq/>
			<current_clsf/>
		</record>
	</DR_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 15 11:36:37 KST 2009 */ %>
