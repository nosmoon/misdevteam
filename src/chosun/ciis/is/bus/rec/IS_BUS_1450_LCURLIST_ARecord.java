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


public class IS_BUS_1450_LCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd_nm;
	public String dw_amt_1;
	public String dw_amt_2;
	public String dw_amt;
	public String jw_amt_1;
	public String jw_amt_2;
	public String jw_amt;
	public String w_amt_1_rate;
	public String w_amt_2_rate;
	public String w_amt_rate;
	public String dm_amt_1;
	public String dm_amt_2;
	public String dm_amt;
	public String jm_amt_1;
	public String jm_amt_2;
	public String jm_amt;
	public String m_amt_1_rate;
	public String m_amt_2_rate;
	public String m_amt_rate;

	public IS_BUS_1450_LCURLIST_ARecord(){}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDw_amt_1(String dw_amt_1){
		this.dw_amt_1 = dw_amt_1;
	}

	public void setDw_amt_2(String dw_amt_2){
		this.dw_amt_2 = dw_amt_2;
	}

	public void setDw_amt(String dw_amt){
		this.dw_amt = dw_amt;
	}

	public void setJw_amt_1(String jw_amt_1){
		this.jw_amt_1 = jw_amt_1;
	}

	public void setJw_amt_2(String jw_amt_2){
		this.jw_amt_2 = jw_amt_2;
	}

	public void setJw_amt(String jw_amt){
		this.jw_amt = jw_amt;
	}

	public void setW_amt_1_rate(String w_amt_1_rate){
		this.w_amt_1_rate = w_amt_1_rate;
	}

	public void setW_amt_2_rate(String w_amt_2_rate){
		this.w_amt_2_rate = w_amt_2_rate;
	}

	public void setW_amt_rate(String w_amt_rate){
		this.w_amt_rate = w_amt_rate;
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

	public String getDw_amt_1(){
		return this.dw_amt_1;
	}

	public String getDw_amt_2(){
		return this.dw_amt_2;
	}

	public String getDw_amt(){
		return this.dw_amt;
	}

	public String getJw_amt_1(){
		return this.jw_amt_1;
	}

	public String getJw_amt_2(){
		return this.jw_amt_2;
	}

	public String getJw_amt(){
		return this.jw_amt;
	}

	public String getW_amt_1_rate(){
		return this.w_amt_1_rate;
	}

	public String getW_amt_2_rate(){
		return this.w_amt_2_rate;
	}

	public String getW_amt_rate(){
		return this.w_amt_rate;
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

/* 작성시간 : Mon Jun 18 13:19:20 KST 2012 */