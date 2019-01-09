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


public class SS_SLS_EXTN_5040_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dncompnm;
	public String adv_deptnm;
	public String adv_nm;
	public String medi_qty;
	public String mob_qty;
	public String extn_deptnm;
	public String extn_nm;
	public String extn_medi_qty;
	public String extn_mob_qty;
	public String regcode;

	public SS_SLS_EXTN_5040_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setAdv_deptnm(String adv_deptnm){
		this.adv_deptnm = adv_deptnm;
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

	public void setExtn_deptnm(String extn_deptnm){
		this.extn_deptnm = extn_deptnm;
	}

	public void setExtn_nm(String extn_nm){
		this.extn_nm = extn_nm;
	}

	public void setExtn_medi_qty(String extn_medi_qty){
		this.extn_medi_qty = extn_medi_qty;
	}

	public void setExtn_mob_qty(String extn_mob_qty){
		this.extn_mob_qty = extn_mob_qty;
	}

	public void setRegcode(String regcode){
		this.regcode = regcode;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getAdv_deptnm(){
		return this.adv_deptnm;
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

	public String getExtn_deptnm(){
		return this.extn_deptnm;
	}

	public String getExtn_nm(){
		return this.extn_nm;
	}

	public String getExtn_medi_qty(){
		return this.extn_medi_qty;
	}

	public String getExtn_mob_qty(){
		return this.extn_mob_qty;
	}

	public String getRegcode(){
		return this.regcode;
	}
}

/* 작성시간 : Mon Aug 08 14:10:00 KST 2016 */