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


public class MT_PAPINOUT_4500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String cut_err_occr_dt;
	public String fac_clsf;
	public String fac_nm;
	public String papcmpy_cd;
	public String papcmpy_nm;
	public String cut_err_tms;
	public String prt_wgt;
	public String cut_err_wgt;
	public String cut_pap;
	public String cut_pap_wgt;
	public String remk;

	public MT_PAPINOUT_4500_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCut_err_occr_dt(String cut_err_occr_dt){
		this.cut_err_occr_dt = cut_err_occr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_nm(String fac_nm){
		this.fac_nm = fac_nm;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setCut_err_tms(String cut_err_tms){
		this.cut_err_tms = cut_err_tms;
	}

	public void setPrt_wgt(String prt_wgt){
		this.prt_wgt = prt_wgt;
	}

	public void setCut_err_wgt(String cut_err_wgt){
		this.cut_err_wgt = cut_err_wgt;
	}

	public void setCut_pap(String cut_pap){
		this.cut_pap = cut_pap;
	}

	public void setCut_pap_wgt(String cut_pap_wgt){
		this.cut_pap_wgt = cut_pap_wgt;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getCut_err_occr_dt(){
		return this.cut_err_occr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_nm(){
		return this.fac_nm;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public String getCut_err_tms(){
		return this.cut_err_tms;
	}

	public String getPrt_wgt(){
		return this.prt_wgt;
	}

	public String getCut_err_wgt(){
		return this.cut_err_wgt;
	}

	public String getCut_pap(){
		return this.cut_pap;
	}

	public String getCut_pap_wgt(){
		return this.cut_pap_wgt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Apr 29 16:15:56 KST 2009 */