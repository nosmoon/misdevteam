/***************************************************************************************************
* 파일명 : SE_BNS_2210_LCURLISTRecord.java
* 기능 : 판매 - 판촉물관리 - 판촉물매출마감
* 작성일자 : 2009-05-25
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String divn_dt		;
	public String clos_yn		;
	public String net_sale_amt_1;
	public String fpymt_amt_1	;
	public String sale_amt_1	;
	public String net_sale_amt_2;
	public String fpymt_amt_2	;
	public String sale_amt_2	;
	public String vat_amt_2		;
	public String sale_amt_3	;

	public SE_BNS_2210_LCURLISTRecord(){}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setNet_sale_amt_1(String net_sale_amt_1){
		this.net_sale_amt_1 = net_sale_amt_1;
	}

	public void setFpymt_amt_1(String fpymt_amt_1){
		this.fpymt_amt_1 = fpymt_amt_1;
	}

	public void setSale_amt_1(String sale_amt_1){
		this.sale_amt_1 = sale_amt_1;
	}

	public void setNet_sale_amt_2(String net_sale_amt_2){
		this.net_sale_amt_2 = net_sale_amt_2;
	}

	public void setFpymt_amt_2(String fpymt_amt_2){
		this.fpymt_amt_2 = fpymt_amt_2;
	}

	public void setSale_amt_2(String sale_amt_2){
		this.sale_amt_2 = sale_amt_2;
	}

	public void setVat_amt_2(String vat_amt_2){
		this.vat_amt_2 = vat_amt_2;
	}

	public void setSale_amt_3(String sale_amt_3){
		this.sale_amt_3 = sale_amt_3;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getNet_sale_amt_1(){
		return this.net_sale_amt_1;
	}

	public String getFpymt_amt_1(){
		return this.fpymt_amt_1;
	}

	public String getSale_amt_1(){
		return this.sale_amt_1;
	}

	public String getNet_sale_amt_2(){
		return this.net_sale_amt_2;
	}

	public String getFpymt_amt_2(){
		return this.fpymt_amt_2;
	}

	public String getSale_amt_2(){
		return this.sale_amt_2;
	}

	public String getVat_amt_2(){
		return this.vat_amt_2;
	}

	public String getSale_amt_3(){
		return this.sale_amt_3;
	}
}

/* 작성시간 : Mon May 25 16:04:08 KST 2009 */