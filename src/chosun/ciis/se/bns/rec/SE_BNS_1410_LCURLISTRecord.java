/***************************************************************************************************
* 파일명 : SE_BNS_1410_LCURLISTRecord.java
* 기능 : 판매-판촉물관리 - 판촉물발송일자관리
* 작성일자 : 2009-04-29
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.rec;

import java.sql.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.ds.*;

/**
 * 
 */


public class SE_BNS_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dt			;
	public String day			;
	public String send_yn		;
	public String medi_cd		;
	public String basi_mm		;
	public String bns_item_cd	;
	public String bns_item_nm	;
	public String divn_dt		;
	public String chg_issu_dt	;

	public SE_BNS_1410_LCURLISTRecord(){}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setDay(String day){
		this.day = day;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setBasi_mm(String basi_mm){
		this.basi_mm = basi_mm;
	}

	public void setBns_item_cd(String bns_item_cd){
		this.bns_item_cd = bns_item_cd;
	}

	public void setBns_item_nm(String bns_item_nm){
		this.bns_item_nm = bns_item_nm;
	}

	public void setDivn_dt(String divn_dt){
		this.divn_dt = divn_dt;
	}

	public void setChg_issu_dt(String chg_issu_dt){
		this.chg_issu_dt = chg_issu_dt;
	}

	public String getDt(){
		return this.dt;
	}

	public String getDay(){
		return this.day;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getBasi_mm(){
		return this.basi_mm;
	}

	public String getBns_item_cd(){
		return this.bns_item_cd;
	}

	public String getBns_item_nm(){
		return this.bns_item_nm;
	}

	public String getDivn_dt(){
		return this.divn_dt;
	}

	public String getChg_issu_dt(){
		return this.chg_issu_dt;
	}

	public String getSend_yn() {
		return send_yn;
	}

	public void setSend_yn(String send_yn) {
		this.send_yn = send_yn;
	}
}

/* 작성시간 : Wed Apr 29 10:17:03 KST 2009 */