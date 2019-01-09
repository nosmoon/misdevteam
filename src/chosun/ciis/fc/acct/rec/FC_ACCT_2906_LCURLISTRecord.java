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


public class FC_ACCT_2906_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String budg_cd;
	public String budg_nm;
	public String rmks2;
	public String cnt;
	public String dr_amt;
	public String clam_dept_cd;
	public String mang_clsf_cd;
	public String boks_dlco_nm;

	public FC_ACCT_2906_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public String getChk(){
		return this.chk;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}
}

/* 작성시간 : Thu Aug 06 17:15:41 KST 2009 */