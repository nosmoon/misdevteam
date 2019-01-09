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


package chosun.ciis.hd.corr.rec;

import java.sql.*;
import chosun.ciis.hd.corr.dm.*;
import chosun.ciis.hd.corr.ds.*;

/**
 * 
 */


public class HD_CORR_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String pay_yymm;
	public String istt_cost_cd;
	public String istt_cost_nm;
	public String istt_cost_ptcr;
	public String frex_clsf;
	public String frex_clsf_nm;
	public String aplc_frex;
	public String aplc_won;
	public String adjm_frex;
	public String adjm_won;
	public String remk;
	public String proc_stat_nm;

	public HD_CORR_1020_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPay_yymm(String pay_yymm){
		this.pay_yymm = pay_yymm;
	}

	public void setIstt_cost_cd(String istt_cost_cd){
		this.istt_cost_cd = istt_cost_cd;
	}

	public void setIstt_cost_nm(String istt_cost_nm){
		this.istt_cost_nm = istt_cost_nm;
	}

	public void setIstt_cost_ptcr(String istt_cost_ptcr){
		this.istt_cost_ptcr = istt_cost_ptcr;
	}

	public void setFrex_clsf(String frex_clsf){
		this.frex_clsf = frex_clsf;
	}

	public void setFrex_clsf_nm(String frex_clsf_nm){
		this.frex_clsf_nm = frex_clsf_nm;
	}

	public void setAplc_frex(String aplc_frex){
		this.aplc_frex = aplc_frex;
	}

	public void setAplc_won(String aplc_won){
		this.aplc_won = aplc_won;
	}

	public void setAdjm_frex(String adjm_frex){
		this.adjm_frex = adjm_frex;
	}

	public void setAdjm_won(String adjm_won){
		this.adjm_won = adjm_won;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}
	
	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getPay_yymm(){
		return this.pay_yymm;
	}

	public String getIstt_cost_cd(){
		return this.istt_cost_cd;
	}

	public String getIstt_cost_nm(){
		return this.istt_cost_nm;
	}

	public String getIstt_cost_ptcr(){
		return this.istt_cost_ptcr;
	}

	public String getFrex_clsf(){
		return this.frex_clsf;
	}

	public String getFrex_clsf_nm(){
		return this.frex_clsf_nm;
	}

	public String getAplc_frex(){
		return this.aplc_frex;
	}

	public String getAplc_won(){
		return this.aplc_won;
	}

	public String getAdjm_frex(){
		return this.adjm_frex;
	}

	public String getAdjm_won(){
		return this.adjm_won;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}
}

/* 작성시간 : Wed Apr 08 15:20:13 KST 2009 */