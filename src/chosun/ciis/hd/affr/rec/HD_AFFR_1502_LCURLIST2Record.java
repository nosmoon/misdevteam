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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_1502_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String scl_exps_clsf;
	public String qq;
	public String bgn_mmdd;
	public String end_mmdd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public HD_AFFR_1502_LCURLIST2Record(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setScl_exps_clsf(String scl_exps_clsf){
		this.scl_exps_clsf = scl_exps_clsf;
	}

	public void setQq(String qq){
		this.qq = qq;
	}

	public void setBgn_mmdd(String bgn_mmdd){
		this.bgn_mmdd = bgn_mmdd;
	}

	public void setEnd_mmdd(String end_mmdd){
		this.end_mmdd = end_mmdd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getScl_exps_clsf(){
		return this.scl_exps_clsf;
	}

	public String getQq(){
		return this.qq;
	}

	public String getBgn_mmdd(){
		return this.bgn_mmdd;
	}

	public String getEnd_mmdd(){
		return this.end_mmdd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Mar 17 10:18:14 KST 2009 */