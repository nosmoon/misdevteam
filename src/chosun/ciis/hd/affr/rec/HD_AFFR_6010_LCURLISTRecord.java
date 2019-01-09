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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_6010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String dept_cd;
	public String dept_nm;
	public String prn;
	public String prn_cnt;
	public String dty_name;
	public String posi_name;
	public String dty_cd;
	public String posi_cd;
	public String lvcmpy_dt;
	public String in_cmpy_dt;

	public HD_AFFR_6010_LCURLISTRecord(){}

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

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPrn_cnt(String prn_cnt){
		this.prn_cnt = prn_cnt;
	}

	public void setDty_name(String dty_name){
		this.dty_name = dty_name;
	}

	public void setPosi_name(String posi_name){
		this.posi_name = posi_name;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
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

	public String getPrn(){
		return this.prn;
	}

	public String getPrn_cnt(){
		return this.prn_cnt;
	}

	public String getDty_name(){
		return this.dty_name;
	}

	public String getPosi_name(){
		return this.posi_name;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}
}

/* 작성시간 : Wed Mar 18 20:08:21 KST 2009 */