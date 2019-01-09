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


public class MC_BUDG_5161_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_yymm;
	public String dept_cd;
	public String buseonm;
	public String budg_cd;
	public String evnt_nm;
	public String ysnm;
	public String cjysbjamt;
	public String budg_ask_amt;
	public String budg_cndt_amt;
	public String chamt;
	public String evnt_cd;
	public String slip_no;
	public String amt;

	public MC_BUDG_5161_LCURLISTRecord(){}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setBuseonm(String buseonm){
		this.buseonm = buseonm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setYsnm(String ysnm){
		this.ysnm = ysnm;
	}

	public void setCjysbjamt(String cjysbjamt){
		this.cjysbjamt = cjysbjamt;
	}

	public void setBudg_ask_amt(String budg_ask_amt){
		this.budg_ask_amt = budg_ask_amt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setChamt(String chamt){
		this.chamt = chamt;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getBuseonm(){
		return this.buseonm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getYsnm(){
		return this.ysnm;
	}

	public String getCjysbjamt(){
		return this.cjysbjamt;
	}

	public String getBudg_ask_amt(){
		return this.budg_ask_amt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getChamt(){
		return this.chamt;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Sat Jul 11 13:42:07 KST 2009 */