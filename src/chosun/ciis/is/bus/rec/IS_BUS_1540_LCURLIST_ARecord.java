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


public class IS_BUS_1540_LCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd_nm;
	public String dm_amt_1;
	public String dm_amt_2;
	public String dm_amt;
	public String jm_amt_1;
	public String jm_amt_2;
	public String jm_amt;
	public String m_amt_1_rate;
	public String m_amt_2_rate;
	public String m_amt_rate;

	public IS_BUS_1540_LCURLIST_ARecord(){}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDm_amt_1(String dm_amt_1){
		this.dm_amt_1 = dm_amt_1;
	}

	public void setDm_amt_2(String dm_amt_2){
		this.dm_amt_2 = dm_amt_2;
	}

	public void setDm_amt(String dm_amt){
		this.dm_amt = dm_amt;
	}

	public void setJm_amt_1(String jm_amt_1){
		this.jm_amt_1 = jm_amt_1;
	}

	public void setJm_amt_2(String jm_amt_2){
		this.jm_amt_2 = jm_amt_2;
	}

	public void setJm_amt(String jm_amt){
		this.jm_amt = jm_amt;
	}

	public void setM_amt_1_rate(String m_amt_1_rate){
		this.m_amt_1_rate = m_amt_1_rate;
	}

	public void setM_amt_2_rate(String m_amt_2_rate){
		this.m_amt_2_rate = m_amt_2_rate;
	}

	public void setM_amt_rate(String m_amt_rate){
		this.m_amt_rate = m_amt_rate;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getDm_amt_1(){
		return this.dm_amt_1;
	}

	public String getDm_amt_2(){
		return this.dm_amt_2;
	}

	public String getDm_amt(){
		return this.dm_amt;
	}

	public String getJm_amt_1(){
		return this.jm_amt_1;
	}

	public String getJm_amt_2(){
		return this.jm_amt_2;
	}

	public String getJm_amt(){
		return this.jm_amt;
	}

	public String getM_amt_1_rate(){
		return this.m_amt_1_rate;
	}

	public String getM_amt_2_rate(){
		return this.m_amt_2_rate;
	}

	public String getM_amt_rate(){
		return this.m_amt_rate;
	}
}

/* 작성시간 : Tue Jun 19 10:06:18 KST 2012 */