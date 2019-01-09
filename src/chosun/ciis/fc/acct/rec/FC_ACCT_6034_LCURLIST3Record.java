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


public class FC_ACCT_6034_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String seq1;
	public String seq2;
	public String seq3;
	public String seq4;
	public String seq5;
	public String recd_clsf;
	public String data_clsf;
	public String qt_clsf;
	public String taxoff;
	public String seq;
	public String subm_ern;
	public String rvrs_yy;
	public String deal_prd_fr;
	public String deal_prd_to;
	public String make_dt;
	public String sale_dlco_cnt1;
	public String stmt_nosh1;
	public String minus_indc1;
	public String sale_amt1;
	public String sale_dlco_cnt2;
	public String stmt_nosh2;
	public String minus_indc2;
	public String sale_amt2;
	public String sale_dlco_cnt3;
	public String stmt_nosh3;
	public String minus_indc3;
	public String sale_amt3;
	public String bill_sender;

	public FC_ACCT_6034_LCURLIST3Record(){}

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

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setQt_clsf(String qt_clsf){
		this.qt_clsf = qt_clsf;
	}

	public void setTaxoff(String taxoff){
		this.taxoff = taxoff;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubm_ern(String subm_ern){
		this.subm_ern = subm_ern;
	}

	public void setRvrs_yy(String rvrs_yy){
		this.rvrs_yy = rvrs_yy;
	}

	public void setDeal_prd_fr(String deal_prd_fr){
		this.deal_prd_fr = deal_prd_fr;
	}

	public void setDeal_prd_to(String deal_prd_to){
		this.deal_prd_to = deal_prd_to;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSale_dlco_cnt1(String sale_dlco_cnt1){
		this.sale_dlco_cnt1 = sale_dlco_cnt1;
	}

	public void setStmt_nosh1(String stmt_nosh1){
		this.stmt_nosh1 = stmt_nosh1;
	}

	public void setMinus_indc1(String minus_indc1){
		this.minus_indc1 = minus_indc1;
	}

	public void setSale_amt1(String sale_amt1){
		this.sale_amt1 = sale_amt1;
	}

	public void setSale_dlco_cnt2(String sale_dlco_cnt2){
		this.sale_dlco_cnt2 = sale_dlco_cnt2;
	}

	public void setStmt_nosh2(String stmt_nosh2){
		this.stmt_nosh2 = stmt_nosh2;
	}

	public void setMinus_indc2(String minus_indc2){
		this.minus_indc2 = minus_indc2;
	}

	public void setSale_amt2(String sale_amt2){
		this.sale_amt2 = sale_amt2;
	}

	public void setSale_dlco_cnt3(String sale_dlco_cnt3){
		this.sale_dlco_cnt3 = sale_dlco_cnt3;
	}

	public void setStmt_nosh3(String stmt_nosh3){
		this.stmt_nosh3 = stmt_nosh3;
	}

	public void setMinus_indc3(String minus_indc3){
		this.minus_indc3 = minus_indc3;
	}

	public void setSale_amt3(String sale_amt3){
		this.sale_amt3 = sale_amt3;
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

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getQt_clsf(){
		return this.qt_clsf;
	}

	public String getTaxoff(){
		return this.taxoff;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubm_ern(){
		return this.subm_ern;
	}

	public String getRvrs_yy(){
		return this.rvrs_yy;
	}

	public String getDeal_prd_fr(){
		return this.deal_prd_fr;
	}

	public String getDeal_prd_to(){
		return this.deal_prd_to;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSale_dlco_cnt1(){
		return this.sale_dlco_cnt1;
	}

	public String getStmt_nosh1(){
		return this.stmt_nosh1;
	}

	public String getMinus_indc1(){
		return this.minus_indc1;
	}

	public String getSale_amt1(){
		return this.sale_amt1;
	}

	public String getSale_dlco_cnt2(){
		return this.sale_dlco_cnt2;
	}

	public String getStmt_nosh2(){
		return this.stmt_nosh2;
	}

	public String getMinus_indc2(){
		return this.minus_indc2;
	}

	public String getSale_amt2(){
		return this.sale_amt2;
	}

	public String getSale_dlco_cnt3(){
		return this.sale_dlco_cnt3;
	}

	public String getStmt_nosh3(){
		return this.stmt_nosh3;
	}

	public String getMinus_indc3(){
		return this.minus_indc3;
	}

	public String getSale_amt3(){
		return this.sale_amt3;
	}

	public String getBill_sender(){
		return this.bill_sender;
	}
}

/* 작성시간 : Thu Jul 23 16:22:59 KST 2015 */