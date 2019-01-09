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


package chosun.ciis.hd.dtbas.rec;

import java.sql.*;
import chosun.ciis.hd.dtbas.dm.*;
import chosun.ciis.hd.dtbas.ds.*;

/**
 * 
 */


public class HD_DTBAS_1102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String duty_alon_cd;
	public String duty_alon_nm;
	public String duty_alon_grad;
	public String aply_bgn_prd;
	public String aply_end_prd;
	public String base_alon;
	public String cmpn_alon;
	public String remk;

	public HD_DTBAS_1102_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDuty_alon_cd(String duty_alon_cd){
		this.duty_alon_cd = duty_alon_cd;
	}

	public void setDuty_alon_nm(String duty_alon_nm){
		this.duty_alon_nm = duty_alon_nm;
	}

	public void setDuty_alon_grad(String duty_alon_grad){
		this.duty_alon_grad = duty_alon_grad;
	}

	public void setAply_bgn_prd(String aply_bgn_prd){
		this.aply_bgn_prd = aply_bgn_prd;
	}

	public void setAply_end_prd(String aply_end_prd){
		this.aply_end_prd = aply_end_prd;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getDuty_alon_cd(){
		return this.duty_alon_cd;
	}

	public String getDuty_alon_nm(){
		return this.duty_alon_nm;
	}

	public String getDuty_alon_grad(){
		return this.duty_alon_grad;
	}

	public String getAply_bgn_prd(){
		return this.aply_bgn_prd;
	}

	public String getAply_end_prd(){
		return this.aply_end_prd;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Sat Feb 14 18:03:27 KST 2009 */