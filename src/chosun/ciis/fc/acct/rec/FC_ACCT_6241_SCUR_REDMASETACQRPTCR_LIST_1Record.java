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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String vat_aset_clsf;
	public String acqr_dt;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String ern;
	public String item;
	public int suply_amt;
	public int vat_amt;
	public int qunt;

	public FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setVat_aset_clsf(String vat_aset_clsf){
		this.vat_aset_clsf = vat_aset_clsf;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setSuply_amt(int suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(int vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setQunt(int qunt){
		this.qunt = qunt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getVat_aset_clsf(){
		return this.vat_aset_clsf;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getItem(){
		return this.item;
	}

	public int getSuply_amt(){
		return this.suply_amt;
	}

	public int getVat_amt(){
		return this.vat_amt;
	}

	public int getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Mon Jun 23 14:40:01 KST 2014 */