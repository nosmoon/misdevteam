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


public class MT_PAPINOUT_4301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String cut_err_occr_dt;
	public String fac_clsf;
	public String papcmpy_cd;
	public String cut_err_tms;
	public String cut_err_point;
	public String cut_err_caus_prd;
	public String cut_err_caus_midl;
	public String cut_err_caus_plac;
	public String clos_clsf;
	public String remk;

	public MT_PAPINOUT_4301_LCURLISTRecord(){}

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

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setCut_err_tms(String cut_err_tms){
		this.cut_err_tms = cut_err_tms;
	}

	public void setCut_err_point(String cut_err_point){
		this.cut_err_point = cut_err_point;
	}

	public void setCut_err_caus_prd(String cut_err_caus_prd){
		this.cut_err_caus_prd = cut_err_caus_prd;
	}

	public void setCut_err_caus_midl(String cut_err_caus_midl){
		this.cut_err_caus_midl = cut_err_caus_midl;
	}

	public void setCut_err_caus_plac(String cut_err_caus_plac){
		this.cut_err_caus_plac = cut_err_caus_plac;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
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

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getCut_err_tms(){
		return this.cut_err_tms;
	}

	public String getCut_err_point(){
		return this.cut_err_point;
	}

	public String getCut_err_caus_prd(){
		return this.cut_err_caus_prd;
	}

	public String getCut_err_caus_midl(){
		return this.cut_err_caus_midl;
	}

	public String getCut_err_caus_plac(){
		return this.cut_err_caus_plac;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Apr 27 16:19:07 KST 2009 */