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


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 
 */


public class SS_L_BOACCT_LISTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String seq;
	public String acctitem;
	public String acctitem_nm;
	public String depskind;
	public String bankcd;
	public String bankcd_nm;
	public String deps_persnm;
	public String acctno;
	public String remk;
	public String incmgpers;
	public String incmgdt;
	public String chgpers;
	public String chgdt;
	public String girono;
	public String cd_atmyn;
	public String bo_cntr_dt;
	public String acct_null;
	public String chrg_cnfm_pers;
	public String chrg_cnfm_dt;

	public SS_L_BOACCT_LISTCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public void setAcctitem_nm(String acctitem_nm){
		this.acctitem_nm = acctitem_nm;
	}

	public void setDepskind(String depskind){
		this.depskind = depskind;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBankcd_nm(String bankcd_nm){
		this.bankcd_nm = bankcd_nm;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setCd_atmyn(String cd_atmyn){
		this.cd_atmyn = cd_atmyn;
	}

	public void setBo_cntr_dt(String bo_cntr_dt){
		this.bo_cntr_dt = bo_cntr_dt;
	}

	public void setAcct_null(String acct_null){
		this.acct_null = acct_null;
	}

	public void setChrg_cnfm_pers(String chrg_cnfm_pers){
		this.chrg_cnfm_pers = chrg_cnfm_pers;
	}

	public void setChrg_cnfm_dt(String chrg_cnfm_dt){
		this.chrg_cnfm_dt = chrg_cnfm_dt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public String getAcctitem_nm(){
		return this.acctitem_nm;
	}

	public String getDepskind(){
		return this.depskind;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBankcd_nm(){
		return this.bankcd_nm;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getCd_atmyn(){
		return this.cd_atmyn;
	}

	public String getBo_cntr_dt(){
		return this.bo_cntr_dt;
	}

	public String getAcct_null(){
		return this.acct_null;
	}

	public String getChrg_cnfm_pers(){
		return this.chrg_cnfm_pers;
	}

	public String getChrg_cnfm_dt(){
		return this.chrg_cnfm_dt;
	}
}

/* 작성시간 : Tue Sep 19 14:54:23 KST 2017 */