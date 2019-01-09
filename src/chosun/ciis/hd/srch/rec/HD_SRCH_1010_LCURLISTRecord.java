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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String cd_nm;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String gender;
	public String cur_job;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String emp_clsf_nm;
	public String emp_dtls_clsf_nm;
	public String in_cmpy_dt;
	public String nm_engl;
	public String nm_chin;
	public String base_saly;
	public String posk_saly;
	public String evngt_saly;
	public String supl_saly;
	public String trff_alon;
	public String treat_add_amt;
	public String tot_saly;
	public String prn;
	public String appmt_nm;
	public String appmt_dt;
	public String appmt_cont;
	public String insd_dept_cd;
	public String dty_order;
	public String posi_order;
	public String aprv_in_cmpy;
	public String age;

	public HD_SRCH_1010_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setCur_job(String cur_job){
		this.cur_job = cur_job;
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

	public void setEmp_clsf_nm(String emp_clsf_nm){
		this.emp_clsf_nm = emp_clsf_nm;
	}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setNm_engl(String nm_engl){
		this.nm_engl = nm_engl;
	}

	public void setNm_chin(String nm_chin){
		this.nm_chin = nm_chin;
	}

	public void setBase_saly(String base_saly){
		this.base_saly = base_saly;
	}

	public void setPosk_saly(String posk_saly){
		this.posk_saly = posk_saly;
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

	public void setTot_saly(String tot_saly){
		this.tot_saly = tot_saly;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAppmt_nm(String appmt_nm){
		this.appmt_nm = appmt_nm;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setInsd_dept_cd(String insd_dept_cd){
		this.insd_dept_cd = insd_dept_cd;
	}

	public void setDty_order(String dty_order){
		this.dty_order = dty_order;
	}

	public void setPosi_order(String posi_order){
		this.posi_order = posi_order;
	}

	public void setAprv_in_cmpy(String aprv_in_cmpy){
		this.aprv_in_cmpy = aprv_in_cmpy;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getGender(){
		return this.gender;
	}

	public String getCur_job(){
		return this.cur_job;
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

	public String getEmp_clsf_nm(){
		return this.emp_clsf_nm;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getNm_engl(){
		return this.nm_engl;
	}

	public String getNm_chin(){
		return this.nm_chin;
	}

	public String getBase_saly(){
		return this.base_saly;
	}

	public String getPosk_saly(){
		return this.posk_saly;
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

	public String getTot_saly(){
		return this.tot_saly;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getAppmt_nm(){
		return this.appmt_nm;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getInsd_dept_cd(){
		return this.insd_dept_cd;
	}

	public String getDty_order(){
		return this.dty_order;
	}

	public String getPosi_order(){
		return this.posi_order;
	}

	public String getAprv_in_cmpy(){
		return this.aprv_in_cmpy;
	}

	public String getAge(){
		return this.age;
	}
}

/* 작성시간 : Wed Nov 06 18:02:51 KST 2013 */