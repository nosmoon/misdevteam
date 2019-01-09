/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_3010_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String gugun;
	public String noval_qty;
	public String val_qty;
	public String nocnfm_qty;
	public String err_qty;
	public String dup_err_qty;
	public String bs_qty;
	public String resv_qty;
	public String icdc_qty;
	public String issu_qty;
	public String postyn;
	public String issu_dt;
	public String medi_cd;

	public SS_SLS_BRMGR_3010_LCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setGugun(String gugun){
		this.gugun = gugun;
	}

	public void setNoval_qty(String noval_qty){
		this.noval_qty = noval_qty;
	}

	public void setVal_qty(String val_qty){
		this.val_qty = val_qty;
	}

	public void setNocnfm_qty(String nocnfm_qty){
		this.nocnfm_qty = nocnfm_qty;
	}

	public void setErr_qty(String err_qty){
		this.err_qty = err_qty;
	}

	public void setDup_err_qty(String dup_err_qty){
		this.dup_err_qty = dup_err_qty;
	}

	public void setBs_qty(String bs_qty){
		this.bs_qty = bs_qty;
	}

	public void setResv_qty(String resv_qty){
		this.resv_qty = resv_qty;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setPostyn(String postyn){
		this.postyn = postyn;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getGugun(){
		return this.gugun;
	}

	public String getNoval_qty(){
		return this.noval_qty;
	}

	public String getVal_qty(){
		return this.val_qty;
	}

	public String getNocnfm_qty(){
		return this.nocnfm_qty;
	}

	public String getErr_qty(){
		return this.err_qty;
	}

	public String getDup_err_qty(){
		return this.dup_err_qty;
	}

	public String getBs_qty(){
		return this.bs_qty;
	}

	public String getResv_qty(){
		return this.resv_qty;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getPostyn(){
		return this.postyn;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}
}

/* 작성시간 : Thu Mar 09 17:06:23 KST 2017 */