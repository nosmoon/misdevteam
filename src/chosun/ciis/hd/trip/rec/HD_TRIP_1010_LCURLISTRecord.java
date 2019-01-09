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


public class HD_TRIP_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String proc_stat_nm;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String busi_trip_clsf_nm;
	public String busi_trip_purp;
	public String medi_cd;
	public String dtls_medi_cd;
	public String occr_dt;
	public String seq;
	public String proc_stat;
	public String emp_no;

	public HD_TRIP_1010_LCURLISTRecord(){}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setBusi_trip_clsf_nm(String busi_trip_clsf_nm){
		this.busi_trip_clsf_nm = busi_trip_clsf_nm;
	}

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getBusi_trip_clsf_nm(){
		return this.busi_trip_clsf_nm;
	}

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getEmp_no(){
		return this.emp_no;
	}
}

/* 작성시간 : Fri Dec 01 11:14:18 KST 2017 */