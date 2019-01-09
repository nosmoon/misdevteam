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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_WORK_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clndr_dt;
	public String prsnt_tm;
	public String finish_tm;
	public String duty_tm;
	public String rest_tm;
	public String duty_clsf_nm;
	public String duty_dt;
	public String proc_stat;

	public HD_DUTY_WORK_1001_LCURLISTRecord(){}

	public void setClndr_dt(String clndr_dt){
		this.clndr_dt = clndr_dt;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setDuty_tm(String duty_tm){
		this.duty_tm = duty_tm;
	}

	public void setRest_tm(String rest_tm){
		this.rest_tm = rest_tm;
	}

	public void setDuty_clsf_nm(String duty_clsf_nm){
		this.duty_clsf_nm = duty_clsf_nm;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getClndr_dt(){
		return this.clndr_dt;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getDuty_tm(){
		return this.duty_tm;
	}

	public String getRest_tm(){
		return this.rest_tm;
	}

	public String getDuty_clsf_nm(){
		return this.duty_clsf_nm;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}
}

/* 작성시간 : Tue Aug 14 15:48:22 KST 2018 */