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


package chosun.ciis.hd.corr.rec;

import java.sql.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;

/**
 * 
 */


public class HD_CORR_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String natn_cd;
	public String natn_nm;
	public String duty_area;
	public String duty_area_nm;
	public String pay_yymm;
	public String aplc_frex_stot;
	public String aplc_exrate;
	public String aplc_won_stot;
	public String adjm_frex_stot;
	public String adjm_exrate;
	public String adjm_won_stot;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String appmt_dt;
	public String real_reinst_return_dt;

	public HD_CORR_1400_LCURLISTRecord(){}

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

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public void setDuty_area_nm(String duty_area_nm){
		this.duty_area_nm = duty_area_nm;
	}

	public void setPay_yymm(String pay_yymm){
		this.pay_yymm = pay_yymm;
	}

	public void setAplc_frex_stot(String aplc_frex_stot){
		this.aplc_frex_stot = aplc_frex_stot;
	}

	public void setAplc_exrate(String aplc_exrate){
		this.aplc_exrate = aplc_exrate;
	}

	public void setAplc_won_stot(String aplc_won_stot){
		this.aplc_won_stot = aplc_won_stot;
	}

	public void setAdjm_frex_stot(String adjm_frex_stot){
		this.adjm_frex_stot = adjm_frex_stot;
	}

	public void setAdjm_exrate(String adjm_exrate){
		this.adjm_exrate = adjm_exrate;
	}

	public void setAdjm_won_stot(String adjm_won_stot){
		this.adjm_won_stot = adjm_won_stot;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setReal_reinst_return_dt(String real_reinst_return_dt){
		this.real_reinst_return_dt = real_reinst_return_dt;
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

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getDuty_area_nm(){
		return this.duty_area_nm;
	}

	public String getPay_yymm(){
		return this.pay_yymm;
	}

	public String getAplc_frex_stot(){
		return this.aplc_frex_stot;
	}

	public String getAplc_exrate(){
		return this.aplc_exrate;
	}

	public String getAplc_won_stot(){
		return this.aplc_won_stot;
	}

	public String getAdjm_frex_stot(){
		return this.adjm_frex_stot;
	}

	public String getAdjm_exrate(){
		return this.adjm_exrate;
	}

	public String getAdjm_won_stot(){
		return this.adjm_won_stot;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getReal_reinst_return_dt(){
		return this.real_reinst_return_dt;
	}
}

/* 작성시간 : Thu Apr 09 15:33:11 KST 2009 */