/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.rcp.rec;

import java.sql.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.ds.*;

/**
 * 
 */


public class PL_RCP_3410_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_nm;
	public String area_nm;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String cyov_bal;
	public String sale_amt;
	public String bal_sum;
	public String rcpm_amt;
	public String meda_bal;

	public PL_RCP_3410_LPTCRLISTRecord(){}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setBal_sum(String bal_sum){
		this.bal_sum = bal_sum;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setMeda_bal(String meda_bal){
		this.meda_bal = meda_bal;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getBal_sum(){
		return this.bal_sum;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getMeda_bal(){
		return this.meda_bal;
	}
}

/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */