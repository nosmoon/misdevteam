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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String make_yn;
	public String matt_yn;
	public String tmhm_yn;
	public String matr_yn;
	public String clos_clsf;
	public String clos_clsf_nm;

	public PR_PAPMAKE_1000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMake_yn(String make_yn){
		this.make_yn = make_yn;
	}

	public void setMatt_yn(String matt_yn){
		this.matt_yn = matt_yn;
	}

	public void setTmhm_yn(String tmhm_yn){
		this.tmhm_yn = tmhm_yn;
	}

	public void setMatr_yn(String matr_yn){
		this.matr_yn = matr_yn;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setClos_clsf_nm(String clos_clsf_nm){
		this.clos_clsf_nm = clos_clsf_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMake_yn(){
		return this.make_yn;
	}

	public String getMatt_yn(){
		return this.matt_yn;
	}

	public String getTmhm_yn(){
		return this.tmhm_yn;
	}

	public String getMatr_yn(){
		return this.matr_yn;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getClos_clsf_nm(){
		return this.clos_clsf_nm;
	}
}

/* 작성시간 : Wed Jun 17 15:03:50 KST 2009 */