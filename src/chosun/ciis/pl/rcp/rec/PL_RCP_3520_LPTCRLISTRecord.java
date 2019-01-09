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


public class PL_RCP_3520_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String bef_gurtamt;
	public String rcpm_amt;
	public String altn_amt;
	public String retn_amt;

	public PL_RCP_3520_LPTCRLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
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

	public void setBef_gurtamt(String bef_gurtamt){
		this.bef_gurtamt = bef_gurtamt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setAltn_amt(String altn_amt){
		this.altn_amt = altn_amt;
	}

	public void setRetn_amt(String retn_amt){
		this.retn_amt = retn_amt;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
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

	public String getBef_gurtamt(){
		return this.bef_gurtamt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getAltn_amt(){
		return this.altn_amt;
	}

	public String getRetn_amt(){
		return this.retn_amt;
	}
}

/* 작성시간 : Tue Apr 28 14:05:51 KST 2009 */