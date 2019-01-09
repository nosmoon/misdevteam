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


public class FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String acq_dt;
	public String qunt;
	public String suply_amt;
	public String vat_amt;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String ern;
	public String mang_clsf_cd;
	public String crdt_card_nm;
	public String crdt_card_no;

	public FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAcq_dt(String acq_dt){
		this.acq_dt = acq_dt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
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

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setCrdt_card_nm(String crdt_card_nm){
		this.crdt_card_nm = crdt_card_nm;
	}

	public void setCrdt_card_no(String crdt_card_no){
		this.crdt_card_no = crdt_card_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAcq_dt(){
		return this.acq_dt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
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

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getCrdt_card_nm(){
		return this.crdt_card_nm;
	}

	public String getCrdt_card_no(){
		return this.crdt_card_no;
	}
}

/* 작성시간 : Tue Jun 17 13:54:08 KST 2014 */