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


public class HD_VACA_1611_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String duty_dt;
	public String hody_clsf;
	public String hody_clsf_nm;
	public String alvc_use_dt;
	public String alvc_use_yn_nm;

	public HD_VACA_1611_LCURLIST1Record(){}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setHody_clsf_nm(String hody_clsf_nm){
		this.hody_clsf_nm = hody_clsf_nm;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setAlvc_use_yn_nm(String alvc_use_yn_nm){
		this.alvc_use_yn_nm = alvc_use_yn_nm;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getHody_clsf_nm(){
		return this.hody_clsf_nm;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getAlvc_use_yn_nm(){
		return this.alvc_use_yn_nm;
	}
}

/* 작성시간 : Wed Oct 24 10:55:13 KST 2018 */