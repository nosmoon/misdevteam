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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_2301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String fee_duty_dd;
	public String remk;
	public String dept_cd;
	public String db_status;
	public String ictry_dspch;
	public String forn_dspch;
	public String ictry_stdy;
	public String forn_stdy;
	public String temp_duty;
	public String susp_duty;

	public HD_EVLU_2301_LCURLISTRecord(){}

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

	public void setFee_duty_dd(String fee_duty_dd){
		this.fee_duty_dd = fee_duty_dd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public void setIctry_dspch(String ictry_dspch){
		this.ictry_dspch = ictry_dspch;
	}

	public void setForn_dspch(String forn_dspch){
		this.forn_dspch = forn_dspch;
	}

	public void setIctry_stdy(String ictry_stdy){
		this.ictry_stdy = ictry_stdy;
	}

	public void setForn_stdy(String forn_stdy){
		this.forn_stdy = forn_stdy;
	}

	public void setTemp_duty(String temp_duty){
		this.temp_duty = temp_duty;
	}

	public void setSusp_duty(String susp_duty){
		this.susp_duty = susp_duty;
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

	public String getFee_duty_dd(){
		return this.fee_duty_dd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDb_status(){
		return this.db_status;
	}

	public String getIctry_dspch(){
		return this.ictry_dspch;
	}

	public String getForn_dspch(){
		return this.forn_dspch;
	}

	public String getIctry_stdy(){
		return this.ictry_stdy;
	}

	public String getForn_stdy(){
		return this.forn_stdy;
	}

	public String getTemp_duty(){
		return this.temp_duty;
	}

	public String getSusp_duty(){
		return this.susp_duty;
	}
}

/* 작성시간 : Tue Mar 18 10:47:33 KST 2014 */