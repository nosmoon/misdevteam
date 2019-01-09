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


public class MC_BUDG_6001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String checked;
	public String budg_cd;
	public String budg_cdnm;
	public String dept_cd;
	public String dept_nm;
	public String medi_cd;
	public String use_dept_cd;
	public String budg_yymm;
	public String req_amt;
	public String temp1;
	public String asin_amt;
	public String asin_amt2;
	public String req_qunt;
	public String temp2;
	public String asin_qunt;
	public String asin_qunt2;
	public String req_uprc;
	public String temp3;
	public String asin_uprc;
	public String asin_uprc2;
	public String rmks;
	public String evnt_cd;
	public String work_no;
	public String seq;
	public String evnt_nm;

	public MC_BUDG_6001_LCURLISTRecord(){}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setTemp1(String temp1){
		this.temp1 = temp1;
	}

	public void setAsin_amt(String asin_amt){
		this.asin_amt = asin_amt;
	}

	public void setAsin_amt2(String asin_amt2){
		this.asin_amt2 = asin_amt2;
	}

	public void setReq_qunt(String req_qunt){
		this.req_qunt = req_qunt;
	}

	public void setTemp2(String temp2){
		this.temp2 = temp2;
	}

	public void setAsin_qunt(String asin_qunt){
		this.asin_qunt = asin_qunt;
	}

	public void setAsin_qunt2(String asin_qunt2){
		this.asin_qunt2 = asin_qunt2;
	}

	public void setReq_uprc(String req_uprc){
		this.req_uprc = req_uprc;
	}

	public void setTemp3(String temp3){
		this.temp3 = temp3;
	}

	public void setAsin_uprc(String asin_uprc){
		this.asin_uprc = asin_uprc;
	}

	public void setAsin_uprc2(String asin_uprc2){
		this.asin_uprc2 = asin_uprc2;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getTemp1(){
		return this.temp1;
	}

	public String getAsin_amt(){
		return this.asin_amt;
	}

	public String getAsin_amt2(){
		return this.asin_amt2;
	}

	public String getReq_qunt(){
		return this.req_qunt;
	}

	public String getTemp2(){
		return this.temp2;
	}

	public String getAsin_qunt(){
		return this.asin_qunt;
	}

	public String getAsin_qunt2(){
		return this.asin_qunt2;
	}

	public String getReq_uprc(){
		return this.req_uprc;
	}

	public String getTemp3(){
		return this.temp3;
	}

	public String getAsin_uprc(){
		return this.asin_uprc;
	}

	public String getAsin_uprc2(){
		return this.asin_uprc2;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}
}

/* 작성시간 : Mon May 25 19:17:19 KST 2009 */