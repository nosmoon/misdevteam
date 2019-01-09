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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seci_nm;
	public String face_val_amt;
	public String purc_amt;
	public String int_rate;
	public String issu_dt;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String defr_yys;
	public String repay_yys;
	public String div_repay_tms;
	public String rmks;
	public String pay_bank_cd;
	public String banknm;
	public String jpno;
	public String acntsist;
	public String yugast;
	public String preint;

	public FC_FUNC_2001_LCURLISTRecord(){}

	public void setSeci_nm(String seci_nm){
		this.seci_nm = seci_nm;
	}

	public void setFace_val_amt(String face_val_amt){
		this.face_val_amt = face_val_amt;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setDefr_yys(String defr_yys){
		this.defr_yys = defr_yys;
	}

	public void setRepay_yys(String repay_yys){
		this.repay_yys = repay_yys;
	}

	public void setDiv_repay_tms(String div_repay_tms){
		this.div_repay_tms = div_repay_tms;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setPay_bank_cd(String pay_bank_cd){
		this.pay_bank_cd = pay_bank_cd;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public void setAcntsist(String acntsist){
		this.acntsist = acntsist;
	}

	public void setYugast(String yugast){
		this.yugast = yugast;
	}

	public void setPreint(String preint){
		this.preint = preint;
	}

	public String getSeci_nm(){
		return this.seci_nm;
	}

	public String getFace_val_amt(){
		return this.face_val_amt;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getDefr_yys(){
		return this.defr_yys;
	}

	public String getRepay_yys(){
		return this.repay_yys;
	}

	public String getDiv_repay_tms(){
		return this.div_repay_tms;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getPay_bank_cd(){
		return this.pay_bank_cd;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getJpno(){
		return this.jpno;
	}

	public String getAcntsist(){
		return this.acntsist;
	}

	public String getYugast(){
		return this.yugast;
	}

	public String getPreint(){
		return this.preint;
	}
}

/* 작성시간 : Tue Mar 10 14:43:28 KST 2009 */