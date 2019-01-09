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


package chosun.ciis.hd.appmt.rec;

import java.sql.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.ds.*;

/**
 * 
 */


public class HD_APPMT_1011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String addm_dept_cd;
	public String addm_dept_nm;
	public String appmt_cd;
	public String appmt_nm;
	public String appmt_resn_cd;
	public String appmt_resn_nm;
	public String appmt_dt;
	public String mtry_dt;
	public String emp_clsf_cd;
	public String emp_clsf_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String emp_dtls_clsf;
	public String emp_dtls_clsf_nm;
	public String base_saly;
	public String posk_saly;
	public String dty_alon;
	public String posk_alon;
	public String care_alon;
	public String meal_fee;
	public String saly_stot;
	public String appmt_sort;
	public String appmt_cont;
	public String appmt_stat_clsf;
	public String evngt_saly;
	public String supl_saly;
	public String trff_alon;
	public String treat_add_amt;
	public String saly_cls;
	public String nxt_promo_dt;
	public String seq;
	public String occr_dt;

	public HD_APPMT_1011_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setAddm_dept_cd(String addm_dept_cd){
		this.addm_dept_cd = addm_dept_cd;
	}

	public void setAddm_dept_nm(String addm_dept_nm){
		this.addm_dept_nm = addm_dept_nm;
	}

	public void setAppmt_cd(String appmt_cd){
		this.appmt_cd = appmt_cd;
	}

	public void setAppmt_nm(String appmt_nm){
		this.appmt_nm = appmt_nm;
	}

	public void setAppmt_resn_cd(String appmt_resn_cd){
		this.appmt_resn_cd = appmt_resn_cd;
	}

	public void setAppmt_resn_nm(String appmt_resn_nm){
		this.appmt_resn_nm = appmt_resn_nm;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setEmp_clsf_cd(String emp_clsf_cd){
		this.emp_clsf_cd = emp_clsf_cd;
	}

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
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

	public void setEmp_dtls_clsf(String emp_dtls_clsf){
		this.emp_dtls_clsf = emp_dtls_clsf;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
	}

	public void setDty_alon(String dty_alon){
		this.dty_alon = dty_alon;
	}

	public void setPosk_alon(String posk_alon){
		this.posk_alon = posk_alon;
	}

	public void setCare_alon(String care_alon){
		this.care_alon = care_alon;
	}

	public void setMeal_fee(String meal_fee){
		this.meal_fee = meal_fee;
	}

	public void setSaly_stot(String saly_stot){
		this.saly_stot = saly_stot;
	}

	public void setAppmt_sort(String appmt_sort){
		this.appmt_sort = appmt_sort;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setAppmt_stat_clsf(String appmt_stat_clsf){
		this.appmt_stat_clsf = appmt_stat_clsf;
	}

	public void setEvngt_saly(String evngt_saly){
		this.evngt_saly = evngt_saly;
	}

	public void setSupl_saly(String supl_saly){
		this.supl_saly = supl_saly;
	}

	public void setTrff_alon(String trff_alon){
		this.trff_alon = trff_alon;
	}

	public void setTreat_add_amt(String treat_add_amt){
		this.treat_add_amt = treat_add_amt;
	}

	public void setSaly_cls(String saly_cls){
		this.saly_cls = saly_cls;
	}

	public void setNxt_promo_dt(String nxt_promo_dt){
		this.nxt_promo_dt = nxt_promo_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getAddm_dept_cd(){
		return this.addm_dept_cd;
	}

	public String getAddm_dept_nm(){
		return this.addm_dept_nm;
	}

	public String getAppmt_cd(){
		return this.appmt_cd;
	}

	public String getAppmt_nm(){
		return this.appmt_nm;
	}

	public String getAppmt_resn_cd(){
		return this.appmt_resn_cd;
	}

	public String getAppmt_resn_nm(){
		return this.appmt_resn_nm;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getEmp_clsf_cd(){
		return this.emp_clsf_cd;
	}

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
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

	public String getEmp_dtls_clsf(){
		return this.emp_dtls_clsf;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
	}

	public String getDty_alon(){
		return this.dty_alon;
	}

	public String getPosk_alon(){
		return this.posk_alon;
	}

	public String getCare_alon(){
		return this.care_alon;
	}

	public String getMeal_fee(){
		return this.meal_fee;
	}

	public String getSaly_stot(){
		return this.saly_stot;
	}

	public String getAppmt_sort(){
		return this.appmt_sort;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getAppmt_stat_clsf(){
		return this.appmt_stat_clsf;
	}

	public String getEvngt_saly(){
		return this.evngt_saly;
	}

	public String getSupl_saly(){
		return this.supl_saly;
	}

	public String getTrff_alon(){
		return this.trff_alon;
	}

	public String getTreat_add_amt(){
		return this.treat_add_amt;
	}

	public String getSaly_cls(){
		return this.saly_cls;
	}

	public String getNxt_promo_dt(){
		return this.nxt_promo_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}
}

/* 작성시간 : Thu Jul 05 17:22:47 KST 2012 */