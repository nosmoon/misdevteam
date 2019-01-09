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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String owh_dt;
	public String factcdnm;
	public String matr_cd;
	public String owh_uprc;
	public String owh_roll;
	public String owh_wgt;
	public String owh_amt;
	public String mov_factcdnm;

	public MT_PAPINOUT_2601_LCURLISTRecord(){}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setFactcdnm(String factcdnm){
		this.factcdnm = factcdnm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setOwh_uprc(String owh_uprc){
		this.owh_uprc = owh_uprc;
	}

	public void setOwh_roll(String owh_roll){
		this.owh_roll = owh_roll;
	}

	public void setOwh_wgt(String owh_wgt){
		this.owh_wgt = owh_wgt;
	}

	public void setOwh_amt(String owh_amt){
		this.owh_amt = owh_amt;
	}

	public void setMov_factcdnm(String mov_factcdnm){
		this.mov_factcdnm = mov_factcdnm;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getFactcdnm(){
		return this.factcdnm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getOwh_uprc(){
		return this.owh_uprc;
	}

	public String getOwh_roll(){
		return this.owh_roll;
	}

	public String getOwh_wgt(){
		return this.owh_wgt;
	}

	public String getOwh_amt(){
		return this.owh_amt;
	}

	public String getMov_factcdnm(){
		return this.mov_factcdnm;
	}
}

/* 작성시간 : Sat Apr 25 12:31:53 KST 2009 */