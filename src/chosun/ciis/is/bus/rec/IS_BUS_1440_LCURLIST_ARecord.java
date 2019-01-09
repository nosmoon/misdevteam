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


public class IS_BUS_1440_LCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd_nm;
	public String dw_amt_1;
	public String jw_amt_1;
	public String w_amt_1_rate;
	public String dm_amt_1;
	public String jm_amt_1;
	public String m_amt_1_rate;

	public IS_BUS_1440_LCURLIST_ARecord(){}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDw_amt_1(String dw_amt_1){
		this.dw_amt_1 = dw_amt_1;
	}

	public void setJw_amt_1(String jw_amt_1){
		this.jw_amt_1 = jw_amt_1;
	}

	public void setW_amt_1_rate(String w_amt_1_rate){
		this.w_amt_1_rate = w_amt_1_rate;
	}

	public void setDm_amt_1(String dm_amt_1){
		this.dm_amt_1 = dm_amt_1;
	}

	public void setJm_amt_1(String jm_amt_1){
		this.jm_amt_1 = jm_amt_1;
	}

	public void setM_amt_1_rate(String m_amt_1_rate){
		this.m_amt_1_rate = m_amt_1_rate;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getDw_amt_1(){
		return this.dw_amt_1;
	}

	public String getJw_amt_1(){
		return this.jw_amt_1;
	}

	public String getW_amt_1_rate(){
		return this.w_amt_1_rate;
	}

	public String getDm_amt_1(){
		return this.dm_amt_1;
	}

	public String getJm_amt_1(){
		return this.jm_amt_1;
	}

	public String getM_amt_1_rate(){
		return this.m_amt_1_rate;
	}
}

/* 작성시간 : Mon Jun 18 11:36:23 KST 2012 */