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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String payo_clsf;
	public String slip_occr_dt;
	public String payo_slip_no;
	public String rcpm_slip_no;
	public String dlco_no;
	public String dlco_nm;
	public String drbk_amt;

	public IS_DEP_1510_LCURLISTRecord(){}

	public void setPayo_clsf(String payo_clsf){
		this.payo_clsf = payo_clsf;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setPayo_slip_no(String payo_slip_no){
		this.payo_slip_no = payo_slip_no;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDrbk_amt(String drbk_amt){
		this.drbk_amt = drbk_amt;
	}

	public String getPayo_clsf(){
		return this.payo_clsf;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getPayo_slip_no(){
		return this.payo_slip_no;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDrbk_amt(){
		return this.drbk_amt;
	}
}

/* 작성시간 : Mon May 21 20:13:07 KST 2012 */