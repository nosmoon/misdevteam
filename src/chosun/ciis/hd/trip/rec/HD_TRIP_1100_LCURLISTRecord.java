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


public class HD_TRIP_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String occr_dt;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String busi_trip_clsf;
	public String busi_trip_nm;
	public String dept_cd;
	public String dept_nm;
	public String flnm;
	public String busi_trip_purp;
	public String trff_means_cd;
	public String trff_means_nm;
	public String trff_means_etc;
	public String slip_proc_seq;
	public String proc_stat;
	public String proc_stat_nm;
	public String actu_slip_no;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String busi_trip_fee_stot;
	public String cost_fix_clsf;
	public String cost_fix_clsf_chk;
	public String emp_no;
	public String slip_clsf_yn;
	public String medi_cd;
	public String dtls_medi_cd;
	public String medi_cd_2;
	public String dtls_medi_cd_2;

	public HD_TRIP_1100_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setBusi_trip_clsf(String busi_trip_clsf){
		this.busi_trip_clsf = busi_trip_clsf;
	}

	public void setBusi_trip_nm(String busi_trip_nm){
		this.busi_trip_nm = busi_trip_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setTrff_means_cd(String trff_means_cd){
		this.trff_means_cd = trff_means_cd;
	}

	public void setTrff_means_nm(String trff_means_nm){
		this.trff_means_nm = trff_means_nm;
	}

	public void setTrff_means_etc(String trff_means_etc){
		this.trff_means_etc = trff_means_etc;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setCost_fix_clsf(String cost_fix_clsf){
		this.cost_fix_clsf = cost_fix_clsf;
	}

	public void setCost_fix_clsf_chk(String cost_fix_clsf_chk){
		this.cost_fix_clsf_chk = cost_fix_clsf_chk;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSlip_clsf_yn(String slip_clsf_yn){
		this.slip_clsf_yn = slip_clsf_yn;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setMedi_cd_2(String medi_cd_2){
		this.medi_cd_2 = medi_cd_2;
	}

	public void setDtls_medi_cd_2(String dtls_medi_cd_2){
		this.dtls_medi_cd_2 = dtls_medi_cd_2;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getBusi_trip_clsf(){
		return this.busi_trip_clsf;
	}

	public String getBusi_trip_nm(){
		return this.busi_trip_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getTrff_means_cd(){
		return this.trff_means_cd;
	}

	public String getTrff_means_nm(){
		return this.trff_means_nm;
	}

	public String getTrff_means_etc(){
		return this.trff_means_etc;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getCost_fix_clsf(){
		return this.cost_fix_clsf;
	}

	public String getCost_fix_clsf_chk(){
		return this.cost_fix_clsf_chk;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSlip_clsf_yn(){
		return this.slip_clsf_yn;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getMedi_cd_2(){
		return this.medi_cd_2;
	}

	public String getDtls_medi_cd_2(){
		return this.dtls_medi_cd_2;
	}
}

/* 작성시간 : Mon Feb 20 13:44:38 KST 2012 */