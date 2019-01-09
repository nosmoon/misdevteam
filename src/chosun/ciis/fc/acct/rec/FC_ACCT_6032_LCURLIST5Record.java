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


public class FC_ACCT_6032_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String data_clsf;
	public String rec_suply_reg_no;
	public String sale_dlco_cnt1;
	public String nosh1;
	public String suply_amt1;
	public String vat_amt1;
	public String sale_dlco_cnt2;
	public String nosh2;
	public String suply_amt2;
	public String vat_amt2;
	public String sale_dlco_cnt3;
	public String nosh3;
	public String suply_amt3;
	public String vat_amt3;
	public String nul;

	public FC_ACCT_6032_LCURLIST5Record(){}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setRec_suply_reg_no(String rec_suply_reg_no){
		this.rec_suply_reg_no = rec_suply_reg_no;
	}

	public void setSale_dlco_cnt1(String sale_dlco_cnt1){
		this.sale_dlco_cnt1 = sale_dlco_cnt1;
	}

	public void setNosh1(String nosh1){
		this.nosh1 = nosh1;
	}

	public void setSuply_amt1(String suply_amt1){
		this.suply_amt1 = suply_amt1;
	}

	public void setVat_amt1(String vat_amt1){
		this.vat_amt1 = vat_amt1;
	}

	public void setSale_dlco_cnt2(String sale_dlco_cnt2){
		this.sale_dlco_cnt2 = sale_dlco_cnt2;
	}

	public void setNosh2(String nosh2){
		this.nosh2 = nosh2;
	}

	public void setSuply_amt2(String suply_amt2){
		this.suply_amt2 = suply_amt2;
	}

	public void setVat_amt2(String vat_amt2){
		this.vat_amt2 = vat_amt2;
	}

	public void setSale_dlco_cnt3(String sale_dlco_cnt3){
		this.sale_dlco_cnt3 = sale_dlco_cnt3;
	}

	public void setNosh3(String nosh3){
		this.nosh3 = nosh3;
	}

	public void setSuply_amt3(String suply_amt3){
		this.suply_amt3 = suply_amt3;
	}

	public void setVat_amt3(String vat_amt3){
		this.vat_amt3 = vat_amt3;
	}

	public void setNul(String nul){
		this.nul = nul;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getRec_suply_reg_no(){
		return this.rec_suply_reg_no;
	}

	public String getSale_dlco_cnt1(){
		return this.sale_dlco_cnt1;
	}

	public String getNosh1(){
		return this.nosh1;
	}

	public String getSuply_amt1(){
		return this.suply_amt1;
	}

	public String getVat_amt1(){
		return this.vat_amt1;
	}

	public String getSale_dlco_cnt2(){
		return this.sale_dlco_cnt2;
	}

	public String getNosh2(){
		return this.nosh2;
	}

	public String getSuply_amt2(){
		return this.suply_amt2;
	}

	public String getVat_amt2(){
		return this.vat_amt2;
	}

	public String getSale_dlco_cnt3(){
		return this.sale_dlco_cnt3;
	}

	public String getNosh3(){
		return this.nosh3;
	}

	public String getSuply_amt3(){
		return this.suply_amt3;
	}

	public String getVat_amt3(){
		return this.vat_amt3;
	}

	public String getNul(){
		return this.nul;
	}
}

/* 작성시간 : Thu Jul 21 17:35:12 KST 2016 */