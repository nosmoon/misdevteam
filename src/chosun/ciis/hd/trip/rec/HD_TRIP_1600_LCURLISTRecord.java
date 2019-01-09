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


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String with_seq;
	public String flnm;
	public String cd_nm;
	public String dept_cd;
	public String dept_nm;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String busi_trip_purp;
	public String busi_trip_dest;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String busi_trip_dds;
	public String invit_instt;
	public String busi_trip_fee_burd_clsf;
	public String busi_trip_neces;
	public String aviat_fee;
	public String stay_fee;
	public String dd_fee;
	public String ceph_use_yn;
	public String busi_trip_fee_stot;
	public String remk;
	public String proc_stat;
	public String genl_affrs_clsf;
	public String proc_stat_nm;
	public String draft_dt;
	public String adpay_no;
	public String adpay_amt;
	public String adpay_plan_dt;
	public String actu_pay_dt;
	public String expn_reso_no;
	public String natn_cd;
	public String natn_nm;
	public String invit_dds;
	public String fix_aviat_fee;
	public String adjm_aviat_fee;
	public String fix_stay_fee;
	public String adjm_stay_fee;
	public String fix_dd_fee;
	public String adjm_dd_fee;
	public String fix_etc_cost;
	public String adjm_etc_cost;

	public HD_TRIP_1600_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setWith_seq(String with_seq){
		this.with_seq = with_seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setBusi_trip_dest(String busi_trip_dest){
		this.busi_trip_dest = busi_trip_dest;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setInvit_instt(String invit_instt){
		this.invit_instt = invit_instt;
	}

	public void setBusi_trip_fee_burd_clsf(String busi_trip_fee_burd_clsf){
		this.busi_trip_fee_burd_clsf = busi_trip_fee_burd_clsf;
	}

	public void setBusi_trip_neces(String busi_trip_neces){
		this.busi_trip_neces = busi_trip_neces;
	}

	public void setAviat_fee(String aviat_fee){
		this.aviat_fee = aviat_fee;
	}

	public void setStay_fee(String stay_fee){
		this.stay_fee = stay_fee;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setCeph_use_yn(String ceph_use_yn){
		this.ceph_use_yn = ceph_use_yn;
	}

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setGenl_affrs_clsf(String genl_affrs_clsf){
		this.genl_affrs_clsf = genl_affrs_clsf;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setDraft_dt(String draft_dt){
		this.draft_dt = draft_dt;
	}

	public void setAdpay_no(String adpay_no){
		this.adpay_no = adpay_no;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setAdpay_plan_dt(String adpay_plan_dt){
		this.adpay_plan_dt = adpay_plan_dt;
	}

	public void setActu_pay_dt(String actu_pay_dt){
		this.actu_pay_dt = actu_pay_dt;
	}

	public void setExpn_reso_no(String expn_reso_no){
		this.expn_reso_no = expn_reso_no;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setInvit_dds(String invit_dds){
		this.invit_dds = invit_dds;
	}

	public void setFix_aviat_fee(String fix_aviat_fee){
		this.fix_aviat_fee = fix_aviat_fee;
	}

	public void setAdjm_aviat_fee(String adjm_aviat_fee){
		this.adjm_aviat_fee = adjm_aviat_fee;
	}

	public void setFix_stay_fee(String fix_stay_fee){
		this.fix_stay_fee = fix_stay_fee;
	}

	public void setAdjm_stay_fee(String adjm_stay_fee){
		this.adjm_stay_fee = adjm_stay_fee;
	}

	public void setFix_dd_fee(String fix_dd_fee){
		this.fix_dd_fee = fix_dd_fee;
	}

	public void setAdjm_dd_fee(String adjm_dd_fee){
		this.adjm_dd_fee = adjm_dd_fee;
	}

	public void setFix_etc_cost(String fix_etc_cost){
		this.fix_etc_cost = fix_etc_cost;
	}

	public void setAdjm_etc_cost(String adjm_etc_cost){
		this.adjm_etc_cost = adjm_etc_cost;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getWith_seq(){
		return this.with_seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getBusi_trip_dest(){
		return this.busi_trip_dest;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getInvit_instt(){
		return this.invit_instt;
	}

	public String getBusi_trip_fee_burd_clsf(){
		return this.busi_trip_fee_burd_clsf;
	}

	public String getBusi_trip_neces(){
		return this.busi_trip_neces;
	}

	public String getAviat_fee(){
		return this.aviat_fee;
	}

	public String getStay_fee(){
		return this.stay_fee;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getCeph_use_yn(){
		return this.ceph_use_yn;
	}

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getGenl_affrs_clsf(){
		return this.genl_affrs_clsf;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getDraft_dt(){
		return this.draft_dt;
	}

	public String getAdpay_no(){
		return this.adpay_no;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getAdpay_plan_dt(){
		return this.adpay_plan_dt;
	}

	public String getActu_pay_dt(){
		return this.actu_pay_dt;
	}

	public String getExpn_reso_no(){
		return this.expn_reso_no;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getInvit_dds(){
		return this.invit_dds;
	}

	public String getFix_aviat_fee(){
		return this.fix_aviat_fee;
	}

	public String getAdjm_aviat_fee(){
		return this.adjm_aviat_fee;
	}

	public String getFix_stay_fee(){
		return this.fix_stay_fee;
	}

	public String getAdjm_stay_fee(){
		return this.adjm_stay_fee;
	}

	public String getFix_dd_fee(){
		return this.fix_dd_fee;
	}

	public String getAdjm_dd_fee(){
		return this.adjm_dd_fee;
	}

	public String getFix_etc_cost(){
		return this.fix_etc_cost;
	}

	public String getAdjm_etc_cost(){
		return this.adjm_etc_cost;
	}
}

/* 작성시간 : Mon May 18 13:49:59 KST 2009 */