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


package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prn;
	public String flnm;
	public String studt_wk_yn;
	public String ptph_no;
	public String emp_insr_dduc_yn;
	public String octgr_cd;
	public String lve_job_resn_cd;
	public String avg_duty_tm;
	public String day01;
	public String day02;
	public String day03;
	public String day04;
	public String day05;
	public String day06;
	public String day07;
	public String day08;
	public String day09;
	public String day10;
	public String day11;
	public String day12;
	public String day13;
	public String day14;
	public String day15;
	public String day16;
	public String day17;
	public String day18;
	public String day19;
	public String day20;
	public String day21;
	public String day22;
	public String day23;
	public String day24;
	public String day25;
	public String day26;
	public String day27;
	public String day28;
	public String day29;
	public String day30;
	public String day31;
	public String pay_amt;
	public String hlth_insr_fee;
	public String np_fee;
	public String dd_amt;
	public String time_amt;
	public String budg_nm;
	public String rcpt_clsf_nm;
	public String medi_nm;
	public String use_dept_nm;
	public String rmks;
	public String evnt_nm;
	public String dtls_medi_nm;
	public String actu_slip_no;
	public String emp_insr_fee;
	public String hd_decid_pers;
	public String hd_decid_dt_tm;
	public String duty_dds;
	public String clos_yn;
	public String clos_dt;
	public String incm_tax;
	public String res_tax;
	public String budg_cd;
	public String rcpt_clsf;
	public String medi_cd;
	public String dtls_medi_cd;
	public String use_dept_cd;
	public String evnt_cd;
	public String cmpy_cd;
	public String mang_no;
	public String occr_dt;
	public String seq;
	public String duty_yymm;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String proc_clsf;
	public String all_insr_dduc_yn;
	public String hlth_insr_med_care_insr_fee;
	public String cntr_amt;

	public HD_DDEMP_1002_LCURLISTRecord(){}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setStudt_wk_yn(String studt_wk_yn){
		this.studt_wk_yn = studt_wk_yn;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmp_insr_dduc_yn(String emp_insr_dduc_yn){
		this.emp_insr_dduc_yn = emp_insr_dduc_yn;
	}

	public void setOctgr_cd(String octgr_cd){
		this.octgr_cd = octgr_cd;
	}

	public void setLve_job_resn_cd(String lve_job_resn_cd){
		this.lve_job_resn_cd = lve_job_resn_cd;
	}

	public void setAvg_duty_tm(String avg_duty_tm){
		this.avg_duty_tm = avg_duty_tm;
	}

	public void setDay01(String day01){
		this.day01 = day01;
	}

	public void setDay02(String day02){
		this.day02 = day02;
	}

	public void setDay03(String day03){
		this.day03 = day03;
	}

	public void setDay04(String day04){
		this.day04 = day04;
	}

	public void setDay05(String day05){
		this.day05 = day05;
	}

	public void setDay06(String day06){
		this.day06 = day06;
	}

	public void setDay07(String day07){
		this.day07 = day07;
	}

	public void setDay08(String day08){
		this.day08 = day08;
	}

	public void setDay09(String day09){
		this.day09 = day09;
	}

	public void setDay10(String day10){
		this.day10 = day10;
	}

	public void setDay11(String day11){
		this.day11 = day11;
	}

	public void setDay12(String day12){
		this.day12 = day12;
	}

	public void setDay13(String day13){
		this.day13 = day13;
	}

	public void setDay14(String day14){
		this.day14 = day14;
	}

	public void setDay15(String day15){
		this.day15 = day15;
	}

	public void setDay16(String day16){
		this.day16 = day16;
	}

	public void setDay17(String day17){
		this.day17 = day17;
	}

	public void setDay18(String day18){
		this.day18 = day18;
	}

	public void setDay19(String day19){
		this.day19 = day19;
	}

	public void setDay20(String day20){
		this.day20 = day20;
	}

	public void setDay21(String day21){
		this.day21 = day21;
	}

	public void setDay22(String day22){
		this.day22 = day22;
	}

	public void setDay23(String day23){
		this.day23 = day23;
	}

	public void setDay24(String day24){
		this.day24 = day24;
	}

	public void setDay25(String day25){
		this.day25 = day25;
	}

	public void setDay26(String day26){
		this.day26 = day26;
	}

	public void setDay27(String day27){
		this.day27 = day27;
	}

	public void setDay28(String day28){
		this.day28 = day28;
	}

	public void setDay29(String day29){
		this.day29 = day29;
	}

	public void setDay30(String day30){
		this.day30 = day30;
	}

	public void setDay31(String day31){
		this.day31 = day31;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setHlth_insr_fee(String hlth_insr_fee){
		this.hlth_insr_fee = hlth_insr_fee;
	}

	public void setNp_fee(String np_fee){
		this.np_fee = np_fee;
	}

	public void setDd_amt(String dd_amt){
		this.dd_amt = dd_amt;
	}

	public void setTime_amt(String time_amt){
		this.time_amt = time_amt;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setRcpt_clsf_nm(String rcpt_clsf_nm){
		this.rcpt_clsf_nm = rcpt_clsf_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
	}

	public void setHd_decid_pers(String hd_decid_pers){
		this.hd_decid_pers = hd_decid_pers;
	}

	public void setHd_decid_dt_tm(String hd_decid_dt_tm){
		this.hd_decid_dt_tm = hd_decid_dt_tm;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setAll_insr_dduc_yn(String all_insr_dduc_yn){
		this.all_insr_dduc_yn = all_insr_dduc_yn;
	}

	public void setHlth_insr_med_care_insr_fee(String hlth_insr_med_care_insr_fee){
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
	}

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getStudt_wk_yn(){
		return this.studt_wk_yn;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmp_insr_dduc_yn(){
		return this.emp_insr_dduc_yn;
	}

	public String getOctgr_cd(){
		return this.octgr_cd;
	}

	public String getLve_job_resn_cd(){
		return this.lve_job_resn_cd;
	}

	public String getAvg_duty_tm(){
		return this.avg_duty_tm;
	}

	public String getDay01(){
		return this.day01;
	}

	public String getDay02(){
		return this.day02;
	}

	public String getDay03(){
		return this.day03;
	}

	public String getDay04(){
		return this.day04;
	}

	public String getDay05(){
		return this.day05;
	}

	public String getDay06(){
		return this.day06;
	}

	public String getDay07(){
		return this.day07;
	}

	public String getDay08(){
		return this.day08;
	}

	public String getDay09(){
		return this.day09;
	}

	public String getDay10(){
		return this.day10;
	}

	public String getDay11(){
		return this.day11;
	}

	public String getDay12(){
		return this.day12;
	}

	public String getDay13(){
		return this.day13;
	}

	public String getDay14(){
		return this.day14;
	}

	public String getDay15(){
		return this.day15;
	}

	public String getDay16(){
		return this.day16;
	}

	public String getDay17(){
		return this.day17;
	}

	public String getDay18(){
		return this.day18;
	}

	public String getDay19(){
		return this.day19;
	}

	public String getDay20(){
		return this.day20;
	}

	public String getDay21(){
		return this.day21;
	}

	public String getDay22(){
		return this.day22;
	}

	public String getDay23(){
		return this.day23;
	}

	public String getDay24(){
		return this.day24;
	}

	public String getDay25(){
		return this.day25;
	}

	public String getDay26(){
		return this.day26;
	}

	public String getDay27(){
		return this.day27;
	}

	public String getDay28(){
		return this.day28;
	}

	public String getDay29(){
		return this.day29;
	}

	public String getDay30(){
		return this.day30;
	}

	public String getDay31(){
		return this.day31;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getHlth_insr_fee(){
		return this.hlth_insr_fee;
	}

	public String getNp_fee(){
		return this.np_fee;
	}

	public String getDd_amt(){
		return this.dd_amt;
	}

	public String getTime_amt(){
		return this.time_amt;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getRcpt_clsf_nm(){
		return this.rcpt_clsf_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
	}

	public String getHd_decid_pers(){
		return this.hd_decid_pers;
	}

	public String getHd_decid_dt_tm(){
		return this.hd_decid_dt_tm;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDuty_yymm(){
		return this.duty_yymm;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getAll_insr_dduc_yn(){
		return this.all_insr_dduc_yn;
	}

	public String getHlth_insr_med_care_insr_fee(){
		return this.hlth_insr_med_care_insr_fee;
	}

	public String getCntr_amt(){
		return this.cntr_amt;
	}
}

/* 작성시간 : Wed Dec 27 10:47:05 KST 2017 */