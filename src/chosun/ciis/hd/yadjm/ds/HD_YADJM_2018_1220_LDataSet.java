/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_2018_1220_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist6 = new ArrayList();
	public ArrayList curlist5 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_2018_1220_LDataSet(){}
	public HD_YADJM_2018_1220_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HD_YADJM_2018_1220_LCURLISTRecord rec = new HD_YADJM_2018_1220_LCURLISTRecord();
			rec.adjm_rvrs_yy = Util.checkString(rset0.getString("adjm_rvrs_yy"));
			rec.adjm_clsf = Util.checkString(rset0.getString("adjm_clsf"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.prsn_pens = Util.checkString(rset0.getString("prsn_pens"));
			rec.pens_savg = Util.checkString(rset0.getString("pens_savg"));
			rec.invsm_cmpd_invsm_amt_6 = Util.checkString(rset0.getString("invsm_cmpd_invsm_amt_6"));
			rec.invsm_cmpd_invsm_amt = Util.checkString(rset0.getString("invsm_cmpd_invsm_amt"));
			rec.hous_subc_savg = Util.checkString(rset0.getString("hous_subc_savg"));
			rec.multy_house_plan_savg = Util.checkString(rset0.getString("multy_house_plan_savg"));
			rec.ltrm_hous_savg = Util.checkString(rset0.getString("ltrm_hous_savg"));
			rec.labr_hous_savg = Util.checkString(rset0.getString("labr_hous_savg"));
			rec.hous_hire_rcpm_won_li_amt_repa = Util.checkString(rset0.getString("hous_hire_rcpm_won_li_amt_repa"));
			rec.monthly_rent_amt = Util.checkString(rset0.getString("monthly_rent_amt"));
			rec.hous_loan_tot_amt = Util.checkString(rset0.getString("hous_loan_tot_amt"));
			rec.ltrm_stok_type_savg_incm_dduc1 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc1"));
			rec.ltrm_stok_type_savg_incm_dduc2 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc2"));
			rec.ltrm_stok_type_savg_incm_dduc3 = Util.checkString(rset0.getString("ltrm_stok_type_savg_incm_dduc3"));
			rec.lvcmpy_pens = Util.checkString(rset0.getString("lvcmpy_pens"));
			rec.smallbiz_incm_dduc = Util.checkString(rset0.getString("smallbiz_incm_dduc"));
			rec.larg_sum_no_lease_house = Util.checkString(rset0.getString("larg_sum_no_lease_house"));
			rec.ltrm_invsm_stock_amt = Util.checkString(rset0.getString("ltrm_invsm_stock_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			HD_YADJM_2018_1220_LCURLIST1Record rec = new HD_YADJM_2018_1220_LCURLIST1Record();
			rec.emp_no = Util.checkString(rset1.getString("emp_no"));
			rec.zip_1_1 = Util.checkString(rset1.getString("zip_1_1"));
			rec.zip_2_1 = Util.checkString(rset1.getString("zip_2_1"));
			rec.addr_1 = Util.checkString(rset1.getString("addr_1"));
			rec.dtls_addr_1 = Util.checkString(rset1.getString("dtls_addr_1"));
			this.curlist1.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			HD_YADJM_2018_1220_LCURLIST2Record rec = new HD_YADJM_2018_1220_LCURLIST2Record();
			rec.limit_hosp_amt = Util.checkString(rset2.getString("limit_hosp_amt"));
			rec.limit_crdt_amt = Util.checkString(rset2.getString("limit_crdt_amt"));
			rec.sum_tot_saly_amt = Util.checkString(rset2.getString("sum_tot_saly_amt"));
			rec.pre_calc_labr_incm_amt = Util.checkString(rset2.getString("pre_calc_labr_incm_amt"));
			this.curlist2.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			HD_YADJM_2018_1220_LCURLIST3Record rec = new HD_YADJM_2018_1220_LCURLIST3Record();
			rec.cd_type = Util.checkString(rset3.getString("cd_type"));
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset3.getString("cd_abrv_nm"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			HD_YADJM_2018_1220_LCURLIST4Record rec = new HD_YADJM_2018_1220_LCURLIST4Record();
			rec.adjm_rvrs_yy = Util.checkString(rset4.getString("adjm_rvrs_yy"));
			rec.emp_no = Util.checkString(rset4.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset4.getString("faml_seq"));
			rec.base_dduc_yn = Util.checkString(rset4.getString("base_dduc_yn"));
			rec.obcl_pers_dduc_yn = Util.checkString(rset4.getString("obcl_pers_dduc_yn"));
			rec.fml_hshd_dduc_yn = Util.checkString(rset4.getString("fml_hshd_dduc_yn"));
			rec.care_fee_dduc_yn = Util.checkString(rset4.getString("care_fee_dduc_yn"));
			rec.one_paren_dduc_yn = Util.checkString(rset4.getString("one_paren_dduc_yn"));
			rec.faml_rshp_cd = Util.checkString(rset4.getString("faml_rshp_cd"));
			rec.faml_flnm = Util.checkString(rset4.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset4.getString("faml_prn"));
			rec.adopt_dt = Util.checkString(rset4.getString("adopt_dt"));
			rec.dth_dt = Util.checkString(rset4.getString("dth_dt"));
			rec.edu_suppamt = Util.checkString(rset4.getString("edu_suppamt"));
			rec.edu_fee_clsf_cd = Util.checkString(rset4.getString("edu_fee_clsf_cd"));
			rec.edu_cost_onta = Util.checkString(rset4.getString("edu_cost_onta"));
			rec.edu_cost_etc = Util.checkString(rset4.getString("edu_cost_etc"));
			rec.edu_splen_pers_onta = Util.checkString(rset4.getString("edu_splen_pers_onta"));
			rec.edu_splen_pers_etc = Util.checkString(rset4.getString("edu_splen_pers_etc"));
			rec.heal_suppamt = Util.checkString(rset4.getString("heal_suppamt"));
			rec.hosp_cost_onta = Util.checkString(rset4.getString("hosp_cost_onta"));
			rec.hosp_cost_etc = Util.checkString(rset4.getString("hosp_cost_etc"));
			rec.asrc_prpn_insr_fee_onta = Util.checkString(rset4.getString("asrc_prpn_insr_fee_onta"));
			rec.asrc_prpn_insr_fee_etc = Util.checkString(rset4.getString("asrc_prpn_insr_fee_etc"));
			rec.obcl_pers_insr_onta = Util.checkString(rset4.getString("obcl_pers_insr_onta"));
			rec.obcl_pers_insr_etc = Util.checkString(rset4.getString("obcl_pers_insr_etc"));
			rec.nonprofit_dona_amt_etc = Util.checkString(rset4.getString("nonprofit_dona_amt_etc"));
			rec.relg_appm_dona_amt_etc = Util.checkString(rset4.getString("relg_appm_dona_amt_etc"));
			rec.appm_dona_amt_etc = Util.checkString(rset4.getString("appm_dona_amt_etc"));
			rec.lgl_dona_amt_etc = Util.checkString(rset4.getString("lgl_dona_amt_etc"));
			rec.dduc_polt_fund = Util.checkString(rset4.getString("dduc_polt_fund"));
			rec.obcl_pers_clsf = Util.checkString(rset4.getString("obcl_pers_clsf"));
			rec.spc_case_dona_amt_etc = Util.checkString(rset4.getString("spc_case_dona_amt_etc"));
			rec.ftyr_crdt_card_onta = Util.checkString(rset4.getString("ftyr_crdt_card_onta"));
			rec.ftyr_crdt_card_etc = Util.checkString(rset4.getString("ftyr_crdt_card_etc"));
			rec.ftyr_debit_card_onta = Util.checkString(rset4.getString("ftyr_debit_card_onta"));
			rec.ftyr_debit_card_etc = Util.checkString(rset4.getString("ftyr_debit_card_etc"));
			rec.ftyr_cash_rcpt_onta = Util.checkString(rset4.getString("ftyr_cash_rcpt_onta"));
			rec.ftyr_trad_amt_onta = Util.checkString(rset4.getString("ftyr_trad_amt_onta"));
			rec.ftyr_trad_amt_etc = Util.checkString(rset4.getString("ftyr_trad_amt_etc"));
			rec.ftyr_trans_amt_onta = Util.checkString(rset4.getString("ftyr_trans_amt_onta"));
			rec.ftyr_trans_amt_etc = Util.checkString(rset4.getString("ftyr_trans_amt_etc"));
			rec.crdt_card_incd_pre_onta = Util.checkString(rset4.getString("crdt_card_incd_pre_onta"));
			rec.crdt_card_incd_pre_etc = Util.checkString(rset4.getString("crdt_card_incd_pre_etc"));
			rec.debit_card_incd_pre_onta = Util.checkString(rset4.getString("debit_card_incd_pre_onta"));
			rec.debit_card_incd_pre_etc = Util.checkString(rset4.getString("debit_card_incd_pre_etc"));
			rec.cash_rcpt_incd_pre_onta = Util.checkString(rset4.getString("cash_rcpt_incd_pre_onta"));
			rec.trad_pre_amt_onta = Util.checkString(rset4.getString("trad_pre_amt_onta"));
			rec.trad_pre_amt_etc = Util.checkString(rset4.getString("trad_pre_amt_etc"));
			rec.trans_pre_amt_onta = Util.checkString(rset4.getString("trans_pre_amt_onta"));
			rec.trans_pre_amt_etc = Util.checkString(rset4.getString("trans_pre_amt_etc"));
			rec.crdt_card_tot_amt_onta = Util.checkString(rset4.getString("crdt_card_tot_amt_onta"));
			rec.crdt_card_tot_amt_etc = Util.checkString(rset4.getString("crdt_card_tot_amt_etc"));
			rec.debit_card_tot_amt_onta = Util.checkString(rset4.getString("debit_card_tot_amt_onta"));
			rec.debit_card_tot_amt_etc = Util.checkString(rset4.getString("debit_card_tot_amt_etc"));
			rec.edu_cost_giro_pymt_onta = Util.checkString(rset4.getString("edu_cost_giro_pymt_onta"));
			rec.edu_cost_giro_pymt_etc = Util.checkString(rset4.getString("edu_cost_giro_pymt_etc"));
			rec.cash_rcpt_onta = Util.checkString(rset4.getString("cash_rcpt_onta"));
			rec.trad_mrkt_onta = Util.checkString(rset4.getString("trad_mrkt_onta"));
			rec.trad_mrkt_etc = Util.checkString(rset4.getString("trad_mrkt_etc"));
			rec.public_trans_amt_onta = Util.checkString(rset4.getString("public_trans_amt_onta"));
			rec.public_trans_amt_etc = Util.checkString(rset4.getString("public_trans_amt_etc"));
			rec.book_show_use_onta = Util.checkString(rset4.getString("book_show_use_onta"));
			rec.book_show_use_etc = Util.checkString(rset4.getString("book_show_use_etc"));
			this.curlist4.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			HD_YADJM_2018_1220_LCURLIST5Record rec = new HD_YADJM_2018_1220_LCURLIST5Record();
			rec.befrduty_cnt = Util.checkString(rset5.getString("befrduty_cnt"));
			this.curlist5.add(rec);
		}
		ResultSet rset6 = (ResultSet) cstmt.getObject(12);
		while(rset6.next()){
			HD_YADJM_2018_1220_LCURLIST6Record rec = new HD_YADJM_2018_1220_LCURLIST6Record();
			rec.upload_dt = Util.checkString(rset6.getString("upload_dt"));
			rec.add_file_nm = Util.checkString(rset6.getString("add_file_nm"));
			rec.add_file = Util.checkString(rset6.getString("add_file"));
			this.curlist6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_2018_1220_LDataSet ds = (HD_YADJM_2018_1220_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_YADJM_2018_1220_LCURLISTRecord curlistRec = (HD_YADJM_2018_1220_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_YADJM_2018_1220_LCURLIST1Record curlist1Rec = (HD_YADJM_2018_1220_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_YADJM_2018_1220_LCURLIST2Record curlist2Rec = (HD_YADJM_2018_1220_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		HD_YADJM_2018_1220_LCURLIST3Record curlist3Rec = (HD_YADJM_2018_1220_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		HD_YADJM_2018_1220_LCURLIST4Record curlist4Rec = (HD_YADJM_2018_1220_LCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist5.size(); i++){
		HD_YADJM_2018_1220_LCURLIST5Record curlist5Rec = (HD_YADJM_2018_1220_LCURLIST5Record)ds.curlist5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist6.size(); i++){
		HD_YADJM_2018_1220_LCURLIST6Record curlist6Rec = (HD_YADJM_2018_1220_LCURLIST6Record)ds.curlist6.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
<%= ds.getCurlist5()%>
<%= ds.getCurlist6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.adjm_rvrs_yy%>
<%= curlistRec.adjm_clsf%>
<%= curlistRec.emp_no%>
<%= curlistRec.prsn_pens%>
<%= curlistRec.pens_savg%>
<%= curlistRec.invsm_cmpd_invsm_amt_6%>
<%= curlistRec.invsm_cmpd_invsm_amt%>
<%= curlistRec.hous_subc_savg%>
<%= curlistRec.multy_house_plan_savg%>
<%= curlistRec.ltrm_hous_savg%>
<%= curlistRec.labr_hous_savg%>
<%= curlistRec.hous_hire_rcpm_won_li_amt_repa%>
<%= curlistRec.monthly_rent_amt%>
<%= curlistRec.hous_loan_tot_amt%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc1%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc2%>
<%= curlistRec.ltrm_stok_type_savg_incm_dduc3%>
<%= curlistRec.lvcmpy_pens%>
<%= curlistRec.smallbiz_incm_dduc%>
<%= curlistRec.larg_sum_no_lease_house%>
<%= curlistRec.ltrm_invsm_stock_amt%>
<%= curlist1Rec.emp_no%>
<%= curlist1Rec.zip_1_1%>
<%= curlist1Rec.zip_2_1%>
<%= curlist1Rec.addr_1%>
<%= curlist1Rec.dtls_addr_1%>
<%= curlist2Rec.limit_hosp_amt%>
<%= curlist2Rec.limit_crdt_amt%>
<%= curlist2Rec.sum_tot_saly_amt%>
<%= curlist2Rec.pre_calc_labr_incm_amt%>
<%= curlist3Rec.cd_type%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist3Rec.cd_abrv_nm%>
<%= curlist4Rec.adjm_rvrs_yy%>
<%= curlist4Rec.emp_no%>
<%= curlist4Rec.faml_seq%>
<%= curlist4Rec.base_dduc_yn%>
<%= curlist4Rec.obcl_pers_dduc_yn%>
<%= curlist4Rec.fml_hshd_dduc_yn%>
<%= curlist4Rec.care_fee_dduc_yn%>
<%= curlist4Rec.one_paren_dduc_yn%>
<%= curlist4Rec.faml_rshp_cd%>
<%= curlist4Rec.faml_flnm%>
<%= curlist4Rec.faml_prn%>
<%= curlist4Rec.adopt_dt%>
<%= curlist4Rec.dth_dt%>
<%= curlist4Rec.edu_suppamt%>
<%= curlist4Rec.edu_fee_clsf_cd%>
<%= curlist4Rec.edu_cost_onta%>
<%= curlist4Rec.edu_cost_etc%>
<%= curlist4Rec.edu_splen_pers_onta%>
<%= curlist4Rec.edu_splen_pers_etc%>
<%= curlist4Rec.heal_suppamt%>
<%= curlist4Rec.hosp_cost_onta%>
<%= curlist4Rec.hosp_cost_etc%>
<%= curlist4Rec.asrc_prpn_insr_fee_onta%>
<%= curlist4Rec.asrc_prpn_insr_fee_etc%>
<%= curlist4Rec.obcl_pers_insr_onta%>
<%= curlist4Rec.obcl_pers_insr_etc%>
<%= curlist4Rec.nonprofit_dona_amt_etc%>
<%= curlist4Rec.relg_appm_dona_amt_etc%>
<%= curlist4Rec.appm_dona_amt_etc%>
<%= curlist4Rec.lgl_dona_amt_etc%>
<%= curlist4Rec.dduc_polt_fund%>
<%= curlist4Rec.obcl_pers_clsf%>
<%= curlist4Rec.spc_case_dona_amt_etc%>
<%= curlist4Rec.ftyr_crdt_card_onta%>
<%= curlist4Rec.ftyr_crdt_card_etc%>
<%= curlist4Rec.ftyr_debit_card_onta%>
<%= curlist4Rec.ftyr_debit_card_etc%>
<%= curlist4Rec.ftyr_cash_rcpt_onta%>
<%= curlist4Rec.ftyr_trad_amt_onta%>
<%= curlist4Rec.ftyr_trad_amt_etc%>
<%= curlist4Rec.ftyr_trans_amt_onta%>
<%= curlist4Rec.ftyr_trans_amt_etc%>
<%= curlist4Rec.crdt_card_incd_pre_onta%>
<%= curlist4Rec.crdt_card_incd_pre_etc%>
<%= curlist4Rec.debit_card_incd_pre_onta%>
<%= curlist4Rec.debit_card_incd_pre_etc%>
<%= curlist4Rec.cash_rcpt_incd_pre_onta%>
<%= curlist4Rec.trad_pre_amt_onta%>
<%= curlist4Rec.trad_pre_amt_etc%>
<%= curlist4Rec.trans_pre_amt_onta%>
<%= curlist4Rec.trans_pre_amt_etc%>
<%= curlist4Rec.crdt_card_tot_amt_onta%>
<%= curlist4Rec.crdt_card_tot_amt_etc%>
<%= curlist4Rec.debit_card_tot_amt_onta%>
<%= curlist4Rec.debit_card_tot_amt_etc%>
<%= curlist4Rec.edu_cost_giro_pymt_onta%>
<%= curlist4Rec.edu_cost_giro_pymt_etc%>
<%= curlist4Rec.cash_rcpt_onta%>
<%= curlist4Rec.trad_mrkt_onta%>
<%= curlist4Rec.trad_mrkt_etc%>
<%= curlist4Rec.public_trans_amt_onta%>
<%= curlist4Rec.public_trans_amt_etc%>
<%= curlist4Rec.book_show_use_onta%>
<%= curlist4Rec.book_show_use_etc%>
<%= curlist5Rec.befrduty_cnt%>
<%= curlist6Rec.upload_dt%>
<%= curlist6Rec.add_file_nm%>
<%= curlist6Rec.add_file%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 13 16:02:16 KST 2018 */