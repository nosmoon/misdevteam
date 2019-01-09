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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String aplc_dt;
	public String emp_no;
	public String flnm;
	public String preng_condo_nm_1;
	public String preng_condo_nm_2;
	public String real_preng_condo_nm;
	public String preng_no;
	public String use_frdt;
	public String use_todt;
	public String use_dds;
	public String guest_room_cnt;
	public String ptph_no;
	public String tel_no;
	public String email_addr;
	public String remk;
	public String use_pay_amt;
	public String slf_burd_amt;
	public String cmpy_sply_amt;
	public String slf_drbk_amt;
	public String guest_room_fee_tot_amt;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String cmpy_cd;
	public String seq;
	public String preng_condo_cd_1;
	public String preng_condo_cd_2;
	public String occr_dt;
	public String noti_yn;
	public String drbk_obj_yn;
	public String real_preng_condo_area_cd;
	public String real_preng_condo_cd;
	public String cmpy_sply_use_yn;
	public String preng_canc_yn;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String ss_emp_no;
	public String incmg_pers_ipadd;
	public String preng_condo_area_cd_1;
	public String preng_condo_area_cd_2;
	public String emp_clsf;
	public String remk_adm;
	public String rcpt_clsf;

	public HD_AFFR_1103_ADM(){}
	public HD_AFFR_1103_ADM(String mode, String aplc_dt, String emp_no, String flnm, String preng_condo_nm_1, String preng_condo_nm_2, String real_preng_condo_nm, String preng_no, String use_frdt, String use_todt, String use_dds, String guest_room_cnt, String ptph_no, String tel_no, String email_addr, String remk, String use_pay_amt, String slf_burd_amt, String cmpy_sply_amt, String slf_drbk_amt, String guest_room_fee_tot_amt, String dept_cd, String dty_cd, String posi_cd, String cmpy_cd, String seq, String preng_condo_cd_1, String preng_condo_cd_2, String occr_dt, String noti_yn, String drbk_obj_yn, String real_preng_condo_area_cd, String real_preng_condo_cd, String cmpy_sply_use_yn, String preng_canc_yn, String slip_proc_mang_dt, String slip_proc_mang_seq, String ss_emp_no, String incmg_pers_ipadd, String preng_condo_area_cd_1, String preng_condo_area_cd_2, String emp_clsf, String remk_adm, String rcpt_clsf){
		this.mode = mode;
		this.aplc_dt = aplc_dt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.preng_condo_nm_1 = preng_condo_nm_1;
		this.preng_condo_nm_2 = preng_condo_nm_2;
		this.real_preng_condo_nm = real_preng_condo_nm;
		this.preng_no = preng_no;
		this.use_frdt = use_frdt;
		this.use_todt = use_todt;
		this.use_dds = use_dds;
		this.guest_room_cnt = guest_room_cnt;
		this.ptph_no = ptph_no;
		this.tel_no = tel_no;
		this.email_addr = email_addr;
		this.remk = remk;
		this.use_pay_amt = use_pay_amt;
		this.slf_burd_amt = slf_burd_amt;
		this.cmpy_sply_amt = cmpy_sply_amt;
		this.slf_drbk_amt = slf_drbk_amt;
		this.guest_room_fee_tot_amt = guest_room_fee_tot_amt;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.preng_condo_cd_1 = preng_condo_cd_1;
		this.preng_condo_cd_2 = preng_condo_cd_2;
		this.occr_dt = occr_dt;
		this.noti_yn = noti_yn;
		this.drbk_obj_yn = drbk_obj_yn;
		this.real_preng_condo_area_cd = real_preng_condo_area_cd;
		this.real_preng_condo_cd = real_preng_condo_cd;
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
		this.preng_canc_yn = preng_canc_yn;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.ss_emp_no = ss_emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
		this.emp_clsf = emp_clsf;
		this.remk_adm = remk_adm;
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPreng_condo_nm_1(String preng_condo_nm_1){
		this.preng_condo_nm_1 = preng_condo_nm_1;
	}

	public void setPreng_condo_nm_2(String preng_condo_nm_2){
		this.preng_condo_nm_2 = preng_condo_nm_2;
	}

	public void setReal_preng_condo_nm(String real_preng_condo_nm){
		this.real_preng_condo_nm = real_preng_condo_nm;
	}

	public void setPreng_no(String preng_no){
		this.preng_no = preng_no;
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

	public void setGuest_room_cnt(String guest_room_cnt){
		this.guest_room_cnt = guest_room_cnt;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setEmail_addr(String email_addr){
		this.email_addr = email_addr;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPreng_condo_cd_1(String preng_condo_cd_1){
		this.preng_condo_cd_1 = preng_condo_cd_1;
	}

	public void setPreng_condo_cd_2(String preng_condo_cd_2){
		this.preng_condo_cd_2 = preng_condo_cd_2;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setNoti_yn(String noti_yn){
		this.noti_yn = noti_yn;
	}

	public void setDrbk_obj_yn(String drbk_obj_yn){
		this.drbk_obj_yn = drbk_obj_yn;
	}

	public void setReal_preng_condo_area_cd(String real_preng_condo_area_cd){
		this.real_preng_condo_area_cd = real_preng_condo_area_cd;
	}

	public void setReal_preng_condo_cd(String real_preng_condo_cd){
		this.real_preng_condo_cd = real_preng_condo_cd;
	}

	public void setCmpy_sply_use_yn(String cmpy_sply_use_yn){
		this.cmpy_sply_use_yn = cmpy_sply_use_yn;
	}

	public void setPreng_canc_yn(String preng_canc_yn){
		this.preng_canc_yn = preng_canc_yn;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setPreng_condo_area_cd_1(String preng_condo_area_cd_1){
		this.preng_condo_area_cd_1 = preng_condo_area_cd_1;
	}

	public void setPreng_condo_area_cd_2(String preng_condo_area_cd_2){
		this.preng_condo_area_cd_2 = preng_condo_area_cd_2;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setRemk_adm(String remk_adm){
		this.remk_adm = remk_adm;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public String getMode(){
		return this.mode;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPreng_condo_nm_1(){
		return this.preng_condo_nm_1;
	}

	public String getPreng_condo_nm_2(){
		return this.preng_condo_nm_2;
	}

	public String getReal_preng_condo_nm(){
		return this.real_preng_condo_nm;
	}

	public String getPreng_no(){
		return this.preng_no;
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

	public String getGuest_room_cnt(){
		return this.guest_room_cnt;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getEmail_addr(){
		return this.email_addr;
	}

	public String getRemk(){
		return this.remk;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPreng_condo_cd_1(){
		return this.preng_condo_cd_1;
	}

	public String getPreng_condo_cd_2(){
		return this.preng_condo_cd_2;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getNoti_yn(){
		return this.noti_yn;
	}

	public String getDrbk_obj_yn(){
		return this.drbk_obj_yn;
	}

	public String getReal_preng_condo_area_cd(){
		return this.real_preng_condo_area_cd;
	}

	public String getReal_preng_condo_cd(){
		return this.real_preng_condo_cd;
	}

	public String getCmpy_sply_use_yn(){
		return this.cmpy_sply_use_yn;
	}

	public String getPreng_canc_yn(){
		return this.preng_canc_yn;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getPreng_condo_area_cd_1(){
		return this.preng_condo_area_cd_1;
	}

	public String getPreng_condo_area_cd_2(){
		return this.preng_condo_area_cd_2;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getRemk_adm(){
		return this.remk_adm;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1103_ADM dm = (HD_AFFR_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.aplc_dt);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.preng_condo_nm_1);
		cstmt.setString(8, dm.preng_condo_nm_2);
		cstmt.setString(9, dm.real_preng_condo_nm);
		cstmt.setString(10, dm.preng_no);
		cstmt.setString(11, dm.use_frdt);
		cstmt.setString(12, dm.use_todt);
		cstmt.setString(13, dm.use_dds);
		cstmt.setString(14, dm.guest_room_cnt);
		cstmt.setString(15, dm.ptph_no);
		cstmt.setString(16, dm.tel_no);
		cstmt.setString(17, dm.email_addr);
		cstmt.setString(18, dm.remk);
		cstmt.setString(19, dm.use_pay_amt);
		cstmt.setString(20, dm.slf_burd_amt);
		cstmt.setString(21, dm.cmpy_sply_amt);
		cstmt.setString(22, dm.slf_drbk_amt);
		cstmt.setString(23, dm.guest_room_fee_tot_amt);
		cstmt.setString(24, dm.dept_cd);
		cstmt.setString(25, dm.dty_cd);
		cstmt.setString(26, dm.posi_cd);
		cstmt.setString(27, dm.cmpy_cd);
		cstmt.setString(28, dm.seq);
		cstmt.setString(29, dm.preng_condo_cd_1);
		cstmt.setString(30, dm.preng_condo_cd_2);
		cstmt.setString(31, dm.occr_dt);
		cstmt.setString(32, dm.noti_yn);
		cstmt.setString(33, dm.drbk_obj_yn);
		cstmt.setString(34, dm.real_preng_condo_area_cd);
		cstmt.setString(35, dm.real_preng_condo_cd);
		cstmt.setString(36, dm.cmpy_sply_use_yn);
		cstmt.setString(37, dm.preng_canc_yn);
		cstmt.setString(38, dm.slip_proc_mang_dt);
		cstmt.setString(39, dm.slip_proc_mang_seq);
		cstmt.setString(40, dm.ss_emp_no);
		cstmt.setString(41, dm.incmg_pers_ipadd);
		cstmt.setString(42, dm.preng_condo_area_cd_1);
		cstmt.setString(43, dm.preng_condo_area_cd_2);
		cstmt.setString(44, dm.emp_clsf);
		cstmt.setString(45, dm.remk_adm);
		cstmt.setString(46, dm.rcpt_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1103_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("preng_condo_nm_1 = [" + getPreng_condo_nm_1() + "]");
		System.out.println("preng_condo_nm_2 = [" + getPreng_condo_nm_2() + "]");
		System.out.println("real_preng_condo_nm = [" + getReal_preng_condo_nm() + "]");
		System.out.println("preng_no = [" + getPreng_no() + "]");
		System.out.println("use_frdt = [" + getUse_frdt() + "]");
		System.out.println("use_todt = [" + getUse_todt() + "]");
		System.out.println("use_dds = [" + getUse_dds() + "]");
		System.out.println("guest_room_cnt = [" + getGuest_room_cnt() + "]");
		System.out.println("ptph_no = [" + getPtph_no() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("email_addr = [" + getEmail_addr() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("use_pay_amt = [" + getUse_pay_amt() + "]");
		System.out.println("slf_burd_amt = [" + getSlf_burd_amt() + "]");
		System.out.println("cmpy_sply_amt = [" + getCmpy_sply_amt() + "]");
		System.out.println("slf_drbk_amt = [" + getSlf_drbk_amt() + "]");
		System.out.println("guest_room_fee_tot_amt = [" + getGuest_room_fee_tot_amt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("preng_condo_cd_1 = [" + getPreng_condo_cd_1() + "]");
		System.out.println("preng_condo_cd_2 = [" + getPreng_condo_cd_2() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("noti_yn = [" + getNoti_yn() + "]");
		System.out.println("drbk_obj_yn = [" + getDrbk_obj_yn() + "]");
		System.out.println("real_preng_condo_area_cd = [" + getReal_preng_condo_area_cd() + "]");
		System.out.println("real_preng_condo_cd = [" + getReal_preng_condo_cd() + "]");
		System.out.println("cmpy_sply_use_yn = [" + getCmpy_sply_use_yn() + "]");
		System.out.println("preng_canc_yn = [" + getPreng_canc_yn() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("preng_condo_area_cd_1 = [" + getPreng_condo_area_cd_1() + "]");
		System.out.println("preng_condo_area_cd_2 = [" + getPreng_condo_area_cd_2() + "]");
		System.out.println("emp_clsf = [" + getEmp_clsf() + "]");
		System.out.println("remk_adm = [" + getRemk_adm() + "]");
		System.out.println("rcpt_clsf = [" + getRcpt_clsf() + "]");
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
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String preng_condo_nm_1 = req.getParameter("preng_condo_nm_1");
if( preng_condo_nm_1 == null){
	System.out.println(this.toString+" : preng_condo_nm_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_nm_1 is "+preng_condo_nm_1 );
}
String preng_condo_nm_2 = req.getParameter("preng_condo_nm_2");
if( preng_condo_nm_2 == null){
	System.out.println(this.toString+" : preng_condo_nm_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_nm_2 is "+preng_condo_nm_2 );
}
String real_preng_condo_nm = req.getParameter("real_preng_condo_nm");
if( real_preng_condo_nm == null){
	System.out.println(this.toString+" : real_preng_condo_nm is null" );
}else{
	System.out.println(this.toString+" : real_preng_condo_nm is "+real_preng_condo_nm );
}
String preng_no = req.getParameter("preng_no");
if( preng_no == null){
	System.out.println(this.toString+" : preng_no is null" );
}else{
	System.out.println(this.toString+" : preng_no is "+preng_no );
}
String use_frdt = req.getParameter("use_frdt");
if( use_frdt == null){
	System.out.println(this.toString+" : use_frdt is null" );
}else{
	System.out.println(this.toString+" : use_frdt is "+use_frdt );
}
String use_todt = req.getParameter("use_todt");
if( use_todt == null){
	System.out.println(this.toString+" : use_todt is null" );
}else{
	System.out.println(this.toString+" : use_todt is "+use_todt );
}
String use_dds = req.getParameter("use_dds");
if( use_dds == null){
	System.out.println(this.toString+" : use_dds is null" );
}else{
	System.out.println(this.toString+" : use_dds is "+use_dds );
}
String guest_room_cnt = req.getParameter("guest_room_cnt");
if( guest_room_cnt == null){
	System.out.println(this.toString+" : guest_room_cnt is null" );
}else{
	System.out.println(this.toString+" : guest_room_cnt is "+guest_room_cnt );
}
String ptph_no = req.getParameter("ptph_no");
if( ptph_no == null){
	System.out.println(this.toString+" : ptph_no is null" );
}else{
	System.out.println(this.toString+" : ptph_no is "+ptph_no );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String email_addr = req.getParameter("email_addr");
if( email_addr == null){
	System.out.println(this.toString+" : email_addr is null" );
}else{
	System.out.println(this.toString+" : email_addr is "+email_addr );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String use_pay_amt = req.getParameter("use_pay_amt");
if( use_pay_amt == null){
	System.out.println(this.toString+" : use_pay_amt is null" );
}else{
	System.out.println(this.toString+" : use_pay_amt is "+use_pay_amt );
}
String slf_burd_amt = req.getParameter("slf_burd_amt");
if( slf_burd_amt == null){
	System.out.println(this.toString+" : slf_burd_amt is null" );
}else{
	System.out.println(this.toString+" : slf_burd_amt is "+slf_burd_amt );
}
String cmpy_sply_amt = req.getParameter("cmpy_sply_amt");
if( cmpy_sply_amt == null){
	System.out.println(this.toString+" : cmpy_sply_amt is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_amt is "+cmpy_sply_amt );
}
String slf_drbk_amt = req.getParameter("slf_drbk_amt");
if( slf_drbk_amt == null){
	System.out.println(this.toString+" : slf_drbk_amt is null" );
}else{
	System.out.println(this.toString+" : slf_drbk_amt is "+slf_drbk_amt );
}
String guest_room_fee_tot_amt = req.getParameter("guest_room_fee_tot_amt");
if( guest_room_fee_tot_amt == null){
	System.out.println(this.toString+" : guest_room_fee_tot_amt is null" );
}else{
	System.out.println(this.toString+" : guest_room_fee_tot_amt is "+guest_room_fee_tot_amt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String preng_condo_cd_1 = req.getParameter("preng_condo_cd_1");
if( preng_condo_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_cd_1 is "+preng_condo_cd_1 );
}
String preng_condo_cd_2 = req.getParameter("preng_condo_cd_2");
if( preng_condo_cd_2 == null){
	System.out.println(this.toString+" : preng_condo_cd_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_cd_2 is "+preng_condo_cd_2 );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String noti_yn = req.getParameter("noti_yn");
if( noti_yn == null){
	System.out.println(this.toString+" : noti_yn is null" );
}else{
	System.out.println(this.toString+" : noti_yn is "+noti_yn );
}
String drbk_obj_yn = req.getParameter("drbk_obj_yn");
if( drbk_obj_yn == null){
	System.out.println(this.toString+" : drbk_obj_yn is null" );
}else{
	System.out.println(this.toString+" : drbk_obj_yn is "+drbk_obj_yn );
}
String real_preng_condo_area_cd = req.getParameter("real_preng_condo_area_cd");
if( real_preng_condo_area_cd == null){
	System.out.println(this.toString+" : real_preng_condo_area_cd is null" );
}else{
	System.out.println(this.toString+" : real_preng_condo_area_cd is "+real_preng_condo_area_cd );
}
String real_preng_condo_cd = req.getParameter("real_preng_condo_cd");
if( real_preng_condo_cd == null){
	System.out.println(this.toString+" : real_preng_condo_cd is null" );
}else{
	System.out.println(this.toString+" : real_preng_condo_cd is "+real_preng_condo_cd );
}
String cmpy_sply_use_yn = req.getParameter("cmpy_sply_use_yn");
if( cmpy_sply_use_yn == null){
	System.out.println(this.toString+" : cmpy_sply_use_yn is null" );
}else{
	System.out.println(this.toString+" : cmpy_sply_use_yn is "+cmpy_sply_use_yn );
}
String preng_canc_yn = req.getParameter("preng_canc_yn");
if( preng_canc_yn == null){
	System.out.println(this.toString+" : preng_canc_yn is null" );
}else{
	System.out.println(this.toString+" : preng_canc_yn is "+preng_canc_yn );
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
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String preng_condo_area_cd_1 = req.getParameter("preng_condo_area_cd_1");
if( preng_condo_area_cd_1 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_1 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_1 is "+preng_condo_area_cd_1 );
}
String preng_condo_area_cd_2 = req.getParameter("preng_condo_area_cd_2");
if( preng_condo_area_cd_2 == null){
	System.out.println(this.toString+" : preng_condo_area_cd_2 is null" );
}else{
	System.out.println(this.toString+" : preng_condo_area_cd_2 is "+preng_condo_area_cd_2 );
}
String emp_clsf = req.getParameter("emp_clsf");
if( emp_clsf == null){
	System.out.println(this.toString+" : emp_clsf is null" );
}else{
	System.out.println(this.toString+" : emp_clsf is "+emp_clsf );
}
String remk_adm = req.getParameter("remk_adm");
if( remk_adm == null){
	System.out.println(this.toString+" : remk_adm is null" );
}else{
	System.out.println(this.toString+" : remk_adm is "+remk_adm );
}
String rcpt_clsf = req.getParameter("rcpt_clsf");
if( rcpt_clsf == null){
	System.out.println(this.toString+" : rcpt_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpt_clsf is "+rcpt_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String preng_condo_nm_1 = Util.checkString(req.getParameter("preng_condo_nm_1"));
String preng_condo_nm_2 = Util.checkString(req.getParameter("preng_condo_nm_2"));
String real_preng_condo_nm = Util.checkString(req.getParameter("real_preng_condo_nm"));
String preng_no = Util.checkString(req.getParameter("preng_no"));
String use_frdt = Util.checkString(req.getParameter("use_frdt"));
String use_todt = Util.checkString(req.getParameter("use_todt"));
String use_dds = Util.checkString(req.getParameter("use_dds"));
String guest_room_cnt = Util.checkString(req.getParameter("guest_room_cnt"));
String ptph_no = Util.checkString(req.getParameter("ptph_no"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String email_addr = Util.checkString(req.getParameter("email_addr"));
String remk = Util.checkString(req.getParameter("remk"));
String use_pay_amt = Util.checkString(req.getParameter("use_pay_amt"));
String slf_burd_amt = Util.checkString(req.getParameter("slf_burd_amt"));
String cmpy_sply_amt = Util.checkString(req.getParameter("cmpy_sply_amt"));
String slf_drbk_amt = Util.checkString(req.getParameter("slf_drbk_amt"));
String guest_room_fee_tot_amt = Util.checkString(req.getParameter("guest_room_fee_tot_amt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String preng_condo_cd_1 = Util.checkString(req.getParameter("preng_condo_cd_1"));
String preng_condo_cd_2 = Util.checkString(req.getParameter("preng_condo_cd_2"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String noti_yn = Util.checkString(req.getParameter("noti_yn"));
String drbk_obj_yn = Util.checkString(req.getParameter("drbk_obj_yn"));
String real_preng_condo_area_cd = Util.checkString(req.getParameter("real_preng_condo_area_cd"));
String real_preng_condo_cd = Util.checkString(req.getParameter("real_preng_condo_cd"));
String cmpy_sply_use_yn = Util.checkString(req.getParameter("cmpy_sply_use_yn"));
String preng_canc_yn = Util.checkString(req.getParameter("preng_canc_yn"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String preng_condo_area_cd_1 = Util.checkString(req.getParameter("preng_condo_area_cd_1"));
String preng_condo_area_cd_2 = Util.checkString(req.getParameter("preng_condo_area_cd_2"));
String emp_clsf = Util.checkString(req.getParameter("emp_clsf"));
String remk_adm = Util.checkString(req.getParameter("remk_adm"));
String rcpt_clsf = Util.checkString(req.getParameter("rcpt_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String preng_condo_nm_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_nm_1")));
String preng_condo_nm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_nm_2")));
String real_preng_condo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("real_preng_condo_nm")));
String preng_no = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_no")));
String use_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_frdt")));
String use_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_todt")));
String use_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dds")));
String guest_room_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("guest_room_cnt")));
String ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String email_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("email_addr")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String use_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pay_amt")));
String slf_burd_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("slf_burd_amt")));
String cmpy_sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_amt")));
String slf_drbk_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("slf_drbk_amt")));
String guest_room_fee_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("guest_room_fee_tot_amt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String preng_condo_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_cd_1")));
String preng_condo_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_cd_2")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String noti_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("noti_yn")));
String drbk_obj_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("drbk_obj_yn")));
String real_preng_condo_area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("real_preng_condo_area_cd")));
String real_preng_condo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("real_preng_condo_cd")));
String cmpy_sply_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_sply_use_yn")));
String preng_canc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_canc_yn")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String preng_condo_area_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_1")));
String preng_condo_area_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_condo_area_cd_2")));
String emp_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_clsf")));
String remk_adm = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_adm")));
String rcpt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setAplc_dt(aplc_dt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setPreng_condo_nm_1(preng_condo_nm_1);
dm.setPreng_condo_nm_2(preng_condo_nm_2);
dm.setReal_preng_condo_nm(real_preng_condo_nm);
dm.setPreng_no(preng_no);
dm.setUse_frdt(use_frdt);
dm.setUse_todt(use_todt);
dm.setUse_dds(use_dds);
dm.setGuest_room_cnt(guest_room_cnt);
dm.setPtph_no(ptph_no);
dm.setTel_no(tel_no);
dm.setEmail_addr(email_addr);
dm.setRemk(remk);
dm.setUse_pay_amt(use_pay_amt);
dm.setSlf_burd_amt(slf_burd_amt);
dm.setCmpy_sply_amt(cmpy_sply_amt);
dm.setSlf_drbk_amt(slf_drbk_amt);
dm.setGuest_room_fee_tot_amt(guest_room_fee_tot_amt);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setPreng_condo_cd_1(preng_condo_cd_1);
dm.setPreng_condo_cd_2(preng_condo_cd_2);
dm.setOccr_dt(occr_dt);
dm.setNoti_yn(noti_yn);
dm.setDrbk_obj_yn(drbk_obj_yn);
dm.setReal_preng_condo_area_cd(real_preng_condo_area_cd);
dm.setReal_preng_condo_cd(real_preng_condo_cd);
dm.setCmpy_sply_use_yn(cmpy_sply_use_yn);
dm.setPreng_canc_yn(preng_canc_yn);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setSs_emp_no(ss_emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setPreng_condo_area_cd_1(preng_condo_area_cd_1);
dm.setPreng_condo_area_cd_2(preng_condo_area_cd_2);
dm.setEmp_clsf(emp_clsf);
dm.setRemk_adm(remk_adm);
dm.setRcpt_clsf(rcpt_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 17 17:48:13 KST 2012 */