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


public class PR_PRTEXEC_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String medi_clsf;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String sep_prtn_pcnt;
	public String hdqt_paper_nm;
	public String pc_paper_nm;
	public String sn_paper_nm;
	public String bp_paper_nm;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ipaddr;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public PR_PRTEXEC_1400_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
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

	public void setSep_prtn_pcnt(String sep_prtn_pcnt){
		this.sep_prtn_pcnt = sep_prtn_pcnt;
	}

	public void setHdqt_paper_nm(String hdqt_paper_nm){
		this.hdqt_paper_nm = hdqt_paper_nm;
	}

	public void setPc_paper_nm(String pc_paper_nm){
		this.pc_paper_nm = pc_paper_nm;
	}

	public void setSn_paper_nm(String sn_paper_nm){
		this.sn_paper_nm = sn_paper_nm;
	}

	public void setBp_paper_nm(String bp_paper_nm){
		this.bp_paper_nm = bp_paper_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
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

	public String getMedi_clsf(){
		return this.medi_clsf;
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

	public String getSep_prtn_pcnt(){
		return this.sep_prtn_pcnt;
	}

	public String getHdqt_paper_nm(){
		return this.hdqt_paper_nm;
	}

	public String getPc_paper_nm(){
		return this.pc_paper_nm;
	}

	public String getSn_paper_nm(){
		return this.sn_paper_nm;
	}

	public String getBp_paper_nm(){
		return this.bp_paper_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Aug 11 17:56:19 KST 2009 */