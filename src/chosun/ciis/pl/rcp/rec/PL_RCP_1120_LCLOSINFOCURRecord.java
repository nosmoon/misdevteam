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


public class PL_RCP_1120_LCLOSINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_clsf;
	public String medi_clsf_nm;
	public String basi_yymm;
	public String cyov_bal;
	public String sale_amt;
	public String rcpm_amt;
	public String thmm_bal;
	public String meda_bal;
	public String tot_bal;

	public PL_RCP_1120_LCLOSINFOCURRecord(){}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMedi_clsf_nm(String medi_clsf_nm){
		this.medi_clsf_nm = medi_clsf_nm;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setThmm_bal(String thmm_bal){
		this.thmm_bal = thmm_bal;
	}

	public void setMeda_bal(String meda_bal){
		this.meda_bal = meda_bal;
	}

	public void setTot_bal(String tot_bal){
		this.tot_bal = tot_bal;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMedi_clsf_nm(){
		return this.medi_clsf_nm;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getThmm_bal(){
		return this.thmm_bal;
	}

	public String getMeda_bal(){
		return this.meda_bal;
	}

	public String getTot_bal(){
		return this.tot_bal;
	}
}

/* 작성시간 : Thu Apr 23 15:08:46 KST 2009 */