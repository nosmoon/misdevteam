/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.trip.rec;

import java.sql.*;
import chosun.ciis.hd.trip.dm.*;
import chosun.ciis.hd.trip.ds.*;

/**
 * 
 */


public class HD_TRIP_1703_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String dept_nm;
	public String posi_nm;
	public String dty_nm;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String busi_trip_clsf;
	public String busi_trip_purp;
	public String dd_fee;
	public String busi_trip_dds;
	public String busi_trip_fee_stot;
	public String stay_clsf;
	public String stay_area;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String rptv_posi_cd;
	public String proc_clsf;
	public String proc_stat_nm;
	public String rptv_posi_nm;

	public HD_TRIP_1703_LCURLISTRecord(){}

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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
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

	public void setBusi_trip_purp(String busi_trip_purp){
		this.busi_trip_purp = busi_trip_purp;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setStay_clsf(String stay_clsf){
		this.stay_clsf = stay_clsf;
	}

	public void setStay_area(String stay_area){
		this.stay_area = stay_area;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setRptv_posi_nm(String rptv_posi_nm){
		this.rptv_posi_nm = rptv_posi_nm;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
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

	public String getBusi_trip_purp(){
		return this.busi_trip_purp;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getStay_clsf(){
		return this.stay_clsf;
	}

	public String getStay_area(){
		return this.stay_area;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getRptv_posi_nm(){
		return this.rptv_posi_nm;
	}
}

/* �ۼ��ð� : Fri Aug 07 15:15:05 KST 2009 */