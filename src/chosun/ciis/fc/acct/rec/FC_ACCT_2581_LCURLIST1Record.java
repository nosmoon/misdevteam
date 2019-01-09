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


public class FC_ACCT_2581_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String acct_cd;
	public String mang_clsf_cd;
	public String mang_clsf_cdnm;
	public String prvdd_bal;
	public String dr_amt;
	public String crdt_amt;
	public String curdd_bal;
	public String withdraw;

	public FC_ACCT_2581_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_clsf_cdnm(String mang_clsf_cdnm){
		this.mang_clsf_cdnm = mang_clsf_cdnm;
	}

	public void setPrvdd_bal(String prvdd_bal){
		this.prvdd_bal = prvdd_bal;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setCurdd_bal(String curdd_bal){
		this.curdd_bal = curdd_bal;
	}

	public void setWithdraw(String withdraw){
		this.withdraw = withdraw;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_clsf_cdnm(){
		return this.mang_clsf_cdnm;
	}

	public String getPrvdd_bal(){
		return this.prvdd_bal;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getCurdd_bal(){
		return this.curdd_bal;
	}

	public String getWithdraw(){
		return this.withdraw;
	}
}

/* 작성시간 : Tue Aug 11 16:06:45 KST 2009 */