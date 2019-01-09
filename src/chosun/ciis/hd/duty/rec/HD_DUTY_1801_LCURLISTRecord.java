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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String duty_cnt;
	public String vaca_cnt;
	public String stay_tm;
	public String duty_tm;
	public String rest_tm;
	public String basi_tm;
	public String excs_tm;

	public HD_DUTY_1801_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDuty_cnt(String duty_cnt){
		this.duty_cnt = duty_cnt;
	}

	public void setVaca_cnt(String vaca_cnt){
		this.vaca_cnt = vaca_cnt;
	}

	public void setStay_tm(String stay_tm){
		this.stay_tm = stay_tm;
	}

	public void setDuty_tm(String duty_tm){
		this.duty_tm = duty_tm;
	}

	public void setRest_tm(String rest_tm){
		this.rest_tm = rest_tm;
	}

	public void setBasi_tm(String basi_tm){
		this.basi_tm = basi_tm;
	}

	public void setExcs_tm(String excs_tm){
		this.excs_tm = excs_tm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDuty_cnt(){
		return this.duty_cnt;
	}

	public String getVaca_cnt(){
		return this.vaca_cnt;
	}

	public String getStay_tm(){
		return this.stay_tm;
	}

	public String getDuty_tm(){
		return this.duty_tm;
	}

	public String getRest_tm(){
		return this.rest_tm;
	}

	public String getBasi_tm(){
		return this.basi_tm;
	}

	public String getExcs_tm(){
		return this.excs_tm;
	}
}

/* 작성시간 : Thu Jun 21 19:39:49 KST 2018 */