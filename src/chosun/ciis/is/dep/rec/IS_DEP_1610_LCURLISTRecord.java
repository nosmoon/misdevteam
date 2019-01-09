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


public class IS_DEP_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_slip_no;
	public String slip_clsf;
	public String slip_clsf_nm;
	public String dlco_nm;
	public String dlco_nm2;
	public String mang_chrg_pers;
	public String per_rcpm_slip_no;
	public String yesu_amt;
	public String subseq;
	public String yesu_exch_amt;
	public String sunsu_amt;
	public String sunsu_exch_amt;
	public String gita_exch_amt;
	public String gita_amt;
	public String bsamt;
	public String misu_amt;

	public IS_DEP_1610_LCURLISTRecord(){}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSlip_clsf_nm(String slip_clsf_nm){
		this.slip_clsf_nm = slip_clsf_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public void setMang_chrg_pers(String mang_chrg_pers){
		this.mang_chrg_pers = mang_chrg_pers;
	}

	public void setPer_rcpm_slip_no(String per_rcpm_slip_no){
		this.per_rcpm_slip_no = per_rcpm_slip_no;
	}

	public void setYesu_amt(String yesu_amt){
		this.yesu_amt = yesu_amt;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public void setYesu_exch_amt(String yesu_exch_amt){
		this.yesu_exch_amt = yesu_exch_amt;
	}

	public void setSunsu_amt(String sunsu_amt){
		this.sunsu_amt = sunsu_amt;
	}

	public void setSunsu_exch_amt(String sunsu_exch_amt){
		this.sunsu_exch_amt = sunsu_exch_amt;
	}

	public void setGita_exch_amt(String gita_exch_amt){
		this.gita_exch_amt = gita_exch_amt;
	}

	public void setGita_amt(String gita_amt){
		this.gita_amt = gita_amt;
	}

	public void setBsamt(String bsamt){
		this.bsamt = bsamt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSlip_clsf_nm(){
		return this.slip_clsf_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}

	public String getMang_chrg_pers(){
		return this.mang_chrg_pers;
	}

	public String getPer_rcpm_slip_no(){
		return this.per_rcpm_slip_no;
	}

	public String getYesu_amt(){
		return this.yesu_amt;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getYesu_exch_amt(){
		return this.yesu_exch_amt;
	}

	public String getSunsu_amt(){
		return this.sunsu_amt;
	}

	public String getSunsu_exch_amt(){
		return this.sunsu_exch_amt;
	}

	public String getGita_exch_amt(){
		return this.gita_exch_amt;
	}

	public String getGita_amt(){
		return this.gita_amt;
	}

	public String getBsamt(){
		return this.bsamt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}
}

/* 작성시간 : Tue May 22 10:41:41 KST 2012 */