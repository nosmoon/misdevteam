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


public class MC_BUDG_6132_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_clas_cd;
	public String budg_clas_cdnm;
	public String bf_sumamt;
	public String af_sumamt;
	public String diff_amt;
	public String bf_amt1;
	public String af_amt1;
	public String bf_amt2;
	public String af_amt2;
	public String bf_amt3;
	public String af_amt3;
	public String bf_amt4;
	public String af_amt4;
	public String bf_amt5;
	public String af_amt5;
	public String bf_amt6;
	public String af_amt6;
	public String bf_amt7;
	public String af_amt7;
	public String bf_amt8;
	public String af_amt8;
	public String bf_amt9;
	public String af_amt9;
	public String bf_amt10;
	public String af_amt10;
	public String bf_amt11;
	public String af_amt11;
	public String bf_amt12;
	public String af_amt12;

	public MC_BUDG_6132_LCURLISTRecord(){}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setBudg_clas_cdnm(String budg_clas_cdnm){
		this.budg_clas_cdnm = budg_clas_cdnm;
	}

	public void setBf_sumamt(String bf_sumamt){
		this.bf_sumamt = bf_sumamt;
	}

	public void setAf_sumamt(String af_sumamt){
		this.af_sumamt = af_sumamt;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setBf_amt1(String bf_amt1){
		this.bf_amt1 = bf_amt1;
	}

	public void setAf_amt1(String af_amt1){
		this.af_amt1 = af_amt1;
	}

	public void setBf_amt2(String bf_amt2){
		this.bf_amt2 = bf_amt2;
	}

	public void setAf_amt2(String af_amt2){
		this.af_amt2 = af_amt2;
	}

	public void setBf_amt3(String bf_amt3){
		this.bf_amt3 = bf_amt3;
	}

	public void setAf_amt3(String af_amt3){
		this.af_amt3 = af_amt3;
	}

	public void setBf_amt4(String bf_amt4){
		this.bf_amt4 = bf_amt4;
	}

	public void setAf_amt4(String af_amt4){
		this.af_amt4 = af_amt4;
	}

	public void setBf_amt5(String bf_amt5){
		this.bf_amt5 = bf_amt5;
	}

	public void setAf_amt5(String af_amt5){
		this.af_amt5 = af_amt5;
	}

	public void setBf_amt6(String bf_amt6){
		this.bf_amt6 = bf_amt6;
	}

	public void setAf_amt6(String af_amt6){
		this.af_amt6 = af_amt6;
	}

	public void setBf_amt7(String bf_amt7){
		this.bf_amt7 = bf_amt7;
	}

	public void setAf_amt7(String af_amt7){
		this.af_amt7 = af_amt7;
	}

	public void setBf_amt8(String bf_amt8){
		this.bf_amt8 = bf_amt8;
	}

	public void setAf_amt8(String af_amt8){
		this.af_amt8 = af_amt8;
	}

	public void setBf_amt9(String bf_amt9){
		this.bf_amt9 = bf_amt9;
	}

	public void setAf_amt9(String af_amt9){
		this.af_amt9 = af_amt9;
	}

	public void setBf_amt10(String bf_amt10){
		this.bf_amt10 = bf_amt10;
	}

	public void setAf_amt10(String af_amt10){
		this.af_amt10 = af_amt10;
	}

	public void setBf_amt11(String bf_amt11){
		this.bf_amt11 = bf_amt11;
	}

	public void setAf_amt11(String af_amt11){
		this.af_amt11 = af_amt11;
	}

	public void setBf_amt12(String bf_amt12){
		this.bf_amt12 = bf_amt12;
	}

	public void setAf_amt12(String af_amt12){
		this.af_amt12 = af_amt12;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getBudg_clas_cdnm(){
		return this.budg_clas_cdnm;
	}

	public String getBf_sumamt(){
		return this.bf_sumamt;
	}

	public String getAf_sumamt(){
		return this.af_sumamt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getBf_amt1(){
		return this.bf_amt1;
	}

	public String getAf_amt1(){
		return this.af_amt1;
	}

	public String getBf_amt2(){
		return this.bf_amt2;
	}

	public String getAf_amt2(){
		return this.af_amt2;
	}

	public String getBf_amt3(){
		return this.bf_amt3;
	}

	public String getAf_amt3(){
		return this.af_amt3;
	}

	public String getBf_amt4(){
		return this.bf_amt4;
	}

	public String getAf_amt4(){
		return this.af_amt4;
	}

	public String getBf_amt5(){
		return this.bf_amt5;
	}

	public String getAf_amt5(){
		return this.af_amt5;
	}

	public String getBf_amt6(){
		return this.bf_amt6;
	}

	public String getAf_amt6(){
		return this.af_amt6;
	}

	public String getBf_amt7(){
		return this.bf_amt7;
	}

	public String getAf_amt7(){
		return this.af_amt7;
	}

	public String getBf_amt8(){
		return this.bf_amt8;
	}

	public String getAf_amt8(){
		return this.af_amt8;
	}

	public String getBf_amt9(){
		return this.bf_amt9;
	}

	public String getAf_amt9(){
		return this.af_amt9;
	}

	public String getBf_amt10(){
		return this.bf_amt10;
	}

	public String getAf_amt10(){
		return this.af_amt10;
	}

	public String getBf_amt11(){
		return this.bf_amt11;
	}

	public String getAf_amt11(){
		return this.af_amt11;
	}

	public String getBf_amt12(){
		return this.bf_amt12;
	}

	public String getAf_amt12(){
		return this.af_amt12;
	}
}

/* 작성시간 : Fri Aug 14 11:45:32 KST 2009 */