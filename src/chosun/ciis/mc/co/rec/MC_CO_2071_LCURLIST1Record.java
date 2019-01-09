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


package chosun.ciis.mc.co.rec;

import java.sql.*;
import chosun.ciis.mc.co.dm.*;
import chosun.ciis.mc.co.ds.*;

/**
 * 
 */


public class MC_CO_2071_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String work_no;
	public String seq;
	public String budg_yymm;
	public String budg_cd;
	public String budg_cdnm;
	public String medi_cd;
	public String medi_nm;
	public String use_dept_cd;
	public String use_dept_cdnm;
	public String rmks;
	public String evnt_cd;
	public String req_amt_tot;
	public String req_uprc;
	public String req_qunt_tot;

	public MC_CO_2071_LCURLIST1Record(){}

	public void setWork_no(String work_no){
		this.work_no = work_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setUse_dept_cdnm(String use_dept_cdnm){
		this.use_dept_cdnm = use_dept_cdnm;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setReq_amt_tot(String req_amt_tot){
		this.req_amt_tot = req_amt_tot;
	}

	public void setReq_uprc(String req_uprc){
		this.req_uprc = req_uprc;
	}

	public void setReq_qunt_tot(String req_qunt_tot){
		this.req_qunt_tot = req_qunt_tot;
	}

	public String getWork_no(){
		return this.work_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getUse_dept_cdnm(){
		return this.use_dept_cdnm;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getReq_amt_tot(){
		return this.req_amt_tot;
	}

	public String getReq_uprc(){
		return this.req_uprc;
	}

	public String getReq_qunt_tot(){
		return this.req_qunt_tot;
	}
}

/* 작성시간 : Sat May 30 16:11:15 KST 2009 */