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


public class FC_ACCT_6034_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String seq1;
	public String seq2;
	public String seq3;
	public String seq4;
	public String seq5;
	public String recd_clsf;
	public String taxoff;
	public String subm_ymd;
	public String subm_pers_clsf;
	public String tax_agnt_no;
	public String ern;
	public String corp_nm;
	public String corp_reg_no;
	public String presi;
	public String plcw_law_cd;
	public String plcw_law_addr;
	public String tel_no;
	public String subm_noit_tot;
	public String use_korn_cd_kind;
	public String bill_sender;

	public FC_ACCT_6034_LCURLIST1Record(){}

	public void setSeq1(String seq1){
		this.seq1 = seq1;
	}

	public void setSeq2(String seq2){
		this.seq2 = seq2;
	}

	public void setSeq3(String seq3){
		this.seq3 = seq3;
	}

	public void setSeq4(String seq4){
		this.seq4 = seq4;
	}

	public void setSeq5(String seq5){
		this.seq5 = seq5;
	}

	public void setRecd_clsf(String recd_clsf){
		this.recd_clsf = recd_clsf;
	}

	public void setTaxoff(String taxoff){
		this.taxoff = taxoff;
	}

	public void setSubm_ymd(String subm_ymd){
		this.subm_ymd = subm_ymd;
	}

	public void setSubm_pers_clsf(String subm_pers_clsf){
		this.subm_pers_clsf = subm_pers_clsf;
	}

	public void setTax_agnt_no(String tax_agnt_no){
		this.tax_agnt_no = tax_agnt_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setCorp_nm(String corp_nm){
		this.corp_nm = corp_nm;
	}

	public void setCorp_reg_no(String corp_reg_no){
		this.corp_reg_no = corp_reg_no;
	}

	public void setPresi(String presi){
		this.presi = presi;
	}

	public void setPlcw_law_cd(String plcw_law_cd){
		this.plcw_law_cd = plcw_law_cd;
	}

	public void setPlcw_law_addr(String plcw_law_addr){
		this.plcw_law_addr = plcw_law_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setSubm_noit_tot(String subm_noit_tot){
		this.subm_noit_tot = subm_noit_tot;
	}

	public void setUse_korn_cd_kind(String use_korn_cd_kind){
		this.use_korn_cd_kind = use_korn_cd_kind;
	}

	public void setBill_sender(String bill_sender){
		this.bill_sender = bill_sender;
	}

	public String getSeq1(){
		return this.seq1;
	}

	public String getSeq2(){
		return this.seq2;
	}

	public String getSeq3(){
		return this.seq3;
	}

	public String getSeq4(){
		return this.seq4;
	}

	public String getSeq5(){
		return this.seq5;
	}

	public String getRecd_clsf(){
		return this.recd_clsf;
	}

	public String getTaxoff(){
		return this.taxoff;
	}

	public String getSubm_ymd(){
		return this.subm_ymd;
	}

	public String getSubm_pers_clsf(){
		return this.subm_pers_clsf;
	}

	public String getTax_agnt_no(){
		return this.tax_agnt_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getCorp_nm(){
		return this.corp_nm;
	}

	public String getCorp_reg_no(){
		return this.corp_reg_no;
	}

	public String getPresi(){
		return this.presi;
	}

	public String getPlcw_law_cd(){
		return this.plcw_law_cd;
	}

	public String getPlcw_law_addr(){
		return this.plcw_law_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getSubm_noit_tot(){
		return this.subm_noit_tot;
	}

	public String getUse_korn_cd_kind(){
		return this.use_korn_cd_kind;
	}

	public String getBill_sender(){
		return this.bill_sender;
	}
}

/* 작성시간 : Thu Jul 23 16:22:59 KST 2015 */