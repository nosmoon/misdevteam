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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ndduc_year;
	public String ndduc_prd_clsf_nm;
	public String remk;
	public String incmg_dt_tm;
	public String incmg_pers_nm;
	public String ndduc_prd_clsf;
	public String chg_clsf;
	public String occr_dt;
	public String occr_seq;

	public AS_ASET_1401_LCURLISTRecord(){}

	public void setNdduc_year(String ndduc_year){
		this.ndduc_year = ndduc_year;
	}

	public void setNdduc_prd_clsf_nm(String ndduc_prd_clsf_nm){
		this.ndduc_prd_clsf_nm = ndduc_prd_clsf_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers_nm(String incmg_pers_nm){
		this.incmg_pers_nm = incmg_pers_nm;
	}

	public void setNdduc_prd_clsf(String ndduc_prd_clsf){
		this.ndduc_prd_clsf = ndduc_prd_clsf;
	}

	public void setChg_clsf(String chg_clsf){
		this.chg_clsf = chg_clsf;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public String getNdduc_year(){
		return this.ndduc_year;
	}

	public String getNdduc_prd_clsf_nm(){
		return this.ndduc_prd_clsf_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers_nm(){
		return this.incmg_pers_nm;
	}

	public String getNdduc_prd_clsf(){
		return this.ndduc_prd_clsf;
	}

	public String getChg_clsf(){
		return this.chg_clsf;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}
}

/* 작성시간 : Mon Mar 16 17:58:43 KST 2009 */