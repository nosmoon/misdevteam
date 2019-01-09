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


public class MC_BUDG_2118_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String ini_plan_qunt;
	public String budg_yymm;
	public String req_qunt;
	public String req_uprc;
	public String req_amt;
	public String rmks;
	public String jobtag;
	public String seq;
	public String use_dept_cd;

	public MC_BUDG_2118_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setIni_plan_qunt(String ini_plan_qunt){
		this.ini_plan_qunt = ini_plan_qunt;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setReq_qunt(String req_qunt){
		this.req_qunt = req_qunt;
	}

	public void setReq_uprc(String req_uprc){
		this.req_uprc = req_uprc;
	}

	public void setReq_amt(String req_amt){
		this.req_amt = req_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setJobtag(String jobtag){
		this.jobtag = jobtag;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getIni_plan_qunt(){
		return this.ini_plan_qunt;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getReq_qunt(){
		return this.req_qunt;
	}

	public String getReq_uprc(){
		return this.req_uprc;
	}

	public String getReq_amt(){
		return this.req_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getJobtag(){
		return this.jobtag;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}
}

/* 작성시간 : Wed May 27 20:17:27 KST 2009 */