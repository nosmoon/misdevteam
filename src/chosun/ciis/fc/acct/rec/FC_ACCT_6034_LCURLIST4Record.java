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


public class FC_ACCT_6034_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

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
	public String sale_dlco_ern;
	public String corp_nm;
	public String stmt_nosh;
	public String minus_indc;
	public String sale_amt;
	public String bill_sender;

	public FC_ACCT_6034_LCURLIST4Record(){}

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

	public void setSale_dlco_ern(String sale_dlco_ern){
		this.sale_dlco_ern = sale_dlco_ern;
	}

	public void setCorp_nm(String corp_nm){
		this.corp_nm = corp_nm;
	}

	public void setStmt_nosh(String stmt_nosh){
		this.stmt_nosh = stmt_nosh;
	}

	public void setMinus_indc(String minus_indc){
		this.minus_indc = minus_indc;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
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

	public String getSale_dlco_ern(){
		return this.sale_dlco_ern;
	}

	public String getCorp_nm(){
		return this.corp_nm;
	}

	public String getStmt_nosh(){
		return this.stmt_nosh;
	}

	public String getMinus_indc(){
		return this.minus_indc;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getBill_sender(){
		return this.bill_sender;
	}
}

/* 작성시간 : Thu Jul 23 16:22:59 KST 2015 */