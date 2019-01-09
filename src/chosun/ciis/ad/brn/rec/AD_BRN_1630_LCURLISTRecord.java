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


package chosun.ciis.ad.brn.rec;

import java.sql.*;
import chosun.ciis.ad.brn.dm.*;
import chosun.ciis.ad.brn.ds.*;

/**
 * 
 */


public class AD_BRN_1630_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String checked;
	public String pubc_occr_dt;
	public String pubc_occr_seq;
	public String medi_cd;
	public String dlco_no;
	public String medi_nm;
	public String sect_cd;
	public String sect_seq;
	public String dlco_nm;
	public String pubc_dt;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String chrg_pers;

	public AD_BRN_1630_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}
}

/* 작성시간 : Tue Aug 25 20:28:29 KST 2009 */