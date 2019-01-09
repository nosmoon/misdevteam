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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_8000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String fac_clsf_nm;
	public String owh_budg_cd;
	public String budg_cdnm;
	public String be_amt;
	public String be_qunt;
	public String amt1;
	public String amt2;
	public String amt3;
	public String amt4;
	public String amt5;
	public String amt6;
	public String amt7;
	public String amt8;
	public String amt9;
	public String amt10;
	public String amt11;
	public String amt12;
	public String amt13;
	public String amt14;
	public String amt15;
	public String amt16;
	public String amt17;
	public String amt18;
	public String amt19;
	public String amt20;
	public String amt21;
	public String amt22;
	public String amt23;
	public String amt24;
	public String amt25;
	public String amt26;
	public String amt27;
	public String amt28;
	public String amt29;
	public String amt30;

	public MT_CLOSE_8000_LCURLIST2Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setBe_amt(String be_amt){
		this.be_amt = be_amt;
	}

	public void setBe_qunt(String be_qunt){
		this.be_qunt = be_qunt;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setAmt6(String amt6){
		this.amt6 = amt6;
	}

	public void setAmt7(String amt7){
		this.amt7 = amt7;
	}

	public void setAmt8(String amt8){
		this.amt8 = amt8;
	}

	public void setAmt9(String amt9){
		this.amt9 = amt9;
	}

	public void setAmt10(String amt10){
		this.amt10 = amt10;
	}

	public void setAmt11(String amt11){
		this.amt11 = amt11;
	}

	public void setAmt12(String amt12){
		this.amt12 = amt12;
	}

	public void setAmt13(String amt13){
		this.amt13 = amt13;
	}

	public void setAmt14(String amt14){
		this.amt14 = amt14;
	}

	public void setAmt15(String amt15){
		this.amt15 = amt15;
	}

	public void setAmt16(String amt16){
		this.amt16 = amt16;
	}

	public void setAmt17(String amt17){
		this.amt17 = amt17;
	}

	public void setAmt18(String amt18){
		this.amt18 = amt18;
	}

	public void setAmt19(String amt19){
		this.amt19 = amt19;
	}

	public void setAmt20(String amt20){
		this.amt20 = amt20;
	}

	public void setAmt21(String amt21){
		this.amt21 = amt21;
	}

	public void setAmt22(String amt22){
		this.amt22 = amt22;
	}

	public void setAmt23(String amt23){
		this.amt23 = amt23;
	}

	public void setAmt24(String amt24){
		this.amt24 = amt24;
	}

	public void setAmt25(String amt25){
		this.amt25 = amt25;
	}

	public void setAmt26(String amt26){
		this.amt26 = amt26;
	}

	public void setAmt27(String amt27){
		this.amt27 = amt27;
	}

	public void setAmt28(String amt28){
		this.amt28 = amt28;
	}

	public void setAmt29(String amt29){
		this.amt29 = amt29;
	}

	public void setAmt30(String amt30){
		this.amt30 = amt30;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getBe_amt(){
		return this.be_amt;
	}

	public String getBe_qunt(){
		return this.be_qunt;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getAmt6(){
		return this.amt6;
	}

	public String getAmt7(){
		return this.amt7;
	}

	public String getAmt8(){
		return this.amt8;
	}

	public String getAmt9(){
		return this.amt9;
	}

	public String getAmt10(){
		return this.amt10;
	}

	public String getAmt11(){
		return this.amt11;
	}

	public String getAmt12(){
		return this.amt12;
	}

	public String getAmt13(){
		return this.amt13;
	}

	public String getAmt14(){
		return this.amt14;
	}

	public String getAmt15(){
		return this.amt15;
	}

	public String getAmt16(){
		return this.amt16;
	}

	public String getAmt17(){
		return this.amt17;
	}

	public String getAmt18(){
		return this.amt18;
	}

	public String getAmt19(){
		return this.amt19;
	}

	public String getAmt20(){
		return this.amt20;
	}

	public String getAmt21(){
		return this.amt21;
	}

	public String getAmt22(){
		return this.amt22;
	}

	public String getAmt23(){
		return this.amt23;
	}

	public String getAmt24(){
		return this.amt24;
	}

	public String getAmt25(){
		return this.amt25;
	}

	public String getAmt26(){
		return this.amt26;
	}

	public String getAmt27(){
		return this.amt27;
	}

	public String getAmt28(){
		return this.amt28;
	}

	public String getAmt29(){
		return this.amt29;
	}

	public String getAmt30(){
		return this.amt30;
	}
}

/* 작성시간 : Thu Jul 16 10:39:13 KST 2009 */