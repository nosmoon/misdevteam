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


public class MC_BUDG_5151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String a_ycbrcd;
	public String brcdnm;
	public String budg_yymm;
	public String fix_asin_amt;
	public String budg_cndt_amt;
	public String camt;
	public String brcd1;
	public String brnm1;
	public String brcd2;
	public String brnm2;
	public String brcd3;
	public String brnm3;
	public String brcd4;
	public String brnm4;
	public String bfe_budg_cndt_amt;

	public MC_BUDG_5151_LCURLISTRecord(){}

	public void setA_ycbrcd(String a_ycbrcd){
		this.a_ycbrcd = a_ycbrcd;
	}

	public void setBrcdnm(String brcdnm){
		this.brcdnm = brcdnm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setCamt(String camt){
		this.camt = camt;
	}

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

	public void setBrcd4(String brcd4){
		this.brcd4 = brcd4;
	}

	public void setBrnm4(String brnm4){
		this.brnm4 = brnm4;
	}

	public void setBfe_budg_cndt_amt(String bfe_budg_cndt_amt){
		this.bfe_budg_cndt_amt = bfe_budg_cndt_amt;
	}

	public String getA_ycbrcd(){
		return this.a_ycbrcd;
	}

	public String getBrcdnm(){
		return this.brcdnm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getCamt(){
		return this.camt;
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

	public String getBrcd4(){
		return this.brcd4;
	}

	public String getBrnm4(){
		return this.brnm4;
	}

	public String getBfe_budg_cndt_amt(){
		return this.bfe_budg_cndt_amt;
	}
}

/* 작성시간 : Mon Jun 18 18:32:49 KST 2018 */