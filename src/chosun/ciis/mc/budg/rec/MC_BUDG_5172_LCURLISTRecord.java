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


public class MC_BUDG_5172_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String brcd1;
	public String brnm1;
	public String brcd2;
	public String brnm2;
	public String brcd3;
	public String brnm3;
	public String medi_cd;
	public String medi_cdnm;
	public String befyy_cndt_amt;
	public String curyy_budg_amt;
	public String bemon_rate;
	public String curyy_cndt_amt;
	public String mon_rate;
	public String curyy_cndt_amt_10;
	public String curyy_cndt_amt_20;
	public String befyy_cndt_amt_10;
	public String befyy_cndt_amt_20;
	public String befyy_budg_ask_amt;
	public String curyy_budg_ask_amt;

	public MC_BUDG_5172_LCURLISTRecord(){}

	public void setBrcd1(String brcd1){
		this.brcd1 = brcd1;
	}

	public void setBrnm1(String brnm1){
		this.brnm1 = brnm1;
	}

	public void setBrcd2(String brcd2){
		this.brcd2 = brcd2;
	}

	public void setBrnm2(String brnm2){
		this.brnm2 = brnm2;
	}

	public void setBrcd3(String brcd3){
		this.brcd3 = brcd3;
	}

	public void setBrnm3(String brnm3){
		this.brnm3 = brnm3;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setBefyy_cndt_amt(String befyy_cndt_amt){
		this.befyy_cndt_amt = befyy_cndt_amt;
	}

	public void setCuryy_budg_amt(String curyy_budg_amt){
		this.curyy_budg_amt = curyy_budg_amt;
	}

	public void setBemon_rate(String bemon_rate){
		this.bemon_rate = bemon_rate;
	}

	public void setCuryy_cndt_amt(String curyy_cndt_amt){
		this.curyy_cndt_amt = curyy_cndt_amt;
	}

	public void setMon_rate(String mon_rate){
		this.mon_rate = mon_rate;
	}

	public void setCuryy_cndt_amt_10(String curyy_cndt_amt_10){
		this.curyy_cndt_amt_10 = curyy_cndt_amt_10;
	}

	public void setCuryy_cndt_amt_20(String curyy_cndt_amt_20){
		this.curyy_cndt_amt_20 = curyy_cndt_amt_20;
	}

	public void setBefyy_cndt_amt_10(String befyy_cndt_amt_10){
		this.befyy_cndt_amt_10 = befyy_cndt_amt_10;
	}

	public void setBefyy_cndt_amt_20(String befyy_cndt_amt_20){
		this.befyy_cndt_amt_20 = befyy_cndt_amt_20;
	}

	public void setBefyy_budg_ask_amt(String befyy_budg_ask_amt){
		this.befyy_budg_ask_amt = befyy_budg_ask_amt;
	}

	public void setCuryy_budg_ask_amt(String curyy_budg_ask_amt){
		this.curyy_budg_ask_amt = curyy_budg_ask_amt;
	}

	public String getBrcd1(){
		return this.brcd1;
	}

	public String getBrnm1(){
		return this.brnm1;
	}

	public String getBrcd2(){
		return this.brcd2;
	}

	public String getBrnm2(){
		return this.brnm2;
	}

	public String getBrcd3(){
		return this.brcd3;
	}

	public String getBrnm3(){
		return this.brnm3;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getBefyy_cndt_amt(){
		return this.befyy_cndt_amt;
	}

	public String getCuryy_budg_amt(){
		return this.curyy_budg_amt;
	}

	public String getBemon_rate(){
		return this.bemon_rate;
	}

	public String getCuryy_cndt_amt(){
		return this.curyy_cndt_amt;
	}

	public String getMon_rate(){
		return this.mon_rate;
	}

	public String getCuryy_cndt_amt_10(){
		return this.curyy_cndt_amt_10;
	}

	public String getCuryy_cndt_amt_20(){
		return this.curyy_cndt_amt_20;
	}

	public String getBefyy_cndt_amt_10(){
		return this.befyy_cndt_amt_10;
	}

	public String getBefyy_cndt_amt_20(){
		return this.befyy_cndt_amt_20;
	}

	public String getBefyy_budg_ask_amt(){
		return this.befyy_budg_ask_amt;
	}

	public String getCuryy_budg_ask_amt(){
		return this.curyy_budg_ask_amt;
	}
}

/* 작성시간 : Mon Feb 09 14:47:59 KST 2015 */