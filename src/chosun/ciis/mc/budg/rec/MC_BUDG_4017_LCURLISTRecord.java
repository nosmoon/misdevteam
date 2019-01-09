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


public class MC_BUDG_4017_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String budg_cd;
	public String budg_nm;
	public String budg_yymm;
	public String use_dept_cd;
	public String use_dept_nm;
	public String medi_cd;
	public String medi_nm;
	public String rmks;
	public String yrsqty;
	public String yrdan;
	public String yramt;
	public String amt;
	public String qunt;
	public String uprc;
	public String hsty_no;
	public String sub_no;

	public MC_BUDG_4017_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_nm(String use_dept_nm){
		this.use_dept_nm = use_dept_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setYrsqty(String yrsqty){
		this.yrsqty = yrsqty;
	}

	public void setYrdan(String yrdan){
		this.yrdan = yrdan;
	}

	public void setYramt(String yramt){
		this.yramt = yramt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setHsty_no(String hsty_no){
		this.hsty_no = hsty_no;
	}

	public void setSub_no(String sub_no){
		this.sub_no = sub_no;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_nm(){
		return this.use_dept_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getYrsqty(){
		return this.yrsqty;
	}

	public String getYrdan(){
		return this.yrdan;
	}

	public String getYramt(){
		return this.yramt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getHsty_no(){
		return this.hsty_no;
	}

	public String getSub_no(){
		return this.sub_no;
	}
}

/* 작성시간 : Fri May 29 14:47:00 KST 2009 */