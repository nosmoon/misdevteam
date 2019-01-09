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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3006_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String paper_loca_clsf;
	public String papcmpy_cd;
	public String a_rem_qunt_cnt;
	public String a_rem_qunt_wgt;
	public String a_un_use_roll_cnt;
	public String a_roll_wgt;
	public String b_rem_qunt_cnt;
	public String b_rem_qunt_wgt;
	public String b_un_use_roll_cnt;
	public String b_roll_wgt;
	public String c_rem_qunt_cnt;
	public String c_rem_qunt_wgt;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String c_un_use_roll_cnt;
	public String c_roll_wgt;

	public MT_PRNPAP_3006_LCURLIST1Record(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPaper_loca_clsf(String paper_loca_clsf){
		this.paper_loca_clsf = paper_loca_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setA_rem_qunt_cnt(String a_rem_qunt_cnt){
		this.a_rem_qunt_cnt = a_rem_qunt_cnt;
	}

	public void setA_rem_qunt_wgt(String a_rem_qunt_wgt){
		this.a_rem_qunt_wgt = a_rem_qunt_wgt;
	}

	public void setA_un_use_roll_cnt(String a_un_use_roll_cnt){
		this.a_un_use_roll_cnt = a_un_use_roll_cnt;
	}

	public void setA_roll_wgt(String a_roll_wgt){
		this.a_roll_wgt = a_roll_wgt;
	}

	public void setB_rem_qunt_cnt(String b_rem_qunt_cnt){
		this.b_rem_qunt_cnt = b_rem_qunt_cnt;
	}

	public void setB_rem_qunt_wgt(String b_rem_qunt_wgt){
		this.b_rem_qunt_wgt = b_rem_qunt_wgt;
	}

	public void setB_un_use_roll_cnt(String b_un_use_roll_cnt){
		this.b_un_use_roll_cnt = b_un_use_roll_cnt;
	}

	public void setB_roll_wgt(String b_roll_wgt){
		this.b_roll_wgt = b_roll_wgt;
	}

	public void setC_rem_qunt_cnt(String c_rem_qunt_cnt){
		this.c_rem_qunt_cnt = c_rem_qunt_cnt;
	}

	public void setC_rem_qunt_wgt(String c_rem_qunt_wgt){
		this.c_rem_qunt_wgt = c_rem_qunt_wgt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setC_un_use_roll_cnt(String c_un_use_roll_cnt){
		this.c_un_use_roll_cnt = c_un_use_roll_cnt;
	}

	public void setC_roll_wgt(String c_roll_wgt){
		this.c_roll_wgt = c_roll_wgt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPaper_loca_clsf(){
		return this.paper_loca_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getA_rem_qunt_cnt(){
		return this.a_rem_qunt_cnt;
	}

	public String getA_rem_qunt_wgt(){
		return this.a_rem_qunt_wgt;
	}

	public String getA_un_use_roll_cnt(){
		return this.a_un_use_roll_cnt;
	}

	public String getA_roll_wgt(){
		return this.a_roll_wgt;
	}

	public String getB_rem_qunt_cnt(){
		return this.b_rem_qunt_cnt;
	}

	public String getB_rem_qunt_wgt(){
		return this.b_rem_qunt_wgt;
	}

	public String getB_un_use_roll_cnt(){
		return this.b_un_use_roll_cnt;
	}

	public String getB_roll_wgt(){
		return this.b_roll_wgt;
	}

	public String getC_rem_qunt_cnt(){
		return this.c_rem_qunt_cnt;
	}

	public String getC_rem_qunt_wgt(){
		return this.c_rem_qunt_wgt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getC_un_use_roll_cnt(){
		return this.c_un_use_roll_cnt;
	}

	public String getC_roll_wgt(){
		return this.c_roll_wgt;
	}
}

/* 작성시간 : Sat Aug 29 21:52:45 KST 2009 */