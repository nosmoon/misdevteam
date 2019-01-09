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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1616_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mang_chce_yn;
	public String busn_chce_yn;
	public String dhon_chce_yn;
	public String issu_pers;
	public String mtry_dt;
	public String amt;
	public String note_stat;
	public String note_no;
	public String note_clsf_nm;

	public AD_BAS_1616_SCURLISTRecord(){}

	public void setMang_chce_yn(String mang_chce_yn){
		this.mang_chce_yn = mang_chce_yn;
	}

	public void setBusn_chce_yn(String busn_chce_yn){
		this.busn_chce_yn = busn_chce_yn;
	}

	public void setDhon_chce_yn(String dhon_chce_yn){
		this.dhon_chce_yn = dhon_chce_yn;
	}

	public void setIssu_pers(String issu_pers){
		this.issu_pers = issu_pers;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public String getMang_chce_yn(){
		return this.mang_chce_yn;
	}

	public String getBusn_chce_yn(){
		return this.busn_chce_yn;
	}

	public String getDhon_chce_yn(){
		return this.dhon_chce_yn;
	}

	public String getIssu_pers(){
		return this.issu_pers;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_clsf_nm() {
		return note_clsf_nm;
	}

	public void setNote_clsf_nm(String note_clsf_nm) {
		this.note_clsf_nm = note_clsf_nm;
	}
	
	
}

/* 작성시간 : Thu Aug 27 19:11:23 KST 2009 */