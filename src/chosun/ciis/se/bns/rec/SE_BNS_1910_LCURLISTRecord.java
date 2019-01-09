/***************************************************************************************************
* 파일명 : SE_BNS_1910_LCURLISTRecord.java
* 기능 : 판매-판촉물관리 - 판촉물(세금)계산서
* 작성일자 : 2009-04-30
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


public class SE_BNS_1910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm			;
	public String clos_yn_1		;
	public String clos_yn_2		;
	public String qunt			;
	public String uprc			;
	public String sale_amt		;
	public String fpymt_amt		;
	public String net_sale_amt	;
	public String vat_amt		;

	public SE_BNS_1910_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClos_yn_1(String clos_yn_1){
		this.clos_yn_1 = clos_yn_1;
	}

	public void setClos_yn_2(String clos_yn_2){
		this.clos_yn_2 = clos_yn_2;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setFpymt_amt(String fpymt_amt){
		this.fpymt_amt = fpymt_amt;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClos_yn_1(){
		return this.clos_yn_1;
	}

	public String getClos_yn_2(){
		return this.clos_yn_2;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getFpymt_amt(){
		return this.fpymt_amt;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}
}

/* 작성시간 : Thu Apr 30 20:37:39 KST 2009 */