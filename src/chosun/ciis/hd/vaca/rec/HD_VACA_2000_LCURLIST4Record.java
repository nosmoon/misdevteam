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


public class HD_VACA_2000_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String duty_dt;
	public String hody_clsf_nm;
	public String alvc_use_dt;
	public String proc_stat;

	public HD_VACA_2000_LCURLIST4Record(){}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setHody_clsf_nm(String hody_clsf_nm){
		this.hody_clsf_nm = hody_clsf_nm;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getHody_clsf_nm(){
		return this.hody_clsf_nm;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Tue Oct 20 15:36:45 KST 2009 */