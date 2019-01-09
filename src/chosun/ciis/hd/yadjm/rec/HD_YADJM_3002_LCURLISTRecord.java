/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_3002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String faml_prn;
	public String faml_flnm;
	public String spos_dduc_obj_yn;
	public String child_dduc_obj_yn;
	public String oldg_dduc_obj_yn;
	public String rspc_dduc_obj_yn;
	public String obcl_pers_dduc_obj_yn;
	public String fml_hshd_dduc_yn;
	public String care_fee_dduc_yn;
	public String ocpn_nm;
	public String offi_nm;
	public String posi;
	public String schir_cd;
	public String schir_nm;
	public String nmat_yn;
	public String adopt_dt;
	public String bwj_possible;
	public String bnjsdj_possible;
	public String soin_possible;
	public String noin_possible;
	public String grwd_70_possible;
	public String yyb_possible;

	public HD_YADJM_3002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
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

	public void setSpos_dduc_obj_yn(String spos_dduc_obj_yn){
		this.spos_dduc_obj_yn = spos_dduc_obj_yn;
	}

	public void setChild_dduc_obj_yn(String child_dduc_obj_yn){
		this.child_dduc_obj_yn = child_dduc_obj_yn;
	}

	public void setOldg_dduc_obj_yn(String oldg_dduc_obj_yn){
		this.oldg_dduc_obj_yn = oldg_dduc_obj_yn;
	}

	public void setRspc_dduc_obj_yn(String rspc_dduc_obj_yn){
		this.rspc_dduc_obj_yn = rspc_dduc_obj_yn;
	}

	public void setObcl_pers_dduc_obj_yn(String obcl_pers_dduc_obj_yn){
		this.obcl_pers_dduc_obj_yn = obcl_pers_dduc_obj_yn;
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

	public void setSchir_cd(String schir_cd){
		this.schir_cd = schir_cd;
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

	public void setBwj_possible(String bwj_possible){
		this.bwj_possible = bwj_possible;
	}

	public void setBnjsdj_possible(String bnjsdj_possible){
		this.bnjsdj_possible = bnjsdj_possible;
	}

	public void setSoin_possible(String soin_possible){
		this.soin_possible = soin_possible;
	}

	public void setNoin_possible(String noin_possible){
		this.noin_possible = noin_possible;
	}

	public void setGrwd_70_possible(String grwd_70_possible){
		this.grwd_70_possible = grwd_70_possible;
	}

	public void setYyb_possible(String yyb_possible){
		this.yyb_possible = yyb_possible;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
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

	public String getSpos_dduc_obj_yn(){
		return this.spos_dduc_obj_yn;
	}

	public String getChild_dduc_obj_yn(){
		return this.child_dduc_obj_yn;
	}

	public String getOldg_dduc_obj_yn(){
		return this.oldg_dduc_obj_yn;
	}

	public String getRspc_dduc_obj_yn(){
		return this.rspc_dduc_obj_yn;
	}

	public String getObcl_pers_dduc_obj_yn(){
		return this.obcl_pers_dduc_obj_yn;
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

	public String getSchir_cd(){
		return this.schir_cd;
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

	public String getBwj_possible(){
		return this.bwj_possible;
	}

	public String getBnjsdj_possible(){
		return this.bnjsdj_possible;
	}

	public String getSoin_possible(){
		return this.soin_possible;
	}

	public String getNoin_possible(){
		return this.noin_possible;
	}

	public String getGrwd_70_possible(){
		return this.grwd_70_possible;
	}

	public String getYyb_possible(){
		return this.yyb_possible;
	}
}

/* �ۼ��ð� : Mon Jan 11 11:08:40 KST 2010 */