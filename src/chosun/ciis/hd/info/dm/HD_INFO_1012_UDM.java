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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1012_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String nm_korn;
	public String nm_chin;
	public String nm_engl;
	public String prn;
	public String emp_dtls_clsf;
	public String in_cmpy_dt;
	public String emp_clsf_cd;
	public String cmpy_cd;
	public String dept_cd;
	public String alon_pay_dept_yn;
	public String dty_cd;
	public String posi_cd;
	public String addm_dept_cd;
	public String addm_alon_pay_dept_yn;
	public String addm_dty_cd;
	public String addm_posi_cd;
	public String duty_area_cd;
	public String dtplc_cd;
	public String lvcmpy_dt;
	public String lvcmpy_resn_cd;
	public String last_midl_adjm_dt;
	public String midl_adjm_tms;
	public String last_upgrd_dt;
	public String last_saly_chg_appmt_dt;
	public String last_appmt_dt;
	public String last_appmt_cd;
	public String last_appmt_cont;
	public String last_temp_dt;
	public String last_reinst_dt;
	public String last_temp_clsf;
	public String last_stdy_dt;
	public String last_stdy_reinst_dt;
	public String in_cmpy_clsf;
	public String open_invit_clsf;
	public String open_invit_desty;
	public String relg_cd;
	public String in_cmpy_resn_cd;
	public String recom_pers_rshp_cd;
	public String recom_pers_flnm;
	public String spc_1;
	public String spc_2;
	public String hby_1;
	public String hby_2;
	public String nativ_cd;
	public String nativ_dtls_area;
	public String blod_cd;
	public String in_cmpy_psgp_cd;
	public String in_cmpy_octgr_cd;
	public String in_cmpy_posk_cd;
	public String cur_jobforc_cd;
	public String cur_jobkind_cd;
	public String cur_jobnon_cd;
	public String saly_shft_bank_cd;
	public String saly_shft_acct_no;
	public String alon_shft_bank_cd;
	public String alon_shft_acct_no;
	public String encrg_amt_shft_bank_cd;
	public String encrg_amt_shft_acct_no;
	public String incmg_pers;

	public HD_INFO_1012_UDM(){}
	public HD_INFO_1012_UDM(String emp_no, String nm_korn, String nm_chin, String nm_engl, String prn, String emp_dtls_clsf, String in_cmpy_dt, String emp_clsf_cd, String cmpy_cd, String dept_cd, String alon_pay_dept_yn, String dty_cd, String posi_cd, String addm_dept_cd, String addm_alon_pay_dept_yn, String addm_dty_cd, String addm_posi_cd, String duty_area_cd, String dtplc_cd, String lvcmpy_dt, String lvcmpy_resn_cd, String last_midl_adjm_dt, String midl_adjm_tms, String last_upgrd_dt, String last_saly_chg_appmt_dt, String last_appmt_dt, String last_appmt_cd, String last_appmt_cont, String last_temp_dt, String last_reinst_dt, String last_temp_clsf, String last_stdy_dt, String last_stdy_reinst_dt, String in_cmpy_clsf, String open_invit_clsf, String open_invit_desty, String relg_cd, String in_cmpy_resn_cd, String recom_pers_rshp_cd, String recom_pers_flnm, String spc_1, String spc_2, String hby_1, String hby_2, String nativ_cd, String nativ_dtls_area, String blod_cd, String in_cmpy_psgp_cd, String in_cmpy_octgr_cd, String in_cmpy_posk_cd, String cur_jobforc_cd, String cur_jobkind_cd, String cur_jobnon_cd, String saly_shft_bank_cd, String saly_shft_acct_no, String alon_shft_bank_cd, String alon_shft_acct_no, String encrg_amt_shft_bank_cd, String encrg_amt_shft_acct_no, String incmg_pers){
		this.emp_no = emp_no;
		this.nm_korn = nm_korn;
		this.nm_chin = nm_chin;
		this.nm_engl = nm_engl;
		this.prn = prn;
		this.emp_dtls_clsf = emp_dtls_clsf;
		this.in_cmpy_dt = in_cmpy_dt;
		this.emp_clsf_cd = emp_clsf_cd;
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.alon_pay_dept_yn = alon_pay_dept_yn;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.addm_dept_cd = addm_dept_cd;
		this.addm_alon_pay_dept_yn = addm_alon_pay_dept_yn;
		this.addm_dty_cd = addm_dty_cd;
		this.addm_posi_cd = addm_posi_cd;
		this.duty_area_cd = duty_area_cd;
		this.dtplc_cd = dtplc_cd;
		this.lvcmpy_dt = lvcmpy_dt;
		this.lvcmpy_resn_cd = lvcmpy_resn_cd;
		this.last_midl_adjm_dt = last_midl_adjm_dt;
		this.midl_adjm_tms = midl_adjm_tms;
		this.last_upgrd_dt = last_upgrd_dt;
		this.last_saly_chg_appmt_dt = last_saly_chg_appmt_dt;
		this.last_appmt_dt = last_appmt_dt;
		this.last_appmt_cd = last_appmt_cd;
		this.last_appmt_cont = last_appmt_cont;
		this.last_temp_dt = last_temp_dt;
		this.last_reinst_dt = last_reinst_dt;
		this.last_temp_clsf = last_temp_clsf;
		this.last_stdy_dt = last_stdy_dt;
		this.last_stdy_reinst_dt = last_stdy_reinst_dt;
		this.in_cmpy_clsf = in_cmpy_clsf;
		this.open_invit_clsf = open_invit_clsf;
		this.open_invit_desty = open_invit_desty;
		this.relg_cd = relg_cd;
		this.in_cmpy_resn_cd = in_cmpy_resn_cd;
		this.recom_pers_rshp_cd = recom_pers_rshp_cd;
		this.recom_pers_flnm = recom_pers_flnm;
		this.spc_1 = spc_1;
		this.spc_2 = spc_2;
		this.hby_1 = hby_1;
		this.hby_2 = hby_2;
		this.nativ_cd = nativ_cd;
		this.nativ_dtls_area = nativ_dtls_area;
		this.blod_cd = blod_cd;
		this.in_cmpy_psgp_cd = in_cmpy_psgp_cd;
		this.in_cmpy_octgr_cd = in_cmpy_octgr_cd;
		this.in_cmpy_posk_cd = in_cmpy_posk_cd;
		this.cur_jobforc_cd = cur_jobforc_cd;
		this.cur_jobkind_cd = cur_jobkind_cd;
		this.cur_jobnon_cd = cur_jobnon_cd;
		this.saly_shft_bank_cd = saly_shft_bank_cd;
		this.saly_shft_acct_no = saly_shft_acct_no;
		this.alon_shft_bank_cd = alon_shft_bank_cd;
		this.alon_shft_acct_no = alon_shft_acct_no;
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
		this.incmg_pers = incmg_pers;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setNm_chin(String nm_chin){
		this.nm_chin = nm_chin;
	}

	public void setNm_engl(String nm_engl){
		this.nm_engl = nm_engl;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAlon_pay_dept_yn(String alon_pay_dept_yn){
		this.alon_pay_dept_yn = alon_pay_dept_yn;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setAddm_dept_cd(String addm_dept_cd){
		this.addm_dept_cd = addm_dept_cd;
	}

	public void setAddm_alon_pay_dept_yn(String addm_alon_pay_dept_yn){
		this.addm_alon_pay_dept_yn = addm_alon_pay_dept_yn;
	}

	public void setAddm_dty_cd(String addm_dty_cd){
		this.addm_dty_cd = addm_dty_cd;
	}

	public void setAddm_posi_cd(String addm_posi_cd){
		this.addm_posi_cd = addm_posi_cd;
	}

	public void setDuty_area_cd(String duty_area_cd){
		this.duty_area_cd = duty_area_cd;
	}

	public void setDtplc_cd(String dtplc_cd){
		this.dtplc_cd = dtplc_cd;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setLvcmpy_resn_cd(String lvcmpy_resn_cd){
		this.lvcmpy_resn_cd = lvcmpy_resn_cd;
	}

	public void setLast_midl_adjm_dt(String last_midl_adjm_dt){
		this.last_midl_adjm_dt = last_midl_adjm_dt;
	}

	public void setMidl_adjm_tms(String midl_adjm_tms){
		this.midl_adjm_tms = midl_adjm_tms;
	}

	public void setLast_upgrd_dt(String last_upgrd_dt){
		this.last_upgrd_dt = last_upgrd_dt;
	}

	public void setLast_saly_chg_appmt_dt(String last_saly_chg_appmt_dt){
		this.last_saly_chg_appmt_dt = last_saly_chg_appmt_dt;
	}

	public void setLast_appmt_dt(String last_appmt_dt){
		this.last_appmt_dt = last_appmt_dt;
	}

	public void setLast_appmt_cd(String last_appmt_cd){
		this.last_appmt_cd = last_appmt_cd;
	}

	public void setLast_appmt_cont(String last_appmt_cont){
		this.last_appmt_cont = last_appmt_cont;
	}

	public void setLast_temp_dt(String last_temp_dt){
		this.last_temp_dt = last_temp_dt;
	}

	public void setLast_reinst_dt(String last_reinst_dt){
		this.last_reinst_dt = last_reinst_dt;
	}

	public void setLast_temp_clsf(String last_temp_clsf){
		this.last_temp_clsf = last_temp_clsf;
	}

	public void setLast_stdy_dt(String last_stdy_dt){
		this.last_stdy_dt = last_stdy_dt;
	}

	public void setLast_stdy_reinst_dt(String last_stdy_reinst_dt){
		this.last_stdy_reinst_dt = last_stdy_reinst_dt;
	}

	public void setIn_cmpy_clsf(String in_cmpy_clsf){
		this.in_cmpy_clsf = in_cmpy_clsf;
	}

	public void setOpen_invit_clsf(String open_invit_clsf){
		this.open_invit_clsf = open_invit_clsf;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public void setRelg_cd(String relg_cd){
		this.relg_cd = relg_cd;
	}

	public void setIn_cmpy_resn_cd(String in_cmpy_resn_cd){
		this.in_cmpy_resn_cd = in_cmpy_resn_cd;
	}

	public void setRecom_pers_rshp_cd(String recom_pers_rshp_cd){
		this.recom_pers_rshp_cd = recom_pers_rshp_cd;
	}

	public void setRecom_pers_flnm(String recom_pers_flnm){
		this.recom_pers_flnm = recom_pers_flnm;
	}

	public void setSpc_1(String spc_1){
		this.spc_1 = spc_1;
	}

	public void setSpc_2(String spc_2){
		this.spc_2 = spc_2;
	}

	public void setHby_1(String hby_1){
		this.hby_1 = hby_1;
	}

	public void setHby_2(String hby_2){
		this.hby_2 = hby_2;
	}

	public void setNativ_cd(String nativ_cd){
		this.nativ_cd = nativ_cd;
	}

	public void setNativ_dtls_area(String nativ_dtls_area){
		this.nativ_dtls_area = nativ_dtls_area;
	}

	public void setBlod_cd(String blod_cd){
		this.blod_cd = blod_cd;
	}

	public void setIn_cmpy_psgp_cd(String in_cmpy_psgp_cd){
		this.in_cmpy_psgp_cd = in_cmpy_psgp_cd;
	}

	public void setIn_cmpy_octgr_cd(String in_cmpy_octgr_cd){
		this.in_cmpy_octgr_cd = in_cmpy_octgr_cd;
	}

	public void setIn_cmpy_posk_cd(String in_cmpy_posk_cd){
		this.in_cmpy_posk_cd = in_cmpy_posk_cd;
	}

	public void setCur_jobforc_cd(String cur_jobforc_cd){
		this.cur_jobforc_cd = cur_jobforc_cd;
	}

	public void setCur_jobkind_cd(String cur_jobkind_cd){
		this.cur_jobkind_cd = cur_jobkind_cd;
	}

	public void setCur_jobnon_cd(String cur_jobnon_cd){
		this.cur_jobnon_cd = cur_jobnon_cd;
	}

	public void setSaly_shft_bank_cd(String saly_shft_bank_cd){
		this.saly_shft_bank_cd = saly_shft_bank_cd;
	}

	public void setSaly_shft_acct_no(String saly_shft_acct_no){
		this.saly_shft_acct_no = saly_shft_acct_no;
	}

	public void setAlon_shft_bank_cd(String alon_shft_bank_cd){
		this.alon_shft_bank_cd = alon_shft_bank_cd;
	}

	public void setAlon_shft_acct_no(String alon_shft_acct_no){
		this.alon_shft_acct_no = alon_shft_acct_no;
	}

	public void setEncrg_amt_shft_bank_cd(String encrg_amt_shft_bank_cd){
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
	}

	public void setEncrg_amt_shft_acct_no(String encrg_amt_shft_acct_no){
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getNm_chin(){
		return this.nm_chin;
	}

	public String getNm_engl(){
		return this.nm_engl;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAlon_pay_dept_yn(){
		return this.alon_pay_dept_yn;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getAddm_dept_cd(){
		return this.addm_dept_cd;
	}

	public String getAddm_alon_pay_dept_yn(){
		return this.addm_alon_pay_dept_yn;
	}

	public String getAddm_dty_cd(){
		return this.addm_dty_cd;
	}

	public String getAddm_posi_cd(){
		return this.addm_posi_cd;
	}

	public String getDuty_area_cd(){
		return this.duty_area_cd;
	}

	public String getDtplc_cd(){
		return this.dtplc_cd;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getLvcmpy_resn_cd(){
		return this.lvcmpy_resn_cd;
	}

	public String getLast_midl_adjm_dt(){
		return this.last_midl_adjm_dt;
	}

	public String getMidl_adjm_tms(){
		return this.midl_adjm_tms;
	}

	public String getLast_upgrd_dt(){
		return this.last_upgrd_dt;
	}

	public String getLast_saly_chg_appmt_dt(){
		return this.last_saly_chg_appmt_dt;
	}

	public String getLast_appmt_dt(){
		return this.last_appmt_dt;
	}

	public String getLast_appmt_cd(){
		return this.last_appmt_cd;
	}

	public String getLast_appmt_cont(){
		return this.last_appmt_cont;
	}

	public String getLast_temp_dt(){
		return this.last_temp_dt;
	}

	public String getLast_reinst_dt(){
		return this.last_reinst_dt;
	}

	public String getLast_temp_clsf(){
		return this.last_temp_clsf;
	}

	public String getLast_stdy_dt(){
		return this.last_stdy_dt;
	}

	public String getLast_stdy_reinst_dt(){
		return this.last_stdy_reinst_dt;
	}

	public String getIn_cmpy_clsf(){
		return this.in_cmpy_clsf;
	}

	public String getOpen_invit_clsf(){
		return this.open_invit_clsf;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getRelg_cd(){
		return this.relg_cd;
	}

	public String getIn_cmpy_resn_cd(){
		return this.in_cmpy_resn_cd;
	}

	public String getRecom_pers_rshp_cd(){
		return this.recom_pers_rshp_cd;
	}

	public String getRecom_pers_flnm(){
		return this.recom_pers_flnm;
	}

	public String getSpc_1(){
		return this.spc_1;
	}

	public String getSpc_2(){
		return this.spc_2;
	}

	public String getHby_1(){
		return this.hby_1;
	}

	public String getHby_2(){
		return this.hby_2;
	}

	public String getNativ_cd(){
		return this.nativ_cd;
	}

	public String getNativ_dtls_area(){
		return this.nativ_dtls_area;
	}

	public String getBlod_cd(){
		return this.blod_cd;
	}

	public String getIn_cmpy_psgp_cd(){
		return this.in_cmpy_psgp_cd;
	}

	public String getIn_cmpy_octgr_cd(){
		return this.in_cmpy_octgr_cd;
	}

	public String getIn_cmpy_posk_cd(){
		return this.in_cmpy_posk_cd;
	}

	public String getCur_jobforc_cd(){
		return this.cur_jobforc_cd;
	}

	public String getCur_jobkind_cd(){
		return this.cur_jobkind_cd;
	}

	public String getCur_jobnon_cd(){
		return this.cur_jobnon_cd;
	}

	public String getSaly_shft_bank_cd(){
		return this.saly_shft_bank_cd;
	}

	public String getSaly_shft_acct_no(){
		return this.saly_shft_acct_no;
	}

	public String getAlon_shft_bank_cd(){
		return this.alon_shft_bank_cd;
	}

	public String getAlon_shft_acct_no(){
		return this.alon_shft_acct_no;
	}

	public String getEncrg_amt_shft_bank_cd(){
		return this.encrg_amt_shft_bank_cd;
	}

	public String getEncrg_amt_shft_acct_no(){
		return this.encrg_amt_shft_acct_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1012_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1012_UDM dm = (HD_INFO_1012_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.nm_korn);
		cstmt.setString(5, dm.nm_chin);
		cstmt.setString(6, dm.nm_engl);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.emp_dtls_clsf);
		cstmt.setString(9, dm.in_cmpy_dt);
		cstmt.setString(10, dm.emp_clsf_cd);
		cstmt.setString(11, dm.cmpy_cd);
		cstmt.setString(12, dm.dept_cd);
		cstmt.setString(13, dm.alon_pay_dept_yn);
		cstmt.setString(14, dm.dty_cd);
		cstmt.setString(15, dm.posi_cd);
		cstmt.setString(16, dm.addm_dept_cd);
		cstmt.setString(17, dm.addm_alon_pay_dept_yn);
		cstmt.setString(18, dm.addm_dty_cd);
		cstmt.setString(19, dm.addm_posi_cd);
		cstmt.setString(20, dm.duty_area_cd);
		cstmt.setString(21, dm.dtplc_cd);
		cstmt.setString(22, dm.lvcmpy_dt);
		cstmt.setString(23, dm.lvcmpy_resn_cd);
		cstmt.setString(24, dm.last_midl_adjm_dt);
		cstmt.setString(25, dm.midl_adjm_tms);
		cstmt.setString(26, dm.last_upgrd_dt);
		cstmt.setString(27, dm.last_saly_chg_appmt_dt);
		cstmt.setString(28, dm.last_appmt_dt);
		cstmt.setString(29, dm.last_appmt_cd);
		cstmt.setString(30, dm.last_appmt_cont);
		cstmt.setString(31, dm.last_temp_dt);
		cstmt.setString(32, dm.last_reinst_dt);
		cstmt.setString(33, dm.last_temp_clsf);
		cstmt.setString(34, dm.last_stdy_dt);
		cstmt.setString(35, dm.last_stdy_reinst_dt);
		cstmt.setString(36, dm.in_cmpy_clsf);
		cstmt.setString(37, dm.open_invit_clsf);
		cstmt.setString(38, dm.open_invit_desty);
		cstmt.setString(39, dm.relg_cd);
		cstmt.setString(40, dm.in_cmpy_resn_cd);
		cstmt.setString(41, dm.recom_pers_rshp_cd);
		cstmt.setString(42, dm.recom_pers_flnm);
		cstmt.setString(43, dm.spc_1);
		cstmt.setString(44, dm.spc_2);
		cstmt.setString(45, dm.hby_1);
		cstmt.setString(46, dm.hby_2);
		cstmt.setString(47, dm.nativ_cd);
		cstmt.setString(48, dm.nativ_dtls_area);
		cstmt.setString(49, dm.blod_cd);
		cstmt.setString(50, dm.in_cmpy_psgp_cd);
		cstmt.setString(51, dm.in_cmpy_octgr_cd);
		cstmt.setString(52, dm.in_cmpy_posk_cd);
		cstmt.setString(53, dm.cur_jobforc_cd);
		cstmt.setString(54, dm.cur_jobkind_cd);
		cstmt.setString(55, dm.cur_jobnon_cd);
		cstmt.setString(56, dm.saly_shft_bank_cd);
		cstmt.setString(57, dm.saly_shft_acct_no);
		cstmt.setString(58, dm.alon_shft_bank_cd);
		cstmt.setString(59, dm.alon_shft_acct_no);
		cstmt.setString(60, dm.encrg_amt_shft_bank_cd);
		cstmt.setString(61, dm.encrg_amt_shft_acct_no);
		cstmt.setString(62, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1012_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("nm_korn = [" + getNm_korn() + "]");
		System.out.println("nm_chin = [" + getNm_chin() + "]");
		System.out.println("nm_engl = [" + getNm_engl() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("emp_dtls_clsf = [" + getEmp_dtls_clsf() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("emp_clsf_cd = [" + getEmp_clsf_cd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("alon_pay_dept_yn = [" + getAlon_pay_dept_yn() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("addm_dept_cd = [" + getAddm_dept_cd() + "]");
		System.out.println("addm_alon_pay_dept_yn = [" + getAddm_alon_pay_dept_yn() + "]");
		System.out.println("addm_dty_cd = [" + getAddm_dty_cd() + "]");
		System.out.println("addm_posi_cd = [" + getAddm_posi_cd() + "]");
		System.out.println("duty_area_cd = [" + getDuty_area_cd() + "]");
		System.out.println("dtplc_cd = [" + getDtplc_cd() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("lvcmpy_resn_cd = [" + getLvcmpy_resn_cd() + "]");
		System.out.println("last_midl_adjm_dt = [" + getLast_midl_adjm_dt() + "]");
		System.out.println("midl_adjm_tms = [" + getMidl_adjm_tms() + "]");
		System.out.println("last_upgrd_dt = [" + getLast_upgrd_dt() + "]");
		System.out.println("last_saly_chg_appmt_dt = [" + getLast_saly_chg_appmt_dt() + "]");
		System.out.println("last_appmt_dt = [" + getLast_appmt_dt() + "]");
		System.out.println("last_appmt_cd = [" + getLast_appmt_cd() + "]");
		System.out.println("last_appmt_cont = [" + getLast_appmt_cont() + "]");
		System.out.println("last_temp_dt = [" + getLast_temp_dt() + "]");
		System.out.println("last_reinst_dt = [" + getLast_reinst_dt() + "]");
		System.out.println("last_temp_clsf = [" + getLast_temp_clsf() + "]");
		System.out.println("last_stdy_dt = [" + getLast_stdy_dt() + "]");
		System.out.println("last_stdy_reinst_dt = [" + getLast_stdy_reinst_dt() + "]");
		System.out.println("in_cmpy_clsf = [" + getIn_cmpy_clsf() + "]");
		System.out.println("open_invit_clsf = [" + getOpen_invit_clsf() + "]");
		System.out.println("open_invit_desty = [" + getOpen_invit_desty() + "]");
		System.out.println("relg_cd = [" + getRelg_cd() + "]");
		System.out.println("in_cmpy_resn_cd = [" + getIn_cmpy_resn_cd() + "]");
		System.out.println("recom_pers_rshp_cd = [" + getRecom_pers_rshp_cd() + "]");
		System.out.println("recom_pers_flnm = [" + getRecom_pers_flnm() + "]");
		System.out.println("spc_1 = [" + getSpc_1() + "]");
		System.out.println("spc_2 = [" + getSpc_2() + "]");
		System.out.println("hby_1 = [" + getHby_1() + "]");
		System.out.println("hby_2 = [" + getHby_2() + "]");
		System.out.println("nativ_cd = [" + getNativ_cd() + "]");
		System.out.println("nativ_dtls_area = [" + getNativ_dtls_area() + "]");
		System.out.println("blod_cd = [" + getBlod_cd() + "]");
		System.out.println("in_cmpy_psgp_cd = [" + getIn_cmpy_psgp_cd() + "]");
		System.out.println("in_cmpy_octgr_cd = [" + getIn_cmpy_octgr_cd() + "]");
		System.out.println("in_cmpy_posk_cd = [" + getIn_cmpy_posk_cd() + "]");
		System.out.println("cur_jobforc_cd = [" + getCur_jobforc_cd() + "]");
		System.out.println("cur_jobkind_cd = [" + getCur_jobkind_cd() + "]");
		System.out.println("cur_jobnon_cd = [" + getCur_jobnon_cd() + "]");
		System.out.println("saly_shft_bank_cd = [" + getSaly_shft_bank_cd() + "]");
		System.out.println("saly_shft_acct_no = [" + getSaly_shft_acct_no() + "]");
		System.out.println("alon_shft_bank_cd = [" + getAlon_shft_bank_cd() + "]");
		System.out.println("alon_shft_acct_no = [" + getAlon_shft_acct_no() + "]");
		System.out.println("encrg_amt_shft_bank_cd = [" + getEncrg_amt_shft_bank_cd() + "]");
		System.out.println("encrg_amt_shft_acct_no = [" + getEncrg_amt_shft_acct_no() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String nm_korn = req.getParameter("nm_korn");
if( nm_korn == null){
	System.out.println(this.toString+" : nm_korn is null" );
}else{
	System.out.println(this.toString+" : nm_korn is "+nm_korn );
}
String nm_chin = req.getParameter("nm_chin");
if( nm_chin == null){
	System.out.println(this.toString+" : nm_chin is null" );
}else{
	System.out.println(this.toString+" : nm_chin is "+nm_chin );
}
String nm_engl = req.getParameter("nm_engl");
if( nm_engl == null){
	System.out.println(this.toString+" : nm_engl is null" );
}else{
	System.out.println(this.toString+" : nm_engl is "+nm_engl );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String emp_dtls_clsf = req.getParameter("emp_dtls_clsf");
if( emp_dtls_clsf == null){
	System.out.println(this.toString+" : emp_dtls_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_dtls_clsf is "+emp_dtls_clsf );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String emp_clsf_cd = req.getParameter("emp_clsf_cd");
if( emp_clsf_cd == null){
	System.out.println(this.toString+" : emp_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : emp_clsf_cd is "+emp_clsf_cd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String alon_pay_dept_yn = req.getParameter("alon_pay_dept_yn");
if( alon_pay_dept_yn == null){
	System.out.println(this.toString+" : alon_pay_dept_yn is null" );
}else{
	System.out.println(this.toString+" : alon_pay_dept_yn is "+alon_pay_dept_yn );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
}
String addm_dept_cd = req.getParameter("addm_dept_cd");
if( addm_dept_cd == null){
	System.out.println(this.toString+" : addm_dept_cd is null" );
}else{
	System.out.println(this.toString+" : addm_dept_cd is "+addm_dept_cd );
}
String addm_alon_pay_dept_yn = req.getParameter("addm_alon_pay_dept_yn");
if( addm_alon_pay_dept_yn == null){
	System.out.println(this.toString+" : addm_alon_pay_dept_yn is null" );
}else{
	System.out.println(this.toString+" : addm_alon_pay_dept_yn is "+addm_alon_pay_dept_yn );
}
String addm_dty_cd = req.getParameter("addm_dty_cd");
if( addm_dty_cd == null){
	System.out.println(this.toString+" : addm_dty_cd is null" );
}else{
	System.out.println(this.toString+" : addm_dty_cd is "+addm_dty_cd );
}
String addm_posi_cd = req.getParameter("addm_posi_cd");
if( addm_posi_cd == null){
	System.out.println(this.toString+" : addm_posi_cd is null" );
}else{
	System.out.println(this.toString+" : addm_posi_cd is "+addm_posi_cd );
}
String duty_area_cd = req.getParameter("duty_area_cd");
if( duty_area_cd == null){
	System.out.println(this.toString+" : duty_area_cd is null" );
}else{
	System.out.println(this.toString+" : duty_area_cd is "+duty_area_cd );
}
String dtplc_cd = req.getParameter("dtplc_cd");
if( dtplc_cd == null){
	System.out.println(this.toString+" : dtplc_cd is null" );
}else{
	System.out.println(this.toString+" : dtplc_cd is "+dtplc_cd );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String lvcmpy_resn_cd = req.getParameter("lvcmpy_resn_cd");
if( lvcmpy_resn_cd == null){
	System.out.println(this.toString+" : lvcmpy_resn_cd is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_resn_cd is "+lvcmpy_resn_cd );
}
String last_midl_adjm_dt = req.getParameter("last_midl_adjm_dt");
if( last_midl_adjm_dt == null){
	System.out.println(this.toString+" : last_midl_adjm_dt is null" );
}else{
	System.out.println(this.toString+" : last_midl_adjm_dt is "+last_midl_adjm_dt );
}
String midl_adjm_tms = req.getParameter("midl_adjm_tms");
if( midl_adjm_tms == null){
	System.out.println(this.toString+" : midl_adjm_tms is null" );
}else{
	System.out.println(this.toString+" : midl_adjm_tms is "+midl_adjm_tms );
}
String last_upgrd_dt = req.getParameter("last_upgrd_dt");
if( last_upgrd_dt == null){
	System.out.println(this.toString+" : last_upgrd_dt is null" );
}else{
	System.out.println(this.toString+" : last_upgrd_dt is "+last_upgrd_dt );
}
String last_saly_chg_appmt_dt = req.getParameter("last_saly_chg_appmt_dt");
if( last_saly_chg_appmt_dt == null){
	System.out.println(this.toString+" : last_saly_chg_appmt_dt is null" );
}else{
	System.out.println(this.toString+" : last_saly_chg_appmt_dt is "+last_saly_chg_appmt_dt );
}
String last_appmt_dt = req.getParameter("last_appmt_dt");
if( last_appmt_dt == null){
	System.out.println(this.toString+" : last_appmt_dt is null" );
}else{
	System.out.println(this.toString+" : last_appmt_dt is "+last_appmt_dt );
}
String last_appmt_cd = req.getParameter("last_appmt_cd");
if( last_appmt_cd == null){
	System.out.println(this.toString+" : last_appmt_cd is null" );
}else{
	System.out.println(this.toString+" : last_appmt_cd is "+last_appmt_cd );
}
String last_appmt_cont = req.getParameter("last_appmt_cont");
if( last_appmt_cont == null){
	System.out.println(this.toString+" : last_appmt_cont is null" );
}else{
	System.out.println(this.toString+" : last_appmt_cont is "+last_appmt_cont );
}
String last_temp_dt = req.getParameter("last_temp_dt");
if( last_temp_dt == null){
	System.out.println(this.toString+" : last_temp_dt is null" );
}else{
	System.out.println(this.toString+" : last_temp_dt is "+last_temp_dt );
}
String last_reinst_dt = req.getParameter("last_reinst_dt");
if( last_reinst_dt == null){
	System.out.println(this.toString+" : last_reinst_dt is null" );
}else{
	System.out.println(this.toString+" : last_reinst_dt is "+last_reinst_dt );
}
String last_temp_clsf = req.getParameter("last_temp_clsf");
if( last_temp_clsf == null){
	System.out.println(this.toString+" : last_temp_clsf is null" );
}else{
	System.out.println(this.toString+" : last_temp_clsf is "+last_temp_clsf );
}
String last_stdy_dt = req.getParameter("last_stdy_dt");
if( last_stdy_dt == null){
	System.out.println(this.toString+" : last_stdy_dt is null" );
}else{
	System.out.println(this.toString+" : last_stdy_dt is "+last_stdy_dt );
}
String last_stdy_reinst_dt = req.getParameter("last_stdy_reinst_dt");
if( last_stdy_reinst_dt == null){
	System.out.println(this.toString+" : last_stdy_reinst_dt is null" );
}else{
	System.out.println(this.toString+" : last_stdy_reinst_dt is "+last_stdy_reinst_dt );
}
String in_cmpy_clsf = req.getParameter("in_cmpy_clsf");
if( in_cmpy_clsf == null){
	System.out.println(this.toString+" : in_cmpy_clsf is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_clsf is "+in_cmpy_clsf );
}
String open_invit_clsf = req.getParameter("open_invit_clsf");
if( open_invit_clsf == null){
	System.out.println(this.toString+" : open_invit_clsf is null" );
}else{
	System.out.println(this.toString+" : open_invit_clsf is "+open_invit_clsf );
}
String open_invit_desty = req.getParameter("open_invit_desty");
if( open_invit_desty == null){
	System.out.println(this.toString+" : open_invit_desty is null" );
}else{
	System.out.println(this.toString+" : open_invit_desty is "+open_invit_desty );
}
String relg_cd = req.getParameter("relg_cd");
if( relg_cd == null){
	System.out.println(this.toString+" : relg_cd is null" );
}else{
	System.out.println(this.toString+" : relg_cd is "+relg_cd );
}
String in_cmpy_resn_cd = req.getParameter("in_cmpy_resn_cd");
if( in_cmpy_resn_cd == null){
	System.out.println(this.toString+" : in_cmpy_resn_cd is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_resn_cd is "+in_cmpy_resn_cd );
}
String recom_pers_rshp_cd = req.getParameter("recom_pers_rshp_cd");
if( recom_pers_rshp_cd == null){
	System.out.println(this.toString+" : recom_pers_rshp_cd is null" );
}else{
	System.out.println(this.toString+" : recom_pers_rshp_cd is "+recom_pers_rshp_cd );
}
String recom_pers_flnm = req.getParameter("recom_pers_flnm");
if( recom_pers_flnm == null){
	System.out.println(this.toString+" : recom_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : recom_pers_flnm is "+recom_pers_flnm );
}
String spc_1 = req.getParameter("spc_1");
if( spc_1 == null){
	System.out.println(this.toString+" : spc_1 is null" );
}else{
	System.out.println(this.toString+" : spc_1 is "+spc_1 );
}
String spc_2 = req.getParameter("spc_2");
if( spc_2 == null){
	System.out.println(this.toString+" : spc_2 is null" );
}else{
	System.out.println(this.toString+" : spc_2 is "+spc_2 );
}
String hby_1 = req.getParameter("hby_1");
if( hby_1 == null){
	System.out.println(this.toString+" : hby_1 is null" );
}else{
	System.out.println(this.toString+" : hby_1 is "+hby_1 );
}
String hby_2 = req.getParameter("hby_2");
if( hby_2 == null){
	System.out.println(this.toString+" : hby_2 is null" );
}else{
	System.out.println(this.toString+" : hby_2 is "+hby_2 );
}
String nativ_cd = req.getParameter("nativ_cd");
if( nativ_cd == null){
	System.out.println(this.toString+" : nativ_cd is null" );
}else{
	System.out.println(this.toString+" : nativ_cd is "+nativ_cd );
}
String nativ_dtls_area = req.getParameter("nativ_dtls_area");
if( nativ_dtls_area == null){
	System.out.println(this.toString+" : nativ_dtls_area is null" );
}else{
	System.out.println(this.toString+" : nativ_dtls_area is "+nativ_dtls_area );
}
String blod_cd = req.getParameter("blod_cd");
if( blod_cd == null){
	System.out.println(this.toString+" : blod_cd is null" );
}else{
	System.out.println(this.toString+" : blod_cd is "+blod_cd );
}
String in_cmpy_psgp_cd = req.getParameter("in_cmpy_psgp_cd");
if( in_cmpy_psgp_cd == null){
	System.out.println(this.toString+" : in_cmpy_psgp_cd is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_psgp_cd is "+in_cmpy_psgp_cd );
}
String in_cmpy_octgr_cd = req.getParameter("in_cmpy_octgr_cd");
if( in_cmpy_octgr_cd == null){
	System.out.println(this.toString+" : in_cmpy_octgr_cd is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_octgr_cd is "+in_cmpy_octgr_cd );
}
String in_cmpy_posk_cd = req.getParameter("in_cmpy_posk_cd");
if( in_cmpy_posk_cd == null){
	System.out.println(this.toString+" : in_cmpy_posk_cd is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_posk_cd is "+in_cmpy_posk_cd );
}
String cur_jobforc_cd = req.getParameter("cur_jobforc_cd");
if( cur_jobforc_cd == null){
	System.out.println(this.toString+" : cur_jobforc_cd is null" );
}else{
	System.out.println(this.toString+" : cur_jobforc_cd is "+cur_jobforc_cd );
}
String cur_jobkind_cd = req.getParameter("cur_jobkind_cd");
if( cur_jobkind_cd == null){
	System.out.println(this.toString+" : cur_jobkind_cd is null" );
}else{
	System.out.println(this.toString+" : cur_jobkind_cd is "+cur_jobkind_cd );
}
String cur_jobnon_cd = req.getParameter("cur_jobnon_cd");
if( cur_jobnon_cd == null){
	System.out.println(this.toString+" : cur_jobnon_cd is null" );
}else{
	System.out.println(this.toString+" : cur_jobnon_cd is "+cur_jobnon_cd );
}
String saly_shft_bank_cd = req.getParameter("saly_shft_bank_cd");
if( saly_shft_bank_cd == null){
	System.out.println(this.toString+" : saly_shft_bank_cd is null" );
}else{
	System.out.println(this.toString+" : saly_shft_bank_cd is "+saly_shft_bank_cd );
}
String saly_shft_acct_no = req.getParameter("saly_shft_acct_no");
if( saly_shft_acct_no == null){
	System.out.println(this.toString+" : saly_shft_acct_no is null" );
}else{
	System.out.println(this.toString+" : saly_shft_acct_no is "+saly_shft_acct_no );
}
String alon_shft_bank_cd = req.getParameter("alon_shft_bank_cd");
if( alon_shft_bank_cd == null){
	System.out.println(this.toString+" : alon_shft_bank_cd is null" );
}else{
	System.out.println(this.toString+" : alon_shft_bank_cd is "+alon_shft_bank_cd );
}
String alon_shft_acct_no = req.getParameter("alon_shft_acct_no");
if( alon_shft_acct_no == null){
	System.out.println(this.toString+" : alon_shft_acct_no is null" );
}else{
	System.out.println(this.toString+" : alon_shft_acct_no is "+alon_shft_acct_no );
}
String encrg_amt_shft_bank_cd = req.getParameter("encrg_amt_shft_bank_cd");
if( encrg_amt_shft_bank_cd == null){
	System.out.println(this.toString+" : encrg_amt_shft_bank_cd is null" );
}else{
	System.out.println(this.toString+" : encrg_amt_shft_bank_cd is "+encrg_amt_shft_bank_cd );
}
String encrg_amt_shft_acct_no = req.getParameter("encrg_amt_shft_acct_no");
if( encrg_amt_shft_acct_no == null){
	System.out.println(this.toString+" : encrg_amt_shft_acct_no is null" );
}else{
	System.out.println(this.toString+" : encrg_amt_shft_acct_no is "+encrg_amt_shft_acct_no );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String nm_korn = Util.checkString(req.getParameter("nm_korn"));
String nm_chin = Util.checkString(req.getParameter("nm_chin"));
String nm_engl = Util.checkString(req.getParameter("nm_engl"));
String prn = Util.checkString(req.getParameter("prn"));
String emp_dtls_clsf = Util.checkString(req.getParameter("emp_dtls_clsf"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String emp_clsf_cd = Util.checkString(req.getParameter("emp_clsf_cd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String alon_pay_dept_yn = Util.checkString(req.getParameter("alon_pay_dept_yn"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String addm_dept_cd = Util.checkString(req.getParameter("addm_dept_cd"));
String addm_alon_pay_dept_yn = Util.checkString(req.getParameter("addm_alon_pay_dept_yn"));
String addm_dty_cd = Util.checkString(req.getParameter("addm_dty_cd"));
String addm_posi_cd = Util.checkString(req.getParameter("addm_posi_cd"));
String duty_area_cd = Util.checkString(req.getParameter("duty_area_cd"));
String dtplc_cd = Util.checkString(req.getParameter("dtplc_cd"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String lvcmpy_resn_cd = Util.checkString(req.getParameter("lvcmpy_resn_cd"));
String last_midl_adjm_dt = Util.checkString(req.getParameter("last_midl_adjm_dt"));
String midl_adjm_tms = Util.checkString(req.getParameter("midl_adjm_tms"));
String last_upgrd_dt = Util.checkString(req.getParameter("last_upgrd_dt"));
String last_saly_chg_appmt_dt = Util.checkString(req.getParameter("last_saly_chg_appmt_dt"));
String last_appmt_dt = Util.checkString(req.getParameter("last_appmt_dt"));
String last_appmt_cd = Util.checkString(req.getParameter("last_appmt_cd"));
String last_appmt_cont = Util.checkString(req.getParameter("last_appmt_cont"));
String last_temp_dt = Util.checkString(req.getParameter("last_temp_dt"));
String last_reinst_dt = Util.checkString(req.getParameter("last_reinst_dt"));
String last_temp_clsf = Util.checkString(req.getParameter("last_temp_clsf"));
String last_stdy_dt = Util.checkString(req.getParameter("last_stdy_dt"));
String last_stdy_reinst_dt = Util.checkString(req.getParameter("last_stdy_reinst_dt"));
String in_cmpy_clsf = Util.checkString(req.getParameter("in_cmpy_clsf"));
String open_invit_clsf = Util.checkString(req.getParameter("open_invit_clsf"));
String open_invit_desty = Util.checkString(req.getParameter("open_invit_desty"));
String relg_cd = Util.checkString(req.getParameter("relg_cd"));
String in_cmpy_resn_cd = Util.checkString(req.getParameter("in_cmpy_resn_cd"));
String recom_pers_rshp_cd = Util.checkString(req.getParameter("recom_pers_rshp_cd"));
String recom_pers_flnm = Util.checkString(req.getParameter("recom_pers_flnm"));
String spc_1 = Util.checkString(req.getParameter("spc_1"));
String spc_2 = Util.checkString(req.getParameter("spc_2"));
String hby_1 = Util.checkString(req.getParameter("hby_1"));
String hby_2 = Util.checkString(req.getParameter("hby_2"));
String nativ_cd = Util.checkString(req.getParameter("nativ_cd"));
String nativ_dtls_area = Util.checkString(req.getParameter("nativ_dtls_area"));
String blod_cd = Util.checkString(req.getParameter("blod_cd"));
String in_cmpy_psgp_cd = Util.checkString(req.getParameter("in_cmpy_psgp_cd"));
String in_cmpy_octgr_cd = Util.checkString(req.getParameter("in_cmpy_octgr_cd"));
String in_cmpy_posk_cd = Util.checkString(req.getParameter("in_cmpy_posk_cd"));
String cur_jobforc_cd = Util.checkString(req.getParameter("cur_jobforc_cd"));
String cur_jobkind_cd = Util.checkString(req.getParameter("cur_jobkind_cd"));
String cur_jobnon_cd = Util.checkString(req.getParameter("cur_jobnon_cd"));
String saly_shft_bank_cd = Util.checkString(req.getParameter("saly_shft_bank_cd"));
String saly_shft_acct_no = Util.checkString(req.getParameter("saly_shft_acct_no"));
String alon_shft_bank_cd = Util.checkString(req.getParameter("alon_shft_bank_cd"));
String alon_shft_acct_no = Util.checkString(req.getParameter("alon_shft_acct_no"));
String encrg_amt_shft_bank_cd = Util.checkString(req.getParameter("encrg_amt_shft_bank_cd"));
String encrg_amt_shft_acct_no = Util.checkString(req.getParameter("encrg_amt_shft_acct_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String nm_korn = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_korn")));
String nm_chin = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_chin")));
String nm_engl = Util.Uni2Ksc(Util.checkString(req.getParameter("nm_engl")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String emp_dtls_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_dtls_clsf")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String emp_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf_cd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String alon_pay_dept_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_pay_dept_yn")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String addm_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dept_cd")));
String addm_alon_pay_dept_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_alon_pay_dept_yn")));
String addm_dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_dty_cd")));
String addm_posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_posi_cd")));
String duty_area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_area_cd")));
String dtplc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtplc_cd")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String lvcmpy_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_resn_cd")));
String last_midl_adjm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_midl_adjm_dt")));
String midl_adjm_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("midl_adjm_tms")));
String last_upgrd_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_upgrd_dt")));
String last_saly_chg_appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_saly_chg_appmt_dt")));
String last_appmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_appmt_dt")));
String last_appmt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("last_appmt_cd")));
String last_appmt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("last_appmt_cont")));
String last_temp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_temp_dt")));
String last_reinst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_reinst_dt")));
String last_temp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("last_temp_clsf")));
String last_stdy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_stdy_dt")));
String last_stdy_reinst_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_stdy_reinst_dt")));
String in_cmpy_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_clsf")));
String open_invit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_clsf")));
String open_invit_desty = Util.Uni2Ksc(Util.checkString(req.getParameter("open_invit_desty")));
String relg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("relg_cd")));
String in_cmpy_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_resn_cd")));
String recom_pers_rshp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("recom_pers_rshp_cd")));
String recom_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("recom_pers_flnm")));
String spc_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_1")));
String spc_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_2")));
String hby_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hby_1")));
String hby_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("hby_2")));
String nativ_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("nativ_cd")));
String nativ_dtls_area = Util.Uni2Ksc(Util.checkString(req.getParameter("nativ_dtls_area")));
String blod_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("blod_cd")));
String in_cmpy_psgp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_psgp_cd")));
String in_cmpy_octgr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_octgr_cd")));
String in_cmpy_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_posk_cd")));
String cur_jobforc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_jobforc_cd")));
String cur_jobkind_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_jobkind_cd")));
String cur_jobnon_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_jobnon_cd")));
String saly_shft_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_shft_bank_cd")));
String saly_shft_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_shft_acct_no")));
String alon_shft_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_shft_bank_cd")));
String alon_shft_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_shft_acct_no")));
String encrg_amt_shft_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("encrg_amt_shft_bank_cd")));
String encrg_amt_shft_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("encrg_amt_shft_acct_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEmp_no(emp_no);
dm.setNm_korn(nm_korn);
dm.setNm_chin(nm_chin);
dm.setNm_engl(nm_engl);
dm.setPrn(prn);
dm.setEmp_dtls_clsf(emp_dtls_clsf);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setEmp_clsf_cd(emp_clsf_cd);
dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setAlon_pay_dept_yn(alon_pay_dept_yn);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setAddm_dept_cd(addm_dept_cd);
dm.setAddm_alon_pay_dept_yn(addm_alon_pay_dept_yn);
dm.setAddm_dty_cd(addm_dty_cd);
dm.setAddm_posi_cd(addm_posi_cd);
dm.setDuty_area_cd(duty_area_cd);
dm.setDtplc_cd(dtplc_cd);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setLvcmpy_resn_cd(lvcmpy_resn_cd);
dm.setLast_midl_adjm_dt(last_midl_adjm_dt);
dm.setMidl_adjm_tms(midl_adjm_tms);
dm.setLast_upgrd_dt(last_upgrd_dt);
dm.setLast_saly_chg_appmt_dt(last_saly_chg_appmt_dt);
dm.setLast_appmt_dt(last_appmt_dt);
dm.setLast_appmt_cd(last_appmt_cd);
dm.setLast_appmt_cont(last_appmt_cont);
dm.setLast_temp_dt(last_temp_dt);
dm.setLast_reinst_dt(last_reinst_dt);
dm.setLast_temp_clsf(last_temp_clsf);
dm.setLast_stdy_dt(last_stdy_dt);
dm.setLast_stdy_reinst_dt(last_stdy_reinst_dt);
dm.setIn_cmpy_clsf(in_cmpy_clsf);
dm.setOpen_invit_clsf(open_invit_clsf);
dm.setOpen_invit_desty(open_invit_desty);
dm.setRelg_cd(relg_cd);
dm.setIn_cmpy_resn_cd(in_cmpy_resn_cd);
dm.setRecom_pers_rshp_cd(recom_pers_rshp_cd);
dm.setRecom_pers_flnm(recom_pers_flnm);
dm.setSpc_1(spc_1);
dm.setSpc_2(spc_2);
dm.setHby_1(hby_1);
dm.setHby_2(hby_2);
dm.setNativ_cd(nativ_cd);
dm.setNativ_dtls_area(nativ_dtls_area);
dm.setBlod_cd(blod_cd);
dm.setIn_cmpy_psgp_cd(in_cmpy_psgp_cd);
dm.setIn_cmpy_octgr_cd(in_cmpy_octgr_cd);
dm.setIn_cmpy_posk_cd(in_cmpy_posk_cd);
dm.setCur_jobforc_cd(cur_jobforc_cd);
dm.setCur_jobkind_cd(cur_jobkind_cd);
dm.setCur_jobnon_cd(cur_jobnon_cd);
dm.setSaly_shft_bank_cd(saly_shft_bank_cd);
dm.setSaly_shft_acct_no(saly_shft_acct_no);
dm.setAlon_shft_bank_cd(alon_shft_bank_cd);
dm.setAlon_shft_acct_no(alon_shft_acct_no);
dm.setEncrg_amt_shft_bank_cd(encrg_amt_shft_bank_cd);
dm.setEncrg_amt_shft_acct_no(encrg_amt_shft_acct_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 16:11:12 KST 2009 */