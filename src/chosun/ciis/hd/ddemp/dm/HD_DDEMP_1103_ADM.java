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


package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String chk;
	public String cmpy_cd;
	public String mang_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String s_duty_yymm;
	public String duty_yymm;
	public String prn;
	public String emp_insr_dduc_yn;
	public String studt_wk_yn;
	public String duty_dds;
	public String avg_duty_tm;
	public String ptph_no;
	public String octgr_cd;
	public String lve_job_resn_cd;
	public String clos_yn;
	public String clos_dt;
	public String pay_amt;
	public String emp_insr_fee;
	public String hlth_insr_fee;
	public String np_fee;
	public String dd_amt;
	public String time_amt;
	public String incm_tax;
	public String res_tax;
	public String medi_cd;
	public String dtls_medi_cd;
	public String use_dept_cd;
	public String evnt_cd;
	public String budg_cd;
	public String rmks;
	public String rcpt_clsf;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
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
	public String u_ipadd;
	public String u_id;
	public String all_insr_dduc_yn;
	public String hlth_insr_med_care_insr_fee;
	public String cntr_amt;

	public HD_DDEMP_1103_ADM(){}
	public HD_DDEMP_1103_ADM(String mode, String chk, String cmpy_cd, String mang_no, String occr_dt, String seq, String flnm, String s_duty_yymm, String duty_yymm, String prn, String emp_insr_dduc_yn, String studt_wk_yn, String duty_dds, String avg_duty_tm, String ptph_no, String octgr_cd, String lve_job_resn_cd, String clos_yn, String clos_dt, String pay_amt, String emp_insr_fee, String hlth_insr_fee, String np_fee, String dd_amt, String time_amt, String incm_tax, String res_tax, String medi_cd, String dtls_medi_cd, String use_dept_cd, String evnt_cd, String budg_cd, String rmks, String rcpt_clsf, String slip_proc_mang_dt, String slip_proc_mang_seq, String day01, String day02, String day03, String day04, String day05, String day06, String day07, String day08, String day09, String day10, String day11, String day12, String day13, String day14, String day15, String day16, String day17, String day18, String day19, String day20, String day21, String day22, String day23, String day24, String day25, String day26, String day27, String day28, String day29, String day30, String day31, String u_ipadd, String u_id, String all_insr_dduc_yn, String hlth_insr_med_care_insr_fee, String cntr_amt){
		this.mode = mode;
		this.chk = chk;
		this.cmpy_cd = cmpy_cd;
		this.mang_no = mang_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.s_duty_yymm = s_duty_yymm;
		this.duty_yymm = duty_yymm;
		this.prn = prn;
		this.emp_insr_dduc_yn = emp_insr_dduc_yn;
		this.studt_wk_yn = studt_wk_yn;
		this.duty_dds = duty_dds;
		this.avg_duty_tm = avg_duty_tm;
		this.ptph_no = ptph_no;
		this.octgr_cd = octgr_cd;
		this.lve_job_resn_cd = lve_job_resn_cd;
		this.clos_yn = clos_yn;
		this.clos_dt = clos_dt;
		this.pay_amt = pay_amt;
		this.emp_insr_fee = emp_insr_fee;
		this.hlth_insr_fee = hlth_insr_fee;
		this.np_fee = np_fee;
		this.dd_amt = dd_amt;
		this.time_amt = time_amt;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.use_dept_cd = use_dept_cd;
		this.evnt_cd = evnt_cd;
		this.budg_cd = budg_cd;
		this.rmks = rmks;
		this.rcpt_clsf = rcpt_clsf;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.day01 = day01;
		this.day02 = day02;
		this.day03 = day03;
		this.day04 = day04;
		this.day05 = day05;
		this.day06 = day06;
		this.day07 = day07;
		this.day08 = day08;
		this.day09 = day09;
		this.day10 = day10;
		this.day11 = day11;
		this.day12 = day12;
		this.day13 = day13;
		this.day14 = day14;
		this.day15 = day15;
		this.day16 = day16;
		this.day17 = day17;
		this.day18 = day18;
		this.day19 = day19;
		this.day20 = day20;
		this.day21 = day21;
		this.day22 = day22;
		this.day23 = day23;
		this.day24 = day24;
		this.day25 = day25;
		this.day26 = day26;
		this.day27 = day27;
		this.day28 = day28;
		this.day29 = day29;
		this.day30 = day30;
		this.day31 = day31;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
		this.all_insr_dduc_yn = all_insr_dduc_yn;
		this.hlth_insr_med_care_insr_fee = hlth_insr_med_care_insr_fee;
		this.cntr_amt = cntr_amt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setChk(String chk){
		this.chk = chk;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setS_duty_yymm(String s_duty_yymm){
		this.s_duty_yymm = s_duty_yymm;
	}

	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmp_insr_dduc_yn(String emp_insr_dduc_yn){
		this.emp_insr_dduc_yn = emp_insr_dduc_yn;
	}

	public void setStudt_wk_yn(String studt_wk_yn){
		this.studt_wk_yn = studt_wk_yn;
	}

	public void setDuty_dds(String duty_dds){
		this.duty_dds = duty_dds;
	}

	public void setAvg_duty_tm(String avg_duty_tm){
		this.avg_duty_tm = avg_duty_tm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setOctgr_cd(String octgr_cd){
		this.octgr_cd = octgr_cd;
	}

	public void setLve_job_resn_cd(String lve_job_resn_cd){
		this.lve_job_resn_cd = lve_job_resn_cd;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setEmp_insr_fee(String emp_insr_fee){
		this.emp_insr_fee = emp_insr_fee;
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

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
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

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
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

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
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

	public String getMode(){
		return this.mode;
	}

	public String getChk(){
		return this.chk;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getS_duty_yymm(){
		return this.s_duty_yymm;
	}

	public String getDuty_yymm(){
		return this.duty_yymm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmp_insr_dduc_yn(){
		return this.emp_insr_dduc_yn;
	}

	public String getStudt_wk_yn(){
		return this.studt_wk_yn;
	}

	public String getDuty_dds(){
		return this.duty_dds;
	}

	public String getAvg_duty_tm(){
		return this.avg_duty_tm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getOctgr_cd(){
		return this.octgr_cd;
	}

	public String getLve_job_resn_cd(){
		return this.lve_job_resn_cd;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getEmp_insr_fee(){
		return this.emp_insr_fee;
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

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
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

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
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

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
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

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DDEMP_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_1103_ADM dm = (HD_DDEMP_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.chk);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.mang_no);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.s_duty_yymm);
		cstmt.setString(11, dm.duty_yymm);
		cstmt.setString(12, dm.prn);
		cstmt.setString(13, dm.emp_insr_dduc_yn);
		cstmt.setString(14, dm.studt_wk_yn);
		cstmt.setString(15, dm.duty_dds);
		cstmt.setString(16, dm.avg_duty_tm);
		cstmt.setString(17, dm.ptph_no);
		cstmt.setString(18, dm.octgr_cd);
		cstmt.setString(19, dm.lve_job_resn_cd);
		cstmt.setString(20, dm.clos_yn);
		cstmt.setString(21, dm.clos_dt);
		cstmt.setString(22, dm.pay_amt);
		cstmt.setString(23, dm.emp_insr_fee);
		cstmt.setString(24, dm.hlth_insr_fee);
		cstmt.setString(25, dm.np_fee);
		cstmt.setString(26, dm.dd_amt);
		cstmt.setString(27, dm.time_amt);
		cstmt.setString(28, dm.incm_tax);
		cstmt.setString(29, dm.res_tax);
		cstmt.setString(30, dm.medi_cd);
		cstmt.setString(31, dm.dtls_medi_cd);
		cstmt.setString(32, dm.use_dept_cd);
		cstmt.setString(33, dm.evnt_cd);
		cstmt.setString(34, dm.budg_cd);
		cstmt.setString(35, dm.rmks);
		cstmt.setString(36, dm.rcpt_clsf);
		cstmt.setString(37, dm.slip_proc_mang_dt);
		cstmt.setString(38, dm.slip_proc_mang_seq);
		cstmt.setString(39, dm.day01);
		cstmt.setString(40, dm.day02);
		cstmt.setString(41, dm.day03);
		cstmt.setString(42, dm.day04);
		cstmt.setString(43, dm.day05);
		cstmt.setString(44, dm.day06);
		cstmt.setString(45, dm.day07);
		cstmt.setString(46, dm.day08);
		cstmt.setString(47, dm.day09);
		cstmt.setString(48, dm.day10);
		cstmt.setString(49, dm.day11);
		cstmt.setString(50, dm.day12);
		cstmt.setString(51, dm.day13);
		cstmt.setString(52, dm.day14);
		cstmt.setString(53, dm.day15);
		cstmt.setString(54, dm.day16);
		cstmt.setString(55, dm.day17);
		cstmt.setString(56, dm.day18);
		cstmt.setString(57, dm.day19);
		cstmt.setString(58, dm.day20);
		cstmt.setString(59, dm.day21);
		cstmt.setString(60, dm.day22);
		cstmt.setString(61, dm.day23);
		cstmt.setString(62, dm.day24);
		cstmt.setString(63, dm.day25);
		cstmt.setString(64, dm.day26);
		cstmt.setString(65, dm.day27);
		cstmt.setString(66, dm.day28);
		cstmt.setString(67, dm.day29);
		cstmt.setString(68, dm.day30);
		cstmt.setString(69, dm.day31);
		cstmt.setString(70, dm.u_ipadd);
		cstmt.setString(71, dm.u_id);
		cstmt.setString(72, dm.all_insr_dduc_yn);
		cstmt.setString(73, dm.hlth_insr_med_care_insr_fee);
		cstmt.setString(74, dm.cntr_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.ddemp.ds.HD_DDEMP_1103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("chk = [" + getChk() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("s_duty_yymm = [" + getS_duty_yymm() + "]");
		System.out.println("duty_yymm = [" + getDuty_yymm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("emp_insr_dduc_yn = [" + getEmp_insr_dduc_yn() + "]");
		System.out.println("studt_wk_yn = [" + getStudt_wk_yn() + "]");
		System.out.println("duty_dds = [" + getDuty_dds() + "]");
		System.out.println("avg_duty_tm = [" + getAvg_duty_tm() + "]");
		System.out.println("ptph_no = [" + getPtph_no() + "]");
		System.out.println("octgr_cd = [" + getOctgr_cd() + "]");
		System.out.println("lve_job_resn_cd = [" + getLve_job_resn_cd() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("emp_insr_fee = [" + getEmp_insr_fee() + "]");
		System.out.println("hlth_insr_fee = [" + getHlth_insr_fee() + "]");
		System.out.println("np_fee = [" + getNp_fee() + "]");
		System.out.println("dd_amt = [" + getDd_amt() + "]");
		System.out.println("time_amt = [" + getTime_amt() + "]");
		System.out.println("incm_tax = [" + getIncm_tax() + "]");
		System.out.println("res_tax = [" + getRes_tax() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
		System.out.println("rcpt_clsf = [" + getRcpt_clsf() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("day01 = [" + getDay01() + "]");
		System.out.println("day02 = [" + getDay02() + "]");
		System.out.println("day03 = [" + getDay03() + "]");
		System.out.println("day04 = [" + getDay04() + "]");
		System.out.println("day05 = [" + getDay05() + "]");
		System.out.println("day06 = [" + getDay06() + "]");
		System.out.println("day07 = [" + getDay07() + "]");
		System.out.println("day08 = [" + getDay08() + "]");
		System.out.println("day09 = [" + getDay09() + "]");
		System.out.println("day10 = [" + getDay10() + "]");
		System.out.println("day11 = [" + getDay11() + "]");
		System.out.println("day12 = [" + getDay12() + "]");
		System.out.println("day13 = [" + getDay13() + "]");
		System.out.println("day14 = [" + getDay14() + "]");
		System.out.println("day15 = [" + getDay15() + "]");
		System.out.println("day16 = [" + getDay16() + "]");
		System.out.println("day17 = [" + getDay17() + "]");
		System.out.println("day18 = [" + getDay18() + "]");
		System.out.println("day19 = [" + getDay19() + "]");
		System.out.println("day20 = [" + getDay20() + "]");
		System.out.println("day21 = [" + getDay21() + "]");
		System.out.println("day22 = [" + getDay22() + "]");
		System.out.println("day23 = [" + getDay23() + "]");
		System.out.println("day24 = [" + getDay24() + "]");
		System.out.println("day25 = [" + getDay25() + "]");
		System.out.println("day26 = [" + getDay26() + "]");
		System.out.println("day27 = [" + getDay27() + "]");
		System.out.println("day28 = [" + getDay28() + "]");
		System.out.println("day29 = [" + getDay29() + "]");
		System.out.println("day30 = [" + getDay30() + "]");
		System.out.println("day31 = [" + getDay31() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
		System.out.println("all_insr_dduc_yn = [" + getAll_insr_dduc_yn() + "]");
		System.out.println("hlth_insr_med_care_insr_fee = [" + getHlth_insr_med_care_insr_fee() + "]");
		System.out.println("cntr_amt = [" + getCntr_amt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String chk = req.getParameter("chk");
if( chk == null){
	System.out.println(this.toString+" : chk is null" );
}else{
	System.out.println(this.toString+" : chk is "+chk );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String s_duty_yymm = req.getParameter("s_duty_yymm");
if( s_duty_yymm == null){
	System.out.println(this.toString+" : s_duty_yymm is null" );
}else{
	System.out.println(this.toString+" : s_duty_yymm is "+s_duty_yymm );
}
String duty_yymm = req.getParameter("duty_yymm");
if( duty_yymm == null){
	System.out.println(this.toString+" : duty_yymm is null" );
}else{
	System.out.println(this.toString+" : duty_yymm is "+duty_yymm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String emp_insr_dduc_yn = req.getParameter("emp_insr_dduc_yn");
if( emp_insr_dduc_yn == null){
	System.out.println(this.toString+" : emp_insr_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : emp_insr_dduc_yn is "+emp_insr_dduc_yn );
}
String studt_wk_yn = req.getParameter("studt_wk_yn");
if( studt_wk_yn == null){
	System.out.println(this.toString+" : studt_wk_yn is null" );
}else{
	System.out.println(this.toString+" : studt_wk_yn is "+studt_wk_yn );
}
String duty_dds = req.getParameter("duty_dds");
if( duty_dds == null){
	System.out.println(this.toString+" : duty_dds is null" );
}else{
	System.out.println(this.toString+" : duty_dds is "+duty_dds );
}
String avg_duty_tm = req.getParameter("avg_duty_tm");
if( avg_duty_tm == null){
	System.out.println(this.toString+" : avg_duty_tm is null" );
}else{
	System.out.println(this.toString+" : avg_duty_tm is "+avg_duty_tm );
}
String ptph_no = req.getParameter("ptph_no");
if( ptph_no == null){
	System.out.println(this.toString+" : ptph_no is null" );
}else{
	System.out.println(this.toString+" : ptph_no is "+ptph_no );
}
String octgr_cd = req.getParameter("octgr_cd");
if( octgr_cd == null){
	System.out.println(this.toString+" : octgr_cd is null" );
}else{
	System.out.println(this.toString+" : octgr_cd is "+octgr_cd );
}
String lve_job_resn_cd = req.getParameter("lve_job_resn_cd");
if( lve_job_resn_cd == null){
	System.out.println(this.toString+" : lve_job_resn_cd is null" );
}else{
	System.out.println(this.toString+" : lve_job_resn_cd is "+lve_job_resn_cd );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String emp_insr_fee = req.getParameter("emp_insr_fee");
if( emp_insr_fee == null){
	System.out.println(this.toString+" : emp_insr_fee is null" );
}else{
	System.out.println(this.toString+" : emp_insr_fee is "+emp_insr_fee );
}
String hlth_insr_fee = req.getParameter("hlth_insr_fee");
if( hlth_insr_fee == null){
	System.out.println(this.toString+" : hlth_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_fee is "+hlth_insr_fee );
}
String np_fee = req.getParameter("np_fee");
if( np_fee == null){
	System.out.println(this.toString+" : np_fee is null" );
}else{
	System.out.println(this.toString+" : np_fee is "+np_fee );
}
String dd_amt = req.getParameter("dd_amt");
if( dd_amt == null){
	System.out.println(this.toString+" : dd_amt is null" );
}else{
	System.out.println(this.toString+" : dd_amt is "+dd_amt );
}
String time_amt = req.getParameter("time_amt");
if( time_amt == null){
	System.out.println(this.toString+" : time_amt is null" );
}else{
	System.out.println(this.toString+" : time_amt is "+time_amt );
}
String incm_tax = req.getParameter("incm_tax");
if( incm_tax == null){
	System.out.println(this.toString+" : incm_tax is null" );
}else{
	System.out.println(this.toString+" : incm_tax is "+incm_tax );
}
String res_tax = req.getParameter("res_tax");
if( res_tax == null){
	System.out.println(this.toString+" : res_tax is null" );
}else{
	System.out.println(this.toString+" : res_tax is "+res_tax );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String rcpt_clsf = req.getParameter("rcpt_clsf");
if( rcpt_clsf == null){
	System.out.println(this.toString+" : rcpt_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpt_clsf is "+rcpt_clsf );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String day01 = req.getParameter("day01");
if( day01 == null){
	System.out.println(this.toString+" : day01 is null" );
}else{
	System.out.println(this.toString+" : day01 is "+day01 );
}
String day02 = req.getParameter("day02");
if( day02 == null){
	System.out.println(this.toString+" : day02 is null" );
}else{
	System.out.println(this.toString+" : day02 is "+day02 );
}
String day03 = req.getParameter("day03");
if( day03 == null){
	System.out.println(this.toString+" : day03 is null" );
}else{
	System.out.println(this.toString+" : day03 is "+day03 );
}
String day04 = req.getParameter("day04");
if( day04 == null){
	System.out.println(this.toString+" : day04 is null" );
}else{
	System.out.println(this.toString+" : day04 is "+day04 );
}
String day05 = req.getParameter("day05");
if( day05 == null){
	System.out.println(this.toString+" : day05 is null" );
}else{
	System.out.println(this.toString+" : day05 is "+day05 );
}
String day06 = req.getParameter("day06");
if( day06 == null){
	System.out.println(this.toString+" : day06 is null" );
}else{
	System.out.println(this.toString+" : day06 is "+day06 );
}
String day07 = req.getParameter("day07");
if( day07 == null){
	System.out.println(this.toString+" : day07 is null" );
}else{
	System.out.println(this.toString+" : day07 is "+day07 );
}
String day08 = req.getParameter("day08");
if( day08 == null){
	System.out.println(this.toString+" : day08 is null" );
}else{
	System.out.println(this.toString+" : day08 is "+day08 );
}
String day09 = req.getParameter("day09");
if( day09 == null){
	System.out.println(this.toString+" : day09 is null" );
}else{
	System.out.println(this.toString+" : day09 is "+day09 );
}
String day10 = req.getParameter("day10");
if( day10 == null){
	System.out.println(this.toString+" : day10 is null" );
}else{
	System.out.println(this.toString+" : day10 is "+day10 );
}
String day11 = req.getParameter("day11");
if( day11 == null){
	System.out.println(this.toString+" : day11 is null" );
}else{
	System.out.println(this.toString+" : day11 is "+day11 );
}
String day12 = req.getParameter("day12");
if( day12 == null){
	System.out.println(this.toString+" : day12 is null" );
}else{
	System.out.println(this.toString+" : day12 is "+day12 );
}
String day13 = req.getParameter("day13");
if( day13 == null){
	System.out.println(this.toString+" : day13 is null" );
}else{
	System.out.println(this.toString+" : day13 is "+day13 );
}
String day14 = req.getParameter("day14");
if( day14 == null){
	System.out.println(this.toString+" : day14 is null" );
}else{
	System.out.println(this.toString+" : day14 is "+day14 );
}
String day15 = req.getParameter("day15");
if( day15 == null){
	System.out.println(this.toString+" : day15 is null" );
}else{
	System.out.println(this.toString+" : day15 is "+day15 );
}
String day16 = req.getParameter("day16");
if( day16 == null){
	System.out.println(this.toString+" : day16 is null" );
}else{
	System.out.println(this.toString+" : day16 is "+day16 );
}
String day17 = req.getParameter("day17");
if( day17 == null){
	System.out.println(this.toString+" : day17 is null" );
}else{
	System.out.println(this.toString+" : day17 is "+day17 );
}
String day18 = req.getParameter("day18");
if( day18 == null){
	System.out.println(this.toString+" : day18 is null" );
}else{
	System.out.println(this.toString+" : day18 is "+day18 );
}
String day19 = req.getParameter("day19");
if( day19 == null){
	System.out.println(this.toString+" : day19 is null" );
}else{
	System.out.println(this.toString+" : day19 is "+day19 );
}
String day20 = req.getParameter("day20");
if( day20 == null){
	System.out.println(this.toString+" : day20 is null" );
}else{
	System.out.println(this.toString+" : day20 is "+day20 );
}
String day21 = req.getParameter("day21");
if( day21 == null){
	System.out.println(this.toString+" : day21 is null" );
}else{
	System.out.println(this.toString+" : day21 is "+day21 );
}
String day22 = req.getParameter("day22");
if( day22 == null){
	System.out.println(this.toString+" : day22 is null" );
}else{
	System.out.println(this.toString+" : day22 is "+day22 );
}
String day23 = req.getParameter("day23");
if( day23 == null){
	System.out.println(this.toString+" : day23 is null" );
}else{
	System.out.println(this.toString+" : day23 is "+day23 );
}
String day24 = req.getParameter("day24");
if( day24 == null){
	System.out.println(this.toString+" : day24 is null" );
}else{
	System.out.println(this.toString+" : day24 is "+day24 );
}
String day25 = req.getParameter("day25");
if( day25 == null){
	System.out.println(this.toString+" : day25 is null" );
}else{
	System.out.println(this.toString+" : day25 is "+day25 );
}
String day26 = req.getParameter("day26");
if( day26 == null){
	System.out.println(this.toString+" : day26 is null" );
}else{
	System.out.println(this.toString+" : day26 is "+day26 );
}
String day27 = req.getParameter("day27");
if( day27 == null){
	System.out.println(this.toString+" : day27 is null" );
}else{
	System.out.println(this.toString+" : day27 is "+day27 );
}
String day28 = req.getParameter("day28");
if( day28 == null){
	System.out.println(this.toString+" : day28 is null" );
}else{
	System.out.println(this.toString+" : day28 is "+day28 );
}
String day29 = req.getParameter("day29");
if( day29 == null){
	System.out.println(this.toString+" : day29 is null" );
}else{
	System.out.println(this.toString+" : day29 is "+day29 );
}
String day30 = req.getParameter("day30");
if( day30 == null){
	System.out.println(this.toString+" : day30 is null" );
}else{
	System.out.println(this.toString+" : day30 is "+day30 );
}
String day31 = req.getParameter("day31");
if( day31 == null){
	System.out.println(this.toString+" : day31 is null" );
}else{
	System.out.println(this.toString+" : day31 is "+day31 );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
String all_insr_dduc_yn = req.getParameter("all_insr_dduc_yn");
if( all_insr_dduc_yn == null){
	System.out.println(this.toString+" : all_insr_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : all_insr_dduc_yn is "+all_insr_dduc_yn );
}
String hlth_insr_med_care_insr_fee = req.getParameter("hlth_insr_med_care_insr_fee");
if( hlth_insr_med_care_insr_fee == null){
	System.out.println(this.toString+" : hlth_insr_med_care_insr_fee is null" );
}else{
	System.out.println(this.toString+" : hlth_insr_med_care_insr_fee is "+hlth_insr_med_care_insr_fee );
}
String cntr_amt = req.getParameter("cntr_amt");
if( cntr_amt == null){
	System.out.println(this.toString+" : cntr_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_amt is "+cntr_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String chk = Util.checkString(req.getParameter("chk"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String s_duty_yymm = Util.checkString(req.getParameter("s_duty_yymm"));
String duty_yymm = Util.checkString(req.getParameter("duty_yymm"));
String prn = Util.checkString(req.getParameter("prn"));
String emp_insr_dduc_yn = Util.checkString(req.getParameter("emp_insr_dduc_yn"));
String studt_wk_yn = Util.checkString(req.getParameter("studt_wk_yn"));
String duty_dds = Util.checkString(req.getParameter("duty_dds"));
String avg_duty_tm = Util.checkString(req.getParameter("avg_duty_tm"));
String ptph_no = Util.checkString(req.getParameter("ptph_no"));
String octgr_cd = Util.checkString(req.getParameter("octgr_cd"));
String lve_job_resn_cd = Util.checkString(req.getParameter("lve_job_resn_cd"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String emp_insr_fee = Util.checkString(req.getParameter("emp_insr_fee"));
String hlth_insr_fee = Util.checkString(req.getParameter("hlth_insr_fee"));
String np_fee = Util.checkString(req.getParameter("np_fee"));
String dd_amt = Util.checkString(req.getParameter("dd_amt"));
String time_amt = Util.checkString(req.getParameter("time_amt"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String rmks = Util.checkString(req.getParameter("rmks"));
String rcpt_clsf = Util.checkString(req.getParameter("rcpt_clsf"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String day01 = Util.checkString(req.getParameter("day01"));
String day02 = Util.checkString(req.getParameter("day02"));
String day03 = Util.checkString(req.getParameter("day03"));
String day04 = Util.checkString(req.getParameter("day04"));
String day05 = Util.checkString(req.getParameter("day05"));
String day06 = Util.checkString(req.getParameter("day06"));
String day07 = Util.checkString(req.getParameter("day07"));
String day08 = Util.checkString(req.getParameter("day08"));
String day09 = Util.checkString(req.getParameter("day09"));
String day10 = Util.checkString(req.getParameter("day10"));
String day11 = Util.checkString(req.getParameter("day11"));
String day12 = Util.checkString(req.getParameter("day12"));
String day13 = Util.checkString(req.getParameter("day13"));
String day14 = Util.checkString(req.getParameter("day14"));
String day15 = Util.checkString(req.getParameter("day15"));
String day16 = Util.checkString(req.getParameter("day16"));
String day17 = Util.checkString(req.getParameter("day17"));
String day18 = Util.checkString(req.getParameter("day18"));
String day19 = Util.checkString(req.getParameter("day19"));
String day20 = Util.checkString(req.getParameter("day20"));
String day21 = Util.checkString(req.getParameter("day21"));
String day22 = Util.checkString(req.getParameter("day22"));
String day23 = Util.checkString(req.getParameter("day23"));
String day24 = Util.checkString(req.getParameter("day24"));
String day25 = Util.checkString(req.getParameter("day25"));
String day26 = Util.checkString(req.getParameter("day26"));
String day27 = Util.checkString(req.getParameter("day27"));
String day28 = Util.checkString(req.getParameter("day28"));
String day29 = Util.checkString(req.getParameter("day29"));
String day30 = Util.checkString(req.getParameter("day30"));
String day31 = Util.checkString(req.getParameter("day31"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
String all_insr_dduc_yn = Util.checkString(req.getParameter("all_insr_dduc_yn"));
String hlth_insr_med_care_insr_fee = Util.checkString(req.getParameter("hlth_insr_med_care_insr_fee"));
String cntr_amt = Util.checkString(req.getParameter("cntr_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String chk = Util.Uni2Ksc(Util.checkString(req.getParameter("chk")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String s_duty_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("s_duty_yymm")));
String duty_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_yymm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String emp_insr_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_dduc_yn")));
String studt_wk_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("studt_wk_yn")));
String duty_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dds")));
String avg_duty_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_duty_tm")));
String ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no")));
String octgr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("octgr_cd")));
String lve_job_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("lve_job_resn_cd")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String emp_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_insr_fee")));
String hlth_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_fee")));
String np_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("np_fee")));
String dd_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_amt")));
String time_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("time_amt")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String rcpt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_clsf")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String day01 = Util.Uni2Ksc(Util.checkString(req.getParameter("day01")));
String day02 = Util.Uni2Ksc(Util.checkString(req.getParameter("day02")));
String day03 = Util.Uni2Ksc(Util.checkString(req.getParameter("day03")));
String day04 = Util.Uni2Ksc(Util.checkString(req.getParameter("day04")));
String day05 = Util.Uni2Ksc(Util.checkString(req.getParameter("day05")));
String day06 = Util.Uni2Ksc(Util.checkString(req.getParameter("day06")));
String day07 = Util.Uni2Ksc(Util.checkString(req.getParameter("day07")));
String day08 = Util.Uni2Ksc(Util.checkString(req.getParameter("day08")));
String day09 = Util.Uni2Ksc(Util.checkString(req.getParameter("day09")));
String day10 = Util.Uni2Ksc(Util.checkString(req.getParameter("day10")));
String day11 = Util.Uni2Ksc(Util.checkString(req.getParameter("day11")));
String day12 = Util.Uni2Ksc(Util.checkString(req.getParameter("day12")));
String day13 = Util.Uni2Ksc(Util.checkString(req.getParameter("day13")));
String day14 = Util.Uni2Ksc(Util.checkString(req.getParameter("day14")));
String day15 = Util.Uni2Ksc(Util.checkString(req.getParameter("day15")));
String day16 = Util.Uni2Ksc(Util.checkString(req.getParameter("day16")));
String day17 = Util.Uni2Ksc(Util.checkString(req.getParameter("day17")));
String day18 = Util.Uni2Ksc(Util.checkString(req.getParameter("day18")));
String day19 = Util.Uni2Ksc(Util.checkString(req.getParameter("day19")));
String day20 = Util.Uni2Ksc(Util.checkString(req.getParameter("day20")));
String day21 = Util.Uni2Ksc(Util.checkString(req.getParameter("day21")));
String day22 = Util.Uni2Ksc(Util.checkString(req.getParameter("day22")));
String day23 = Util.Uni2Ksc(Util.checkString(req.getParameter("day23")));
String day24 = Util.Uni2Ksc(Util.checkString(req.getParameter("day24")));
String day25 = Util.Uni2Ksc(Util.checkString(req.getParameter("day25")));
String day26 = Util.Uni2Ksc(Util.checkString(req.getParameter("day26")));
String day27 = Util.Uni2Ksc(Util.checkString(req.getParameter("day27")));
String day28 = Util.Uni2Ksc(Util.checkString(req.getParameter("day28")));
String day29 = Util.Uni2Ksc(Util.checkString(req.getParameter("day29")));
String day30 = Util.Uni2Ksc(Util.checkString(req.getParameter("day30")));
String day31 = Util.Uni2Ksc(Util.checkString(req.getParameter("day31")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String all_insr_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("all_insr_dduc_yn")));
String hlth_insr_med_care_insr_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_insr_med_care_insr_fee")));
String cntr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setChk(chk);
dm.setCmpy_cd(cmpy_cd);
dm.setMang_no(mang_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setS_duty_yymm(s_duty_yymm);
dm.setDuty_yymm(duty_yymm);
dm.setPrn(prn);
dm.setEmp_insr_dduc_yn(emp_insr_dduc_yn);
dm.setStudt_wk_yn(studt_wk_yn);
dm.setDuty_dds(duty_dds);
dm.setAvg_duty_tm(avg_duty_tm);
dm.setPtph_no(ptph_no);
dm.setOctgr_cd(octgr_cd);
dm.setLve_job_resn_cd(lve_job_resn_cd);
dm.setClos_yn(clos_yn);
dm.setClos_dt(clos_dt);
dm.setPay_amt(pay_amt);
dm.setEmp_insr_fee(emp_insr_fee);
dm.setHlth_insr_fee(hlth_insr_fee);
dm.setNp_fee(np_fee);
dm.setDd_amt(dd_amt);
dm.setTime_amt(time_amt);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setEvnt_cd(evnt_cd);
dm.setBudg_cd(budg_cd);
dm.setRmks(rmks);
dm.setRcpt_clsf(rcpt_clsf);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setDay01(day01);
dm.setDay02(day02);
dm.setDay03(day03);
dm.setDay04(day04);
dm.setDay05(day05);
dm.setDay06(day06);
dm.setDay07(day07);
dm.setDay08(day08);
dm.setDay09(day09);
dm.setDay10(day10);
dm.setDay11(day11);
dm.setDay12(day12);
dm.setDay13(day13);
dm.setDay14(day14);
dm.setDay15(day15);
dm.setDay16(day16);
dm.setDay17(day17);
dm.setDay18(day18);
dm.setDay19(day19);
dm.setDay20(day20);
dm.setDay21(day21);
dm.setDay22(day22);
dm.setDay23(day23);
dm.setDay24(day24);
dm.setDay25(day25);
dm.setDay26(day26);
dm.setDay27(day27);
dm.setDay28(day28);
dm.setDay29(day29);
dm.setDay30(day30);
dm.setDay31(day31);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
dm.setAll_insr_dduc_yn(all_insr_dduc_yn);
dm.setHlth_insr_med_care_insr_fee(hlth_insr_med_care_insr_fee);
dm.setCntr_amt(cntr_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 27 17:12:24 KST 2017 */