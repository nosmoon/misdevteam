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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1620_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String seq;
	public String obj_dept_cd;
	public String obj_dept_nm;
	public String obj_emp_no;
	public String obj_nm_korn;
	public String prv_aprv_emp_no;
	public String prv_aprv_nm_korn;
	public String aft_aprv_emp_no;
	public String aft_aprv_nm_korn;
	public String fr_dt;
	public String to_dt;
	public String use_yn;

	public HD_VACA_1620_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setObj_dept_cd(String obj_dept_cd){
		this.obj_dept_cd = obj_dept_cd;
	}

	public void setObj_dept_nm(String obj_dept_nm){
		this.obj_dept_nm = obj_dept_nm;
	}

	public void setObj_emp_no(String obj_emp_no){
		this.obj_emp_no = obj_emp_no;
	}

	public void setObj_nm_korn(String obj_nm_korn){
		this.obj_nm_korn = obj_nm_korn;
	}

	public void setPrv_aprv_emp_no(String prv_aprv_emp_no){
		this.prv_aprv_emp_no = prv_aprv_emp_no;
	}

	public void setPrv_aprv_nm_korn(String prv_aprv_nm_korn){
		this.prv_aprv_nm_korn = prv_aprv_nm_korn;
	}

	public void setAft_aprv_emp_no(String aft_aprv_emp_no){
		this.aft_aprv_emp_no = aft_aprv_emp_no;
	}

	public void setAft_aprv_nm_korn(String aft_aprv_nm_korn){
		this.aft_aprv_nm_korn = aft_aprv_nm_korn;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getObj_dept_cd(){
		return this.obj_dept_cd;
	}

	public String getObj_dept_nm(){
		return this.obj_dept_nm;
	}

	public String getObj_emp_no(){
		return this.obj_emp_no;
	}

	public String getObj_nm_korn(){
		return this.obj_nm_korn;
	}

	public String getPrv_aprv_emp_no(){
		return this.prv_aprv_emp_no;
	}

	public String getPrv_aprv_nm_korn(){
		return this.prv_aprv_nm_korn;
	}

	public String getAft_aprv_emp_no(){
		return this.aft_aprv_emp_no;
	}

	public String getAft_aprv_nm_korn(){
		return this.aft_aprv_nm_korn;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Wed Aug 22 17:05:36 KST 2018 */