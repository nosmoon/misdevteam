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


public class MT_CLOSE_7004_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String dstb_rat_cd;
	public String matr_cd;
	public String matr_nm;
	public String be_qunt;
	public String be_amt;
	public String qunt1;
	public String amt1;
	public String qunt2;
	public String amt2;
	public String qunt3;
	public String amt3;
	public String qunt4;
	public String amt4;
	public String qunt5;
	public String amt5;
	public String qunt6;
	public String amt6;
	public String qunt7;
	public String amt7;
	public String qunt8;
	public String amt8;
	public String qunt9;
	public String amt9;
	public String qunt10;
	public String amt10;
	public String qunt11;
	public String amt11;
	public String qunt12;
	public String amt12;
	public String qunt13;
	public String amt13;
	public String qunt14;
	public String amt14;
	public String qunt15;
	public String amt15;
	public String qunt16;
	public String amt16;
	public String qunt17;
	public String amt17;
	public String qunt18;
	public String amt18;
	public String qunt19;
	public String amt19;
	public String qunt20;
	public String amt20;

	public MT_CLOSE_7004_LCURLIST2Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setBe_qunt(String be_qunt){
		this.be_qunt = be_qunt;
	}

	public void setBe_amt(String be_amt){
		this.be_amt = be_amt;
	}

	public void setQunt1(String qunt1){
		this.qunt1 = qunt1;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setQunt2(String qunt2){
		this.qunt2 = qunt2;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setQunt3(String qunt3){
		this.qunt3 = qunt3;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setQunt4(String qunt4){
		this.qunt4 = qunt4;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setQunt5(String qunt5){
		this.qunt5 = qunt5;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setQunt6(String qunt6){
		this.qunt6 = qunt6;
	}

	public void setAmt6(String amt6){
		this.amt6 = amt6;
	}

	public void setQunt7(String qunt7){
		this.qunt7 = qunt7;
	}

	public void setAmt7(String amt7){
		this.amt7 = amt7;
	}

	public void setQunt8(String qunt8){
		this.qunt8 = qunt8;
	}

	public void setAmt8(String amt8){
		this.amt8 = amt8;
	}

	public void setQunt9(String qunt9){
		this.qunt9 = qunt9;
	}

	public void setAmt9(String amt9){
		this.amt9 = amt9;
	}

	public void setQunt10(String qunt10){
		this.qunt10 = qunt10;
	}

	public void setAmt10(String amt10){
		this.amt10 = amt10;
	}

	public void setQunt11(String qunt11){
		this.qunt11 = qunt11;
	}

	public void setAmt11(String amt11){
		this.amt11 = amt11;
	}

	public void setQunt12(String qunt12){
		this.qunt12 = qunt12;
	}

	public void setAmt12(String amt12){
		this.amt12 = amt12;
	}

	public void setQunt13(String qunt13){
		this.qunt13 = qunt13;
	}

	public void setAmt13(String amt13){
		this.amt13 = amt13;
	}

	public void setQunt14(String qunt14){
		this.qunt14 = qunt14;
	}

	public void setAmt14(String amt14){
		this.amt14 = amt14;
	}

	public void setQunt15(String qunt15){
		this.qunt15 = qunt15;
	}

	public void setAmt15(String amt15){
		this.amt15 = amt15;
	}

	public void setQunt16(String qunt16){
		this.qunt16 = qunt16;
	}

	public void setAmt16(String amt16){
		this.amt16 = amt16;
	}

	public void setQunt17(String qunt17){
		this.qunt17 = qunt17;
	}

	public void setAmt17(String amt17){
		this.amt17 = amt17;
	}

	public void setQunt18(String qunt18){
		this.qunt18 = qunt18;
	}

	public void setAmt18(String amt18){
		this.amt18 = amt18;
	}

	public void setQunt19(String qunt19){
		this.qunt19 = qunt19;
	}

	public void setAmt19(String amt19){
		this.amt19 = amt19;
	}

	public void setQunt20(String qunt20){
		this.qunt20 = qunt20;
	}

	public void setAmt20(String amt20){
		this.amt20 = amt20;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getBe_qunt(){
		return this.be_qunt;
	}

	public String getBe_amt(){
		return this.be_amt;
	}

	public String getQunt1(){
		return this.qunt1;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getQunt2(){
		return this.qunt2;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getQunt3(){
		return this.qunt3;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getQunt4(){
		return this.qunt4;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getQunt5(){
		return this.qunt5;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getQunt6(){
		return this.qunt6;
	}

	public String getAmt6(){
		return this.amt6;
	}

	public String getQunt7(){
		return this.qunt7;
	}

	public String getAmt7(){
		return this.amt7;
	}

	public String getQunt8(){
		return this.qunt8;
	}

	public String getAmt8(){
		return this.amt8;
	}

	public String getQunt9(){
		return this.qunt9;
	}

	public String getAmt9(){
		return this.amt9;
	}

	public String getQunt10(){
		return this.qunt10;
	}

	public String getAmt10(){
		return this.amt10;
	}

	public String getQunt11(){
		return this.qunt11;
	}

	public String getAmt11(){
		return this.amt11;
	}

	public String getQunt12(){
		return this.qunt12;
	}

	public String getAmt12(){
		return this.amt12;
	}

	public String getQunt13(){
		return this.qunt13;
	}

	public String getAmt13(){
		return this.amt13;
	}

	public String getQunt14(){
		return this.qunt14;
	}

	public String getAmt14(){
		return this.amt14;
	}

	public String getQunt15(){
		return this.qunt15;
	}

	public String getAmt15(){
		return this.amt15;
	}

	public String getQunt16(){
		return this.qunt16;
	}

	public String getAmt16(){
		return this.amt16;
	}

	public String getQunt17(){
		return this.qunt17;
	}

	public String getAmt17(){
		return this.amt17;
	}

	public String getQunt18(){
		return this.qunt18;
	}

	public String getAmt18(){
		return this.amt18;
	}

	public String getQunt19(){
		return this.qunt19;
	}

	public String getAmt19(){
		return this.amt19;
	}

	public String getQunt20(){
		return this.qunt20;
	}

	public String getAmt20(){
		return this.amt20;
	}
}

/* 작성시간 : Wed Jul 15 13:52:30 KST 2009 */