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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1610_SCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String chrg_pers_nm;
	public String tgt_amt;
	public String rst_amt;
	public String dm_rate;
	public String tgt_amt_1;
	public String rst_amt_1;
	public String dm_rate_1;
	public String rst_amt_2;
	public String rst_amt_3;
	public String tgt_amt_s;
	public String rst_amt_s;
	public String dm_rate_s;

	public IS_BUS_1610_SCURLIST_1Record(){}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setTgt_amt(String tgt_amt){
		this.tgt_amt = tgt_amt;
	}

	public void setRst_amt(String rst_amt){
		this.rst_amt = rst_amt;
	}

	public void setDm_rate(String dm_rate){
		this.dm_rate = dm_rate;
	}

	public void setTgt_amt_1(String tgt_amt_1){
		this.tgt_amt_1 = tgt_amt_1;
	}

	public void setRst_amt_1(String rst_amt_1){
		this.rst_amt_1 = rst_amt_1;
	}

	public void setDm_rate_1(String dm_rate_1){
		this.dm_rate_1 = dm_rate_1;
	}

	public void setRst_amt_2(String rst_amt_2){
		this.rst_amt_2 = rst_amt_2;
	}

	public void setRst_amt_3(String rst_amt_3){
		this.rst_amt_3 = rst_amt_3;
	}

	public void setTgt_amt_s(String tgt_amt_s){
		this.tgt_amt_s = tgt_amt_s;
	}

	public void setRst_amt_s(String rst_amt_s){
		this.rst_amt_s = rst_amt_s;
	}

	public void setDm_rate_s(String dm_rate_s){
		this.dm_rate_s = dm_rate_s;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getTgt_amt(){
		return this.tgt_amt;
	}

	public String getRst_amt(){
		return this.rst_amt;
	}

	public String getDm_rate(){
		return this.dm_rate;
	}

	public String getTgt_amt_1(){
		return this.tgt_amt_1;
	}

	public String getRst_amt_1(){
		return this.rst_amt_1;
	}

	public String getDm_rate_1(){
		return this.dm_rate_1;
	}

	public String getRst_amt_2(){
		return this.rst_amt_2;
	}

	public String getRst_amt_3(){
		return this.rst_amt_3;
	}

	public String getTgt_amt_s(){
		return this.tgt_amt_s;
	}

	public String getRst_amt_s(){
		return this.rst_amt_s;
	}

	public String getDm_rate_s(){
		return this.dm_rate_s;
	}
}

/* 작성시간 : Tue Jun 19 18:11:56 KST 2012 */