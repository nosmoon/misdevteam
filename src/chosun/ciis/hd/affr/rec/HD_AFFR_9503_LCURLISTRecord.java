/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9503_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String flnm;
	public String memb_clsf;
	public String spos_name;
	public String bank_cd;
	public String bank_nm;
	public String acct_no;
	public String deps_per;

	public HD_AFFR_9503_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMemb_clsf(String memb_clsf){
		this.memb_clsf = memb_clsf;
	}

	public void setSpos_name(String spos_name){
		this.spos_name = spos_name;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_per(String deps_per){
		this.deps_per = deps_per;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMemb_clsf(){
		return this.memb_clsf;
	}

	public String getSpos_name(){
		return this.spos_name;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_per(){
		return this.deps_per;
	}
}

/* 작성시간 : Mon Sep 04 16:48:48 KST 2017 */