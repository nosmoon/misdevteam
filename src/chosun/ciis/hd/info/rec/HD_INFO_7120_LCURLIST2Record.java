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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_7120_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String supr_dept_cd;
	public String dept_cd;
	public String chrg_posk_cd;
	public String medi_cd;
	public String thrw_pgm;
	public String medi_cd2;
	public String thrw_pgm2;
	public String servcost;
	public String serv_pay_cond;
	public String fst_cntr_dt;
	public String last_cntr_dt;
	public String cntr_expr_dt;
	public String draft_no;
	public String mang_no;

	public HD_INFO_7120_LCURLIST2Record(){}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setThrw_pgm2(String thrw_pgm2){
		this.thrw_pgm2 = thrw_pgm2;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setServ_pay_cond(String serv_pay_cond){
		this.serv_pay_cond = serv_pay_cond;
	}

	public void setFst_cntr_dt(String fst_cntr_dt){
		this.fst_cntr_dt = fst_cntr_dt;
	}

	public void setLast_cntr_dt(String last_cntr_dt){
		this.last_cntr_dt = last_cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getThrw_pgm2(){
		return this.thrw_pgm2;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getServ_pay_cond(){
		return this.serv_pay_cond;
	}

	public String getFst_cntr_dt(){
		return this.fst_cntr_dt;
	}

	public String getLast_cntr_dt(){
		return this.last_cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getMang_no(){
		return this.mang_no;
	}
}

/* 작성시간 : Tue Mar 26 10:35:15 KST 2013 */