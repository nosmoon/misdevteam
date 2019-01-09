/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_2501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String alon_cd;
	public String alon_nm;
	public String pay_dt;
	public String saly_yy;
	public String saly_no;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String exst_pay_alon;
	public String budg_cd;
	public String actu_slip_no;

	public HD_SALY_2501_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setAlon_cd(String alon_cd){
		this.alon_cd = alon_cd;
	}

	public void setAlon_nm(String alon_nm){
		this.alon_nm = alon_nm;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setExst_pay_alon(String exst_pay_alon){
		this.exst_pay_alon = exst_pay_alon;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getAlon_cd(){
		return this.alon_cd;
	}

	public String getAlon_nm(){
		return this.alon_nm;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getExst_pay_alon(){
		return this.exst_pay_alon;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
}

/* 작성시간 : Fri Mar 13 19:32:11 KST 2015 */