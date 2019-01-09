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


public class HD_YADJM_1223_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_prn;
	public String faml_flnm;
	public String asrc_prpn_insr_fee_onta;
	public String asrc_prpn_insr_fee_etc;
	public String obcl_pers_insr_onta;
	public String obcl_pers_insr_etc;
	public String hosp_cost_slf_onta;
	public String hosp_cost_slf_etc;
	public String hosp_fee_onta;
	public String hosp_fee_etc;
	public String lgl_dona_amt_onta;
	public String lgl_dona_amt_etc;
	public String spc_case_dona_amt_onta;
	public String spc_case_dona_amt_etc;
	public String emp_stok_ownr_onta;
	public String emp_stok_ownr_etc;
	public String appm_dona_amt_onta;
	public String appm_dona_amt_etc;
	public String relg_appm_dona_amt_onta;
	public String relg_appm_dona_amt_etc;
	public String edu_cost_slf_sclgg_onta;
	public String edu_cost_slf_sclgg_etc;
	public String edu_cost_slf_onta;
	public String edu_cost_slf_etc;
	public String edu_cost_ent_scl_onta;
	public String edu_cost_ent_scl_etc;
	public String edu_cost_elmihi_onta;
	public String edu_cost_elmihi_etc;
	public String edu_cost_univ_onta;
	public String edu_cost_univ_etc;
	public String edu_splen_pers_onta;
	public String edu_splen_pers_etc;
	public String crdt_card_tot_amt_onta;
	public String crdt_card_tot_amt_etc;
	public String edu_cost_giro_pymt_onta;
	public String edu_cost_giro_pymt_etc;
	public String cash_rcpt_onta;
	public String connect_ip;
	public String connect_userid;

	public HD_YADJM_1223_ADM(){}
	public HD_YADJM_1223_ADM(String cmpy_cd, String mode, String adjm_rvrs_yy, String emp_no, String faml_seq, String faml_rshp_cd, String faml_prn, String faml_flnm, String asrc_prpn_insr_fee_onta, String asrc_prpn_insr_fee_etc, String obcl_pers_insr_onta, String obcl_pers_insr_etc, String hosp_cost_slf_onta, String hosp_cost_slf_etc, String hosp_fee_onta, String hosp_fee_etc, String lgl_dona_amt_onta, String lgl_dona_amt_etc, String spc_case_dona_amt_onta, String spc_case_dona_amt_etc, String emp_stok_ownr_onta, String emp_stok_ownr_etc, String appm_dona_amt_onta, String appm_dona_amt_etc, String relg_appm_dona_amt_onta, String relg_appm_dona_amt_etc, String edu_cost_slf_sclgg_onta, String edu_cost_slf_sclgg_etc, String edu_cost_slf_onta, String edu_cost_slf_etc, String edu_cost_ent_scl_onta, String edu_cost_ent_scl_etc, String edu_cost_elmihi_onta, String edu_cost_elmihi_etc, String edu_cost_univ_onta, String edu_cost_univ_etc, String edu_splen_pers_onta, String edu_splen_pers_etc, String crdt_card_tot_amt_onta, String crdt_card_tot_amt_etc, String edu_cost_giro_pymt_onta, String edu_cost_giro_pymt_etc, String cash_rcpt_onta, String connect_ip, String connect_userid){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.adjm_rvrs_yy = adjm_rvrs_yy;
		this.emp_no = emp_no;
		this.faml_seq = faml_seq;
		this.faml_rshp_cd = faml_rshp_cd;
		this.faml_prn = faml_prn;
		this.faml_flnm = faml_flnm;
		this.asrc_prpn_insr_fee_onta = asrc_prpn_insr_fee_onta;
		this.asrc_prpn_insr_fee_etc = asrc_prpn_insr_fee_etc;
		this.obcl_pers_insr_onta = obcl_pers_insr_onta;
		this.obcl_pers_insr_etc = obcl_pers_insr_etc;
		this.hosp_cost_slf_onta = hosp_cost_slf_onta;
		this.hosp_cost_slf_etc = hosp_cost_slf_etc;
		this.hosp_fee_onta = hosp_fee_onta;
		this.hosp_fee_etc = hosp_fee_etc;
		this.lgl_dona_amt_onta = lgl_dona_amt_onta;
		this.lgl_dona_amt_etc = lgl_dona_amt_etc;
		this.spc_case_dona_amt_onta = spc_case_dona_amt_onta;
		this.spc_case_dona_amt_etc = spc_case_dona_amt_etc;
		this.emp_stok_ownr_onta = emp_stok_ownr_onta;
		this.emp_stok_ownr_etc = emp_stok_ownr_etc;
		this.appm_dona_amt_onta = appm_dona_amt_onta;
		this.appm_dona_amt_etc = appm_dona_amt_etc;
		this.relg_appm_dona_amt_onta = relg_appm_dona_amt_onta;
		this.relg_appm_dona_amt_etc = relg_appm_dona_amt_etc;
		this.edu_cost_slf_sclgg_onta = edu_cost_slf_sclgg_onta;
		this.edu_cost_slf_sclgg_etc = edu_cost_slf_sclgg_etc;
		this.edu_cost_slf_onta = edu_cost_slf_onta;
		this.edu_cost_slf_etc = edu_cost_slf_etc;
		this.edu_cost_ent_scl_onta = edu_cost_ent_scl_onta;
		this.edu_cost_ent_scl_etc = edu_cost_ent_scl_etc;
		this.edu_cost_elmihi_onta = edu_cost_elmihi_onta;
		this.edu_cost_elmihi_etc = edu_cost_elmihi_etc;
		this.edu_cost_univ_onta = edu_cost_univ_onta;
		this.edu_cost_univ_etc = edu_cost_univ_etc;
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

	public void setHosp_fee_onta(String hosp_fee_onta){
		this.hosp_fee_onta = hosp_fee_onta;
	}

	public void setHosp_fee_etc(String hosp_fee_etc){
		this.hosp_fee_etc = hosp_fee_etc;
	}

	public void setLgl_dona_amt_onta(String lgl_dona_amt_onta){
		this.lgl_dona_amt_onta = lgl_dona_amt_onta;
	}

	public void setLgl_dona_amt_etc(String lgl_dona_amt_etc){
		this.lgl_dona_amt_etc = lgl_dona_amt_etc;
	}

	public void setSpc_case_dona_amt_onta(String spc_case_dona_amt_onta){
		this.spc_case_dona_amt_onta = spc_case_dona_amt_onta;
	}

	public void setSpc_case_dona_amt_etc(String spc_case_dona_amt_etc){
		this.spc_case_dona_amt_etc = spc_case_dona_amt_etc;
	}

	public void setEmp_stok_ownr_onta(String emp_stok_ownr_onta){
		this.emp_stok_ownr_onta = emp_stok_ownr_onta;
	}

	public void setEmp_stok_ownr_etc(String emp_stok_ownr_etc){
		this.emp_stok_ownr_etc = emp_stok_ownr_etc;
	}

	public void setAppm_dona_amt_onta(String appm_dona_amt_onta){
		this.appm_dona_amt_onta = appm_dona_amt_onta;
	}

	public void setAppm_dona_amt_etc(String appm_dona_amt_etc){
		this.appm_dona_amt_etc = appm_dona_amt_etc;
	}

	public void setRelg_appm_dona_amt_onta(String relg_appm_dona_amt_onta){
		this.relg_appm_dona_amt_onta = relg_appm_dona_amt_onta;
	}

	public void setRelg_appm_dona_amt_etc(String relg_appm_dona_amt_etc){
		this.relg_appm_dona_amt_etc = relg_appm_dona_amt_etc;
	}

	public void setEdu_cost_slf_sclgg_onta(String edu_cost_slf_sclgg_onta){
		this.edu_cost_slf_sclgg_onta = edu_cost_slf_sclgg_onta;
	}

	public void setEdu_cost_slf_sclgg_etc(String edu_cost_slf_sclgg_etc){
		this.edu_cost_slf_sclgg_etc = edu_cost_slf_sclgg_etc;
	}

	public void setEdu_cost_slf_onta(String edu_cost_slf_onta){
		this.edu_cost_slf_onta = edu_cost_slf_onta;
	}

	public void setEdu_cost_slf_etc(String edu_cost_slf_etc){
		this.edu_cost_slf_etc = edu_cost_slf_etc;
	}

	public void setEdu_cost_ent_scl_onta(String edu_cost_ent_scl_onta){
		this.edu_cost_ent_scl_onta = edu_cost_ent_scl_onta;
	}

	public void setEdu_cost_ent_scl_etc(String edu_cost_ent_scl_etc){
		this.edu_cost_ent_scl_etc = edu_cost_ent_scl_etc;
	}

	public void setEdu_cost_elmihi_onta(String edu_cost_elmihi_onta){
		this.edu_cost_elmihi_onta = edu_cost_elmihi_onta;
	}

	public void setEdu_cost_elmihi_etc(String edu_cost_elmihi_etc){
		this.edu_cost_elmihi_etc = edu_cost_elmihi_etc;
	}

	public void setEdu_cost_univ_onta(String edu_cost_univ_onta){
		this.edu_cost_univ_onta = edu_cost_univ_onta;
	}

	public void setEdu_cost_univ_etc(String edu_cost_univ_etc){
		this.edu_cost_univ_etc = edu_cost_univ_etc;
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

	public String getHosp_fee_onta(){
		return this.hosp_fee_onta;
	}

	public String getHosp_fee_etc(){
		return this.hosp_fee_etc;
	}

	public String getLgl_dona_amt_onta(){
		return this.lgl_dona_amt_onta;
	}

	public String getLgl_dona_amt_etc(){
		return this.lgl_dona_amt_etc;
	}

	public String getSpc_case_dona_amt_onta(){
		return this.spc_case_dona_amt_onta;
	}

	public String getSpc_case_dona_amt_etc(){
		return this.spc_case_dona_amt_etc;
	}

	public String getEmp_stok_ownr_onta(){
		return this.emp_stok_ownr_onta;
	}

	public String getEmp_stok_ownr_etc(){
		return this.emp_stok_ownr_etc;
	}

	public String getAppm_dona_amt_onta(){
		return this.appm_dona_amt_onta;
	}

	public String getAppm_dona_amt_etc(){
		return this.appm_dona_amt_etc;
	}

	public String getRelg_appm_dona_amt_onta(){
		return this.relg_appm_dona_amt_onta;
	}

	public String getRelg_appm_dona_amt_etc(){
		return this.relg_appm_dona_amt_etc;
	}

	public String getEdu_cost_slf_sclgg_onta(){
		return this.edu_cost_slf_sclgg_onta;
	}

	public String getEdu_cost_slf_sclgg_etc(){
		return this.edu_cost_slf_sclgg_etc;
	}

	public String getEdu_cost_slf_onta(){
		return this.edu_cost_slf_onta;
	}

	public String getEdu_cost_slf_etc(){
		return this.edu_cost_slf_etc;
	}

	public String getEdu_cost_ent_scl_onta(){
		return this.edu_cost_ent_scl_onta;
	}

	public String getEdu_cost_ent_scl_etc(){
		return this.edu_cost_ent_scl_etc;
	}

	public String getEdu_cost_elmihi_onta(){
		return this.edu_cost_elmihi_onta;
	}

	public String getEdu_cost_elmihi_etc(){
		return this.edu_cost_elmihi_etc;
	}

	public String getEdu_cost_univ_onta(){
		return this.edu_cost_univ_onta;
	}

	public String getEdu_cost_univ_etc(){
		return this.edu_cost_univ_etc;
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
		 return "{ call MISHDL.SP_HD_YADJM_1223_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_YADJM_1223_ADM dm = (HD_YADJM_1223_ADM)bdm;
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
		cstmt.setString(11, dm.asrc_prpn_insr_fee_onta);
		cstmt.setString(12, dm.asrc_prpn_insr_fee_etc);
		cstmt.setString(13, dm.obcl_pers_insr_onta);
		cstmt.setString(14, dm.obcl_pers_insr_etc);
		cstmt.setString(15, dm.hosp_cost_slf_onta);
		cstmt.setString(16, dm.hosp_cost_slf_etc);
		cstmt.setString(17, dm.hosp_fee_onta);
		cstmt.setString(18, dm.hosp_fee_etc);
		cstmt.setString(19, dm.lgl_dona_amt_onta);
		cstmt.setString(20, dm.lgl_dona_amt_etc);
		cstmt.setString(21, dm.spc_case_dona_amt_onta);
		cstmt.setString(22, dm.spc_case_dona_amt_etc);
		cstmt.setString(23, dm.emp_stok_ownr_onta);
		cstmt.setString(24, dm.emp_stok_ownr_etc);
		cstmt.setString(25, dm.appm_dona_amt_onta);
		cstmt.setString(26, dm.appm_dona_amt_etc);
		cstmt.setString(27, dm.relg_appm_dona_amt_onta);
		cstmt.setString(28, dm.relg_appm_dona_amt_etc);
		cstmt.setString(29, dm.edu_cost_slf_sclgg_onta);
		cstmt.setString(30, dm.edu_cost_slf_sclgg_etc);
		cstmt.setString(31, dm.edu_cost_slf_onta);
		cstmt.setString(32, dm.edu_cost_slf_etc);
		cstmt.setString(33, dm.edu_cost_ent_scl_onta);
		cstmt.setString(34, dm.edu_cost_ent_scl_etc);
		cstmt.setString(35, dm.edu_cost_elmihi_onta);
		cstmt.setString(36, dm.edu_cost_elmihi_etc);
		cstmt.setString(37, dm.edu_cost_univ_onta);
		cstmt.setString(38, dm.edu_cost_univ_etc);
		cstmt.setString(39, dm.edu_splen_pers_onta);
		cstmt.setString(40, dm.edu_splen_pers_etc);
		cstmt.setString(41, dm.crdt_card_tot_amt_onta);
		cstmt.setString(42, dm.crdt_card_tot_amt_etc);
		cstmt.setString(43, dm.edu_cost_giro_pymt_onta);
		cstmt.setString(44, dm.edu_cost_giro_pymt_etc);
		cstmt.setString(45, dm.cash_rcpt_onta);
		cstmt.setString(46, dm.connect_ip);
		cstmt.setString(47, dm.connect_userid);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.yadjm.ds.HD_YADJM_1223_ADataSet();
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
		System.out.println("asrc_prpn_insr_fee_onta = [" + getAsrc_prpn_insr_fee_onta() + "]");
		System.out.println("asrc_prpn_insr_fee_etc = [" + getAsrc_prpn_insr_fee_etc() + "]");
		System.out.println("obcl_pers_insr_onta = [" + getObcl_pers_insr_onta() + "]");
		System.out.println("obcl_pers_insr_etc = [" + getObcl_pers_insr_etc() + "]");
		System.out.println("hosp_cost_slf_onta = [" + getHosp_cost_slf_onta() + "]");
		System.out.println("hosp_cost_slf_etc = [" + getHosp_cost_slf_etc() + "]");
		System.out.println("hosp_fee_onta = [" + getHosp_fee_onta() + "]");
		System.out.println("hosp_fee_etc = [" + getHosp_fee_etc() + "]");
		System.out.println("lgl_dona_amt_onta = [" + getLgl_dona_amt_onta() + "]");
		System.out.println("lgl_dona_amt_etc = [" + getLgl_dona_amt_etc() + "]");
		System.out.println("spc_case_dona_amt_onta = [" + getSpc_case_dona_amt_onta() + "]");
		System.out.println("spc_case_dona_amt_etc = [" + getSpc_case_dona_amt_etc() + "]");
		System.out.println("emp_stok_ownr_onta = [" + getEmp_stok_ownr_onta() + "]");
		System.out.println("emp_stok_ownr_etc = [" + getEmp_stok_ownr_etc() + "]");
		System.out.println("appm_dona_amt_onta = [" + getAppm_dona_amt_onta() + "]");
		System.out.println("appm_dona_amt_etc = [" + getAppm_dona_amt_etc() + "]");
		System.out.println("relg_appm_dona_amt_onta = [" + getRelg_appm_dona_amt_onta() + "]");
		System.out.println("relg_appm_dona_amt_etc = [" + getRelg_appm_dona_amt_etc() + "]");
		System.out.println("edu_cost_slf_sclgg_onta = [" + getEdu_cost_slf_sclgg_onta() + "]");
		System.out.println("edu_cost_slf_sclgg_etc = [" + getEdu_cost_slf_sclgg_etc() + "]");
		System.out.println("edu_cost_slf_onta = [" + getEdu_cost_slf_onta() + "]");
		System.out.println("edu_cost_slf_etc = [" + getEdu_cost_slf_etc() + "]");
		System.out.println("edu_cost_ent_scl_onta = [" + getEdu_cost_ent_scl_onta() + "]");
		System.out.println("edu_cost_ent_scl_etc = [" + getEdu_cost_ent_scl_etc() + "]");
		System.out.println("edu_cost_elmihi_onta = [" + getEdu_cost_elmihi_onta() + "]");
		System.out.println("edu_cost_elmihi_etc = [" + getEdu_cost_elmihi_etc() + "]");
		System.out.println("edu_cost_univ_onta = [" + getEdu_cost_univ_onta() + "]");
		System.out.println("edu_cost_univ_etc = [" + getEdu_cost_univ_etc() + "]");
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
String hosp_fee_onta = req.getParameter("hosp_fee_onta");
if( hosp_fee_onta == null){
	System.out.println(this.toString+" : hosp_fee_onta is null" );
}else{
	System.out.println(this.toString+" : hosp_fee_onta is "+hosp_fee_onta );
}
String hosp_fee_etc = req.getParameter("hosp_fee_etc");
if( hosp_fee_etc == null){
	System.out.println(this.toString+" : hosp_fee_etc is null" );
}else{
	System.out.println(this.toString+" : hosp_fee_etc is "+hosp_fee_etc );
}
String lgl_dona_amt_onta = req.getParameter("lgl_dona_amt_onta");
if( lgl_dona_amt_onta == null){
	System.out.println(this.toString+" : lgl_dona_amt_onta is null" );
}else{
	System.out.println(this.toString+" : lgl_dona_amt_onta is "+lgl_dona_amt_onta );
}
String lgl_dona_amt_etc = req.getParameter("lgl_dona_amt_etc");
if( lgl_dona_amt_etc == null){
	System.out.println(this.toString+" : lgl_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : lgl_dona_amt_etc is "+lgl_dona_amt_etc );
}
String spc_case_dona_amt_onta = req.getParameter("spc_case_dona_amt_onta");
if( spc_case_dona_amt_onta == null){
	System.out.println(this.toString+" : spc_case_dona_amt_onta is null" );
}else{
	System.out.println(this.toString+" : spc_case_dona_amt_onta is "+spc_case_dona_amt_onta );
}
String spc_case_dona_amt_etc = req.getParameter("spc_case_dona_amt_etc");
if( spc_case_dona_amt_etc == null){
	System.out.println(this.toString+" : spc_case_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : spc_case_dona_amt_etc is "+spc_case_dona_amt_etc );
}
String emp_stok_ownr_onta = req.getParameter("emp_stok_ownr_onta");
if( emp_stok_ownr_onta == null){
	System.out.println(this.toString+" : emp_stok_ownr_onta is null" );
}else{
	System.out.println(this.toString+" : emp_stok_ownr_onta is "+emp_stok_ownr_onta );
}
String emp_stok_ownr_etc = req.getParameter("emp_stok_ownr_etc");
if( emp_stok_ownr_etc == null){
	System.out.println(this.toString+" : emp_stok_ownr_etc is null" );
}else{
	System.out.println(this.toString+" : emp_stok_ownr_etc is "+emp_stok_ownr_etc );
}
String appm_dona_amt_onta = req.getParameter("appm_dona_amt_onta");
if( appm_dona_amt_onta == null){
	System.out.println(this.toString+" : appm_dona_amt_onta is null" );
}else{
	System.out.println(this.toString+" : appm_dona_amt_onta is "+appm_dona_amt_onta );
}
String appm_dona_amt_etc = req.getParameter("appm_dona_amt_etc");
if( appm_dona_amt_etc == null){
	System.out.println(this.toString+" : appm_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : appm_dona_amt_etc is "+appm_dona_amt_etc );
}
String relg_appm_dona_amt_onta = req.getParameter("relg_appm_dona_amt_onta");
if( relg_appm_dona_amt_onta == null){
	System.out.println(this.toString+" : relg_appm_dona_amt_onta is null" );
}else{
	System.out.println(this.toString+" : relg_appm_dona_amt_onta is "+relg_appm_dona_amt_onta );
}
String relg_appm_dona_amt_etc = req.getParameter("relg_appm_dona_amt_etc");
if( relg_appm_dona_amt_etc == null){
	System.out.println(this.toString+" : relg_appm_dona_amt_etc is null" );
}else{
	System.out.println(this.toString+" : relg_appm_dona_amt_etc is "+relg_appm_dona_amt_etc );
}
String edu_cost_slf_sclgg_onta = req.getParameter("edu_cost_slf_sclgg_onta");
if( edu_cost_slf_sclgg_onta == null){
	System.out.println(this.toString+" : edu_cost_slf_sclgg_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_slf_sclgg_onta is "+edu_cost_slf_sclgg_onta );
}
String edu_cost_slf_sclgg_etc = req.getParameter("edu_cost_slf_sclgg_etc");
if( edu_cost_slf_sclgg_etc == null){
	System.out.println(this.toString+" : edu_cost_slf_sclgg_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_slf_sclgg_etc is "+edu_cost_slf_sclgg_etc );
}
String edu_cost_slf_onta = req.getParameter("edu_cost_slf_onta");
if( edu_cost_slf_onta == null){
	System.out.println(this.toString+" : edu_cost_slf_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_slf_onta is "+edu_cost_slf_onta );
}
String edu_cost_slf_etc = req.getParameter("edu_cost_slf_etc");
if( edu_cost_slf_etc == null){
	System.out.println(this.toString+" : edu_cost_slf_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_slf_etc is "+edu_cost_slf_etc );
}
String edu_cost_ent_scl_onta = req.getParameter("edu_cost_ent_scl_onta");
if( edu_cost_ent_scl_onta == null){
	System.out.println(this.toString+" : edu_cost_ent_scl_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_ent_scl_onta is "+edu_cost_ent_scl_onta );
}
String edu_cost_ent_scl_etc = req.getParameter("edu_cost_ent_scl_etc");
if( edu_cost_ent_scl_etc == null){
	System.out.println(this.toString+" : edu_cost_ent_scl_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_ent_scl_etc is "+edu_cost_ent_scl_etc );
}
String edu_cost_elmihi_onta = req.getParameter("edu_cost_elmihi_onta");
if( edu_cost_elmihi_onta == null){
	System.out.println(this.toString+" : edu_cost_elmihi_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_elmihi_onta is "+edu_cost_elmihi_onta );
}
String edu_cost_elmihi_etc = req.getParameter("edu_cost_elmihi_etc");
if( edu_cost_elmihi_etc == null){
	System.out.println(this.toString+" : edu_cost_elmihi_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_elmihi_etc is "+edu_cost_elmihi_etc );
}
String edu_cost_univ_onta = req.getParameter("edu_cost_univ_onta");
if( edu_cost_univ_onta == null){
	System.out.println(this.toString+" : edu_cost_univ_onta is null" );
}else{
	System.out.println(this.toString+" : edu_cost_univ_onta is "+edu_cost_univ_onta );
}
String edu_cost_univ_etc = req.getParameter("edu_cost_univ_etc");
if( edu_cost_univ_etc == null){
	System.out.println(this.toString+" : edu_cost_univ_etc is null" );
}else{
	System.out.println(this.toString+" : edu_cost_univ_etc is "+edu_cost_univ_etc );
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
String asrc_prpn_insr_fee_onta = Util.checkString(req.getParameter("asrc_prpn_insr_fee_onta"));
String asrc_prpn_insr_fee_etc = Util.checkString(req.getParameter("asrc_prpn_insr_fee_etc"));
String obcl_pers_insr_onta = Util.checkString(req.getParameter("obcl_pers_insr_onta"));
String obcl_pers_insr_etc = Util.checkString(req.getParameter("obcl_pers_insr_etc"));
String hosp_cost_slf_onta = Util.checkString(req.getParameter("hosp_cost_slf_onta"));
String hosp_cost_slf_etc = Util.checkString(req.getParameter("hosp_cost_slf_etc"));
String hosp_fee_onta = Util.checkString(req.getParameter("hosp_fee_onta"));
String hosp_fee_etc = Util.checkString(req.getParameter("hosp_fee_etc"));
String lgl_dona_amt_onta = Util.checkString(req.getParameter("lgl_dona_amt_onta"));
String lgl_dona_amt_etc = Util.checkString(req.getParameter("lgl_dona_amt_etc"));
String spc_case_dona_amt_onta = Util.checkString(req.getParameter("spc_case_dona_amt_onta"));
String spc_case_dona_amt_etc = Util.checkString(req.getParameter("spc_case_dona_amt_etc"));
String emp_stok_ownr_onta = Util.checkString(req.getParameter("emp_stok_ownr_onta"));
String emp_stok_ownr_etc = Util.checkString(req.getParameter("emp_stok_ownr_etc"));
String appm_dona_amt_onta = Util.checkString(req.getParameter("appm_dona_amt_onta"));
String appm_dona_amt_etc = Util.checkString(req.getParameter("appm_dona_amt_etc"));
String relg_appm_dona_amt_onta = Util.checkString(req.getParameter("relg_appm_dona_amt_onta"));
String relg_appm_dona_amt_etc = Util.checkString(req.getParameter("relg_appm_dona_amt_etc"));
String edu_cost_slf_sclgg_onta = Util.checkString(req.getParameter("edu_cost_slf_sclgg_onta"));
String edu_cost_slf_sclgg_etc = Util.checkString(req.getParameter("edu_cost_slf_sclgg_etc"));
String edu_cost_slf_onta = Util.checkString(req.getParameter("edu_cost_slf_onta"));
String edu_cost_slf_etc = Util.checkString(req.getParameter("edu_cost_slf_etc"));
String edu_cost_ent_scl_onta = Util.checkString(req.getParameter("edu_cost_ent_scl_onta"));
String edu_cost_ent_scl_etc = Util.checkString(req.getParameter("edu_cost_ent_scl_etc"));
String edu_cost_elmihi_onta = Util.checkString(req.getParameter("edu_cost_elmihi_onta"));
String edu_cost_elmihi_etc = Util.checkString(req.getParameter("edu_cost_elmihi_etc"));
String edu_cost_univ_onta = Util.checkString(req.getParameter("edu_cost_univ_onta"));
String edu_cost_univ_etc = Util.checkString(req.getParameter("edu_cost_univ_etc"));
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
String asrc_prpn_insr_fee_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("asrc_prpn_insr_fee_onta")));
String asrc_prpn_insr_fee_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("asrc_prpn_insr_fee_etc")));
String obcl_pers_insr_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_onta")));
String obcl_pers_insr_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("obcl_pers_insr_etc")));
String hosp_cost_slf_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_cost_slf_onta")));
String hosp_cost_slf_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_cost_slf_etc")));
String hosp_fee_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_fee_onta")));
String hosp_fee_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("hosp_fee_etc")));
String lgl_dona_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_dona_amt_onta")));
String lgl_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("lgl_dona_amt_etc")));
String spc_case_dona_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_case_dona_amt_onta")));
String spc_case_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_case_dona_amt_etc")));
String emp_stok_ownr_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_stok_ownr_onta")));
String emp_stok_ownr_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_stok_ownr_etc")));
String appm_dona_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("appm_dona_amt_onta")));
String appm_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("appm_dona_amt_etc")));
String relg_appm_dona_amt_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("relg_appm_dona_amt_onta")));
String relg_appm_dona_amt_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("relg_appm_dona_amt_etc")));
String edu_cost_slf_sclgg_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_slf_sclgg_onta")));
String edu_cost_slf_sclgg_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_slf_sclgg_etc")));
String edu_cost_slf_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_slf_onta")));
String edu_cost_slf_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_slf_etc")));
String edu_cost_ent_scl_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_ent_scl_onta")));
String edu_cost_ent_scl_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_ent_scl_etc")));
String edu_cost_elmihi_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_elmihi_onta")));
String edu_cost_elmihi_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_elmihi_etc")));
String edu_cost_univ_onta = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_univ_onta")));
String edu_cost_univ_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("edu_cost_univ_etc")));
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
dm.setAsrc_prpn_insr_fee_onta(asrc_prpn_insr_fee_onta);
dm.setAsrc_prpn_insr_fee_etc(asrc_prpn_insr_fee_etc);
dm.setObcl_pers_insr_onta(obcl_pers_insr_onta);
dm.setObcl_pers_insr_etc(obcl_pers_insr_etc);
dm.setHosp_cost_slf_onta(hosp_cost_slf_onta);
dm.setHosp_cost_slf_etc(hosp_cost_slf_etc);
dm.setHosp_fee_onta(hosp_fee_onta);
dm.setHosp_fee_etc(hosp_fee_etc);
dm.setLgl_dona_amt_onta(lgl_dona_amt_onta);
dm.setLgl_dona_amt_etc(lgl_dona_amt_etc);
dm.setSpc_case_dona_amt_onta(spc_case_dona_amt_onta);
dm.setSpc_case_dona_amt_etc(spc_case_dona_amt_etc);
dm.setEmp_stok_ownr_onta(emp_stok_ownr_onta);
dm.setEmp_stok_ownr_etc(emp_stok_ownr_etc);
dm.setAppm_dona_amt_onta(appm_dona_amt_onta);
dm.setAppm_dona_amt_etc(appm_dona_amt_etc);
dm.setRelg_appm_dona_amt_onta(relg_appm_dona_amt_onta);
dm.setRelg_appm_dona_amt_etc(relg_appm_dona_amt_etc);
dm.setEdu_cost_slf_sclgg_onta(edu_cost_slf_sclgg_onta);
dm.setEdu_cost_slf_sclgg_etc(edu_cost_slf_sclgg_etc);
dm.setEdu_cost_slf_onta(edu_cost_slf_onta);
dm.setEdu_cost_slf_etc(edu_cost_slf_etc);
dm.setEdu_cost_ent_scl_onta(edu_cost_ent_scl_onta);
dm.setEdu_cost_ent_scl_etc(edu_cost_ent_scl_etc);
dm.setEdu_cost_elmihi_onta(edu_cost_elmihi_onta);
dm.setEdu_cost_elmihi_etc(edu_cost_elmihi_etc);
dm.setEdu_cost_univ_onta(edu_cost_univ_onta);
dm.setEdu_cost_univ_etc(edu_cost_univ_etc);
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


/* 작성시간 : Sun Aug 23 17:10:00 KST 2009 */