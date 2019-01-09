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


package chosun.ciis.mt.submatrstok.rec;

import java.sql.*;
import chosun.ciis.mt.submatrstok.dm.*;
import chosun.ciis.mt.submatrstok.ds.*;

/**
 * 
 */


public class MT_SUBMATRSTOK_1110_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String sect_cd;
	public String sect_nm;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String slip_qty;
	public String prt_bgn_tm;        
	public String prt_end_tm;       
	public String real_prt_qty;    
	public String err_tms;        

	public MT_SUBMATRSTOK_1110_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setReal_prt_qty(String real_prt_qty){
		this.real_prt_qty = real_prt_qty;
	}

	public void setErr_tms(String err_tms){
		this.err_tms = err_tms;
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

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getReal_prt_qty(){
		return this.real_prt_qty;
	}

	public String getErr_tms(){
		return this.err_tms;
	}

}

/* 작성시간 : Fri May 03 15:52:38 KST 2013 */