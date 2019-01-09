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


public class SE_RCP_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_cd;
	public String area_nm;
	public String bo_nm;
	public String acpt_bo_nm;
	public String chrg_flnm;
	public String swit_dt;
	public String swit_seq;
	public String acct_bal;
	public String acpt_trsf_amt;
	public String cnfm_yn;

	public SE_RCP_1110_LCURLISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setAcpt_bo_nm(String acpt_bo_nm){
		this.acpt_bo_nm = acpt_bo_nm;
	}

	public void setChrg_flnm(String chrg_flnm){
		this.chrg_flnm = chrg_flnm;
	}

	public void setSwit_dt(String swit_dt){
		this.swit_dt = swit_dt;
	}

	public void setSwit_seq(String swit_seq){
		this.swit_seq = swit_seq;
	}

	public void setAcct_bal(String acct_bal){
		this.acct_bal = acct_bal;
	}

	public void setAcpt_trsf_amt(String acpt_trsf_amt){
		this.acpt_trsf_amt = acpt_trsf_amt;
	}

	public void setCnfm_yn(String cnfm_yn){
		this.cnfm_yn = cnfm_yn;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAcpt_bo_nm(){
		return this.acpt_bo_nm;
	}

	public String getChrg_flnm(){
		return this.chrg_flnm;
	}

	public String getSwit_dt(){
		return this.swit_dt;
	}

	public String getSwit_seq(){
		return this.swit_seq;
	}

	public String getAcct_bal(){
		return this.acct_bal;
	}

	public String getAcpt_trsf_amt(){
		return this.acpt_trsf_amt;
	}

	public String getCnfm_yn(){
		return this.cnfm_yn;
	}
}

/* 작성시간 : Fri Jun 19 20:09:01 KST 2009 */