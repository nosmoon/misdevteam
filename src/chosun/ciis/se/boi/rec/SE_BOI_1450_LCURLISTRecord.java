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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1450_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String chg_prv_area_cd;
	public String chg_prv_srt_seq;
	public String chg_prv_area_nm;
	public String chrg_nm1;
	public String chrg_nm2;
	public String chrg_nm3;
	public String chg_aft_area_cd;
	public String chg_aft_srt_seq;
	public String chg_aft_area_nm;

	public SE_BOI_1450_LCURLISTRecord(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setChg_prv_area_cd(String chg_prv_area_cd){
		this.chg_prv_area_cd = chg_prv_area_cd;
	}

	public void setChg_prv_srt_seq(String chg_prv_srt_seq){
		this.chg_prv_srt_seq = chg_prv_srt_seq;
	}

	public void setChg_prv_area_nm(String chg_prv_area_nm){
		this.chg_prv_area_nm = chg_prv_area_nm;
	}

	public void setChrg_nm1(String chrg_nm1){
		this.chrg_nm1 = chrg_nm1;
	}

	public void setChrg_nm2(String chrg_nm2){
		this.chrg_nm2 = chrg_nm2;
	}

	public void setChrg_nm3(String chrg_nm3){
		this.chrg_nm3 = chrg_nm3;
	}

	public void setChg_aft_area_cd(String chg_aft_area_cd){
		this.chg_aft_area_cd = chg_aft_area_cd;
	}

	public void setChg_aft_srt_seq(String chg_aft_srt_seq){
		this.chg_aft_srt_seq = chg_aft_srt_seq;
	}

	public void setChg_aft_area_nm(String chg_aft_area_nm){
		this.chg_aft_area_nm = chg_aft_area_nm;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getChg_prv_area_cd(){
		return this.chg_prv_area_cd;
	}

	public String getChg_prv_srt_seq(){
		return this.chg_prv_srt_seq;
	}

	public String getChg_prv_area_nm(){
		return this.chg_prv_area_nm;
	}

	public String getChrg_nm1(){
		return this.chrg_nm1;
	}

	public String getChrg_nm2(){
		return this.chrg_nm2;
	}

	public String getChrg_nm3(){
		return this.chrg_nm3;
	}

	public String getChg_aft_area_cd(){
		return this.chg_aft_area_cd;
	}

	public String getChg_aft_srt_seq(){
		return this.chg_aft_srt_seq;
	}

	public String getChg_aft_area_nm(){
		return this.chg_aft_area_nm;
	}
}

/* 작성시간 : Thu Feb 05 13:13:55 KST 2009 */