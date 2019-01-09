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


public class FC_ACCT_2561_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String impt_expn_clsf_nm;
	public String budg_cd;
	public String budg_nm;
	public String fisc_dt;
	public String dr_amt;
	public String crdt_amt;
	public String rmks2;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String sort_no;

	public FC_ACCT_2561_LCURLIST1Record(){}

	public void setImpt_expn_clsf_nm(String impt_expn_clsf_nm){
		this.impt_expn_clsf_nm = impt_expn_clsf_nm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setSort_no(String sort_no){
		this.sort_no = sort_no;
	}

	public String getImpt_expn_clsf_nm(){
		return this.impt_expn_clsf_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getSort_no(){
		return this.sort_no;
	}
}

/* 작성시간 : Tue Oct 06 16:35:06 KST 2015 */