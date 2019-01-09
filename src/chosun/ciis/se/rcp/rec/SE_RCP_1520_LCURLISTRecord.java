/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_1520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String area_cd;
	public String area_nm;
	public String chrg_pers;
	public String amt1;
	public String atm1_r;
	public String amt2;
	public String atm2_r;
	public String amt3;
	public String atm3_r;
	public String tot_amt;
	public String remk;

	public SE_RCP_1520_LCURLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAtm1_r(String atm1_r){
		this.atm1_r = atm1_r;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setAtm2_r(String atm2_r){
		this.atm2_r = atm2_r;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setAtm3_r(String atm3_r){
		this.atm3_r = atm3_r;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAtm1_r(){
		return this.atm1_r;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getAtm2_r(){
		return this.atm2_r;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getAtm3_r(){
		return this.atm3_r;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon May 04 09:45:47 KST 2009 */