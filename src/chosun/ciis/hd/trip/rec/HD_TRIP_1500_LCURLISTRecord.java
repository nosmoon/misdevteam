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


public class HD_TRIP_1500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String dty_cd;
	public String natn_nm;
	public String busi_trip_dest;
	public String via_area;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String invit_dds;
	public String busi_trip_dds;
	public String busi_trip_purp;
	public String fix_dd_fee;
	public String fix_stay_fee;
	public String fix_aviat_fee;
	public String fix_etc_cost;
	public String fix_cost_tot;
	public String adpay_no;
	public String adpay_amt;
	public String expn_reso_no;
	public String adjm_dd_fee;
	public String adjm_stay_fee;
	public String adjm_aviat_fee;
	public String adjm_etc_cost;
	public String adjm_cost_tot;
	public String minus_cost_tot;
	public String ceph_use_yn;
	public String ceph_use_nm;
	public String cmpy_cd;
	public String occr_dt;
	public String with_seq;
	public String seq;
	public String aviat_fee;
	public String stay_fee;
	public String dd_fee;

	public HD_TRIP_1500_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public void setBusi_trip_dest(String busi_trip_dest){
		this.busi_trip_dest = busi_trip_dest;
	}

	public void setVia_area(String via_area){
		this.via_area = via_area;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setInvit_dds(String invit_dds){
		this.invit_dds = invit_dds;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setFix_dd_fee(String fix_dd_fee){
		this.fix_dd_fee = fix_dd_fee;
	}

	public void setFix_stay_fee(String fix_stay_fee){
		this.fix_stay_fee = fix_stay_fee;
	}

	public void setFix_aviat_fee(String fix_aviat_fee){
		this.fix_aviat_fee = fix_aviat_fee;
	}

	public void setFix_etc_cost(String fix_etc_cost){
		this.fix_etc_cost = fix_etc_cost;
	}

	public void setFix_cost_tot(String fix_cost_tot){
		this.fix_cost_tot = fix_cost_tot;
	}

	public void setAdpay_no(String adpay_no){
		this.adpay_no = adpay_no;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public void setExpn_reso_no(String expn_reso_no){
		this.expn_reso_no = expn_reso_no;
	}

	public void setAdjm_dd_fee(String adjm_dd_fee){
		this.adjm_dd_fee = adjm_dd_fee;
	}

	public void setAdjm_stay_fee(String adjm_stay_fee){
		this.adjm_stay_fee = adjm_stay_fee;
	}

	public void setAdjm_aviat_fee(String adjm_aviat_fee){
		this.adjm_aviat_fee = adjm_aviat_fee;
	}

	public void setAdjm_etc_cost(String adjm_etc_cost){
		this.adjm_etc_cost = adjm_etc_cost;
	}

	public void setAdjm_cost_tot(String adjm_cost_tot){
		this.adjm_cost_tot = adjm_cost_tot;
	}

	public void setMinus_cost_tot(String minus_cost_tot){
		this.minus_cost_tot = minus_cost_tot;
	}

	public void setCeph_use_yn(String ceph_use_yn){
		this.ceph_use_yn = ceph_use_yn;
	}

	public void setCeph_use_nm(String ceph_use_nm){
		this.ceph_use_nm = ceph_use_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setWith_seq(String with_seq){
		this.with_seq = with_seq;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}

	public String getBusi_trip_dest(){
		return this.busi_trip_dest;
	}

	public String getVia_area(){
		return this.via_area;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getInvit_dds(){
		return this.invit_dds;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getFix_dd_fee(){
		return this.fix_dd_fee;
	}

	public String getFix_stay_fee(){
		return this.fix_stay_fee;
	}

	public String getFix_aviat_fee(){
		return this.fix_aviat_fee;
	}

	public String getFix_etc_cost(){
		return this.fix_etc_cost;
	}

	public String getFix_cost_tot(){
		return this.fix_cost_tot;
	}

	public String getAdpay_no(){
		return this.adpay_no;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}

	public String getExpn_reso_no(){
		return this.expn_reso_no;
	}

	public String getAdjm_dd_fee(){
		return this.adjm_dd_fee;
	}

	public String getAdjm_stay_fee(){
		return this.adjm_stay_fee;
	}

	public String getAdjm_aviat_fee(){
		return this.adjm_aviat_fee;
	}

	public String getAdjm_etc_cost(){
		return this.adjm_etc_cost;
	}

	public String getAdjm_cost_tot(){
		return this.adjm_cost_tot;
	}

	public String getMinus_cost_tot(){
		return this.minus_cost_tot;
	}

	public String getCeph_use_yn(){
		return this.ceph_use_yn;
	}

	public String getCeph_use_nm(){
		return this.ceph_use_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getWith_seq(){
		return this.with_seq;
	}

	public String getSeq(){
		return this.seq;
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
}

/* 작성시간 : Tue Aug 25 14:16:37 KST 2009 */