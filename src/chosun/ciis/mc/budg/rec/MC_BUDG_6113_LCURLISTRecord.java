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


public class MC_BUDG_6113_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String kind;
	public String clas_cd;
	public String clas_cd_code;
	public String budg_clas_cd_nm;
	public String amt_01;
	public String amt_02;
	public String amt_03;
	public String amt_04;
	public String amt_05;
	public String amt_06;
	public String amt_07;
	public String amt_08;
	public String amt_09;
	public String amt_10;
	public String amt_11;
	public String amt_12;
	public String tot_amt;
	public String pre_tot_amt;

	public MC_BUDG_6113_LCURLISTRecord(){}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setClas_cd(String clas_cd){
		this.clas_cd = clas_cd;
	}

	public void setClas_cd_code(String clas_cd_code){
		this.clas_cd_code = clas_cd_code;
	}

	public void setBudg_clas_cd_nm(String budg_clas_cd_nm){
		this.budg_clas_cd_nm = budg_clas_cd_nm;
	}

	public void setAmt_01(String amt_01){
		this.amt_01 = amt_01;
	}

	public void setAmt_02(String amt_02){
		this.amt_02 = amt_02;
	}

	public void setAmt_03(String amt_03){
		this.amt_03 = amt_03;
	}

	public void setAmt_04(String amt_04){
		this.amt_04 = amt_04;
	}

	public void setAmt_05(String amt_05){
		this.amt_05 = amt_05;
	}

	public void setAmt_06(String amt_06){
		this.amt_06 = amt_06;
	}

	public void setAmt_07(String amt_07){
		this.amt_07 = amt_07;
	}

	public void setAmt_08(String amt_08){
		this.amt_08 = amt_08;
	}

	public void setAmt_09(String amt_09){
		this.amt_09 = amt_09;
	}

	public void setAmt_10(String amt_10){
		this.amt_10 = amt_10;
	}

	public void setAmt_11(String amt_11){
		this.amt_11 = amt_11;
	}

	public void setAmt_12(String amt_12){
		this.amt_12 = amt_12;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setPre_tot_amt(String pre_tot_amt){
		this.pre_tot_amt = pre_tot_amt;
	}

	public String getKind(){
		return this.kind;
	}

	public String getClas_cd(){
		return this.clas_cd;
	}

	public String getClas_cd_code(){
		return this.clas_cd_code;
	}

	public String getBudg_clas_cd_nm(){
		return this.budg_clas_cd_nm;
	}

	public String getAmt_01(){
		return this.amt_01;
	}

	public String getAmt_02(){
		return this.amt_02;
	}

	public String getAmt_03(){
		return this.amt_03;
	}

	public String getAmt_04(){
		return this.amt_04;
	}

	public String getAmt_05(){
		return this.amt_05;
	}

	public String getAmt_06(){
		return this.amt_06;
	}

	public String getAmt_07(){
		return this.amt_07;
	}

	public String getAmt_08(){
		return this.amt_08;
	}

	public String getAmt_09(){
		return this.amt_09;
	}

	public String getAmt_10(){
		return this.amt_10;
	}

	public String getAmt_11(){
		return this.amt_11;
	}

	public String getAmt_12(){
		return this.amt_12;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getPre_tot_amt(){
		return this.pre_tot_amt;
	}
}

/* 작성시간 : Mon Apr 06 19:43:07 KST 2009 */