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


package chosun.ciis.hd.yadjm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.ds.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_5202_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_prn;
	public String faml_flnm;
	public String base_dduc_yn;
	public String child_dduc_yn;
	public String oldg_dduc_yn;
	public String spos_dduc_yn;
	public String rspc_dduc_yn;
	public String care_fee_dduc_yn;
	public String fml_hshd_dduc_yn;
	public String obcl_pers_dduc_yn;
	public String nmat_yn;
	public String dth_dt;
	public String adopt_dt;
	public String asrc_prpn_insr_fee_onta;
	public String asrc_prpn_insr_fee_etc;
	public String obcl_pers_insr_onta;
	public String obcl_pers_insr_etc;
	public String hosp_cost_slf_onta;
	public String hosp_cost_slf_etc;
	public String hosp_cost_onta;
	public String hosp_cost_etc;
	public String dduc_polt_fund;
	public String lgl_dona_amt_etc;
	public String spc_case_dona_amt_etc;
	public String appm_dona_amt_etc;
	public String relg_appm_dona_amt_etc;
	public String edu_fee_clsf_cd;
	public String edu_cost_onta;
	public String edu_cost_etc;
	public String edu_splen_pers_onta;
	public String edu_splen_pers_etc;
	public String crdt_card_tot_amt_onta;
	public String crdt_card_tot_amt_etc;
	public String edu_cost_giro_pymt_onta;
	public String edu_cost_giro_pymt_etc;
	public String cash_rcpt_onta;
	public String connect_ip;
	public String connect_userid;

	public HD_YADJM_5202_ADM(){}
	public HD_YADJM_5202_ADM(String cmpy_cd, String mode, String adjm_rvrs_yy, String emp_no, String faml_seq, String faml_rshp_cd, String faml_prn, String faml_flnm, String base_dduc_yn, String child_dduc_yn, String oldg_dduc_yn, String spos_dduc_yn, String rspc_dduc_yn, String care_fee_dduc_yn, String fml_hshd_dduc_yn, String obcl_pers_dduc_yn, String nmat_yn, String dth_dt, String adopt_dt, String asrc_prpn_insr_fee_onta, String asrc_prpn_insr_fee_etc, String obcl_pers_insr_onta, String obcl_pers_insr_etc, String hosp_cost_slf_onta, String hosp_cost_slf_etc, String hosp_cost_onta, String hosp_cost_etc, String dduc_polt_fund, String lgl_dona_amt_etc, String spc_case_dona_amt_etc, String appm_dona_amt_etc, String relg_appm_dona_amt_etc, String edu_fee_clsf_cd, String edu_cost_onta, String edu_cost_etc, String edu_splen_pers_onta, String edu_splen_pers_etc, String crdt_card_tot_amt_onta, String crdt_card_tot_amt_etc, String edu_cost_giro_pymt_onta, String edu_cost_giro_pymt_etc, String cash_rcpt_onta, String connect_ip, String connect_userid){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.faml_seq = faml_seq;
		this.faml_rshp_cd = faml_rshp_cd;
		this.faml_prn = faml_prn;
		this.faml_flnm = faml_flnm;
		this.base_dduc_yn = base_dduc_yn;
		this.child_dduc_yn = child_dduc_yn;
		this.oldg_dduc_yn = oldg_dduc_yn;
		this.spos_dduc_yn = spos_dduc_yn;
		this.rspc_dduc_yn = rspc_dduc_yn;
		this.care_fee_dduc_yn = care_fee_dduc_yn;
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
		this.obcl_pers_dduc_yn = obcl_pers_dduc_yn;
		this.nmat_yn = nmat_yn;
		this.dth_dt = dth_dt;
		this.adopt_dt = adopt_dt;
		this.asrc_prpn_insr_fee_onta = asrc_prpn_insr_fee_onta;
		this.asrc_prpn_insr_fee_etc = asrc_prpn_insr_fee_etc;
		this.obcl_pers_insr_onta = obcl_pers_insr_onta;
		this.obcl_pers_insr_etc = obcl_pers_insr_etc;
		this.hosp_cost_slf_onta = hosp_cost_slf_onta;
		this.hosp_cost_slf_etc = hosp_cost_slf_etc;
		this.hosp_cost_onta = hosp_cost_onta;
		this.hosp_cost_etc = hosp_cost_etc;
		this.dduc_polt_fund = dduc_polt_fund;
		this.lgl_dona_amt_etc = lgl_dona_amt_etc;
		this.spc_case_dona_amt_etc = spc_case_dona_amt_etc;
		this.appm_dona_amt_etc = appm_dona_amt_etc;
		this.relg_appm_dona_amt_etc = relg_appm_dona_amt_etc;
		this.edu_fee_clsf_cd = edu_fee_clsf_cd;
		this.edu_cost_onta = edu_cost_onta;
		this.edu_cost_etc = edu_cost_etc;
		this.edu_splen_pers_onta = edu_splen_pers_onta;
		this.edu_splen_pers_etc = edu_splen_pers_etc;
		this.crdt_card_tot_amt_onta = crdt_card_tot_amt_onta;
		this.crdt_card_tot_amt_etc = crdt_card_tot_amt_etc;
		this.edu_cost_giro_pymt_onta = edu_cost_giro_pymt_onta;
		this.edu_cost_giro_pymt_etc = edu_cost_giro_pymt_etc;
		this.cash_rcpt_onta = cash_rcpt_onta;
		this.connect_ip = connect_ip;
		this.connect_userid = connect_userid;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setBase_dduc_yn(String base_dduc_yn){
		this.base_dduc_yn = base_dduc_yn;
	}

	public void setChild_dduc_yn(String child_dduc_yn){
		this.child_dduc_yn = child_dduc_yn;
	}

	public void setOldg_dduc_yn(String oldg_dduc_yn){
		this.oldg_dduc_yn = oldg_dduc_yn;
	}

	public void setSpos_dduc_yn(String spos_dduc_yn){
		this.spos_dduc_yn = spos_dduc_yn;
	}

	public void setRspc_dduc_yn(String rspc_dduc_yn){
		this.rspc_dduc_yn = rspc_dduc_yn;
	}

	public void setCare_fee_dduc_yn(String care_fee_dduc_yn){
		this.care_fee_dduc_yn = care_fee_dduc_yn;
	}

	public void setFml_hshd_dduc_yn(String fml_hshd_dduc_yn){
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
	}

	public void setObcl_pers_dduc_yn(String obcl_pers_dduc_yn){
		this.obcl_pers_dduc_yn = obcl_pers_dduc_yn;
	}

	public void setNmat_yn(String nmat_yn){
		this.nmat_yn = nmat_yn;
	}

	public void setDth_dt(String dth_dt){
		this.dth_dt = dth_dt;
	}

	public void setAdopt_dt(String adopt_dt){
		this.adopt_dt = adopt_dt;
	}

	public void setAsrc_prpn_insr_fee_onta(String asrc_prpn_insr_fee_onta){
		this.asrc_prpn_insr_fee_onta = asrc_prpn_insr_fee_onta;
	}

	public void setAsrc_prpn_insr_fee_etc(String asrc_prpn_insr_fee_etc){
		this.asrc_prpn_insr_fee_etc = asrc_prpn_insr_fee_etc;
	}

	public void setObcl_pers_insr_onta(String obcl_pers_insr_onta){
		this.obcl_pers_insr_onta = obcl_pers_insr_onta;
	}

	public void setObcl_pers_insr_etc(String obcl_pers_insr_etc){
		this.obcl_pers_insr_etc = obcl_pers_insr_etc;
	}

	public void setHosp_cost_slf_onta(String hosp_cost_slf_onta){
		this.hosp_cost_slf_onta = hosp_cost_slf_onta;
	}

	public void setHosp_cost_slf_etc(String hosp_cost_slf_etc){
		this.hosp_cost_slf_etc = hosp_cost_slf_etc;
	}

	public void setHosp_cost_onta(String hosp_cost_onta){
		this.hosp_cost_onta = hosp_cost_onta;
	}

	public void setHosp_cost_etc(String hosp_cost_etc){
		this.hosp_cost_etc = hosp_cost_etc;
	}

	public void setDduc_polt_fund(String dduc_polt_fund){
		this.dduc_polt_fund = dduc_polt_fund;
	}

	public void setLgl_dona_amt_etc(String lgl_dona_amt_etc){
		this.lgl_dona_amt_etc = lgl_dona_amt_etc;
	}

	public void setSpc_case_dona_amt_etc(String spc_case_dona_amt_etc){
		this.spc_case_dona_amt_etc = spc_case_dona_amt_etc;
	}

	public void setAppm_dona_amt_etc(String appm_dona_amt_etc){
		this.appm_dona_amt_etc = appm_dona_amt_etc;
	}

	public void setRelg_appm_dona_amt_etc(String relg_appm_dona_amt_etc){
		this.relg_appm_dona_amt_etc = relg_appm_dona_amt_etc;
	}

	public void setEdu_fee_clsf_cd(String edu_fee_clsf_cd){
		this.edu_fee_clsf_cd = edu_fee_clsf_cd;
	}

	public void setEdu_cost_onta(String edu_cost_onta){
		this.edu_cost_onta = edu_cost_onta;
	}

	public void setEdu_cost_etc(String edu_cost_etc){
		this.edu_cost_etc = edu_cost_etc;
	}

	public void setEdu_splen_pers_onta(String edu_splen_pers_onta){
		this.edu_splen_pers_onta = edu_splen_pers_onta;
	}

	public void setEdu_splen_pers_etc(String edu_splen_pers_etc){
		this.edu_splen_pers_etc = edu_splen_pers_etc;
	}

	public void setCrdt_card_tot_amt_onta(String crdt_card_tot_amt_onta){
		this.crdt_card_tot_amt_onta = crdt_card_tot_amt_onta;
	}

	public void setCrdt_card_tot_amt_etc(String crdt_card_tot_amt_etc){
		this.crdt_card_tot_amt_etc = crdt_card_tot_amt_etc;
	}

	public void setEdu_cost_giro_pymt_onta(String edu_cost_giro_pymt_onta){
		this.edu_cost_giro_pymt_onta = edu_cost_giro_pymt_onta;
	}

	public void setEdu_cost_giro_pymt_etc(String edu_cost_giro_pymt_etc){
		this.edu_cost_giro_pymt_etc = edu_cost_giro_pymt_etc;
	}

	public void setCash_rcpt_onta(String cash_rcpt_onta){
		this.cash_rcpt_onta = cash_rcpt_onta;
	}

	public void setConnect_ip(String connect_ip){
		this.connect_ip = connect_ip;
	}

	public void setConnect_userid(String connect_userid){
		this.connect_userid = connect_userid;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getBase_dduc_yn(){
		return this.base_dduc_yn;
	}

	public String getChild_dduc_yn(){
		return this.child_dduc_yn;
	}

	public String getOldg_dduc_yn(){
		return this.oldg_dduc_yn;
	}

	public String getSpos_dduc_yn(){
		return this.spos_dduc_yn;
	}

	public String getRspc_dduc_yn(){
		return this.rspc_dduc_yn;
	}

	public String getCare_fee_dduc_yn(){
		return this.care_fee_dduc_yn;
	}

	public String getFml_hshd_dduc_yn(){
		return this.fml_hshd_dduc_yn;
	}

	public String getObcl_pers_dduc_yn(){
		return this.obcl_pers_dduc_yn;
	}

	public String getNmat_yn(){
		return this.nmat_yn;
	}

	public String getDth_dt(){
		return this.dth_dt;
	}

	public String getAdopt_dt(){
		return this.adopt_dt;
	}

	public String getAsrc_prpn_insr_fee_onta(){
		return this.asrc_prpn_insr_fee_onta;
	}

	public String getAsrc_prpn_insr_fee_etc(){
		return this.asrc_prpn_insr_fee_etc;
	}

	public String getObcl_pers_insr_onta(){
		return this.obcl_pers_insr_onta;
	}

	public String getObcl_pers_insr_etc(){
		return this.obcl_pers_insr_etc;
	}

	public String getHosp_cost_slf_onta(){
		return this.hosp_cost_slf_onta;
	}

	public String getHosp_cost_slf_etc(){
		return this.hosp_cost_slf_etc;
	}

	public String getHosp_cost_onta(){
		return this.hosp_cost_onta;
	}

	public String getHosp_cost_etc(){
		return this.hosp_cost_etc;
	}

	public String getDduc_polt_fund(){
		return this.dduc_polt_fund;
	}

	public String getLgl_dona_amt_etc(){
		return this.lgl_dona_amt_etc;
	}

	public String getSpc_case_dona_amt_etc(){
		return this.spc_case_dona_amt_etc;
	}

	public String getAppm_dona_amt_etc(){
		return this.appm_dona_amt_etc;
	}

	public String getRelg_appm_dona_amt_etc(){
		return this.relg_appm_dona_amt_etc;
	}

	public String getEdu_fee_clsf_cd(){
		return this.edu_fee_clsf_cd;
	}

	public String getEdu_cost_onta(){
		return this.edu_cost_onta;
	}

	public String getEdu_cost_etc(){
		return this.edu_cost_etc;
	}

	public String getEdu_splen_pers_onta(){
		return this.edu_splen_pers_onta;
	}

	public String getEdu_splen_pers_etc(){
		return this.edu_splen_pers_etc;
	}

	public String getCrdt_card_tot_amt_onta(){
		return this.crdt_card_tot_amt_onta;
	}

	public String getCrdt_card_tot_amt_etc(){
		return this.crdt_card_tot_amt_etc;
	}

	public String getEdu_cost_giro_pymt_onta(){
		return this.edu_cost_giro_pymt_onta;
	}

	public String getEdu_cost_giro_pymt_etc(){
		return this.edu_cost_giro_pymt_etc;
	}

	public String getCash_rcpt_onta(){
		return this.cash_rcpt_onta;
	}

	public String getConnect_ip(){
		return this.connect_ip;
	}

	public String getConnect_userid(){
		return this.connect_userid;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_YADJM_5202_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_5202_ADM dm = (HD_YADJM_5202_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.adjm_rvrs_yy);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.faml_seq);
		cstmt.setString(8, dm.faml_rshp_cd);
		cstmt.setString(9, dm.faml_prn);
		cstmt.setString(10, dm.faml_flnm);
		cstmt.setString(11, dm.base_dduc_yn);
		cstmt.setString(12, dm.child_dduc_yn);
		cstmt.setString(13, dm.oldg_dduc_yn);
		cstmt.setString(14, dm.spos_dduc_yn);
		cstmt.setString(15, dm.rspc_dduc_yn);
		cstmt.setString(16, dm.care_fee_dduc_yn);
		cstmt.setString(17, dm.fml_hshd_dduc_yn);
		cstmt.setString(18, dm.obcl_pers_dduc_yn);
		cstmt.setString(19, dm.nmat_yn);
		cstmt.setString(20, dm.dth_dt);
		cstmt.setString(21, dm.adopt_dt);
		cstmt.setString(22, dm.asrc_prpn_insr_fee_onta);
		cstmt.setString(23, dm.asrc_prpn_insr_fee_etc);
		cstmt.setString(24, dm.obcl_pers_insr_onta);
		cstmt.setString(25, dm.obcl_pers_insr_etc);
		cstmt.setString(26, dm.hosp_cost_slf_onta);
		cstmt.setString(27, dm.hosp_cost_slf_etc);
		cstmt.setString(28, dm.hosp_cost_onta);
		cstmt.setString(29, dm.hosp_cost_etc);
		cstmt.setString(30, dm.dduc_polt_fund);
		cstmt.setString(31, dm.lgl_dona_amt_etc);
		cstmt.setString(32, dm.spc_case_dona_amt_etc);
		cstmt.setString(33, dm.appm_dona_amt_etc);
		cstmt.setString(34, dm.relg_appm_dona_amt_etc);
		cstmt.setString(35, dm.edu_fee_clsf_cd);
		cstmt.setString(36, dm.edu_cost_onta);
		cstmt.setString(37, dm.edu_cost_etc);
		cstmt.setString(38, dm.edu_splen_pers_onta);
		cstmt.setString(39, dm.edu_splen_pers_etc);
		cstmt.setString(40, dm.crdt_card_tot_amt_onta);
		cstmt.setString(41, dm.crdt_card_tot_amt_etc);
		cstmt.setString(42, dm.edu_cost_giro_pymt_onta);
		cstmt.setString(43, dm.edu_cost_giro_pymt_etc);
		cstmt.setString(44, dm.cash_rcpt_onta);
		cstmt.setString(45, dm.connect_ip);
		cstmt.setString(46, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_YADJM_5202_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("adjm_rvrs_yy = [" + getAdjm_rvrs_yy() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("faml_seq = [" + getFaml_seq() + "]");
		System.out.println("faml_rshp_cd = [" + getFaml_rshp_cd() + "]");
		System.out.println("faml_prn = [" + getFaml_prn() + "]");
		System.out.println("faml_flnm = [" + getFaml_flnm() + "]");
		System.out.println("base_dduc_yn = [" + getBase_dduc_yn() + "]");
		System.out.println("child_dduc_yn = [" + getChild_dduc_yn() + "]");
		System.out.println("oldg_dduc_yn = [" + getOldg_dduc_yn() + "]");
		System.out.println("spos_dduc_yn = [" + getSpos_dduc_yn() + "]");
		System.out.println("rspc_dduc_yn = [" + getRspc_dduc_yn() + "]");
		System.out.println("care_fee_dduc_yn = [" + getCare_fee_dduc_yn() + "]");
		System.out.println("fml_hshd_dduc_yn = [" + getFml_hshd_dduc_yn() + "]");
		System.out.println("obcl_pers_dduc_yn = [" + getObcl_pers_dduc_yn() + "]");
		System.out.println("nmat_yn = [" + getNmat_yn() + "]");
		System.out.println("dth_dt = [" + getDth_dt() + "]");
		System.out.println("adopt_dt = [" + getAdopt_dt() + "]");
		System.out.println("asrc_prpn_insr_fee_onta = [" + getAsrc_prpn_insr_fee_onta() + "]");
		System.out.println("asrc_prpn_insr_fee_etc = [" + getAsrc_prpn_insr_fee_etc() + "]");
		System.out.println("obcl_pers_insr_onta = [" + getObcl_pers_insr_onta() + "]");
		System.out.println("obcl_pers_insr_etc = [" + getObcl_pers_insr_etc() + "]");
		System.out.println("hosp_cost_slf_onta = [" + getHosp_cost_slf_onta() + "]");
		System.out.println("hosp_cost_slf_etc = [" + getHosp_cost_slf_etc() + "]");
		System.out.println("hosp_cost_onta = [" + getHosp_cost_onta() + "]");
		System.out.println("hosp_cost_etc = [" + getHosp_cost_etc() + "]");
		System.out.println("dduc_polt_fund = [" + getDduc_polt_fund() + "]");
		System.out.println("lgl_dona_amt_etc = [" + getLgl_dona_amt_etc() + "]");
		System.out.println("spc_case_dona_amt_etc = [" + getSpc_case_dona_amt_etc() + "]");
		System.out.println("appm_dona_amt_etc = [" + getAppm_dona_amt_etc() + "]");
		System.out.println("relg_appm_dona_amt_etc = [" + getRelg_appm_dona_amt_etc() + "]");
		System.out.println("edu_fee_clsf_cd = [" + getEdu_fee_clsf_cd() + "]");
		System.out.println("edu_cost_onta = [" + getEdu_cost_onta() + "]");
		System.out.println("edu_cost_etc = [" + getEdu_cost_etc() + "]");
		System.out.println("edu_splen_pers_onta = [" + getEdu_splen_pers_onta() + "]");
		System.out.println("edu_splen_pers_etc = [" + getEdu_splen_pers_etc() + "]");
		System.out.println("crdt_card_tot_amt_onta = [" + getCrdt_card_tot_amt_onta() + "]");
		System.out.println("crdt_card_tot_amt_etc = [" + getCrdt_card_tot_amt_etc() + "]");
		System.out.println("edu_cost_giro_pymt_onta = [" + getEdu_cost_giro_pymt_onta() + "]");
		System.out.println("edu_cost_giro_pymt_etc = [" + getEdu_cost_giro_pymt_etc() + "]");
		System.out.println("cash_rcpt_onta = [" + getCash_rcpt_onta() + "]");
		System.out.println("connect_ip = [" + getConnect_ip() + "]");
		System.out.println("connect_userid = [" + getConnect_userid() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String adjm_rvrs_yy = req.getParameter("adjm_rvrs_yy");
if( adjm_rvrs_yy == null){
	System.out.println(this.toString+" : adjm_rvrs_yy is null" );
}else{
	System.out.println(this.toString+" : adjm_rvrs_yy is "+adjm_rvrs_yy );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String faml_seq = req.getParameter("faml_seq");
if( faml_seq == null){
	System.out.println(this.toString+" : faml_seq is null" );
}else{
	System.out.println(this.toString+" : faml_seq is "+faml_seq );
}
String faml_rshp_cd = req.getParameter("faml_rshp_cd");
if( faml_rshp_cd == null){
	System.out.println(this.toString+" : faml_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : faml_rshp_cd is "+faml_rshp_cd );
}
String faml_prn = req.getParameter("faml_prn");
if( faml_prn == null){
	System.out.println(this.toString+" : faml_prn is null" );
}else{
	System.out.println(this.toString+" : faml_prn is "+faml_prn );
}
String faml_flnm = req.getParameter("faml_flnm");
if( faml_flnm == null){
	System.out.println(this.toString+" : faml_flnm is null" );
}else{
	System.out.println(this.toString+" : faml_flnm is "+faml_flnm );
}
String base_dduc_yn = req.getParameter("base_dduc_yn");
if( base_dduc_yn == null){
	System.out.println(this.toString+" : base_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : base_dduc_yn is "+base_dduc_yn );
}
String child_dduc_yn = req.getParameter("child_dduc_yn");
if( child_dduc_yn == null){
	System.out.println(this.toString+" : child_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : child_dduc_yn is "+child_dduc_yn );
}
String oldg_dduc_yn = req.getParameter("oldg_dduc_yn");
if( oldg_dduc_yn == null){
	System.out.println(this.toString+" : oldg_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : oldg_dduc_yn is "+oldg_dduc_yn );
}
String spos_dduc_yn = req.getParameter("spos_dduc_yn");
if( spos_dduc_yn == null){
	System.out.println(this.toString+" : spos_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : spos_dduc_yn is "+spos_dduc_yn );
}
String rspc_dduc_yn = req.getParameter("rspc_dduc_yn");
if( rspc_dduc_yn == null){
	System.out.println(this.toString+" : rspc_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : rspc_dduc_yn is "+rspc_dduc_yn );
}
String care_fee_dduc_yn = req.getParameter("care_fee_dduc_yn");
if( care_fee_dduc_yn == null){
	System.out.println(this.toString+" : care_fee_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : care_fee_dduc_yn is "+care_fee_dduc_yn );
}
String fml_hshd_dduc_yn = req.getParameter("fml_hshd_dduc_yn");
if( fml_hshd_dduc_yn == null){
	System.out.println(this.toString+" : fml_hshd_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : fml_hshd_dduc_yn is "+fml_hshd_dduc_yn );
}
String obcl_pers_dduc_yn = req.getParameter("obcl_pers_dduc_yn");
if( obcl_pers_dduc_yn == null){
	System.out.println(this.toString+" : obcl_pers_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_dduc_yn is "+obcl_pers_dduc_yn );
}
String nmat_yn = req.getParameter("nmat_yn");
if( nmat_yn == null){
	System.out.println(this.toString+" : nmat_yn is null" );
}else{
	System.out.println(this.toString+" : nmat_yn is "+nmat_yn );
}
String dth_dt = req.getParameter("dth_dt");
if( dth_dt == null){
	System.out.println(this.toString+" : dth_dt is null" );
}else{
	System.out.println(this.toString+" : dth_dt is "+dth_dt );
}
String adopt_dt = req.getParameter("adopt_dt");
if( adopt_dt == null){
	System.out.println(this.toString+" : adopt_dt is null" );
}else{
	System.out.println(this.toString+" : adopt_dt is "+adopt_dt );
}
String asrc_prpn_insr_fee_onta = req.getParameter("asrc_prpn_insr_fee_onta");
if( asrc_prpn_insr_fee_onta == null){
	System.out.println(this.toString+" : asrc_prpn_insr_fee_onta is null" );
}else{
	System.out.println(this.toString+" : asrc_prpn_insr_fee_onta is "+asrc_prpn_insr_fee_onta );
}
String asrc_prpn_insr_fee_etc = req.getParameter("asrc_prpn_insr_fee_etc");
if( asrc_prpn_insr_fee_etc == null){
	System.out.println(this.toString+" : asrc_prpn_insr_fee_etc is null" );
}else{
	System.out.println(this.toString+" : asrc_prpn_insr_fee_etc is "+asrc_prpn_insr_fee_etc );
}
String obcl_pers_insr_onta = req.getParameter("obcl_pers_insr_onta");
if( obcl_pers_insr_onta == null){
	System.out.println(this.toString+" : obcl_pers_insr_onta is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_insr_onta is "+obcl_pers_insr_onta );
}
String obcl_pers_insr_etc = req.getParameter("obcl_pers_insr_etc");
if( obcl_pers_insr_etc == null){
	System.out.println(this.toString+" : obcl_pers_insr_etc is null" );
}else{
	System.out.println(this.toString+" : obcl_pers_insr_etc is "+obcl_pers_insr_etc );
}
String hosp_cost_slf_onta = req.getParameter("hosp_cost_slf_onta");
if( hosp_cost_slf_onta == null){
	System.out.println(this.toString+" : hosp_cost_slf_onta is null" );
}else{
	System.out.println(this.toString+" : hosp_cost_slf_onta is "+hosp_cost_slf_onta );
}
String hosp_cost_slf_etc = req.getParameter("hosp_cost_slf_etc");
if( hosp_cost_slf_etc == null){
	System.out.println(this.toString+" : hosp_cost_slf_etc is null" );
}else{
	System.out.println(this.toString+" : hosp_cost_slf_etc is "+hosp_cost_slf_etc );
}
String hosp_cost_onta = req.getParameter("hosp_cost_onta");
if( hosp_cost_onta == null){
	System.out.println(this.toString+" : hosp_cost_onta is null" );
}else{
	System.out.println(this.toString+" : hosp_cost_onta is "+hosp_cost_onta );
}
String hosp_cost_etc = req.getParameter("hosp_cost_etc");
if( hosp_cost_etc == null){
	System.out.println(this.toString+" : hosp_cost_etc is null" );
}else{
	System.out.println(this.toString+" : hosp_cost_etc is "+hosp_cost_etc );
}
String dduc_polt_fund = req.getParameter("dduc_polt_fund");
if( dduc_polt_fund == null){
	System.out.println(this.toString+" : dduc_polt_fund is null" );
}else{
	System.out.println(this.toString+" : dduc_polt_fund is "+dduc_polt_fund );
}
String lgl_dona_amt_etc = req.getParameter("lgl_dona_amt_etc");
if( lgl_dona_amt_etc == null){
	System.out.println(this.toString+" : lgl_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : lgl_dona_amt_etc is "+lgl_dona_amt_etc );
}
String spc_case_dona_amt_etc = req.getParameter("spc_case_dona_amt_etc");
if( spc_case_dona_amt_etc == null){
	System.out.println(this.toString+" : spc_case_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : spc_case_dona_amt_etc is "+spc_case_dona_amt_etc );
}
String appm_dona_amt_etc = req.getParameter("appm_dona_amt_etc");
if( appm_dona_amt_etc == null){
	System.out.println(this.toString+" : appm_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : appm_dona_amt_etc is "+appm_dona_amt_etc );
}
String relg_appm_dona_amt_etc = req.getParameter("relg_appm_dona_amt_etc");
if( relg_appm_dona_amt_etc == null){
	System.out.println(this.toString+" : relg_appm_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : relg_appm_dona_amt_etc is "+relg_appm_dona_amt_etc );
}
String edu_fee_clsf_cd = req.getParameter("edu_fee_clsf_cd");
if( edu_fee_clsf_cd == null){
	System.out.println(this.toString+" : edu_fee_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : edu_fee_clsf_cd is "+edu_fee_clsf_cd );
}
String edu_cost_onta = req.getParameter("edu_cost_onta");
if( edu_cost_onta == null){
	System.out.println(this.toString+" : edu_cost_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_onta is "+edu_cost_onta );
}
String edu_cost_etc = req.getParameter("edu_cost_etc");
if( edu_cost_etc == null){
	System.out.println(this.toString+" : edu_cost_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_etc is "+edu_cost_etc );
}
String edu_splen_pers_onta = req.getParameter("edu_splen_pers_onta");
if( edu_splen_pers_onta == null){
	System.out.println(this.toString+" : edu_splen_pers_onta is null" );
}else{
	System.out.println(this.toString+" : edu_splen_pers_onta is "+edu_splen_pers_onta );
}
String edu_splen_pers_etc = req.getParameter("edu_splen_pers_etc");
if( edu_splen_pers_etc == null){
	System.out.println(this.toString+" : edu_splen_pers_etc is null" );
}else{
	System.out.println(this.toString+" : edu_splen_pers_etc is "+edu_splen_pers_etc );
}
String crdt_card_tot_amt_onta = req.getParameter("crdt_card_tot_amt_onta");
if( crdt_card_tot_amt_onta == null){
	System.out.println(this.toString+" : crdt_card_tot_amt_onta is null" );
}else{
	System.out.println(this.toString+" : crdt_card_tot_amt_onta is "+crdt_card_tot_amt_onta );
}
String crdt_card_tot_amt_etc = req.getParameter("crdt_card_tot_amt_etc");
if( crdt_card_tot_amt_etc == null){
	System.out.println(this.toString+" : crdt_card_tot_amt_etc is null" );
}else{
	System.out.println(this.toString+" : crdt_card_tot_amt_etc is "+crdt_card_tot_amt_etc );
}
String edu_cost_giro_pymt_onta = req.getParameter("edu_cost_giro_pymt_onta");
if( edu_cost_giro_pymt_onta == null){
	System.out.println(this.toString+" : edu_cost_giro_pymt_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_giro_pymt_onta is "+edu_cost_giro_pymt_onta );
}
String edu_cost_giro_pymt_etc = req.getParameter("edu_cost_giro_pymt_etc");
if( edu_cost_giro_pymt_etc == null){
	System.out.println(this.toString+" : edu_cost_giro_pymt_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_giro_pymt_etc is "+edu_cost_giro_pymt_etc );
}
String cash_rcpt_onta = req.getParameter("cash_rcpt_onta");
if( cash_rcpt_onta == null){
	System.out.println(this.toString+" : cash_rcpt_onta is null" );
}else{
	System.out.println(this.toString+" : cash_rcpt_onta is "+cash_rcpt_onta );
}
String connect_ip = req.getParameter("connect_ip");
if( connect_ip == null){
	System.out.println(this.toString+" : connect_ip is null" );
}else{
	System.out.println(this.toString+" : connect_ip is "+connect_ip );
}
String connect_userid = req.getParameter("connect_userid");
if( connect_userid == null){
	System.out.println(this.toString+" : connect_userid is null" );
}else{
	System.out.println(this.toString+" : connect_userid is "+connect_userid );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String adjm_rvrs_yy = Util.checkString(req.getParameter("adjm_rvrs_yy"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String faml_seq = Util.checkString(req.getParameter("faml_seq"));
String faml_rshp_cd = Util.checkString(req.getParameter("faml_rshp_cd"));
String faml_prn = Util.checkString(req.getParameter("faml_prn"));
String faml_flnm = Util.checkString(req.getParameter("faml_flnm"));
String base_dduc_yn = Util.checkString(req.getParameter("base_dduc_yn"));
String child_dduc_yn = Util.checkString(req.getParameter("child_dduc_yn"));
String oldg_dduc_yn = Util.checkString(req.getParameter("oldg_dduc_yn"));
String spos_dduc_yn = Util.checkString(req.getParameter("spos_dduc_yn"));
String rspc_dduc_yn = Util.checkString(req.getParameter("rspc_dduc_yn"));
String care_fee_dduc_yn = Util.checkString(req.getParameter("care_fee_dduc_yn"));
String fml_hshd_dduc_yn = Util.checkString(req.getParameter("fml_hshd_dduc_yn"));
String obcl_pers_dduc_yn = Util.checkString(req.getParameter("obcl_pers_dduc_yn"));
String nmat_yn = Util.checkString(req.getParameter("nmat_yn"));
String dth_dt = Util.checkString(req.getParameter("dth_dt"));
String adopt_dt = Util.checkString(req.getParameter("adopt_dt"));
String asrc_prpn_insr_fee_onta = Util.checkString(req.getParameter("asrc_prpn_insr_fee_onta"));
String asrc_prpn_insr_fee_etc = Util.checkString(req.getParameter("asrc_prpn_insr_fee_etc"));
String obcl_pers_insr_onta = Util.checkString(req.getParameter("obcl_pers_insr_onta"));
String obcl_pers_insr_etc = Util.checkString(req.getParameter("obcl_pers_insr_etc"));
String hosp_cost_slf_onta = Util.checkString(req.getParameter("hosp_cost_slf_onta"));
String hosp_cost_slf_etc = Util.checkString(req.getParameter("hosp_cost_slf_etc"));
String hosp_cost_onta = Util.checkString(req.getParameter("hosp_cost_onta"));
String hosp_cost_etc = Util.checkString(req.getParameter("hosp_cost_etc"));
String dduc_polt_fund = Util.checkString(req.getParameter("dduc_polt_fund"));
String lgl_dona_amt_etc = Util.checkString(req.getParameter("lgl_dona_amt_etc"));
String spc_case_dona_amt_etc = Util.checkString(req.getParameter("spc_case_dona_amt_etc"));
String appm_dona_amt_etc = Util.checkString(req.getParameter("appm_dona_amt_etc"));
String relg_appm_dona_amt_etc = Util.checkString(req.getParameter("relg_appm_dona_amt_etc"));
String edu_fee_clsf_cd = Util.checkString(req.getParameter("edu_fee_clsf_cd"));
String edu_cost_onta = Util.checkString(req.getParameter("edu_cost_onta"));
String edu_cost_etc = Util.checkString(req.getParameter("edu_cost_etc"));
String edu_splen_pers_onta = Util.checkString(req.getParameter("edu_splen_pers_onta"));
String edu_splen_pers_etc = Util.checkString(req.getParameter("edu_splen_pers_etc"));
String crdt_card_tot_amt_onta = Util.checkString(req.getParameter("crdt_card_tot_amt_onta"));
String crdt_card_tot_amt_etc = Util.checkString(req.getParameter("crdt_card_tot_amt_etc"));
String edu_cost_giro_pymt_onta = Util.checkString(req.getParameter("edu_cost_giro_pymt_onta"));
String edu_cost_giro_pymt_etc = Util.checkString(req.getParameter("edu_cost_giro_pymt_etc"));
String cash_rcpt_onta = Util.checkString(req.getParameter("cash_rcpt_onta"));
String connect_ip = Util.checkString(req.getParameter("connect_ip"));
String connect_userid = Util.checkString(req.getParameter("connect_userid"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String adjm_rvrs_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_rvrs_yy")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String faml_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_seq")));
String faml_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_rshp_cd")));
String faml_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_prn")));
String faml_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_flnm")));
String base_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dduc_yn")));
String child_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("child_dduc_yn")));
String oldg_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("oldg_dduc_yn")));
String spos_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_dduc_yn")));
String rspc_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rspc_dduc_yn")));
String care_fee_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("care_fee_dduc_yn")));
String fml_hshd_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fml_hshd_dduc_yn")));
String obcl_pers_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_dduc_yn")));
String nmat_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nmat_yn")));
String dth_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_dt")));
String adopt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adopt_dt")));
String asrc_prpn_insr_fee_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("asrc_prpn_insr_fee_onta")));
String asrc_prpn_insr_fee_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("asrc_prpn_insr_fee_etc")));
String obcl_pers_insr_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_onta")));
String obcl_pers_insr_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_etc")));
String hosp_cost_slf_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_cost_slf_onta")));
String hosp_cost_slf_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_cost_slf_etc")));
String hosp_cost_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_cost_onta")));
String hosp_cost_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_cost_etc")));
String dduc_polt_fund = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_polt_fund")));
String lgl_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_dona_amt_etc")));
String spc_case_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_case_dona_amt_etc")));
String appm_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("appm_dona_amt_etc")));
String relg_appm_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("relg_appm_dona_amt_etc")));
String edu_fee_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_fee_clsf_cd")));
String edu_cost_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_onta")));
String edu_cost_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_etc")));
String edu_splen_pers_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_splen_pers_onta")));
String edu_splen_pers_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_splen_pers_etc")));
String crdt_card_tot_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_tot_amt_onta")));
String crdt_card_tot_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_card_tot_amt_etc")));
String edu_cost_giro_pymt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_giro_pymt_onta")));
String edu_cost_giro_pymt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_giro_pymt_etc")));
String cash_rcpt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("cash_rcpt_onta")));
String connect_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_ip")));
String connect_userid = Util.Uni2Ksc(Util.checkString(req.getParameter("connect_userid")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setAdjm_rvrs_yy(adjm_rvrs_yy);
dm.setEmp_no(emp_no);
dm.setFaml_seq(faml_seq);
dm.setFaml_rshp_cd(faml_rshp_cd);
dm.setFaml_prn(faml_prn);
dm.setFaml_flnm(faml_flnm);
dm.setBase_dduc_yn(base_dduc_yn);
dm.setChild_dduc_yn(child_dduc_yn);
dm.setOldg_dduc_yn(oldg_dduc_yn);
dm.setSpos_dduc_yn(spos_dduc_yn);
dm.setRspc_dduc_yn(rspc_dduc_yn);
dm.setCare_fee_dduc_yn(care_fee_dduc_yn);
dm.setFml_hshd_dduc_yn(fml_hshd_dduc_yn);
dm.setObcl_pers_dduc_yn(obcl_pers_dduc_yn);
dm.setNmat_yn(nmat_yn);
dm.setDth_dt(dth_dt);
dm.setAdopt_dt(adopt_dt);
dm.setAsrc_prpn_insr_fee_onta(asrc_prpn_insr_fee_onta);
dm.setAsrc_prpn_insr_fee_etc(asrc_prpn_insr_fee_etc);
dm.setObcl_pers_insr_onta(obcl_pers_insr_onta);
dm.setObcl_pers_insr_etc(obcl_pers_insr_etc);
dm.setHosp_cost_slf_onta(hosp_cost_slf_onta);
dm.setHosp_cost_slf_etc(hosp_cost_slf_etc);
dm.setHosp_cost_onta(hosp_cost_onta);
dm.setHosp_cost_etc(hosp_cost_etc);
dm.setDduc_polt_fund(dduc_polt_fund);
dm.setLgl_dona_amt_etc(lgl_dona_amt_etc);
dm.setSpc_case_dona_amt_etc(spc_case_dona_amt_etc);
dm.setAppm_dona_amt_etc(appm_dona_amt_etc);
dm.setRelg_appm_dona_amt_etc(relg_appm_dona_amt_etc);
dm.setEdu_fee_clsf_cd(edu_fee_clsf_cd);
dm.setEdu_cost_onta(edu_cost_onta);
dm.setEdu_cost_etc(edu_cost_etc);
dm.setEdu_splen_pers_onta(edu_splen_pers_onta);
dm.setEdu_splen_pers_etc(edu_splen_pers_etc);
dm.setCrdt_card_tot_amt_onta(crdt_card_tot_amt_onta);
dm.setCrdt_card_tot_amt_etc(crdt_card_tot_amt_etc);
dm.setEdu_cost_giro_pymt_onta(edu_cost_giro_pymt_onta);
dm.setEdu_cost_giro_pymt_etc(edu_cost_giro_pymt_etc);
dm.setCash_rcpt_onta(cash_rcpt_onta);
dm.setConnect_ip(connect_ip);
dm.setConnect_userid(connect_userid);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 25 11:06:15 KST 2010 */