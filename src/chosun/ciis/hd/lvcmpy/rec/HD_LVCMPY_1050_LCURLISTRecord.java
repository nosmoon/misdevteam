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


public class HD_LVCMPY_1050_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd_1;
	public String duty_dt_1;
	public String emp_no_1;
	public String hody_clsf;
	public String hody_nm;
	public String cmpy_cd_2;
	public String duty_dt_2;
	public String emp_no_2;
	public String base_alon;
	public String cmpn_alon;

	public HD_LVCMPY_1050_LCURLISTRecord(){}

	public void setCmpy_cd_1(String cmpy_cd_1){
		this.cmpy_cd_1 = cmpy_cd_1;
	}

	public void setDuty_dt_1(String duty_dt_1){
		this.duty_dt_1 = duty_dt_1;
	}

	public void setEmp_no_1(String emp_no_1){
		this.emp_no_1 = emp_no_1;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setHody_nm(String hody_nm){
		this.hody_nm = hody_nm;
	}

	public void setCmpy_cd_2(String cmpy_cd_2){
		this.cmpy_cd_2 = cmpy_cd_2;
	}

	public void setDuty_dt_2(String duty_dt_2){
		this.duty_dt_2 = duty_dt_2;
	}

	public void setEmp_no_2(String emp_no_2){
		this.emp_no_2 = emp_no_2;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
	}

	public String getCmpy_cd_1(){
		return this.cmpy_cd_1;
	}

	public String getDuty_dt_1(){
		return this.duty_dt_1;
	}

	public String getEmp_no_1(){
		return this.emp_no_1;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getHody_nm(){
		return this.hody_nm;
	}

	public String getCmpy_cd_2(){
		return this.cmpy_cd_2;
	}

	public String getDuty_dt_2(){
		return this.duty_dt_2;
	}

	public String getEmp_no_2(){
		return this.emp_no_2;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}
}

/* 작성시간 : Wed Apr 29 21:06:42 KST 2009 */