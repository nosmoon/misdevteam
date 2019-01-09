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


public class FC_FUNC_8071_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String leas_nm;
	public String compgbcdnm;
	public String dlco_cd;
	public String compnm;
	public String frcr_amt;
	public String pay_plan_tms;
	public String pch_count;

	public FC_FUNC_8071_LCURLISTRecord(){}

	public void setLeas_nm(String leas_nm){
		this.leas_nm = leas_nm;
	}

	public void setCompgbcdnm(String compgbcdnm){
		this.compgbcdnm = compgbcdnm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setPay_plan_tms(String pay_plan_tms){
		this.pay_plan_tms = pay_plan_tms;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public String getLeas_nm(){
		return this.leas_nm;
	}

	public String getCompgbcdnm(){
		return this.compgbcdnm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getPay_plan_tms(){
		return this.pay_plan_tms;
	}

	public String getPch_count(){
		return this.pch_count;
	}
}

/* 작성시간 : Wed Apr 08 13:50:32 KST 2009 */