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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String use_frdt;
	public String use_todt;
	public String use_dds;
	public String preng_condo_area_cd_1;
	public String preng_condo_cd_1;
	public String preng_condo_nm_1;
	public String preng_condo_area_cd_2;
	public String preng_condo_cd_2;
	public String preng_condo_nm_2;
	public String real_preng_condo_area_cd;
	public String real_preng_condo_cd;
	public String real_preng_condo_nm;
	public String preng_no;
	public String cmpy_sply_use_yn;
	public String cmpy_sply_use_yn_nm;
	public String tel_no;
	public String ptph_no;
	public String email_addr;
	public String use_pay_amt;
	public String slf_burd_amt;
	public String cmpy_sply_amt;
	public String slf_drbk_amt;
	public String guest_room_fee_tot_amt;
	public String remk;
	public String noti_yn;
	public String noti_yn_nm;
	public String drbk_obj_yn;
	public String drbk_obj_yn_nm;
	public String preng_canc_yn;
	public String preng_canc_yn_nm;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String aplc_dt;
	public String aplc_seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String guest_room_cnt;
	public String dds_send_do_it_day;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;
	public String emp_clsf;
	public String remk_adm;
	public String aplc_amt;
	public String rcpt_clsf;
	public String rcpt_nm;

	public HD_AFFR_1100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
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

	public void setUse_frdt(String use_frdt){
		this.use_frdt = use_frdt;
	}

	public void setUse_todt(String use_todt){
		this.use_todt = use_todt;
	}

	public void setUse_dds(String use_dds){
		this.use_dds = use_dds;
	}

	public void setPreng_condo_area_cd_1(String preng_condo_area_cd_1){
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
	}

	public void setPreng_condo_cd_1(String preng_condo_cd_1){
		this.preng_condo_cd_1 = preng_condo_cd_1;
	}

	public void setPreng_condo_nm_1(String preng_condo_nm_1){
		this.preng_condo_nm_1 = preng_condo_nm_1;
	}

	public void setPreng_condo_area_cd_2(String preng_condo_area_cd_2){
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
	}

	public void setPreng_condo_cd_2(String preng_condo_cd_2){
		this.preng_condo_cd_2 = preng_condo_cd_2;
	}

	public void setPreng_condo_nm_2(String preng_condo_nm_2){
		this.preng_condo_nm_2 = preng_condo_nm_2;
	}

	public void setReal_preng_condo_area_cd(String real_preng_condo_area_cd){
		this.real_preng_condo_area_cd = real_preng_condo_area_cd;
	}

	public void setReal_preng_condo_cd(String real_preng_condo_cd){
		this.real_preng_condo_cd = real_preng_condo_cd;
	}

	public void setReal_preng_condo_nm(String real_preng_condo_nm){
		this.real_preng_condo_nm = real_preng_condo_nm;
	}

	public void setPreng_no(String preng_no){
		this.preng_no = preng_no;
	}

	public void setCmpy_sply_use_yn(String cmpy_sply_use_yn){
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
	}

	public void setCmpy_sply_use_yn_nm(String cmpy_sply_use_yn_nm){
		this.cmpy_sply_use_yn_nm = cmpy_sply_use_yn_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail_addr(String email_addr){
		this.email_addr = email_addr;
	}

	public void setUse_pay_amt(String use_pay_amt){
		this.use_pay_amt = use_pay_amt;
	}

	public void setSlf_burd_amt(String slf_burd_amt){
		this.slf_burd_amt = slf_burd_amt;
	}

	public void setCmpy_sply_amt(String cmpy_sply_amt){
		this.cmpy_sply_amt = cmpy_sply_amt;
	}

	public void setSlf_drbk_amt(String slf_drbk_amt){
		this.slf_drbk_amt = slf_drbk_amt;
	}

	public void setGuest_room_fee_tot_amt(String guest_room_fee_tot_amt){
		this.guest_room_fee_tot_amt = guest_room_fee_tot_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setNoti_yn(String noti_yn){
		this.noti_yn = noti_yn;
	}

	public void setNoti_yn_nm(String noti_yn_nm){
		this.noti_yn_nm = noti_yn_nm;
	}

	public void setDrbk_obj_yn(String drbk_obj_yn){
		this.drbk_obj_yn = drbk_obj_yn;
	}

	public void setDrbk_obj_yn_nm(String drbk_obj_yn_nm){
		this.drbk_obj_yn_nm = drbk_obj_yn_nm;
	}

	public void setPreng_canc_yn(String preng_canc_yn){
		this.preng_canc_yn = preng_canc_yn;
	}

	public void setPreng_canc_yn_nm(String preng_canc_yn_nm){
		this.preng_canc_yn_nm = preng_canc_yn_nm;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAplc_seq(String aplc_seq){
		this.aplc_seq = aplc_seq;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setGuest_room_cnt(String guest_room_cnt){
		this.guest_room_cnt = guest_room_cnt;
	}

	public void setDds_send_do_it_day(String dds_send_do_it_day){
		this.dds_send_do_it_day = dds_send_do_it_day;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setRemk_adm(String remk_adm){
		this.remk_adm = remk_adm;
	}

	public void setAplc_amt(String aplc_amt){
		this.aplc_amt = aplc_amt;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setRcpt_nm(String rcpt_nm){
		this.rcpt_nm = rcpt_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
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

	public String getUse_frdt(){
		return this.use_frdt;
	}

	public String getUse_todt(){
		return this.use_todt;
	}

	public String getUse_dds(){
		return this.use_dds;
	}

	public String getPreng_condo_area_cd_1(){
		return this.preng_condo_area_cd_1;
	}

	public String getPreng_condo_cd_1(){
		return this.preng_condo_cd_1;
	}

	public String getPreng_condo_nm_1(){
		return this.preng_condo_nm_1;
	}

	public String getPreng_condo_area_cd_2(){
		return this.preng_condo_area_cd_2;
	}

	public String getPreng_condo_cd_2(){
		return this.preng_condo_cd_2;
	}

	public String getPreng_condo_nm_2(){
		return this.preng_condo_nm_2;
	}

	public String getReal_preng_condo_area_cd(){
		return this.real_preng_condo_area_cd;
	}

	public String getReal_preng_condo_cd(){
		return this.real_preng_condo_cd;
	}

	public String getReal_preng_condo_nm(){
		return this.real_preng_condo_nm;
	}

	public String getPreng_no(){
		return this.preng_no;
	}

	public String getCmpy_sply_use_yn(){
		return this.cmpy_sply_use_yn;
	}

	public String getCmpy_sply_use_yn_nm(){
		return this.cmpy_sply_use_yn_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail_addr(){
		return this.email_addr;
	}

	public String getUse_pay_amt(){
		return this.use_pay_amt;
	}

	public String getSlf_burd_amt(){
		return this.slf_burd_amt;
	}

	public String getCmpy_sply_amt(){
		return this.cmpy_sply_amt;
	}

	public String getSlf_drbk_amt(){
		return this.slf_drbk_amt;
	}

	public String getGuest_room_fee_tot_amt(){
		return this.guest_room_fee_tot_amt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getNoti_yn(){
		return this.noti_yn;
	}

	public String getNoti_yn_nm(){
		return this.noti_yn_nm;
	}

	public String getDrbk_obj_yn(){
		return this.drbk_obj_yn;
	}

	public String getDrbk_obj_yn_nm(){
		return this.drbk_obj_yn_nm;
	}

	public String getPreng_canc_yn(){
		return this.preng_canc_yn;
	}

	public String getPreng_canc_yn_nm(){
		return this.preng_canc_yn_nm;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAplc_seq(){
		return this.aplc_seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getGuest_room_cnt(){
		return this.guest_room_cnt;
	}

	public String getDds_send_do_it_day(){
		return this.dds_send_do_it_day;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getRemk_adm(){
		return this.remk_adm;
	}

	public String getAplc_amt(){
		return this.aplc_amt;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getRcpt_nm(){
		return this.rcpt_nm;
	}
}

/* 작성시간 : Thu Aug 08 17:20:18 KST 2013 */