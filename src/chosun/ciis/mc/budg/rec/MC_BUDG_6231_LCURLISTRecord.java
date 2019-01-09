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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6231_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_occr_dt;
	public String sect_cd;
	public String pubc_side;
	public String sect_nm_cd;
	public String sect_nm_cdnm;
	public String dlco_no;
	public String dlco_nm;
	public String pubc_slip_no;
	public String cm;
	public String dn;
	public String arow;
	public String squar;
	public String uprc;
	public String pubc_uprc;
	public String loss_squar;
	public String loss_adv_amt;
	public String diff_amt;
	public String advt_fee;
	public String edt_clsf_nm;
	public String edt_clsf;
	public String slcrg_pers_nm;
	public String slcrg_pers;
	public String mchrg_pers_nm;
	public String mchrg_pers;

	public MC_BUDG_6231_LCURLISTRecord(){}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setSect_nm_cdnm(String sect_nm_cdnm){
		this.sect_nm_cdnm = sect_nm_cdnm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setArow(String arow){
		this.arow = arow;
	}

	public void setSquar(String squar){
		this.squar = squar;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setPubc_uprc(String pubc_uprc){
		this.pubc_uprc = pubc_uprc;
	}

	public void setLoss_squar(String loss_squar){
		this.loss_squar = loss_squar;
	}

	public void setLoss_adv_amt(String loss_adv_amt){
		this.loss_adv_amt = loss_adv_amt;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setEdt_clsf_nm(String edt_clsf_nm){
		this.edt_clsf_nm = edt_clsf_nm;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSect_nm_cdnm(){
		return this.sect_nm_cdnm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getArow(){
		return this.arow;
	}

	public String getSquar(){
		return this.squar;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getPubc_uprc(){
		return this.pubc_uprc;
	}

	public String getLoss_squar(){
		return this.loss_squar;
	}

	public String getLoss_adv_amt(){
		return this.loss_adv_amt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getEdt_clsf_nm(){
		return this.edt_clsf_nm;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}
}

/* 작성시간 : Wed May 20 14:07:59 KST 2009 */