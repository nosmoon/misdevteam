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


public class MT_PRNPAP_3300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String papcmpy_cd;
	public String rot_mach_no;
	public String sett_no;
	public String sett_seq;
	public String a_cmcnt_val_cnt;
	public String a_wgt;
	public String a_un_use_yn;
	public String b_cmcnt_val_cnt;
	public String b_wgt;
	public String b_un_use_yn;
	public String c_cmcnt_val_cnt;
	public String c_wgt;
	public String c_un_use_yn;
	public String occr_dt;
	public String seq;
	public String issu_dt;

	public MT_PRNPAP_3300_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setRot_mach_no(String rot_mach_no){
		this.rot_mach_no = rot_mach_no;
	}

	public void setSett_no(String sett_no){
		this.sett_no = sett_no;
	}

	public void setSett_seq(String sett_seq){
		this.sett_seq = sett_seq;
	}

	public void setA_cmcnt_val_cnt(String a_cmcnt_val_cnt){
		this.a_cmcnt_val_cnt = a_cmcnt_val_cnt;
	}

	public void setA_wgt(String a_wgt){
		this.a_wgt = a_wgt;
	}

	public void setA_un_use_yn(String a_un_use_yn){
		this.a_un_use_yn = a_un_use_yn;
	}

	public void setB_cmcnt_val_cnt(String b_cmcnt_val_cnt){
		this.b_cmcnt_val_cnt = b_cmcnt_val_cnt;
	}

	public void setB_wgt(String b_wgt){
		this.b_wgt = b_wgt;
	}

	public void setB_un_use_yn(String b_un_use_yn){
		this.b_un_use_yn = b_un_use_yn;
	}

	public void setC_cmcnt_val_cnt(String c_cmcnt_val_cnt){
		this.c_cmcnt_val_cnt = c_cmcnt_val_cnt;
	}

	public void setC_wgt(String c_wgt){
		this.c_wgt = c_wgt;
	}

	public void setC_un_use_yn(String c_un_use_yn){
		this.c_un_use_yn = c_un_use_yn;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getRot_mach_no(){
		return this.rot_mach_no;
	}

	public String getSett_no(){
		return this.sett_no;
	}

	public String getSett_seq(){
		return this.sett_seq;
	}

	public String getA_cmcnt_val_cnt(){
		return this.a_cmcnt_val_cnt;
	}

	public String getA_wgt(){
		return this.a_wgt;
	}

	public String getA_un_use_yn(){
		return this.a_un_use_yn;
	}

	public String getB_cmcnt_val_cnt(){
		return this.b_cmcnt_val_cnt;
	}

	public String getB_wgt(){
		return this.b_wgt;
	}

	public String getB_un_use_yn(){
		return this.b_un_use_yn;
	}

	public String getC_cmcnt_val_cnt(){
		return this.c_cmcnt_val_cnt;
	}

	public String getC_wgt(){
		return this.c_wgt;
	}

	public String getC_un_use_yn(){
		return this.c_un_use_yn;
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
}

/* 작성시간 : Tue Jun 23 16:54:16 KST 2009 */