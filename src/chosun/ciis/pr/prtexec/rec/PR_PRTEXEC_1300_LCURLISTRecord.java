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


public class PR_PRTEXEC_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String aply_dt;
	public String medi_cd;
	public String medi_cd_nm;
	public String sect_cd;
	public String sect_cd_nm;
	public String ecnt;
	public String issu_pcnt;
	public String clr_pcnt;
	public String off_plat_tm;
	public String clr_off_plat_tm;
	public String trsm_end_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String prt_qty;

	public PR_PRTEXEC_1300_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_cd_nm(String sect_cd_nm){
		this.sect_cd_nm = sect_cd_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setOff_plat_tm(String off_plat_tm){
		this.off_plat_tm = off_plat_tm;
	}

	public void setClr_off_plat_tm(String clr_off_plat_tm){
		this.clr_off_plat_tm = clr_off_plat_tm;
	}

	public void setTrsm_end_tm(String trsm_end_tm){
		this.trsm_end_tm = trsm_end_tm;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
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

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_cd_nm(){
		return this.sect_cd_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getOff_plat_tm(){
		return this.off_plat_tm;
	}

	public String getClr_off_plat_tm(){
		return this.clr_off_plat_tm;
	}

	public String getTrsm_end_tm(){
		return this.trsm_end_tm;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getPrt_qty(){
		return this.prt_qty;
	}
}

/* 작성시간 : Thu May 21 18:42:23 KST 2009 */