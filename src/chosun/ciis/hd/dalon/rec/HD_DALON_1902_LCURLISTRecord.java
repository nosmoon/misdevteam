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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1902_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String dty_cd;
	public String posi_cd;
	public String duty_dt;
	public String vgl_duty_dt;
	public String prvdd_prsnt_tm;
	public String prvdd_finish_tm;
	public String thdd_prsnt_tm;
	public String thdd_finish_tm;
	public String thdd_duty_tm;
	public String pay_dt;

	public HD_DALON_1902_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

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

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setVgl_duty_dt(String vgl_duty_dt){
		this.vgl_duty_dt = vgl_duty_dt;
	}

	public void setPrvdd_prsnt_tm(String prvdd_prsnt_tm){
		this.prvdd_prsnt_tm = prvdd_prsnt_tm;
	}

	public void setPrvdd_finish_tm(String prvdd_finish_tm){
		this.prvdd_finish_tm = prvdd_finish_tm;
	}

	public void setThdd_prsnt_tm(String thdd_prsnt_tm){
		this.thdd_prsnt_tm = thdd_prsnt_tm;
	}

	public void setThdd_finish_tm(String thdd_finish_tm){
		this.thdd_finish_tm = thdd_finish_tm;
	}

	public void setThdd_duty_tm(String thdd_duty_tm){
		this.thdd_duty_tm = thdd_duty_tm;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getVgl_duty_dt(){
		return this.vgl_duty_dt;
	}

	public String getPrvdd_prsnt_tm(){
		return this.prvdd_prsnt_tm;
	}

	public String getPrvdd_finish_tm(){
		return this.prvdd_finish_tm;
	}

	public String getThdd_prsnt_tm(){
		return this.thdd_prsnt_tm;
	}

	public String getThdd_finish_tm(){
		return this.thdd_finish_tm;
	}

	public String getThdd_duty_tm(){
		return this.thdd_duty_tm;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}
}

/* 작성시간 : Thu Apr 23 16:41:37 KST 2009 */