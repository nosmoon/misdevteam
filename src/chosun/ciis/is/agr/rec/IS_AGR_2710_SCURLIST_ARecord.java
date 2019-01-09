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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_2710_SCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String a_purc_reg_dt;
	public String a_purc_reg_seq;
	public String a_asnt_dstc_cd;
	public String a_asnt_dstc_cd_nm;
	public String a_dlco_clsf_cd_seq;
	public String a_dlco_nm;
	public String a_purc_clsf;
	public String a_uprc;
	public String a_qunt;
	public String a_purc_amt;
	public String a_trc_yn;
	public String a_send_yn;
	public String a_remk;
	public String a_adjm_yn;
	public String a_chg_dt_tm;

	public IS_AGR_2710_SCURLIST_ARecord(){}

	public void setA_purc_reg_dt(String a_purc_reg_dt){
		this.a_purc_reg_dt = a_purc_reg_dt;
	}

	public void setA_purc_reg_seq(String a_purc_reg_seq){
		this.a_purc_reg_seq = a_purc_reg_seq;
	}

	public void setA_asnt_dstc_cd(String a_asnt_dstc_cd){
		this.a_asnt_dstc_cd = a_asnt_dstc_cd;
	}

	public void setA_asnt_dstc_cd_nm(String a_asnt_dstc_cd_nm){
		this.a_asnt_dstc_cd_nm = a_asnt_dstc_cd_nm;
	}

	public void setA_dlco_clsf_cd_seq(String a_dlco_clsf_cd_seq){
		this.a_dlco_clsf_cd_seq = a_dlco_clsf_cd_seq;
	}

	public void setA_dlco_nm(String a_dlco_nm){
		this.a_dlco_nm = a_dlco_nm;
	}

	public void setA_purc_clsf(String a_purc_clsf){
		this.a_purc_clsf = a_purc_clsf;
	}

	public void setA_uprc(String a_uprc){
		this.a_uprc = a_uprc;
	}

	public void setA_qunt(String a_qunt){
		this.a_qunt = a_qunt;
	}

	public void setA_purc_amt(String a_purc_amt){
		this.a_purc_amt = a_purc_amt;
	}

	public void setA_trc_yn(String a_trc_yn){
		this.a_trc_yn = a_trc_yn;
	}

	public void setA_send_yn(String a_send_yn){
		this.a_send_yn = a_send_yn;
	}

	public void setA_remk(String a_remk){
		this.a_remk = a_remk;
	}

	public void setA_adjm_yn(String a_adjm_yn){
		this.a_adjm_yn = a_adjm_yn;
	}

	public void setA_chg_dt_tm(String a_chg_dt_tm){
		this.a_chg_dt_tm = a_chg_dt_tm;
	}

	public String getA_purc_reg_dt(){
		return this.a_purc_reg_dt;
	}

	public String getA_purc_reg_seq(){
		return this.a_purc_reg_seq;
	}

	public String getA_asnt_dstc_cd(){
		return this.a_asnt_dstc_cd;
	}

	public String getA_asnt_dstc_cd_nm(){
		return this.a_asnt_dstc_cd_nm;
	}

	public String getA_dlco_clsf_cd_seq(){
		return this.a_dlco_clsf_cd_seq;
	}

	public String getA_dlco_nm(){
		return this.a_dlco_nm;
	}

	public String getA_purc_clsf(){
		return this.a_purc_clsf;
	}

	public String getA_uprc(){
		return this.a_uprc;
	}

	public String getA_qunt(){
		return this.a_qunt;
	}

	public String getA_purc_amt(){
		return this.a_purc_amt;
	}

	public String getA_trc_yn(){
		return this.a_trc_yn;
	}

	public String getA_send_yn(){
		return this.a_send_yn;
	}

	public String getA_remk(){
		return this.a_remk;
	}

	public String getA_adjm_yn(){
		return this.a_adjm_yn;
	}

	public String getA_chg_dt_tm(){
		return this.a_chg_dt_tm;
	}
}

/* 작성시간 : Wed Jun 06 12:22:45 KST 2012 */