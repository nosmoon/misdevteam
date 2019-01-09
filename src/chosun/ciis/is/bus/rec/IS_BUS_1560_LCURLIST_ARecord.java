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


public class IS_BUS_1560_LCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd_nm;
	public String dm_amt;
	public String dm_amt_3;
	public String dm_amt_2;
	public String jm_amt;
	public String jm_amt_3;
	public String jm_amt_2;
	public String dm_amt_rate;
	public String dm_amt_3_rate;
	public String dm_amt_2_rate;

	public IS_BUS_1560_LCURLIST_ARecord(){}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setDm_amt(String dm_amt){
		this.dm_amt = dm_amt;
	}

	public void setDm_amt_3(String dm_amt_3){
		this.dm_amt_3 = dm_amt_3;
	}

	public void setDm_amt_2(String dm_amt_2){
		this.dm_amt_2 = dm_amt_2;
	}

	public void setJm_amt(String jm_amt){
		this.jm_amt = jm_amt;
	}

	public void setJm_amt_3(String jm_amt_3){
		this.jm_amt_3 = jm_amt_3;
	}

	public void setJm_amt_2(String jm_amt_2){
		this.jm_amt_2 = jm_amt_2;
	}

	public void setDm_amt_rate(String dm_amt_rate){
		this.dm_amt_rate = dm_amt_rate;
	}

	public void setDm_amt_3_rate(String dm_amt_3_rate){
		this.dm_amt_3_rate = dm_amt_3_rate;
	}

	public void setDm_amt_2_rate(String dm_amt_2_rate){
		this.dm_amt_2_rate = dm_amt_2_rate;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getDm_amt(){
		return this.dm_amt;
	}

	public String getDm_amt_3(){
		return this.dm_amt_3;
	}

	public String getDm_amt_2(){
		return this.dm_amt_2;
	}

	public String getJm_amt(){
		return this.jm_amt;
	}

	public String getJm_amt_3(){
		return this.jm_amt_3;
	}

	public String getJm_amt_2(){
		return this.jm_amt_2;
	}

	public String getDm_amt_rate(){
		return this.dm_amt_rate;
	}

	public String getDm_amt_3_rate(){
		return this.dm_amt_3_rate;
	}

	public String getDm_amt_2_rate(){
		return this.dm_amt_2_rate;
	}
}

/* 작성시간 : Tue Jun 19 10:19:33 KST 2012 */