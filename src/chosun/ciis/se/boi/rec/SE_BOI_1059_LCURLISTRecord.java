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


public class SE_BOI_1059_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chg_seq;
	public String chg_prv_bo_nm;
	public String chg_aft_bo_nm;
	public String incmg_pers_ip;
	public String chg_pers;
	public String chg_dt_tm; 

	public SE_BOI_1059_LCURLISTRecord(){}

	public void setChg_seq(String chg_seq){
		this.chg_seq = chg_seq;
	}

	public void setChg_prv_bo_nm(String chg_prv_bo_nm){
		this.chg_prv_bo_nm = chg_prv_bo_nm;
	}

	public void setChg_aft_bo_nm(String chg_aft_bo_nm){
		this.chg_aft_bo_nm = chg_aft_bo_nm;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getChg_seq(){
		return this.chg_seq;
	}

	public String getChg_prv_bo_nm(){
		return this.chg_prv_bo_nm;
	}

	public String getChg_aft_bo_nm(){
		return this.chg_aft_bo_nm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Sun Aug 30 17:47:47 KST 2009 */