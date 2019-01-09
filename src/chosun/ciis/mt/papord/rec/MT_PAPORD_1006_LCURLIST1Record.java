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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_1006_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String matr_cd;
	public String roll_wgt;
	public String matr_nm;
	public String std_ewh_roll_cnt;
	public String std_ewh_wgt;

	public MT_PAPORD_1006_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_wgt(String roll_wgt){
		this.roll_wgt = roll_wgt;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setStd_ewh_roll_cnt(String std_ewh_roll_cnt){
		this.std_ewh_roll_cnt = std_ewh_roll_cnt;
	}

	public void setStd_ewh_wgt(String std_ewh_wgt){
		this.std_ewh_wgt = std_ewh_wgt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_wgt(){
		return this.roll_wgt;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getStd_ewh_roll_cnt(){
		return this.std_ewh_roll_cnt;
	}

	public String getStd_ewh_wgt(){
		return this.std_ewh_wgt;
	}
}

/* 작성시간 : Mon Jul 13 23:53:13 KST 2009 */