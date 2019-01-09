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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2013_1214_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String firmnm;
	public String dona_plac_clsf;
	public String dona_yymm;
	public String dona_ptcr_noit;
	public String dona_ptcr_amt;
	public String rmks;
	public String rshp;
	public String obj_pers_flnm;
	public String prn;
	public String corr_txn_prd_dduc_amt;
	public String cyov_amt;
	public String lastyear_cyov_amt;
	public String seq;

	public HD_YADJM_2013_1214_LCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFirmnm(String firmnm){
		this.firmnm = firmnm;
	}

	public void setDona_plac_clsf(String dona_plac_clsf){
		this.dona_plac_clsf = dona_plac_clsf;
	}

	public void setDona_yymm(String dona_yymm){
		this.dona_yymm = dona_yymm;
	}

	public void setDona_ptcr_noit(String dona_ptcr_noit){
		this.dona_ptcr_noit = dona_ptcr_noit;
	}

	public void setDona_ptcr_amt(String dona_ptcr_amt){
		this.dona_ptcr_amt = dona_ptcr_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setRshp(String rshp){
		this.rshp = rshp;
	}

	public void setObj_pers_flnm(String obj_pers_flnm){
		this.obj_pers_flnm = obj_pers_flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setCorr_txn_prd_dduc_amt(String corr_txn_prd_dduc_amt){
		this.corr_txn_prd_dduc_amt = corr_txn_prd_dduc_amt;
	}

	public void setCyov_amt(String cyov_amt){
		this.cyov_amt = cyov_amt;
	}

	public void setLastyear_cyov_amt(String lastyear_cyov_amt){
		this.lastyear_cyov_amt = lastyear_cyov_amt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getErn(){
		return this.ern;
	}

	public String getFirmnm(){
		return this.firmnm;
	}

	public String getDona_plac_clsf(){
		return this.dona_plac_clsf;
	}

	public String getDona_yymm(){
		return this.dona_yymm;
	}

	public String getDona_ptcr_noit(){
		return this.dona_ptcr_noit;
	}

	public String getDona_ptcr_amt(){
		return this.dona_ptcr_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getRshp(){
		return this.rshp;
	}

	public String getObj_pers_flnm(){
		return this.obj_pers_flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getCorr_txn_prd_dduc_amt(){
		return this.corr_txn_prd_dduc_amt;
	}

	public String getCyov_amt(){
		return this.cyov_amt;
	}

	public String getLastyear_cyov_amt(){
		return this.lastyear_cyov_amt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Jan 09 18:28:41 KST 2013 */