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


package chosun.ciis.ad.dep.rec;

import java.sql.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.ds.*;

/**
 * 
 */


public class AD_DEP_3510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String medi_nm;
	public String pubc_slip_no;
	public String dlco_no;
	public String dlco_nm;
	public String pubc_tot_amt;
	public String advt_size;
	public String advt_cont;
	public String indt_clsf_nm;
	public String ms_amt;
	public String setoff_tot_pubc_amt;

	public AD_DEP_3510_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setAdvt_size(String advt_size){
		this.advt_size = advt_size;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setIndt_clsf_nm(String indt_clsf_nm){
		this.indt_clsf_nm = indt_clsf_nm;
	}

	public void setMs_amt(String ms_amt){
		this.ms_amt = ms_amt;
	}

	public void setSetoff_tot_pubc_amt(String setoff_tot_pubc_amt){
		this.setoff_tot_pubc_amt = setoff_tot_pubc_amt;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getAdvt_size(){
		return this.advt_size;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getIndt_clsf_nm(){
		return this.indt_clsf_nm;
	}

	public String getMs_amt(){
		return this.ms_amt;
	}

	public String getSetoff_tot_pubc_amt(){
		return this.setoff_tot_pubc_amt;
	}
}

/* 작성시간 : Wed Aug 26 11:47:51 KST 2009 */