/***************************************************************************************************
* 파일명 : SE_SAL_1510_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 생성
* 작성일자 : 2009-04-14
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm				;
	public String tms_yn_1			;
	public String tms_yn_2			;
	public String qty_110			;
	public String avg_uprc_110		;
	public String sale_amt_110		;
	public String net_sale_amt_110	;
	public String fpymt_amt_110		;
	public String qty_130			;
	public String avg_uprc_130		;
	public String sale_amt_130		;
	public String net_sale_amt_130	;
	public String fpymt_amt_130		;
	public String sale_amt			;
	public String fpymt_amt			;
	public String net_sale_amt		;

	public SE_SAL_1510_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setTms_yn_1(String tms_yn_1){
		this.tms_yn_1 = tms_yn_1;
	}

	public void setTms_yn_2(String tms_yn_2){
		this.tms_yn_2 = tms_yn_2;
	}

	public void setQty_110(String qty_110){
		this.qty_110 = qty_110;
	}

	public void setAvg_uprc_110(String avg_uprc_110){
		this.avg_uprc_110 = avg_uprc_110;
	}

	public void setSale_amt_110(String sale_amt_110){
		this.sale_amt_110 = sale_amt_110;
	}

	public void setNet_sale_amt_110(String net_sale_amt_110){
		this.net_sale_amt_110 = net_sale_amt_110;
	}

	public void setFpymt_amt_110(String fpymt_amt_110){
		this.fpymt_amt_110 = fpymt_amt_110;
	}

	public void setQty_130(String qty_130){
		this.qty_130 = qty_130;
	}

	public void setAvg_uprc_130(String avg_uprc_130){
		this.avg_uprc_130 = avg_uprc_130;
	}

	public void setSale_amt_130(String sale_amt_130){
		this.sale_amt_130 = sale_amt_130;
	}

	public void setNet_sale_amt_130(String net_sale_amt_130){
		this.net_sale_amt_130 = net_sale_amt_130;
	}

	public void setFpymt_amt_130(String fpymt_amt_130){
		this.fpymt_amt_130 = fpymt_amt_130;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getTms_yn_1(){
		return this.tms_yn_1;
	}

	public String getTms_yn_2(){
		return this.tms_yn_2;
	}

	public String getQty_110(){
		return this.qty_110;
	}

	public String getAvg_uprc_110(){
		return this.avg_uprc_110;
	}

	public String getSale_amt_110(){
		return this.sale_amt_110;
	}

	public String getNet_sale_amt_110(){
		return this.net_sale_amt_110;
	}

	public String getFpymt_amt_110(){
		return this.fpymt_amt_110;
	}

	public String getQty_130(){
		return this.qty_130;
	}

	public String getAvg_uprc_130(){
		return this.avg_uprc_130;
	}

	public String getSale_amt_130(){
		return this.sale_amt_130;
	}

	public String getNet_sale_amt_130(){
		return this.net_sale_amt_130;
	}

	public String getFpymt_amt_130(){
		return this.fpymt_amt_130;
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
}

/* 작성시간 : Tue Apr 14 11:21:08 KST 2009 */