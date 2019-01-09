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


public class MC_BUDG_2082_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_dept_cd;
	public String if_buseonm_dtsybscd;
	public String budg_yymm;
	public String req_qunt;
	public String req_uprc;
	public String req_amt;
	public String medi_cd;
	public String rmks;

	public MC_BUDG_2082_LCURLISTRecord(){}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setIf_buseonm_dtsybscd(String if_buseonm_dtsybscd){
		this.if_buseonm_dtsybscd = if_buseonm_dtsybscd;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getIf_buseonm_dtsybscd(){
		return this.if_buseonm_dtsybscd;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRmks(){
		return this.rmks;
	}
}

/* 작성시간 : Mon Jun 29 14:28:34 KST 2009 */