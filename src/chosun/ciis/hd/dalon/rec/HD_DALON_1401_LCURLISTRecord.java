
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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String session_emp_no;
	public String session_flnm;
	public String cost_obj_clsf;
	public String occr_dt;
	public String seq;
	public String session_dept_cd;
	public String session_dept_cd_nm;
	public String session_dty_cd;
	public String session_dty_nm;	
	public String session_posi_cd;
	public String session_posi_nm;	
	public String frdt;
	public String todt;
	public String out_in_plac;
	public String cost;
	public String excl_pers_clsf;
	public String proc_stat;

	public HD_DALON_1401_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSession_emp_no(String session_emp_no){
		this.session_emp_no = session_emp_no;
	}

	public void setSession_flnm(String session_flnm){
		this.session_flnm = session_flnm;
	}

	public void setCost_obj_clsf(String cost_obj_clsf){
		this.cost_obj_clsf = cost_obj_clsf;
	}

	public void setSession_dept_cd(String session_dept_cd){
		this.session_dept_cd = session_dept_cd;
	}

	public void setSession_dept_cd_nm(String session_dept_cd_nm){
		this.session_dept_cd_nm = session_dept_cd_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setOut_in_plac(String out_in_plac){
		this.out_in_plac = out_in_plac;
	}

	public void setCost(String cost){
		this.cost = cost;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}
	
	public void setSeq(String seq){
		this.seq = seq;
	}
	
	public void setExcl_pers_clsf(String excl_pers_clsf){
		this.excl_pers_clsf = excl_pers_clsf;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSession_emp_no(){
		return this.session_emp_no;
	}

	public String getSession_flnm(){
		return this.session_flnm;
	}

	public String getCost_obj_clsf(){
		return this.cost_obj_clsf;
	}

	public String getSession_dept_cd(){
		return this.session_dept_cd;
	}

	public String getSession_dept_cd_nm(){
		return this.session_dept_cd_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getOut_in_plac(){
		return this.out_in_plac;
	}

	public String getCost(){
		return this.cost;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getSession_dty_cd() {
		return this.session_dty_cd;
	}

	public String getOccr_dt() {
		return this.occr_dt;
	}
	
	public String getSeq() {
		return this.seq;
	}
	
	public String getExcl_pers_clsf() {
		return this.excl_pers_clsf;
	}
	
	public void setSession_dty_cd(String session_dty_cd) {
		this.session_dty_cd = session_dty_cd;
	}

	public String getSession_dty_nm() {
		return this.session_dty_nm;
	}

	public void setSession_dty_nm(String session_dty_nm) {
		this.session_dty_nm = session_dty_nm;
	}

	public String getSession_posi_cd() {
		return this.session_posi_cd;
	}

	public void setSession_posi_cd(String session_posi_cd) {
		this.session_posi_cd = session_posi_cd;
	}

	public String getSession_posi_nm() {
		return this.session_posi_nm;
	}

	public void setSession_posi_nm(String session_posi_nm) {
		this.session_posi_nm = session_posi_nm;
	}
			
}

/* 작성시간 : Tue Apr 14 16:13:42 KST 2009 */