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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_5012_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String issu_pcnt;
	public String clr_pcnt;
	public String slip_qty;
	public String gnr_qty;
	public String spsl_qty;
	public String gnr_add_qty;
	public String spsl_add_qty;

	public PR_PRTEXEC_5012_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setGnr_qty(String gnr_qty){
		this.gnr_qty = gnr_qty;
	}

	public void setSpsl_qty(String spsl_qty){
		this.spsl_qty = spsl_qty;
	}

	public void setGnr_add_qty(String gnr_add_qty){
		this.gnr_add_qty = gnr_add_qty;
	}

	public void setSpsl_add_qty(String spsl_add_qty){
		this.spsl_add_qty = spsl_add_qty;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getGnr_qty(){
		return this.gnr_qty;
	}

	public String getSpsl_qty(){
		return this.spsl_qty;
	}

	public String getGnr_add_qty(){
		return this.gnr_add_qty;
	}

	public String getSpsl_add_qty(){
		return this.spsl_add_qty;
	}
}

/* 작성시간 : Wed Sep 09 02:06:23 KST 2009 */