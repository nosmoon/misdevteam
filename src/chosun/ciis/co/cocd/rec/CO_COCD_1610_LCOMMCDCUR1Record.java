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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_1610_LCOMMCDCUR1Record extends java.lang.Object implements java.io.Serializable{

	public String pgm_id;
	public String pgm_nm;
	public String pgm_onm;
	public String pgm_clf2;
	public String pgm_clf2_nm;
	public String medi_cd;
	public String use_yn;
	public String prd_co_cd;
	public String prd_co_nm;
	public String prd_ym;
	public String rmsg_dt_tm;
	public String mod_dt;

	public CO_COCD_1610_LCOMMCDCUR1Record(){}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_onm(String pgm_onm){
		this.pgm_onm = pgm_onm;
	}

	public void setPgm_clf2(String pgm_clf2){
		this.pgm_clf2 = pgm_clf2;
	}

	public void setPgm_clf2_nm(String pgm_clf2_nm){
		this.pgm_clf2_nm = pgm_clf2_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setPrd_co_cd(String prd_co_cd){
		this.prd_co_cd = prd_co_cd;
	}

	public void setPrd_co_nm(String prd_co_nm){
		this.prd_co_nm = prd_co_nm;
	}

	public void setPrd_ym(String prd_ym){
		this.prd_ym = prd_ym;
	}

	public void setRmsg_dt_tm(String rmsg_dt_tm){
		this.rmsg_dt_tm = rmsg_dt_tm;
	}

	public void setMod_dt(String mod_dt){
		this.mod_dt = mod_dt;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_onm(){
		return this.pgm_onm;
	}

	public String getPgm_clf2(){
		return this.pgm_clf2;
	}

	public String getPgm_clf2_nm(){
		return this.pgm_clf2_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getPrd_co_cd(){
		return this.prd_co_cd;
	}

	public String getPrd_co_nm(){
		return this.prd_co_nm;
	}

	public String getPrd_ym(){
		return this.prd_ym;
	}

	public String getRmsg_dt_tm(){
		return this.rmsg_dt_tm;
	}

	public String getMod_dt(){
		return this.mod_dt;
	}
}

/* 작성시간 : Mon Jan 16 18:51:58 KST 2012 */