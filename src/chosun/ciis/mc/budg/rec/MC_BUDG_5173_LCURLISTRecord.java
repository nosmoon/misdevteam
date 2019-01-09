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


public class MC_BUDG_5173_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_cdnm;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String curmm_cndt_amt_01;
	public String curmm_cndt_amt_02;
	public String curmm_cndt_amt_03;
	public String curmm_cndt_amt_04;
	public String curmm_cndt_amt_05;
	public String curmm_cndt_amt_06;
	public String curmm_cndt_amt_07;
	public String curmm_cndt_amt_08;
	public String curmm_cndt_amt_09;
	public String curmm_cndt_amt_10;
	public String curmm_cndt_amt_11;
	public String curmm_cndt_amt_12;
	public String curmm_cndt_amt_tot;

	public MC_BUDG_5173_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setCurmm_cndt_amt_01(String curmm_cndt_amt_01){
		this.curmm_cndt_amt_01 = curmm_cndt_amt_01;
	}

	public void setCurmm_cndt_amt_02(String curmm_cndt_amt_02){
		this.curmm_cndt_amt_02 = curmm_cndt_amt_02;
	}

	public void setCurmm_cndt_amt_03(String curmm_cndt_amt_03){
		this.curmm_cndt_amt_03 = curmm_cndt_amt_03;
	}

	public void setCurmm_cndt_amt_04(String curmm_cndt_amt_04){
		this.curmm_cndt_amt_04 = curmm_cndt_amt_04;
	}

	public void setCurmm_cndt_amt_05(String curmm_cndt_amt_05){
		this.curmm_cndt_amt_05 = curmm_cndt_amt_05;
	}

	public void setCurmm_cndt_amt_06(String curmm_cndt_amt_06){
		this.curmm_cndt_amt_06 = curmm_cndt_amt_06;
	}

	public void setCurmm_cndt_amt_07(String curmm_cndt_amt_07){
		this.curmm_cndt_amt_07 = curmm_cndt_amt_07;
	}

	public void setCurmm_cndt_amt_08(String curmm_cndt_amt_08){
		this.curmm_cndt_amt_08 = curmm_cndt_amt_08;
	}

	public void setCurmm_cndt_amt_09(String curmm_cndt_amt_09){
		this.curmm_cndt_amt_09 = curmm_cndt_amt_09;
	}

	public void setCurmm_cndt_amt_10(String curmm_cndt_amt_10){
		this.curmm_cndt_amt_10 = curmm_cndt_amt_10;
	}

	public void setCurmm_cndt_amt_11(String curmm_cndt_amt_11){
		this.curmm_cndt_amt_11 = curmm_cndt_amt_11;
	}

	public void setCurmm_cndt_amt_12(String curmm_cndt_amt_12){
		this.curmm_cndt_amt_12 = curmm_cndt_amt_12;
	}

	public void setCurmm_cndt_amt_tot(String curmm_cndt_amt_tot){
		this.curmm_cndt_amt_tot = curmm_cndt_amt_tot;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getCurmm_cndt_amt_01(){
		return this.curmm_cndt_amt_01;
	}

	public String getCurmm_cndt_amt_02(){
		return this.curmm_cndt_amt_02;
	}

	public String getCurmm_cndt_amt_03(){
		return this.curmm_cndt_amt_03;
	}

	public String getCurmm_cndt_amt_04(){
		return this.curmm_cndt_amt_04;
	}

	public String getCurmm_cndt_amt_05(){
		return this.curmm_cndt_amt_05;
	}

	public String getCurmm_cndt_amt_06(){
		return this.curmm_cndt_amt_06;
	}

	public String getCurmm_cndt_amt_07(){
		return this.curmm_cndt_amt_07;
	}

	public String getCurmm_cndt_amt_08(){
		return this.curmm_cndt_amt_08;
	}

	public String getCurmm_cndt_amt_09(){
		return this.curmm_cndt_amt_09;
	}

	public String getCurmm_cndt_amt_10(){
		return this.curmm_cndt_amt_10;
	}

	public String getCurmm_cndt_amt_11(){
		return this.curmm_cndt_amt_11;
	}

	public String getCurmm_cndt_amt_12(){
		return this.curmm_cndt_amt_12;
	}

	public String getCurmm_cndt_amt_tot(){
		return this.curmm_cndt_amt_tot;
	}
}

/* 작성시간 : Wed May 24 14:28:52 KST 2017 */