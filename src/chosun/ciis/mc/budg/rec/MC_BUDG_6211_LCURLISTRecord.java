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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6211_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_clas_cd;
	public String budg_clas_cd_nm;
	public String groupings;
	public String mm_amt_1;
	public String mm_amt_2;
	public String mm_amt_3;
	public String mm_amt_4;
	public String mm_amt_5;
	public String mm_amt_6;
	public String mm_amt_7;
	public String mm_amt_8;
	public String mm_amt_9;
	public String mm_amt_10;
	public String mm_amt_11;
	public String mm_amt_12;
	public String amount_sum;
	public String prvyy_rslt_amt;

	public MC_BUDG_6211_LCURLISTRecord(){}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setBudg_clas_cd_nm(String budg_clas_cd_nm){
		this.budg_clas_cd_nm = budg_clas_cd_nm;
	}

	public void setGroupings(String groupings){
		this.groupings = groupings;
	}

	public void setMm_amt_1(String mm_amt_1){
		this.mm_amt_1 = mm_amt_1;
	}

	public void setMm_amt_2(String mm_amt_2){
		this.mm_amt_2 = mm_amt_2;
	}

	public void setMm_amt_3(String mm_amt_3){
		this.mm_amt_3 = mm_amt_3;
	}

	public void setMm_amt_4(String mm_amt_4){
		this.mm_amt_4 = mm_amt_4;
	}

	public void setMm_amt_5(String mm_amt_5){
		this.mm_amt_5 = mm_amt_5;
	}

	public void setMm_amt_6(String mm_amt_6){
		this.mm_amt_6 = mm_amt_6;
	}

	public void setMm_amt_7(String mm_amt_7){
		this.mm_amt_7 = mm_amt_7;
	}

	public void setMm_amt_8(String mm_amt_8){
		this.mm_amt_8 = mm_amt_8;
	}

	public void setMm_amt_9(String mm_amt_9){
		this.mm_amt_9 = mm_amt_9;
	}

	public void setMm_amt_10(String mm_amt_10){
		this.mm_amt_10 = mm_amt_10;
	}

	public void setMm_amt_11(String mm_amt_11){
		this.mm_amt_11 = mm_amt_11;
	}

	public void setMm_amt_12(String mm_amt_12){
		this.mm_amt_12 = mm_amt_12;
	}

	public void setAmount_sum(String amount_sum){
		this.amount_sum = amount_sum;
	}

	public void setPrvyy_rslt_amt(String prvyy_rslt_amt){
		this.prvyy_rslt_amt = prvyy_rslt_amt;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getBudg_clas_cd_nm(){
		return this.budg_clas_cd_nm;
	}

	public String getGroupings(){
		return this.groupings;
	}

	public String getMm_amt_1(){
		return this.mm_amt_1;
	}

	public String getMm_amt_2(){
		return this.mm_amt_2;
	}

	public String getMm_amt_3(){
		return this.mm_amt_3;
	}

	public String getMm_amt_4(){
		return this.mm_amt_4;
	}

	public String getMm_amt_5(){
		return this.mm_amt_5;
	}

	public String getMm_amt_6(){
		return this.mm_amt_6;
	}

	public String getMm_amt_7(){
		return this.mm_amt_7;
	}

	public String getMm_amt_8(){
		return this.mm_amt_8;
	}

	public String getMm_amt_9(){
		return this.mm_amt_9;
	}

	public String getMm_amt_10(){
		return this.mm_amt_10;
	}

	public String getMm_amt_11(){
		return this.mm_amt_11;
	}

	public String getMm_amt_12(){
		return this.mm_amt_12;
	}

	public String getAmount_sum(){
		return this.amount_sum;
	}

	public String getPrvyy_rslt_amt(){
		return this.prvyy_rslt_amt;
	}
}

/* 작성시간 : Mon May 25 16:40:12 KST 2009 */