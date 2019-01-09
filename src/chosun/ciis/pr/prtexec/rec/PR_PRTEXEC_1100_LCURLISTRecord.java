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


public class PR_PRTEXEC_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prt_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String ecnt;
	public String seq;
	public String new_yn;
	public String clr_off_plat_tm;
	public String trsm_end_tm;
	public String off_plat_end_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String slip_qty;
	public String real_prt_qty;
	public String bad_nwsp_qty;
	public String card_qty;
	public String dqty;
	public String dt_tm_stop_tms;
	public String fail_tms;
	public String apcut_err_tms;
	public String driv_susp_prgr_tms;
	public String basi_clr_off_plat_tm;
	public String basi_off_plat_tm;
	public String basi_trsm_end_tm;
	public String basi_prt_bgn_tm;
	public String basi_prt_end_tm;
	public String remk;
	public String prt_ex_qunt;
	public String out_gate;

	public PR_PRTEXEC_1100_LCURLISTRecord(){}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setNew_yn(String new_yn){
		this.new_yn = new_yn;
	}

	public void setClr_off_plat_tm(String clr_off_plat_tm){
		this.clr_off_plat_tm = clr_off_plat_tm;
	}

	public void setTrsm_end_tm(String trsm_end_tm){
		this.trsm_end_tm = trsm_end_tm;
	}

	public void setOff_plat_end_tm(String off_plat_end_tm){
		this.off_plat_end_tm = off_plat_end_tm;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setReal_prt_qty(String real_prt_qty){
		this.real_prt_qty = real_prt_qty;
	}

	public void setBad_nwsp_qty(String bad_nwsp_qty){
		this.bad_nwsp_qty = bad_nwsp_qty;
	}

	public void setCard_qty(String card_qty){
		this.card_qty = card_qty;
	}

	public void setDqty(String dqty){
		this.dqty = dqty;
	}

	public void setDt_tm_stop_tms(String dt_tm_stop_tms){
		this.dt_tm_stop_tms = dt_tm_stop_tms;
	}

	public void setFail_tms(String fail_tms){
		this.fail_tms = fail_tms;
	}

	public void setApcut_err_tms(String apcut_err_tms){
		this.apcut_err_tms = apcut_err_tms;
	}

	public void setDriv_susp_prgr_tms(String driv_susp_prgr_tms){
		this.driv_susp_prgr_tms = driv_susp_prgr_tms;
	}

	public void setBasi_clr_off_plat_tm(String basi_clr_off_plat_tm){
		this.basi_clr_off_plat_tm = basi_clr_off_plat_tm;
	}

	public void setBasi_off_plat_tm(String basi_off_plat_tm){
		this.basi_off_plat_tm = basi_off_plat_tm;
	}

	public void setBasi_trsm_end_tm(String basi_trsm_end_tm){
		this.basi_trsm_end_tm = basi_trsm_end_tm;
	}

	public void setBasi_prt_bgn_tm(String basi_prt_bgn_tm){
		this.basi_prt_bgn_tm = basi_prt_bgn_tm;
	}

	public void setBasi_prt_end_tm(String basi_prt_end_tm){
		this.basi_prt_end_tm = basi_prt_end_tm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPrt_ex_qunt(String prt_ex_qunt){
		this.prt_ex_qunt = prt_ex_qunt;
	}

	public void setOut_gate(String out_gate){
		this.out_gate = out_gate;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getNew_yn(){
		return this.new_yn;
	}

	public String getClr_off_plat_tm(){
		return this.clr_off_plat_tm;
	}

	public String getTrsm_end_tm(){
		return this.trsm_end_tm;
	}

	public String getOff_plat_end_tm(){
		return this.off_plat_end_tm;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getReal_prt_qty(){
		return this.real_prt_qty;
	}

	public String getBad_nwsp_qty(){
		return this.bad_nwsp_qty;
	}

	public String getCard_qty(){
		return this.card_qty;
	}

	public String getDqty(){
		return this.dqty;
	}

	public String getDt_tm_stop_tms(){
		return this.dt_tm_stop_tms;
	}

	public String getFail_tms(){
		return this.fail_tms;
	}

	public String getApcut_err_tms(){
		return this.apcut_err_tms;
	}

	public String getDriv_susp_prgr_tms(){
		return this.driv_susp_prgr_tms;
	}

	public String getBasi_clr_off_plat_tm(){
		return this.basi_clr_off_plat_tm;
	}

	public String getBasi_off_plat_tm(){
		return this.basi_off_plat_tm;
	}

	public String getBasi_trsm_end_tm(){
		return this.basi_trsm_end_tm;
	}

	public String getBasi_prt_bgn_tm(){
		return this.basi_prt_bgn_tm;
	}

	public String getBasi_prt_end_tm(){
		return this.basi_prt_end_tm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPrt_ex_qunt(){
		return this.prt_ex_qunt;
	}

	public String getOut_gate(){
		return this.out_gate;
	}
}

/* 작성시간 : Tue Jul 28 19:34:34 KST 2009 */