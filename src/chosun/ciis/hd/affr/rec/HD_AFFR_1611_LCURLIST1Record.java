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


public class HD_AFFR_1611_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String scl_exps_pay_yy;
	public String scl_exps_pay_qq;
	public String scl_exps_clsf;
	public String scl_exps_pay_plac_clsf;
	public String obj_pers_flnm;
	public String obj_pers_prn;
	public String scl_nm;
	public String grade;
	public String scl_part;
	public String aplc_amt;
	public String vdty_amt;
	public String pay_amt;
	public String remk;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String aplc_dt;
	public String aplc_seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public HD_AFFR_1611_LCURLIST1Record(){}

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

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setScl_exps_pay_yy(String scl_exps_pay_yy){
		this.scl_exps_pay_yy = scl_exps_pay_yy;
	}

	public void setScl_exps_pay_qq(String scl_exps_pay_qq){
		this.scl_exps_pay_qq = scl_exps_pay_qq;
	}

	public void setScl_exps_clsf(String scl_exps_clsf){
		this.scl_exps_clsf = scl_exps_clsf;
	}

	public void setScl_exps_pay_plac_clsf(String scl_exps_pay_plac_clsf){
		this.scl_exps_pay_plac_clsf = scl_exps_pay_plac_clsf;
	}

	public void setObj_pers_flnm(String obj_pers_flnm){
		this.obj_pers_flnm = obj_pers_flnm;
	}

	public void setObj_pers_prn(String obj_pers_prn){
		this.obj_pers_prn = obj_pers_prn;
	}

	public void setScl_nm(String scl_nm){
		this.scl_nm = scl_nm;
	}

	public void setGrade(String grade){
		this.grade = grade;
	}

	public void setScl_part(String scl_part){
		this.scl_part = scl_part;
	}

	public void setAplc_amt(String aplc_amt){
		this.aplc_amt = aplc_amt;
	}

	public void setVdty_amt(String vdty_amt){
		this.vdty_amt = vdty_amt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getScl_exps_pay_yy(){
		return this.scl_exps_pay_yy;
	}

	public String getScl_exps_pay_qq(){
		return this.scl_exps_pay_qq;
	}

	public String getScl_exps_clsf(){
		return this.scl_exps_clsf;
	}

	public String getScl_exps_pay_plac_clsf(){
		return this.scl_exps_pay_plac_clsf;
	}

	public String getObj_pers_flnm(){
		return this.obj_pers_flnm;
	}

	public String getObj_pers_prn(){
		return this.obj_pers_prn;
	}

	public String getScl_nm(){
		return this.scl_nm;
	}

	public String getGrade(){
		return this.grade;
	}

	public String getScl_part(){
		return this.scl_part;
	}

	public String getAplc_amt(){
		return this.aplc_amt;
	}

	public String getVdty_amt(){
		return this.vdty_amt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getRemk(){
		return this.remk;
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
}

/* 작성시간 : Wed Mar 18 08:50:51 KST 2009 */