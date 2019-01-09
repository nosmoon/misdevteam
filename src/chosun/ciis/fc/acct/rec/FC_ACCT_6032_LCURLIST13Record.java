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


public class FC_ACCT_6032_LCURLIST13Record extends java.lang.Object implements java.io.Serializable{

	public String data_clsf;
	public String rec_suply_reg_no;
	public String sale_dlco_cnt1;
	public String nosh1;
	public String suply_amt1;
	public String vat_amt1;
	public String total_amt1;
	public String nul;

	public FC_ACCT_6032_LCURLIST13Record(){}

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

	public void setTotal_amt1(String total_amt1){
		this.total_amt1 = total_amt1;
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

	public String getTotal_amt1(){
		return this.total_amt1;
	}

	public String getNul(){
		return this.nul;
	}
}

/* 작성시간 : Thu Jul 21 17:35:12 KST 2016 */