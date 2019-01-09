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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_3300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String in_cmpy_dt;
	public String rgla_saly;
	public String yymm_alon;
	public String etc_saly;
	public String tot_pay_saly_estm_amt;

	public HD_LVCMPY_3300_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setRgla_saly(String rgla_saly){
		this.rgla_saly = rgla_saly;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	public void setEtc_saly(String etc_saly){
		this.etc_saly = etc_saly;
	}

	public void setTot_pay_saly_estm_amt(String tot_pay_saly_estm_amt){
		this.tot_pay_saly_estm_amt = tot_pay_saly_estm_amt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getRgla_saly(){
		return this.rgla_saly;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	public String getEtc_saly(){
		return this.etc_saly;
	}

	public String getTot_pay_saly_estm_amt(){
		return this.tot_pay_saly_estm_amt;
	}
}

/* 작성시간 : Fri May 29 11:20:22 KST 2009 */