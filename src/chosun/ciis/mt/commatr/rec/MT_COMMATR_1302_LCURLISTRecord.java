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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_1302_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String wste_yn;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String dstb_rat_cd;
	public String ewh_budg_cd_nm;
	public String owh_budg_cd_nm;

	public MT_COMMATR_1302_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setWste_yn(String wste_yn){
		this.wste_yn = wste_yn;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setEwh_budg_cd_nm(String ewh_budg_cd_nm){
		this.ewh_budg_cd_nm = ewh_budg_cd_nm;
	}

	public void setOwh_budg_cd_nm(String owh_budg_cd_nm){
		this.owh_budg_cd_nm = owh_budg_cd_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getWste_yn(){
		return this.wste_yn;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getEwh_budg_cd_nm(){
		return this.ewh_budg_cd_nm;
	}

	public String getOwh_budg_cd_nm(){
		return this.owh_budg_cd_nm;
	}
}

/* 작성시간 : Thu Jul 02 18:05:14 KST 2009 */