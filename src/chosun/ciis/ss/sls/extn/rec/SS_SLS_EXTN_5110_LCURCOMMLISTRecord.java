/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_5110_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dncomp;
	public String dncompnm;
	public String deptnm;
	public String adv_nm;
	public String medi_qty;
	public String mob_qty;
	public String medi_amt;
	public String mob_amt;
	public String tot_amt;
	public String rcpm_slip_no;
	public String proc_yn;
	public String proc_dt;
	public String regdt;
	public String regno;

	public SS_SLS_EXTN_5110_LCURCOMMLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAdv_nm(String adv_nm){
		this.adv_nm = adv_nm;
	}

	public void setMedi_qty(String medi_qty){
		this.medi_qty = medi_qty;
	}

	public void setMob_qty(String mob_qty){
		this.mob_qty = mob_qty;
	}

	public void setMedi_amt(String medi_amt){
		this.medi_amt = medi_amt;
	}

	public void setMob_amt(String mob_amt){
		this.mob_amt = mob_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setProc_yn(String proc_yn){
		this.proc_yn = proc_yn;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAdv_nm(){
		return this.adv_nm;
	}

	public String getMedi_qty(){
		return this.medi_qty;
	}

	public String getMob_qty(){
		return this.mob_qty;
	}

	public String getMedi_amt(){
		return this.medi_amt;
	}

	public String getMob_amt(){
		return this.mob_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getProc_yn(){
		return this.proc_yn;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}
}

/* 작성시간 : Tue Oct 04 16:15:05 KST 2016 */