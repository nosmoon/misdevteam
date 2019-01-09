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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String duty_area_cd;
	public String duty_area_nm;
	public String dtplc_cd;
	public String dtplc_nm;
	public String in_cmpy_psgp_cd;
	public String in_cmpy_psgp_nm;
	public String in_cmpy_octgr_cd;
	public String in_cmpy_octgr_nm;
	public String in_cmpy_posk_cd;
	public String in_cmpy_posk_nm;
	public String cur_jobforc_cd;
	public String cur_jobforc_nm;
	public String cur_jobkind_cd;
	public String cur_jobkind_nm;
	public String cur_jobnon_cd;
	public String cur_jobnon_nm;
	public String lvcmpy_dt;
	public String lvcmpy_resn_cd;
	public String lvcmpy_resn_nm;
	public String last_midl_adjm_dt;
	public String midl_adjm_tms;
	public String last_upgrd_dt;
	public String last_saly_chg_appmt_dt;
	public String last_appmt_dt;
	public String last_appmt_cd;
	public String last_appmt_nm;
	public String last_appmt_cont;
	public String last_temp_dt;
	public String last_reinst_dt;
	public String last_temp_clsf;
	public String last_temp_clsf_nm;
	public String last_stdy_dt;
	public String last_stdy_reinst_dt;
	public String in_cmpy_clsf;
	public String in_cmpy_clsf_nm;
	public String open_invit_clsf;
	public String open_invit_clsf_nm;
	public String open_invit_desty;
	public String relg_cd;
	public String relg_nm;
	public String in_cmpy_resn_cd;
	public String in_cmpy_resn_nm;
	public String recom_pers_rshp_cd;
	public String recom_pers_rshp_nm;
	public String recom_pers_flnm;
	public String blod_cd;
	public String blod_nm;
	public String nativ_cd;
	public String nativ_dtls_area;
	public String hby_1;
	public String hby_2;
	public String spc_1;
	public String spc_2;
	public String saly_shft_bank_cd;
	public String saly_shft_bank_nm;
	public String saly_shft_acct_no;
	public String alon_shft_bank_cd;
	public String alon_shft_bank_nm;
	public String alon_shft_acct_no;
	public String encrg_amt_shft_bank_cd;
	public String encrg_amt_shft_bank_nm;
	public String encrg_amt_shft_acct_no;
	public String etc_shft_bank_cd;
	public String etc_shft_bank_nm;
	public String etc_shft_acct_no;
	public String etc_shft_chqe_pay_yn;
	public String aprv_in_cmpy;

	public HD_INFO_1011_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDuty_area_cd(String duty_area_cd){
		this.duty_area_cd = duty_area_cd;
	}

	public void setDuty_area_nm(String duty_area_nm){
		this.duty_area_nm = duty_area_nm;
	}

	public void setDtplc_cd(String dtplc_cd){
		this.dtplc_cd = dtplc_cd;
	}

	public void setDtplc_nm(String dtplc_nm){
		this.dtplc_nm = dtplc_nm;
	}

	public void setIn_cmpy_psgp_cd(String in_cmpy_psgp_cd){
		this.in_cmpy_psgp_cd = in_cmpy_psgp_cd;
	}

	public void setIn_cmpy_psgp_nm(String in_cmpy_psgp_nm){
		this.in_cmpy_psgp_nm = in_cmpy_psgp_nm;
	}

	public void setIn_cmpy_octgr_cd(String in_cmpy_octgr_cd){
		this.in_cmpy_octgr_cd = in_cmpy_octgr_cd;
	}

	public void setIn_cmpy_octgr_nm(String in_cmpy_octgr_nm){
		this.in_cmpy_octgr_nm = in_cmpy_octgr_nm;
	}

	public void setIn_cmpy_posk_cd(String in_cmpy_posk_cd){
		this.in_cmpy_posk_cd = in_cmpy_posk_cd;
	}

	public void setIn_cmpy_posk_nm(String in_cmpy_posk_nm){
		this.in_cmpy_posk_nm = in_cmpy_posk_nm;
	}

	public void setCur_jobforc_cd(String cur_jobforc_cd){
		this.cur_jobforc_cd = cur_jobforc_cd;
	}

	public void setCur_jobforc_nm(String cur_jobforc_nm){
		this.cur_jobforc_nm = cur_jobforc_nm;
	}

	public void setCur_jobkind_cd(String cur_jobkind_cd){
		this.cur_jobkind_cd = cur_jobkind_cd;
	}

	public void setCur_jobkind_nm(String cur_jobkind_nm){
		this.cur_jobkind_nm = cur_jobkind_nm;
	}

	public void setCur_jobnon_cd(String cur_jobnon_cd){
		this.cur_jobnon_cd = cur_jobnon_cd;
	}

	public void setCur_jobnon_nm(String cur_jobnon_nm){
		this.cur_jobnon_nm = cur_jobnon_nm;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setLvcmpy_resn_cd(String lvcmpy_resn_cd){
		this.lvcmpy_resn_cd = lvcmpy_resn_cd;
	}

	public void setLvcmpy_resn_nm(String lvcmpy_resn_nm){
		this.lvcmpy_resn_nm = lvcmpy_resn_nm;
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

	public void setLast_appmt_nm(String last_appmt_nm){
		this.last_appmt_nm = last_appmt_nm;
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

	public void setLast_temp_clsf_nm(String last_temp_clsf_nm){
		this.last_temp_clsf_nm = last_temp_clsf_nm;
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

	public void setIn_cmpy_clsf_nm(String in_cmpy_clsf_nm){
		this.in_cmpy_clsf_nm = in_cmpy_clsf_nm;
	}

	public void setOpen_invit_clsf(String open_invit_clsf){
		this.open_invit_clsf = open_invit_clsf;
	}

	public void setOpen_invit_clsf_nm(String open_invit_clsf_nm){
		this.open_invit_clsf_nm = open_invit_clsf_nm;
	}

	public void setOpen_invit_desty(String open_invit_desty){
		this.open_invit_desty = open_invit_desty;
	}

	public void setRelg_cd(String relg_cd){
		this.relg_cd = relg_cd;
	}

	public void setRelg_nm(String relg_nm){
		this.relg_nm = relg_nm;
	}

	public void setIn_cmpy_resn_cd(String in_cmpy_resn_cd){
		this.in_cmpy_resn_cd = in_cmpy_resn_cd;
	}

	public void setIn_cmpy_resn_nm(String in_cmpy_resn_nm){
		this.in_cmpy_resn_nm = in_cmpy_resn_nm;
	}

	public void setRecom_pers_rshp_cd(String recom_pers_rshp_cd){
		this.recom_pers_rshp_cd = recom_pers_rshp_cd;
	}

	public void setRecom_pers_rshp_nm(String recom_pers_rshp_nm){
		this.recom_pers_rshp_nm = recom_pers_rshp_nm;
	}

	public void setRecom_pers_flnm(String recom_pers_flnm){
		this.recom_pers_flnm = recom_pers_flnm;
	}

	public void setBlod_cd(String blod_cd){
		this.blod_cd = blod_cd;
	}

	public void setBlod_nm(String blod_nm){
		this.blod_nm = blod_nm;
	}

	public void setNativ_cd(String nativ_cd){
		this.nativ_cd = nativ_cd;
	}

	public void setNativ_dtls_area(String nativ_dtls_area){
		this.nativ_dtls_area = nativ_dtls_area;
	}

	public void setHby_1(String hby_1){
		this.hby_1 = hby_1;
	}

	public void setHby_2(String hby_2){
		this.hby_2 = hby_2;
	}

	public void setSpc_1(String spc_1){
		this.spc_1 = spc_1;
	}

	public void setSpc_2(String spc_2){
		this.spc_2 = spc_2;
	}

	public void setSaly_shft_bank_cd(String saly_shft_bank_cd){
		this.saly_shft_bank_cd = saly_shft_bank_cd;
	}

	public void setSaly_shft_bank_nm(String saly_shft_bank_nm){
		this.saly_shft_bank_nm = saly_shft_bank_nm;
	}

	public void setSaly_shft_acct_no(String saly_shft_acct_no){
		this.saly_shft_acct_no = saly_shft_acct_no;
	}

	public void setAlon_shft_bank_cd(String alon_shft_bank_cd){
		this.alon_shft_bank_cd = alon_shft_bank_cd;
	}

	public void setAlon_shft_bank_nm(String alon_shft_bank_nm){
		this.alon_shft_bank_nm = alon_shft_bank_nm;
	}

	public void setAlon_shft_acct_no(String alon_shft_acct_no){
		this.alon_shft_acct_no = alon_shft_acct_no;
	}

	public void setEncrg_amt_shft_bank_cd(String encrg_amt_shft_bank_cd){
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
	}

	public void setEncrg_amt_shft_bank_nm(String encrg_amt_shft_bank_nm){
		this.encrg_amt_shft_bank_nm = encrg_amt_shft_bank_nm;
	}

	public void setEncrg_amt_shft_acct_no(String encrg_amt_shft_acct_no){
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
	}

	public void setEtc_shft_bank_cd(String etc_shft_bank_cd){
		this.etc_shft_bank_cd = etc_shft_bank_cd;
	}

	public void setEtc_shft_bank_nm(String etc_shft_bank_nm){
		this.etc_shft_bank_nm = etc_shft_bank_nm;
	}

	public void setEtc_shft_acct_no(String etc_shft_acct_no){
		this.etc_shft_acct_no = etc_shft_acct_no;
	}

	public void setEtc_shft_chqe_pay_yn(String etc_shft_chqe_pay_yn){
		this.etc_shft_chqe_pay_yn = etc_shft_chqe_pay_yn;
	}

	public void setAprv_in_cmpy(String aprv_in_cmpy){
		this.aprv_in_cmpy = aprv_in_cmpy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDuty_area_cd(){
		return this.duty_area_cd;
	}

	public String getDuty_area_nm(){
		return this.duty_area_nm;
	}

	public String getDtplc_cd(){
		return this.dtplc_cd;
	}

	public String getDtplc_nm(){
		return this.dtplc_nm;
	}

	public String getIn_cmpy_psgp_cd(){
		return this.in_cmpy_psgp_cd;
	}

	public String getIn_cmpy_psgp_nm(){
		return this.in_cmpy_psgp_nm;
	}

	public String getIn_cmpy_octgr_cd(){
		return this.in_cmpy_octgr_cd;
	}

	public String getIn_cmpy_octgr_nm(){
		return this.in_cmpy_octgr_nm;
	}

	public String getIn_cmpy_posk_cd(){
		return this.in_cmpy_posk_cd;
	}

	public String getIn_cmpy_posk_nm(){
		return this.in_cmpy_posk_nm;
	}

	public String getCur_jobforc_cd(){
		return this.cur_jobforc_cd;
	}

	public String getCur_jobforc_nm(){
		return this.cur_jobforc_nm;
	}

	public String getCur_jobkind_cd(){
		return this.cur_jobkind_cd;
	}

	public String getCur_jobkind_nm(){
		return this.cur_jobkind_nm;
	}

	public String getCur_jobnon_cd(){
		return this.cur_jobnon_cd;
	}

	public String getCur_jobnon_nm(){
		return this.cur_jobnon_nm;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getLvcmpy_resn_cd(){
		return this.lvcmpy_resn_cd;
	}

	public String getLvcmpy_resn_nm(){
		return this.lvcmpy_resn_nm;
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

	public String getLast_appmt_nm(){
		return this.last_appmt_nm;
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

	public String getLast_temp_clsf_nm(){
		return this.last_temp_clsf_nm;
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

	public String getIn_cmpy_clsf_nm(){
		return this.in_cmpy_clsf_nm;
	}

	public String getOpen_invit_clsf(){
		return this.open_invit_clsf;
	}

	public String getOpen_invit_clsf_nm(){
		return this.open_invit_clsf_nm;
	}

	public String getOpen_invit_desty(){
		return this.open_invit_desty;
	}

	public String getRelg_cd(){
		return this.relg_cd;
	}

	public String getRelg_nm(){
		return this.relg_nm;
	}

	public String getIn_cmpy_resn_cd(){
		return this.in_cmpy_resn_cd;
	}

	public String getIn_cmpy_resn_nm(){
		return this.in_cmpy_resn_nm;
	}

	public String getRecom_pers_rshp_cd(){
		return this.recom_pers_rshp_cd;
	}

	public String getRecom_pers_rshp_nm(){
		return this.recom_pers_rshp_nm;
	}

	public String getRecom_pers_flnm(){
		return this.recom_pers_flnm;
	}

	public String getBlod_cd(){
		return this.blod_cd;
	}

	public String getBlod_nm(){
		return this.blod_nm;
	}

	public String getNativ_cd(){
		return this.nativ_cd;
	}

	public String getNativ_dtls_area(){
		return this.nativ_dtls_area;
	}

	public String getHby_1(){
		return this.hby_1;
	}

	public String getHby_2(){
		return this.hby_2;
	}

	public String getSpc_1(){
		return this.spc_1;
	}

	public String getSpc_2(){
		return this.spc_2;
	}

	public String getSaly_shft_bank_cd(){
		return this.saly_shft_bank_cd;
	}

	public String getSaly_shft_bank_nm(){
		return this.saly_shft_bank_nm;
	}

	public String getSaly_shft_acct_no(){
		return this.saly_shft_acct_no;
	}

	public String getAlon_shft_bank_cd(){
		return this.alon_shft_bank_cd;
	}

	public String getAlon_shft_bank_nm(){
		return this.alon_shft_bank_nm;
	}

	public String getAlon_shft_acct_no(){
		return this.alon_shft_acct_no;
	}

	public String getEncrg_amt_shft_bank_cd(){
		return this.encrg_amt_shft_bank_cd;
	}

	public String getEncrg_amt_shft_bank_nm(){
		return this.encrg_amt_shft_bank_nm;
	}

	public String getEncrg_amt_shft_acct_no(){
		return this.encrg_amt_shft_acct_no;
	}

	public String getEtc_shft_bank_cd(){
		return this.etc_shft_bank_cd;
	}

	public String getEtc_shft_bank_nm(){
		return this.etc_shft_bank_nm;
	}

	public String getEtc_shft_acct_no(){
		return this.etc_shft_acct_no;
	}

	public String getEtc_shft_chqe_pay_yn(){
		return this.etc_shft_chqe_pay_yn;
	}

	public String getAprv_in_cmpy(){
		return this.aprv_in_cmpy;
	}
}

/* 작성시간 : Mon Dec 18 15:04:47 KST 2017 */