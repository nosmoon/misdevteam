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


public class HD_VACA_3510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String chg_dept_cd;
	public String chg_dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String chg_posi_cd;
	public String chg_posi_nm;
	public String dty_cd;
	public String dty_nm;
	public String chg_dty_cd;
	public String chg_dty_nm;
	public String appmt_dt;

	public HD_VACA_3510_LCURLISTRecord(){}

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

	public void setChg_dept_cd(String chg_dept_cd){
		this.chg_dept_cd = chg_dept_cd;
	}

	public void setChg_dept_nm(String chg_dept_nm){
		this.chg_dept_nm = chg_dept_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setChg_posi_cd(String chg_posi_cd){
		this.chg_posi_cd = chg_posi_cd;
	}

	public void setChg_posi_nm(String chg_posi_nm){
		this.chg_posi_nm = chg_posi_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setChg_dty_cd(String chg_dty_cd){
		this.chg_dty_cd = chg_dty_cd;
	}

	public void setChg_dty_nm(String chg_dty_nm){
		this.chg_dty_nm = chg_dty_nm;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
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

	public String getChg_dept_cd(){
		return this.chg_dept_cd;
	}

	public String getChg_dept_nm(){
		return this.chg_dept_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getChg_posi_cd(){
		return this.chg_posi_cd;
	}

	public String getChg_posi_nm(){
		return this.chg_posi_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getChg_dty_cd(){
		return this.chg_dty_cd;
	}

	public String getChg_dty_nm(){
		return this.chg_dty_nm;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}
}

/* 작성시간 : Wed Aug 05 16:19:37 KST 2015 */