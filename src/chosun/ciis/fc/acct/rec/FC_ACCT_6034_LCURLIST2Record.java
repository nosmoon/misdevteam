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


public class FC_ACCT_6034_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String seq1;
	public String seq2;
	public String seq3;
	public String seq4;
	public String seq5;
	public String recd_clsf;
	public String taxoff;
	public String seq;
	public String ern;
	public String corp_nm;
	public String presi;
	public String erplace_law_dstc_cd;
	public String erplace_plcw;
	public String bill_sender;

	public FC_ACCT_6034_LCURLIST2Record(){}

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

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setCorp_nm(String corp_nm){
		this.corp_nm = corp_nm;
	}

	public void setPresi(String presi){
		this.presi = presi;
	}

	public void setErplace_law_dstc_cd(String erplace_law_dstc_cd){
		this.erplace_law_dstc_cd = erplace_law_dstc_cd;
	}

	public void setErplace_plcw(String erplace_plcw){
		this.erplace_plcw = erplace_plcw;
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

	public String getSeq(){
		return this.seq;
	}

	public String getErn(){
		return this.ern;
	}

	public String getCorp_nm(){
		return this.corp_nm;
	}

	public String getPresi(){
		return this.presi;
	}

	public String getErplace_law_dstc_cd(){
		return this.erplace_law_dstc_cd;
	}

	public String getErplace_plcw(){
		return this.erplace_plcw;
	}

	public String getBill_sender(){
		return this.bill_sender;
	}
}

/* 작성시간 : Thu Jul 23 16:22:59 KST 2015 */