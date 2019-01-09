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


public class HD_VACA_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String duty_dt;
	public String clndr_wkdy;
	public String clndr_wkdy_nm;
	public String hody_clsf;
	public String hody_clsf_nm;
	public String alvc_plan_dt;
	public String alvc_use_dt;

	public HD_VACA_1610_LCURLISTRecord(){}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setClndr_wkdy(String clndr_wkdy){
		this.clndr_wkdy = clndr_wkdy;
	}

	public void setClndr_wkdy_nm(String clndr_wkdy_nm){
		this.clndr_wkdy_nm = clndr_wkdy_nm;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setHody_clsf_nm(String hody_clsf_nm){
		this.hody_clsf_nm = hody_clsf_nm;
	}

	public void setAlvc_plan_dt(String alvc_plan_dt){
		this.alvc_plan_dt = alvc_plan_dt;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getClndr_wkdy(){
		return this.clndr_wkdy;
	}

	public String getClndr_wkdy_nm(){
		return this.clndr_wkdy_nm;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getHody_clsf_nm(){
		return this.hody_clsf_nm;
	}

	public String getAlvc_plan_dt(){
		return this.alvc_plan_dt;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}
}

/* 작성시간 : Wed Jul 29 16:05:57 KST 2009 */