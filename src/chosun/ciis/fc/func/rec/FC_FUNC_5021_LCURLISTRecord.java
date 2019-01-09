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


public class FC_FUNC_5021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bhgbcdnm;
	public String bhnonm;
	public String comp_dt;
	public String mtry_dt;
	public String dlco_nm;
	public String use_dept_nm;
	public String bhcompcdnm;
	public String bhusebuseocdnm;
	public String won_amt;
	public String cost_gain_stot;
	public String bhbijanamt;

	public FC_FUNC_5021_LCURLISTRecord(){}

	public void setBhgbcdnm(String bhgbcdnm){
		this.bhgbcdnm = bhgbcdnm;
	}

	public void setBhnonm(String bhnonm){
		this.bhnonm = bhnonm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setBhcompcdnm(String bhcompcdnm){
		this.bhcompcdnm = bhcompcdnm;
	}

	public void setBhusebuseocdnm(String bhusebuseocdnm){
		this.bhusebuseocdnm = bhusebuseocdnm;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setBhbijanamt(String bhbijanamt){
		this.bhbijanamt = bhbijanamt;
	}

	public String getBhgbcdnm(){
		return this.bhgbcdnm;
	}

	public String getBhnonm(){
		return this.bhnonm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getBhcompcdnm(){
		return this.bhcompcdnm;
	}

	public String getBhusebuseocdnm(){
		return this.bhusebuseocdnm;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getBhbijanamt(){
		return this.bhbijanamt;
	}
}

/* 작성시간 : Wed Apr 01 11:18:53 KST 2009 */