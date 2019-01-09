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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String major_amt;
	public String sub_amt;
	public String prt_labor_amt;
	public String sub_tot;
	public String major_amt_local;
	public String sub_amt_local;
	public String sub_tot_local;
	public String tot_avg;
	public String deduct_labor_amt;
	public String bmajor_amt;
	public String bsub_amt;
	public String bprt_labor_amt;
	public String bsub_tot;
	public String bmajor_amt_local;
	public String bsub_amt_local;
	public String bsub_tot_local;
	public String btot_avg;
	public String bdeduct_labor_amt;
	public String bmajor_cost;
	public String bsub_cost;
	public String bprt_labor_cost;
	public String bsub_tot_cost;
	public String bmajor_local_cost;
	public String bsub_local_cost;
	public String tot_local_cost;
	public String btot_avg_cost;
	public String bdeduct_labor_cost;
	public String iss_cho;
	public String iss_local;
	public String avg_qty;

	public MC_BUDG_6151_LCURLISTRecord(){}

	public void setMajor_amt(String major_amt){
		this.major_amt = major_amt;
	}

	public void setSub_amt(String sub_amt){
		this.sub_amt = sub_amt;
	}

	public void setPrt_labor_amt(String prt_labor_amt){
		this.prt_labor_amt = prt_labor_amt;
	}

	public void setSub_tot(String sub_tot){
		this.sub_tot = sub_tot;
	}

	public void setMajor_amt_local(String major_amt_local){
		this.major_amt_local = major_amt_local;
	}

	public void setSub_amt_local(String sub_amt_local){
		this.sub_amt_local = sub_amt_local;
	}

	public void setSub_tot_local(String sub_tot_local){
		this.sub_tot_local = sub_tot_local;
	}

	public void setTot_avg(String tot_avg){
		this.tot_avg = tot_avg;
	}

	public void setDeduct_labor_amt(String deduct_labor_amt){
		this.deduct_labor_amt = deduct_labor_amt;
	}

	public void setBmajor_amt(String bmajor_amt){
		this.bmajor_amt = bmajor_amt;
	}

	public void setBsub_amt(String bsub_amt){
		this.bsub_amt = bsub_amt;
	}

	public void setBprt_labor_amt(String bprt_labor_amt){
		this.bprt_labor_amt = bprt_labor_amt;
	}

	public void setBsub_tot(String bsub_tot){
		this.bsub_tot = bsub_tot;
	}

	public void setBmajor_amt_local(String bmajor_amt_local){
		this.bmajor_amt_local = bmajor_amt_local;
	}

	public void setBsub_amt_local(String bsub_amt_local){
		this.bsub_amt_local = bsub_amt_local;
	}

	public void setBsub_tot_local(String bsub_tot_local){
		this.bsub_tot_local = bsub_tot_local;
	}

	public void setBtot_avg(String btot_avg){
		this.btot_avg = btot_avg;
	}

	public void setBdeduct_labor_amt(String bdeduct_labor_amt){
		this.bdeduct_labor_amt = bdeduct_labor_amt;
	}

	public void setBmajor_cost(String bmajor_cost){
		this.bmajor_cost = bmajor_cost;
	}

	public void setBsub_cost(String bsub_cost){
		this.bsub_cost = bsub_cost;
	}

	public void setBprt_labor_cost(String bprt_labor_cost){
		this.bprt_labor_cost = bprt_labor_cost;
	}

	public void setBsub_tot_cost(String bsub_tot_cost){
		this.bsub_tot_cost = bsub_tot_cost;
	}

	public void setBmajor_local_cost(String bmajor_local_cost){
		this.bmajor_local_cost = bmajor_local_cost;
	}

	public void setBsub_local_cost(String bsub_local_cost){
		this.bsub_local_cost = bsub_local_cost;
	}

	public void setTot_local_cost(String tot_local_cost){
		this.tot_local_cost = tot_local_cost;
	}

	public void setBtot_avg_cost(String btot_avg_cost){
		this.btot_avg_cost = btot_avg_cost;
	}

	public void setBdeduct_labor_cost(String bdeduct_labor_cost){
		this.bdeduct_labor_cost = bdeduct_labor_cost;
	}

	public void setIss_cho(String iss_cho){
		this.iss_cho = iss_cho;
	}

	public void setIss_local(String iss_local){
		this.iss_local = iss_local;
	}

	public void setAvg_qty(String avg_qty){
		this.avg_qty = avg_qty;
	}

	public String getMajor_amt(){
		return this.major_amt;
	}

	public String getSub_amt(){
		return this.sub_amt;
	}

	public String getPrt_labor_amt(){
		return this.prt_labor_amt;
	}

	public String getSub_tot(){
		return this.sub_tot;
	}

	public String getMajor_amt_local(){
		return this.major_amt_local;
	}

	public String getSub_amt_local(){
		return this.sub_amt_local;
	}

	public String getSub_tot_local(){
		return this.sub_tot_local;
	}

	public String getTot_avg(){
		return this.tot_avg;
	}

	public String getDeduct_labor_amt(){
		return this.deduct_labor_amt;
	}

	public String getBmajor_amt(){
		return this.bmajor_amt;
	}

	public String getBsub_amt(){
		return this.bsub_amt;
	}

	public String getBprt_labor_amt(){
		return this.bprt_labor_amt;
	}

	public String getBsub_tot(){
		return this.bsub_tot;
	}

	public String getBmajor_amt_local(){
		return this.bmajor_amt_local;
	}

	public String getBsub_amt_local(){
		return this.bsub_amt_local;
	}

	public String getBsub_tot_local(){
		return this.bsub_tot_local;
	}

	public String getBtot_avg(){
		return this.btot_avg;
	}

	public String getBdeduct_labor_amt(){
		return this.bdeduct_labor_amt;
	}

	public String getBmajor_cost(){
		return this.bmajor_cost;
	}

	public String getBsub_cost(){
		return this.bsub_cost;
	}

	public String getBprt_labor_cost(){
		return this.bprt_labor_cost;
	}

	public String getBsub_tot_cost(){
		return this.bsub_tot_cost;
	}

	public String getBmajor_local_cost(){
		return this.bmajor_local_cost;
	}

	public String getBsub_local_cost(){
		return this.bsub_local_cost;
	}

	public String getTot_local_cost(){
		return this.tot_local_cost;
	}

	public String getBtot_avg_cost(){
		return this.btot_avg_cost;
	}

	public String getBdeduct_labor_cost(){
		return this.bdeduct_labor_cost;
	}

	public String getIss_cho(){
		return this.iss_cho;
	}

	public String getIss_local(){
		return this.iss_local;
	}

	public String getAvg_qty(){
		return this.avg_qty;
	}
}

/* 작성시간 : Sat May 23 15:54:02 KST 2009 */