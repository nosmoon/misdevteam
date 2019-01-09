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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_8011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String dcmt_no;
	public String dcmt_clsf;
	public String dcmt_nm;
	public String requ_dt;
	public String requ_pers;
	public String requ_pers_nm;
	public String resp_dt;
	public String resp_pers;
	public String resp_pers_nm;
	public String remk;
	public String remk2;
	public String dept_cd;
	public String fac_clsf;
	public String dept_nm;
	public String fac_clsf_nm;
	public String dcmt_tp;
	public String tel_no;

	public PR_PAPMAKE_8011_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDcmt_no(String dcmt_no){
		this.dcmt_no = dcmt_no;
	}

	public void setDcmt_clsf(String dcmt_clsf){
		this.dcmt_clsf = dcmt_clsf;
	}

	public void setDcmt_nm(String dcmt_nm){
		this.dcmt_nm = dcmt_nm;
	}

	public void setRequ_dt(String requ_dt){
		this.requ_dt = requ_dt;
	}

	public void setRequ_pers(String requ_pers){
		this.requ_pers = requ_pers;
	}

	public void setRequ_pers_nm(String requ_pers_nm){
		this.requ_pers_nm = requ_pers_nm;
	}

	public void setResp_dt(String resp_dt){
		this.resp_dt = resp_dt;
	}

	public void setResp_pers(String resp_pers){
		this.resp_pers = resp_pers;
	}

	public void setResp_pers_nm(String resp_pers_nm){
		this.resp_pers_nm = resp_pers_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}
	
	public void setFac_clsf_nm(String fac_clsf_nm) {
		this.fac_clsf_nm = fac_clsf_nm;
	}
	
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	
	public void setFac_clsf(String fac_clsf) {
		this.fac_clsf = fac_clsf;
	}
	
	public void setRemk2(String remk2) {
		this.remk2 = remk2;
	}
	
	public void setDcmt_tp(String dcmt_tp) {
		this.dcmt_tp = dcmt_tp;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDcmt_no(){
		return this.dcmt_no;
	}

	public String getDcmt_clsf(){
		return this.dcmt_clsf;
	}

	public String getDcmt_nm(){
		return this.dcmt_nm;
	}

	public String getRequ_dt(){
		return this.requ_dt;
	}

	public String getRequ_pers(){
		return this.requ_pers;
	}

	public String getRequ_pers_nm(){
		return this.requ_pers_nm;
	}

	public String getResp_dt(){
		return this.resp_dt;
	}

	public String getResp_pers(){
		return this.resp_pers;
	}

	public String getResp_pers_nm(){
		return this.resp_pers_nm;
	}

	public String getRemk(){
		return this.remk;
	}
	
	public String getDept_cd() {
		return dept_cd;
	}
	
	public String getFac_clsf() {
		return fac_clsf;
	}
	
	public String getDept_nm() {
		return dept_nm;
	}
	
	public String getFac_clsf_nm() {
		return fac_clsf_nm;
	}
	
	public String getRemk2() {
		return remk2;
	}

	public String getDcmt_tp() {
		return dcmt_tp;
	}
	
	public String getTel_no() {
		return tel_no;
	}

	

}

/* 작성시간 : Thu Jul 21 17:25:16 KST 2016 */