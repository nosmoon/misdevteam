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


public class HD_TRIP_1101_344_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String busi_trip_fee_stot;
	public String dd_fee;
	public String food_fee;
	public String busi_trip_dds;
	public String dd_stay_fee;
	public String stay_dds;
	public String trff_fee;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String rptv_posi_cd;
	public String rptv_posi_nm;

	public HD_TRIP_1101_344_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setBusi_trip_fee_stot(String busi_trip_fee_stot){
		this.busi_trip_fee_stot = busi_trip_fee_stot;
	}

	public void setDd_fee(String dd_fee){
		this.dd_fee = dd_fee;
	}

	public void setFood_fee(String food_fee){
		this.food_fee = food_fee;
	}

	public void setBusi_trip_dds(String busi_trip_dds){
		this.busi_trip_dds = busi_trip_dds;
	}

	public void setDd_stay_fee(String dd_stay_fee){
		this.dd_stay_fee = dd_stay_fee;
	}

	public void setStay_dds(String stay_dds){
		this.stay_dds = stay_dds;
	}

	public void setTrff_fee(String trff_fee){
		this.trff_fee = trff_fee;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setRptv_posi_cd(String rptv_posi_cd){
		this.rptv_posi_cd = rptv_posi_cd;
	}

	public void setRptv_posi_nm(String rptv_posi_nm){
		this.rptv_posi_nm = rptv_posi_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getBusi_trip_fee_stot(){
		return this.busi_trip_fee_stot;
	}

	public String getDd_fee(){
		return this.dd_fee;
	}

	public String getFood_fee(){
		return this.food_fee;
	}

	public String getBusi_trip_dds(){
		return this.busi_trip_dds;
	}

	public String getDd_stay_fee(){
		return this.dd_stay_fee;
	}

	public String getStay_dds(){
		return this.stay_dds;
	}

	public String getTrff_fee(){
		return this.trff_fee;
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

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getRptv_posi_cd(){
		return this.rptv_posi_cd;
	}

	public String getRptv_posi_nm(){
		return this.rptv_posi_nm;
	}
}

/* 작성시간 : Thu Aug 09 15:47:21 KST 2012 */