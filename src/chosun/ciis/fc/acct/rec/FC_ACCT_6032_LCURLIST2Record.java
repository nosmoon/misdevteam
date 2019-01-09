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


public class FC_ACCT_6032_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String data_clsf;
	public String suply_pers_reg_no;
	public String seq;
	public String rec_suply_reg_no;
	public String firmnm;
	public String bizcond;
	public String item;
	public String nosh;
	public String deal_cnt;
	public String suply_amt;
	public String vat_amt;
	public String whosal_cd;
	public String retail_cd;
	public String vol_no;
	public String subm_paper;
	public String nul;

	public FC_ACCT_6032_LCURLIST2Record(){}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setSuply_pers_reg_no(String suply_pers_reg_no){
		this.suply_pers_reg_no = suply_pers_reg_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRec_suply_reg_no(String rec_suply_reg_no){
		this.rec_suply_reg_no = rec_suply_reg_no;
	}

	public void setFirmnm(String firmnm){
		this.firmnm = firmnm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setNosh(String nosh){
		this.nosh = nosh;
	}

	public void setDeal_cnt(String deal_cnt){
		this.deal_cnt = deal_cnt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setWhosal_cd(String whosal_cd){
		this.whosal_cd = whosal_cd;
	}

	public void setRetail_cd(String retail_cd){
		this.retail_cd = retail_cd;
	}

	public void setVol_no(String vol_no){
		this.vol_no = vol_no;
	}

	public void setSubm_paper(String subm_paper){
		this.subm_paper = subm_paper;
	}

	public void setNul(String nul){
		this.nul = nul;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getSuply_pers_reg_no(){
		return this.suply_pers_reg_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRec_suply_reg_no(){
		return this.rec_suply_reg_no;
	}

	public String getFirmnm(){
		return this.firmnm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getNosh(){
		return this.nosh;
	}

	public String getDeal_cnt(){
		return this.deal_cnt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getWhosal_cd(){
		return this.whosal_cd;
	}

	public String getRetail_cd(){
		return this.retail_cd;
	}

	public String getVol_no(){
		return this.vol_no;
	}

	public String getSubm_paper(){
		return this.subm_paper;
	}

	public String getNul(){
		return this.nul;
	}
}

/* 작성시간 : Thu Jul 21 17:35:12 KST 2016 */