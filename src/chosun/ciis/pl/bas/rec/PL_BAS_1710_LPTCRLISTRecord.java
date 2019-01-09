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


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1710_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String aply_bgn_yymm;
	public String aply_end_yymm;
	public String sale_aply_clsf;
	public String sale_aply_clsf_nm;
	public String sale_rate;
	public String purc_aply_clsf;
	public String purc_aply_clsf_nm;
	public String purc_rate;
	public String cntr_amt;
	public String dcrate_basi;
	public String dcrate_basi_rate;

	public PL_BAS_1710_LPTCRLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setAply_bgn_yymm(String aply_bgn_yymm){
		this.aply_bgn_yymm = aply_bgn_yymm;
	}

	public void setAply_end_yymm(String aply_end_yymm){
		this.aply_end_yymm = aply_end_yymm;
	}

	public void setSale_aply_clsf(String sale_aply_clsf){
		this.sale_aply_clsf = sale_aply_clsf;
	}

	public void setSale_aply_clsf_nm(String sale_aply_clsf_nm){
		this.sale_aply_clsf_nm = sale_aply_clsf_nm;
	}

	public void setSale_rate(String sale_rate){
		this.sale_rate = sale_rate;
	}

	public void setPurc_aply_clsf(String purc_aply_clsf){
		this.purc_aply_clsf = purc_aply_clsf;
	}

	public void setPurc_aply_clsf_nm(String purc_aply_clsf_nm){
		this.purc_aply_clsf_nm = purc_aply_clsf_nm;
	}

	public void setPurc_rate(String purc_rate){
		this.purc_rate = purc_rate;
	}

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
	}

	public void setDcrate_basi(String dcrate_basi){
		this.dcrate_basi = dcrate_basi;
	}

	public void setDcrate_basi_rate(String dcrate_basi_rate){
		this.dcrate_basi_rate = dcrate_basi_rate;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getAply_bgn_yymm(){
		return this.aply_bgn_yymm;
	}

	public String getAply_end_yymm(){
		return this.aply_end_yymm;
	}

	public String getSale_aply_clsf(){
		return this.sale_aply_clsf;
	}

	public String getSale_aply_clsf_nm(){
		return this.sale_aply_clsf_nm;
	}

	public String getSale_rate(){
		return this.sale_rate;
	}

	public String getPurc_aply_clsf(){
		return this.purc_aply_clsf;
	}

	public String getPurc_aply_clsf_nm(){
		return this.purc_aply_clsf_nm;
	}

	public String getPurc_rate(){
		return this.purc_rate;
	}

	public String getCntr_amt(){
		return this.cntr_amt;
	}

	public String getDcrate_basi(){
		return this.dcrate_basi;
	}

	public String getDcrate_basi_rate(){
		return this.dcrate_basi_rate;
	}
}

/* 작성시간 : Mon Jun 15 20:27:49 KST 2009 */