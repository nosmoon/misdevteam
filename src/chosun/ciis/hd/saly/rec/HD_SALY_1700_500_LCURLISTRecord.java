/***************************************************************************************************
* 파일명 : .java
* 기능 : 인사-급여관리-총보상 생성 및 조회(TV조선용)
* 작성일자 : 2014-10-15
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */

 
public class HD_SALY_1700_500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String mm_saly;
	public String rslt_pay;
	public String year_alon;
	public String hody_alon;
	public String vgl_fee;
	public String dd_subj_sel_fee;
	public String cnfr_fee;
	public String real_subj_sel_fee;
	public String erl_prsnt_alon;
	public String dspch_dd_fee;
	public String cmpy_burd_np_amt;
	public String cmpy_burd_hlth_insr_fee;
	public String cmpy_burd_emp_insr_fee;
	public String cmpy_burd_dist_insr_fee;
	public String corp_card_use_amt;
	public String subj_sel_oli_deal_amt;
	public String make_proc_deal_amt;
	public String olcard_use_amt;
	public String hlth_chk_sply_amt;
	public String hospz_med_exam_fee;
	public String child_scl_exps;
	public String congr_condl_fee;
	public String paty_insr_fee;
	public String condo_use_cmpy_sply_amt;
	public String posk_edu_fee;
	public String sclgg_course_edu_fee;
	public String cmpy_sply_stdy_fee;
	public String etc_alon_prize_amt;
	public String etc_alon_show_amt;
	public String etc_bns_amt;
	public String etc_evlu_amt;
	public String etc_etc_amt;
	public String etc_spos_hlth_amt;
	public String etc_ptph_amt;
	public String etc_med_exam_amt;
	public String etc_child_birth_amt;
	public String etc_scl_exps_amt;
	public String etc_drvr_trff_amt;
	public String etc_cast_amt;
	public String etc_edu_amt;

	public HD_SALY_1700_500_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setMm_saly(String mm_saly){
		this.mm_saly = mm_saly;
	}

	public void setRslt_pay(String rslt_pay){
		this.rslt_pay = rslt_pay;
	}

	public void setYear_alon(String year_alon){
		this.year_alon = year_alon;
	}

	public void setHody_alon(String hody_alon){
		this.hody_alon = hody_alon;
	}

	public void setVgl_fee(String vgl_fee){
		this.vgl_fee = vgl_fee;
	}

	public void setDd_subj_sel_fee(String dd_subj_sel_fee){
		this.dd_subj_sel_fee = dd_subj_sel_fee;
	}

	public void setCnfr_fee(String cnfr_fee){
		this.cnfr_fee = cnfr_fee;
	}

	public void setReal_subj_sel_fee(String real_subj_sel_fee){
		this.real_subj_sel_fee = real_subj_sel_fee;
	}

	public void setErl_prsnt_alon(String erl_prsnt_alon){
		this.erl_prsnt_alon = erl_prsnt_alon;
	}

	public void setDspch_dd_fee(String dspch_dd_fee){
		this.dspch_dd_fee = dspch_dd_fee;
	}

	public void setCmpy_burd_np_amt(String cmpy_burd_np_amt){
		this.cmpy_burd_np_amt = cmpy_burd_np_amt;
	}

	public void setCmpy_burd_hlth_insr_fee(String cmpy_burd_hlth_insr_fee){
		this.cmpy_burd_hlth_insr_fee = cmpy_burd_hlth_insr_fee;
	}

	public void setCmpy_burd_emp_insr_fee(String cmpy_burd_emp_insr_fee){
		this.cmpy_burd_emp_insr_fee = cmpy_burd_emp_insr_fee;
	}

	public void setCmpy_burd_dist_insr_fee(String cmpy_burd_dist_insr_fee){
		this.cmpy_burd_dist_insr_fee = cmpy_burd_dist_insr_fee;
	}

	public void setCorp_card_use_amt(String corp_card_use_amt){
		this.corp_card_use_amt = corp_card_use_amt;
	}
	
	public void setSubj_sel_oli_deal_amt(String subj_sel_oli_deal_amt){
		this.subj_sel_oli_deal_amt = subj_sel_oli_deal_amt;
	}
	
	public void setMake_proc_deal_amt(String make_proc_deal_amt){
		this.make_proc_deal_amt = make_proc_deal_amt;
	}
	
	public void setOlcard_use_amt(String olcard_use_amt){
		this.olcard_use_amt = olcard_use_amt;
	}

	public void setHlth_chk_sply_amt(String hlth_chk_sply_amt){
		this.hlth_chk_sply_amt = hlth_chk_sply_amt;
	}

	public void setHospz_med_exam_fee(String hospz_med_exam_fee){
		this.hospz_med_exam_fee = hospz_med_exam_fee;
	}

	public void setChild_scl_exps(String child_scl_exps){
		this.child_scl_exps = child_scl_exps;
	}

	public void setCongr_condl_fee(String congr_condl_fee){
		this.congr_condl_fee = congr_condl_fee;
	}

	public void setPaty_insr_fee(String paty_insr_fee){
		this.paty_insr_fee = paty_insr_fee;
	}

	public void setCondo_use_cmpy_sply_amt(String condo_use_cmpy_sply_amt){
		this.condo_use_cmpy_sply_amt = condo_use_cmpy_sply_amt;
	}

	public void setPosk_edu_fee(String posk_edu_fee){
		this.posk_edu_fee = posk_edu_fee;
	}

	public void setSclgg_course_edu_fee(String sclgg_course_edu_fee){
		this.sclgg_course_edu_fee = sclgg_course_edu_fee;
	}

	public void setCmpy_sply_stdy_fee(String cmpy_sply_stdy_fee){
		this.cmpy_sply_stdy_fee = cmpy_sply_stdy_fee;
	}

	public void setEtc_alon_prize_amt(String etc_alon_prize_amt){
		this.etc_alon_prize_amt = etc_alon_prize_amt;
	}
	
	public void setEtc_alon_show_amt(String etc_alon_show_amt){
		this.etc_alon_show_amt = etc_alon_show_amt;
	}
	
	public void setEtc_bns_amt(String etc_bns_amt){
		this.etc_bns_amt = etc_bns_amt;
	}
	
	public void setEtc_evlu_amt(String etc_evlu_amt){
		this.etc_evlu_amt = etc_evlu_amt;
	}
	
	public void setEtc_etc_amt(String etc_etc_amt){
		this.etc_etc_amt = etc_etc_amt;
	}
	
	public void setEtc_spos_hlth_amt(String etc_spos_hlth_amt){
		this.etc_spos_hlth_amt = etc_spos_hlth_amt;
	}
	
	public void setEtc_ptph_amt(String etc_ptph_amt){
		this.etc_ptph_amt = etc_ptph_amt;
	}
	
	public void setEtc_med_exam_amt(String etc_med_exam_amt){
		this.etc_med_exam_amt = etc_med_exam_amt;
	}
	
	public void setEtc_child_birth_amt(String etc_child_birth_amt){
		this.etc_child_birth_amt = etc_child_birth_amt;
	}
	
	public void setEtc_scl_exps_amt(String etc_scl_exps_amt){
		this.etc_scl_exps_amt = etc_scl_exps_amt;
	}
	
	public void setEtc_drvr_trff_amt(String etc_drvr_trff_amt){
		this.etc_drvr_trff_amt = etc_drvr_trff_amt;
	}
	
	public void setEtc_cast_amt(String etc_cast_amt){
		this.etc_cast_amt = etc_cast_amt;
	}
	
	public void setEtc_edu_amt(String etc_edu_amt){
		this.etc_edu_amt = etc_edu_amt;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getMm_saly(){
		return this.mm_saly;
	}

	public String getRslt_pay(){
		return this.rslt_pay;
	}

	public String getYear_alon(){
		return this.year_alon;
	}

	public String getHody_alon(){
		return this.hody_alon;
	}

	public String getVgl_fee(){
		return this.vgl_fee;
	}

	public String getDd_subj_sel_fee(){
		return this.dd_subj_sel_fee;
	}

	public String getCnfr_fee(){
		return this.cnfr_fee;
	}

	public String getReal_subj_sel_fee(){
		return this.real_subj_sel_fee;
	}

	public String getErl_prsnt_alon(){
		return this.erl_prsnt_alon;
	}

	public String getDspch_dd_fee(){
		return this.dspch_dd_fee;
	}

	public String getCmpy_burd_np_amt(){
		return this.cmpy_burd_np_amt;
	}

	public String getCmpy_burd_hlth_insr_fee(){
		return this.cmpy_burd_hlth_insr_fee;
	}

	public String getCmpy_burd_emp_insr_fee(){
		return this.cmpy_burd_emp_insr_fee;
	}

	public String getCmpy_burd_dist_insr_fee(){
		return this.cmpy_burd_dist_insr_fee;
	}

	public String getCorp_card_use_amt(){
		return this.corp_card_use_amt;
	}
	
	public String getSubj_sel_oli_deal_amt(){
		return this.subj_sel_oli_deal_amt;
	}
	
	public String getMake_proc_deal_amt(){
		return this.make_proc_deal_amt;
	}
	
	public String getOlcard_use_amt(){
		return this.olcard_use_amt;
	}

	public String getHlth_chk_sply_amt(){
		return this.hlth_chk_sply_amt;
	}

	public String getHospz_med_exam_fee(){
		return this.hospz_med_exam_fee;
	}

	public String getChild_scl_exps(){
		return this.child_scl_exps;
	}

	public String getCongr_condl_fee(){
		return this.congr_condl_fee;
	}

	public String getPaty_insr_fee(){
		return this.paty_insr_fee;
	}

	public String getCondo_use_cmpy_sply_amt(){
		return this.condo_use_cmpy_sply_amt;
	}

	public String getPosk_edu_fee(){
		return this.posk_edu_fee;
	}

	public String getSclgg_course_edu_fee(){
		return this.sclgg_course_edu_fee;
	}

	public String getCmpy_sply_stdy_fee(){
		return this.cmpy_sply_stdy_fee;
	}

	public String getEtc_alon_prize_amt(){
		return this.etc_alon_prize_amt;
	}

	public String getEtc_alon_show_amt(){
		return this.etc_alon_show_amt;
	}
	
	public String getEtc_bns_amt(){
		return this.etc_bns_amt;
	}
	
	public String getEtc_evlu_amt(){
		return this.etc_evlu_amt;
	}
	
	public String getEtc_etc_amt(){
		return this.etc_etc_amt;
	}
	
	public String getEtc_spos_hlth_amt(){
		return this.etc_spos_hlth_amt;
	}
	
	public String getEtc_ptph_amt(){
		return this.etc_ptph_amt;
	}
	
	public String getEtc_med_exam_amt(){
		return this.etc_med_exam_amt;
	}
	
	public String getEtc_child_birth_amt(){
		return this.etc_child_birth_amt;
	}
	
	public String getEtc_scl_exps_amt(){
		return this.etc_scl_exps_amt;
	}
	
	public String getEtc_drvr_trff_amt(){
		return this.etc_drvr_trff_amt;
	}
	
	public String getEtc_cast_amt(){
		return this.etc_cast_amt;
	}
	
	public String getEtc_edu_amt(){
		return this.etc_edu_amt;
	}
}

/* 작성시간 : Wed Oct 15 17:43:14 KST 2014 */