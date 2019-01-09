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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_5361_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String acacctynm;
	public String budg_cd;
	public String ycyscdnm;
	public String medi_cd;
	public String dr_amt;
	public String use_dept_cd;
	public String usebuseonm;
	public String rmks1;
	public String rmks2;
	public String clam_dept_cd;
	public String cgbuseonm;
	public String qunt;

	public FC_ACCT_5361_LCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcacctynm(String acacctynm){
		this.acacctynm = acacctynm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setYcyscdnm(String ycyscdnm){
		this.ycyscdnm = ycyscdnm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUsebuseonm(String usebuseonm){
		this.usebuseonm = usebuseonm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setCgbuseonm(String cgbuseonm){
		this.cgbuseonm = cgbuseonm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcacctynm(){
		return this.acacctynm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getYcyscdnm(){
		return this.ycyscdnm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUsebuseonm(){
		return this.usebuseonm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getCgbuseonm(){
		return this.cgbuseonm;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Wed Mar 18 15:31:35 KST 2009 */