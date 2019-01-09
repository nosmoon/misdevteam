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


public class MT_PRNPAP_2010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String real_prt_paper_clsf;
	public String real_paper_std;
	public String prt_nm;
	public String prt_plan_dd_pers;
	public String prt_frdt;
	public String prt_todt;
	public String prt_tms;
	public String paper_std;
	public String issu_pcnt;
	public String clr_pcnt;
	public String bw_pcnt;
	public String prt_qty;
	public String prt_paper_clsf;
	public String qunt_out_yn;
	public String paper_gm;
	public String brk_rate;
	public String remk;

	public MT_PRNPAP_2010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setReal_prt_paper_clsf(String real_prt_paper_clsf){
		this.real_prt_paper_clsf = real_prt_paper_clsf;
	}

	public void setReal_paper_std(String real_paper_std){
		this.real_paper_std = real_paper_std;
	}

	public void setPrt_nm(String prt_nm){
		this.prt_nm = prt_nm;
	}

	public void setPrt_plan_dd_pers(String prt_plan_dd_pers){
		this.prt_plan_dd_pers = prt_plan_dd_pers;
	}

	public void setPrt_frdt(String prt_frdt){
		this.prt_frdt = prt_frdt;
	}

	public void setPrt_todt(String prt_todt){
		this.prt_todt = prt_todt;
	}

	public void setPrt_tms(String prt_tms){
		this.prt_tms = prt_tms;
	}

	public void setPaper_std(String paper_std){
		this.paper_std = paper_std;
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

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
	}

	public void setPrt_paper_clsf(String prt_paper_clsf){
		this.prt_paper_clsf = prt_paper_clsf;
	}

	public void setQunt_out_yn(String qunt_out_yn){
		this.qunt_out_yn = qunt_out_yn;
	}

	public void setPaper_gm(String paper_gm){
		this.paper_gm = paper_gm;
	}

	public void setBrk_rate(String brk_rate){
		this.brk_rate = brk_rate;
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

	public String getReal_prt_paper_clsf(){
		return this.real_prt_paper_clsf;
	}

	public String getReal_paper_std(){
		return this.real_paper_std;
	}

	public String getPrt_nm(){
		return this.prt_nm;
	}

	public String getPrt_plan_dd_pers(){
		return this.prt_plan_dd_pers;
	}

	public String getPrt_frdt(){
		return this.prt_frdt;
	}

	public String getPrt_todt(){
		return this.prt_todt;
	}

	public String getPrt_tms(){
		return this.prt_tms;
	}

	public String getPaper_std(){
		return this.paper_std;
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

	public String getPrt_qty(){
		return this.prt_qty;
	}

	public String getPrt_paper_clsf(){
		return this.prt_paper_clsf;
	}

	public String getQunt_out_yn(){
		return this.qunt_out_yn;
	}

	public String getPaper_gm(){
		return this.paper_gm;
	}

	public String getBrk_rate(){
		return this.brk_rate;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Sat May 23 18:00:58 KST 2009 */