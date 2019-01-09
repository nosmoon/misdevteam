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


public class IS_BUS_1510_LCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd_nm;
	public String dm_tgt_amt;
	public String dm_rst_amt;
	public String dm_rate;
	public String jm_rst_amt;
	public String dm_j_rate;
	public String dm_tgt_amt_s;
	public String dm_rst_amt_s;
	public String dm_rate_s;
	public String jm_rst_amt_s;
	public String dm_j_rate_s;

	public IS_BUS_1510_LCURLIST_ARecord(){}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDm_tgt_amt(String dm_tgt_amt){
		this.dm_tgt_amt = dm_tgt_amt;
	}

	public void setDm_rst_amt(String dm_rst_amt){
		this.dm_rst_amt = dm_rst_amt;
	}

	public void setDm_rate(String dm_rate){
		this.dm_rate = dm_rate;
	}

	public void setJm_rst_amt(String jm_rst_amt){
		this.jm_rst_amt = jm_rst_amt;
	}

	public void setDm_j_rate(String dm_j_rate){
		this.dm_j_rate = dm_j_rate;
	}

	public void setDm_tgt_amt_s(String dm_tgt_amt_s){
		this.dm_tgt_amt_s = dm_tgt_amt_s;
	}

	public void setDm_rst_amt_s(String dm_rst_amt_s){
		this.dm_rst_amt_s = dm_rst_amt_s;
	}

	public void setDm_rate_s(String dm_rate_s){
		this.dm_rate_s = dm_rate_s;
	}

	public void setJm_rst_amt_s(String jm_rst_amt_s){
		this.jm_rst_amt_s = jm_rst_amt_s;
	}

	public void setDm_j_rate_s(String dm_j_rate_s){
		this.dm_j_rate_s = dm_j_rate_s;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getDm_tgt_amt(){
		return this.dm_tgt_amt;
	}

	public String getDm_rst_amt(){
		return this.dm_rst_amt;
	}

	public String getDm_rate(){
		return this.dm_rate;
	}

	public String getJm_rst_amt(){
		return this.jm_rst_amt;
	}

	public String getDm_j_rate(){
		return this.dm_j_rate;
	}

	public String getDm_tgt_amt_s(){
		return this.dm_tgt_amt_s;
	}

	public String getDm_rst_amt_s(){
		return this.dm_rst_amt_s;
	}

	public String getDm_rate_s(){
		return this.dm_rate_s;
	}

	public String getJm_rst_amt_s(){
		return this.jm_rst_amt_s;
	}

	public String getDm_j_rate_s(){
		return this.dm_j_rate_s;
	}
}

/* 작성시간 : Tue Jun 19 09:16:46 KST 2012 */