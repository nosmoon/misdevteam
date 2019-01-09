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


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_1310_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_cd_nm;
	public String pm_rst_amt;
	public String dm_tgt_amt;
	public String dm_rst_amt;
	public String dm_d_rate;
	public String ny_tgt_amt;
	public String ny_rst_amt;
	public String ny_d_rate;
	public String incr_amt;
	public String incr_rate;

	public IS_RPT_1310_LCURLIST1Record(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setPm_rst_amt(String pm_rst_amt){
		this.pm_rst_amt = pm_rst_amt;
	}

	public void setDm_tgt_amt(String dm_tgt_amt){
		this.dm_tgt_amt = dm_tgt_amt;
	}

	public void setDm_rst_amt(String dm_rst_amt){
		this.dm_rst_amt = dm_rst_amt;
	}

	public void setDm_d_rate(String dm_d_rate){
		this.dm_d_rate = dm_d_rate;
	}

	public void setNy_tgt_amt(String ny_tgt_amt){
		this.ny_tgt_amt = ny_tgt_amt;
	}

	public void setNy_rst_amt(String ny_rst_amt){
		this.ny_rst_amt = ny_rst_amt;
	}

	public void setNy_d_rate(String ny_d_rate){
		this.ny_d_rate = ny_d_rate;
	}

	public void setIncr_amt(String incr_amt){
		this.incr_amt = incr_amt;
	}

	public void setIncr_rate(String incr_rate){
		this.incr_rate = incr_rate;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getPm_rst_amt(){
		return this.pm_rst_amt;
	}

	public String getDm_tgt_amt(){
		return this.dm_tgt_amt;
	}

	public String getDm_rst_amt(){
		return this.dm_rst_amt;
	}

	public String getDm_d_rate(){
		return this.dm_d_rate;
	}

	public String getNy_tgt_amt(){
		return this.ny_tgt_amt;
	}

	public String getNy_rst_amt(){
		return this.ny_rst_amt;
	}

	public String getNy_d_rate(){
		return this.ny_d_rate;
	}

	public String getIncr_amt(){
		return this.incr_amt;
	}

	public String getIncr_rate(){
		return this.incr_rate;
	}
}

/* 작성시간 : Thu May 31 13:13:58 KST 2012 */