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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2310_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String bank_nm;
	public String bank_cd;
	public String acct_no;
	public String amt;
	public String deps_pers;
	public String bo_nm;
	public String bo_nm_1;
	public String bo_cd;
	public String dept_nm;
	public String area_nm;
	public String shft_noit;
	public String payo_amt;
	public String coms;

	public SP_SAL_2310_LCURLIST1Record(){}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setDeps_pers(String deps_pers){
		this.deps_pers = deps_pers;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_nm_1(String bo_nm_1){
		this.bo_nm_1 = bo_nm_1;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setShft_noit(String shft_noit){
		this.shft_noit = shft_noit;
	}

	public void setPayo_amt(String payo_amt){
		this.payo_amt = payo_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getDeps_pers(){
		return this.deps_pers;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_nm_1(){
		return this.bo_nm_1;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getShft_noit(){
		return this.shft_noit;
	}

	public String getPayo_amt(){
		return this.payo_amt;
	}

	public String getComs(){
		return this.coms;
	}
}

/* 작성시간 : Wed Jul 18 10:11:44 KST 2012 */