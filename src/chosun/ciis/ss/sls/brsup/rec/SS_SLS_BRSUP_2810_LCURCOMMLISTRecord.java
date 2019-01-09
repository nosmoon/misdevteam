/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */


public class SS_SLS_BRSUP_2810_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String jursareanm;
	public String stafnm;
	public String prn;
	public String ptphno;
	public String qty1;
	public String qty1_1;
	public String qty2;
	public String qty2_1;
	public String qty3;
	public String qty3_1;
	public String qty4;
	public String qty4_1;
	public String qty5;
	public String qty5_1;
	public String qty6;
	public String qty6_1;
	public String qty7;
	public String qty7_1;
	public String qty8;
	public String qty8_1;
	public String qty9;
	public String qty9_1;
	public String qty10;
	public String qty10_1;
	public String qty11;
	public String qty11_1;
	public String qty12;
	public String qty12_1;
	public String qty13;
	public String qty13_1;
	public String totqty;
	public String totqty_1;

	public SS_SLS_BRSUP_2810_LCURCOMMLISTRecord(){}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public void setQty1(String qty1){
		this.qty1 = qty1;
	}

	public void setQty1_1(String qty1_1){
		this.qty1_1 = qty1_1;
	}

	public void setQty2(String qty2){
		this.qty2 = qty2;
	}

	public void setQty2_1(String qty2_1){
		this.qty2_1 = qty2_1;
	}

	public void setQty3(String qty3){
		this.qty3 = qty3;
	}

	public void setQty3_1(String qty3_1){
		this.qty3_1 = qty3_1;
	}

	public void setQty4(String qty4){
		this.qty4 = qty4;
	}

	public void setQty4_1(String qty4_1){
		this.qty4_1 = qty4_1;
	}

	public void setQty5(String qty5){
		this.qty5 = qty5;
	}

	public void setQty5_1(String qty5_1){
		this.qty5_1 = qty5_1;
	}

	public void setQty6(String qty6){
		this.qty6 = qty6;
	}

	public void setQty6_1(String qty6_1){
		this.qty6_1 = qty6_1;
	}

	public void setQty7(String qty7){
		this.qty7 = qty7;
	}

	public void setQty7_1(String qty7_1){
		this.qty7_1 = qty7_1;
	}

	public void setQty8(String qty8){
		this.qty8 = qty8;
	}

	public void setQty8_1(String qty8_1){
		this.qty8_1 = qty8_1;
	}

	public void setQty9(String qty9){
		this.qty9 = qty9;
	}

	public void setQty9_1(String qty9_1){
		this.qty9_1 = qty9_1;
	}

	public void setQty10(String qty10){
		this.qty10 = qty10;
	}

	public void setQty10_1(String qty10_1){
		this.qty10_1 = qty10_1;
	}

	public void setQty11(String qty11){
		this.qty11 = qty11;
	}

	public void setQty11_1(String qty11_1){
		this.qty11_1 = qty11_1;
	}

	public void setQty12(String qty12){
		this.qty12 = qty12;
	}

	public void setQty12_1(String qty12_1){
		this.qty12_1 = qty12_1;
	}

	public void setQty13(String qty13){
		this.qty13 = qty13;
	}

	public void setQty13_1(String qty13_1){
		this.qty13_1 = qty13_1;
	}

	public void setTotqty(String totqty){
		this.totqty = totqty;
	}

	public void setTotqty_1(String totqty_1){
		this.totqty_1 = totqty_1;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtphno(){
		return this.ptphno;
	}

	public String getQty1(){
		return this.qty1;
	}

	public String getQty1_1(){
		return this.qty1_1;
	}

	public String getQty2(){
		return this.qty2;
	}

	public String getQty2_1(){
		return this.qty2_1;
	}

	public String getQty3(){
		return this.qty3;
	}

	public String getQty3_1(){
		return this.qty3_1;
	}

	public String getQty4(){
		return this.qty4;
	}

	public String getQty4_1(){
		return this.qty4_1;
	}

	public String getQty5(){
		return this.qty5;
	}

	public String getQty5_1(){
		return this.qty5_1;
	}

	public String getQty6(){
		return this.qty6;
	}

	public String getQty6_1(){
		return this.qty6_1;
	}

	public String getQty7(){
		return this.qty7;
	}

	public String getQty7_1(){
		return this.qty7_1;
	}

	public String getQty8(){
		return this.qty8;
	}

	public String getQty8_1(){
		return this.qty8_1;
	}

	public String getQty9(){
		return this.qty9;
	}

	public String getQty9_1(){
		return this.qty9_1;
	}

	public String getQty10(){
		return this.qty10;
	}

	public String getQty10_1(){
		return this.qty10_1;
	}

	public String getQty11(){
		return this.qty11;
	}

	public String getQty11_1(){
		return this.qty11_1;
	}

	public String getQty12(){
		return this.qty12;
	}

	public String getQty12_1(){
		return this.qty12_1;
	}

	public String getQty13(){
		return this.qty13;
	}

	public String getQty13_1(){
		return this.qty13_1;
	}

	public String getTotqty(){
		return this.totqty;
	}

	public String getTotqty_1(){
		return this.totqty_1;
	}
}

/* 작성시간 : Mon May 09 10:54:04 KST 2016 */