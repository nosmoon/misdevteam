/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_slip_clsf;
	public String occr_slip;
	public String occr_dlco_nm;
	public String occr_amt;
	public String budg_nm;
	public String proc_clsf;

	public SE_COMM_1610_LCURLISTRecord(){}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setOccr_dlco_nm(String occr_dlco_nm){
		this.occr_dlco_nm = occr_dlco_nm;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getOccr_dlco_nm(){
		return this.occr_dlco_nm;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}
}

/* 작성시간 : Wed Apr 29 15:11:47 KST 2009 */