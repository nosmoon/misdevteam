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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_5010_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dncompnm;
	public String deptnm;
	public String adv_nm;
	public String medi_qty;
	public String mob_qty;
	public String regdt;
	public String regno;
	public String medi_err;
	public String mob_err;

	public SS_SLS_EXTN_5010_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAdv_nm(String adv_nm){
		this.adv_nm = adv_nm;
	}

	public void setMedi_qty(String medi_qty){
		this.medi_qty = medi_qty;
	}

	public void setMob_qty(String mob_qty){
		this.mob_qty = mob_qty;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setMedi_err(String medi_err){
		this.medi_err = medi_err;
	}

	public void setMob_err(String mob_err){
		this.mob_err = mob_err;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAdv_nm(){
		return this.adv_nm;
	}

	public String getMedi_qty(){
		return this.medi_qty;
	}

	public String getMob_qty(){
		return this.mob_qty;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getMedi_err(){
		return this.medi_err;
	}

	public String getMob_err(){
		return this.mob_err;
	}
}

/* 작성시간 : Mon Aug 08 11:55:44 KST 2016 */