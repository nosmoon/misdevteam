/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_3320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String dty_cd;
	public String dty_nm;
	public String tot_acc_cnt;
	public String alvc_use_rate;
	public String sunday_rate;
	public String week_rate;

	public HD_VACA_3320_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setTot_acc_cnt(String tot_acc_cnt){
		this.tot_acc_cnt = tot_acc_cnt;
	}

	public void setAlvc_use_rate(String alvc_use_rate){
		this.alvc_use_rate = alvc_use_rate;
	}

	public void setSunday_rate(String sunday_rate){
		this.sunday_rate = sunday_rate;
	}

	public void setWeek_rate(String week_rate){
		this.week_rate = week_rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getTot_acc_cnt(){
		return this.tot_acc_cnt;
	}

	public String getAlvc_use_rate(){
		return this.alvc_use_rate;
	}

	public String getSunday_rate(){
		return this.sunday_rate;
	}

	public String getWeek_rate(){
		return this.week_rate;
	}
}

/* 작성시간 : Thu Aug 20 15:21:30 KST 2015 */