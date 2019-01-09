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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_3001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_rvrs_yy;
	public String emp_no;
	public String faml_seq;
	public String flnm;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String faml_prn;
	public String faml_flnm;
	public String spos_dduc_yn;
	public String child_dduc_yn;
	public String oldg_dduc_yn;
	public String rspc_dduc_yn;
	public String obcl_pers_dduc_yn;
	public String fml_hshd_dduc_yn;
	public String care_fee_dduc_yn;
	public String ocpn_nm;
	public String offi_nm;
	public String posi;
	public String schir_nm;
	public String nmat_yn;
	public String adopt_dt;

	public HD_YADJM_3001_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_rvrs_yy(String adjm_rvrs_yy){
		this.adjm_rvrs_yy = adjm_rvrs_yy;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_rshp_nm(String faml_rshp_nm){
		this.faml_rshp_nm = faml_rshp_nm;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setSpos_dduc_yn(String spos_dduc_yn){
		this.spos_dduc_yn = spos_dduc_yn;
	}

	public void setChild_dduc_yn(String child_dduc_yn){
		this.child_dduc_yn = child_dduc_yn;
	}

	public void setOldg_dduc_yn(String oldg_dduc_yn){
		this.oldg_dduc_yn = oldg_dduc_yn;
	}

	public void setRspc_dduc_yn(String rspc_dduc_yn){
		this.rspc_dduc_yn = rspc_dduc_yn;
	}

	public void setObcl_pers_dduc_yn(String obcl_pers_dduc_yn){
		this.obcl_pers_dduc_yn = obcl_pers_dduc_yn;
	}

	public void setFml_hshd_dduc_yn(String fml_hshd_dduc_yn){
		this.fml_hshd_dduc_yn = fml_hshd_dduc_yn;
	}

	public void setCare_fee_dduc_yn(String care_fee_dduc_yn){
		this.care_fee_dduc_yn = care_fee_dduc_yn;
	}

	public void setOcpn_nm(String ocpn_nm){
		this.ocpn_nm = ocpn_nm;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setPosi(String posi){
		this.posi = posi;
	}

	public void setSchir_nm(String schir_nm){
		this.schir_nm = schir_nm;
	}

	public void setNmat_yn(String nmat_yn){
		this.nmat_yn = nmat_yn;
	}

	public void setAdopt_dt(String adopt_dt){
		this.adopt_dt = adopt_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_rvrs_yy(){
		return this.adjm_rvrs_yy;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_rshp_nm(){
		return this.faml_rshp_nm;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getSpos_dduc_yn(){
		return this.spos_dduc_yn;
	}

	public String getChild_dduc_yn(){
		return this.child_dduc_yn;
	}

	public String getOldg_dduc_yn(){
		return this.oldg_dduc_yn;
	}

	public String getRspc_dduc_yn(){
		return this.rspc_dduc_yn;
	}

	public String getObcl_pers_dduc_yn(){
		return this.obcl_pers_dduc_yn;
	}

	public String getFml_hshd_dduc_yn(){
		return this.fml_hshd_dduc_yn;
	}

	public String getCare_fee_dduc_yn(){
		return this.care_fee_dduc_yn;
	}

	public String getOcpn_nm(){
		return this.ocpn_nm;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getPosi(){
		return this.posi;
	}

	public String getSchir_nm(){
		return this.schir_nm;
	}

	public String getNmat_yn(){
		return this.nmat_yn;
	}

	public String getAdopt_dt(){
		return this.adopt_dt;
	}
}

/* 작성시간 : Fri Nov 27 16:54:48 KST 2009 */