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


public class PR_PRTEXEC_7000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String fac_clsf;
	public String medi_cd;
	public String edt_nm;
	public String ecnt;
	public String prt_dt;
	public String advt_clr_pcnt;
	public String advt_bw_pcnt;
	public String atic_clr_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String prv_side_advt_clr_pcnt;
	public String prv_side_advt_bw_pcnt;
	public String wht_pj_qty;
	public String blk_pj_qty;
	public String sect_nm;
	public String sect_cnt;
	public String sect_pcnt;
	public String sect_clr_pcnt;
	public String sect_bw_pcnt;

	public PR_PRTEXEC_7000_LCURLISTRecord(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setEdt_nm(String edt_nm){
		this.edt_nm = edt_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setAdvt_clr_pcnt(String advt_clr_pcnt){
		this.advt_clr_pcnt = advt_clr_pcnt;
	}

	public void setAdvt_bw_pcnt(String advt_bw_pcnt){
		this.advt_bw_pcnt = advt_bw_pcnt;
	}

	public void setAtic_clr_pcnt(String atic_clr_pcnt){
		this.atic_clr_pcnt = atic_clr_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setBw_pcnt(String bw_pcnt){
		this.bw_pcnt = bw_pcnt;
	}

	public void setPrv_side_advt_clr_pcnt(String prv_side_advt_clr_pcnt){
		this.prv_side_advt_clr_pcnt = prv_side_advt_clr_pcnt;
	}

	public void setPrv_side_advt_bw_pcnt(String prv_side_advt_bw_pcnt){
		this.prv_side_advt_bw_pcnt = prv_side_advt_bw_pcnt;
	}

	public void setWht_pj_qty(String wht_pj_qty){
		this.wht_pj_qty = wht_pj_qty;
	}

	public void setBlk_pj_qty(String blk_pj_qty){
		this.blk_pj_qty = blk_pj_qty;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setSect_cnt(String sect_cnt){
		this.sect_cnt = sect_cnt;
	}

	public void setSect_pcnt(String sect_pcnt){
		this.sect_pcnt = sect_pcnt;
	}

	public void setSect_clr_pcnt(String sect_clr_pcnt){
		this.sect_clr_pcnt = sect_clr_pcnt;
	}

	public void setSect_bw_pcnt(String sect_bw_pcnt){
		this.sect_bw_pcnt = sect_bw_pcnt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getEdt_nm(){
		return this.edt_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getAdvt_clr_pcnt(){
		return this.advt_clr_pcnt;
	}

	public String getAdvt_bw_pcnt(){
		return this.advt_bw_pcnt;
	}

	public String getAtic_clr_pcnt(){
		return this.atic_clr_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getBw_pcnt(){
		return this.bw_pcnt;
	}

	public String getPrv_side_advt_clr_pcnt(){
		return this.prv_side_advt_clr_pcnt;
	}

	public String getPrv_side_advt_bw_pcnt(){
		return this.prv_side_advt_bw_pcnt;
	}

	public String getWht_pj_qty(){
		return this.wht_pj_qty;
	}

	public String getBlk_pj_qty(){
		return this.blk_pj_qty;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getSect_cnt(){
		return this.sect_cnt;
	}

	public String getSect_pcnt(){
		return this.sect_pcnt;
	}

	public String getSect_clr_pcnt(){
		return this.sect_clr_pcnt;
	}

	public String getSect_bw_pcnt(){
		return this.sect_bw_pcnt;
	}
}

/* 작성시간 : Wed May 06 15:05:29 KST 2009 */