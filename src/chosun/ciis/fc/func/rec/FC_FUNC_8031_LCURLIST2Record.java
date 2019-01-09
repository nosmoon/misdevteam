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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8031_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String pay_cost_clsf;
	public String pay_cost_clsf_cdnm;
	public String hsty_seq;
	public String pymt_plan_dt;
	public String prv_pymt_plan_prcp;
	public String pymt_plan_prcp;
	public String pymt_plan_int;
	public String bal;
	public String slip_no;
	public String pymt_yn;

	public FC_FUNC_8031_LCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setPay_cost_clsf(String pay_cost_clsf){
		this.pay_cost_clsf = pay_cost_clsf;
	}

	public void setPay_cost_clsf_cdnm(String pay_cost_clsf_cdnm){
		this.pay_cost_clsf_cdnm = pay_cost_clsf_cdnm;
	}

	public void setHsty_seq(String hsty_seq){
		this.hsty_seq = hsty_seq;
	}

	public void setPymt_plan_dt(String pymt_plan_dt){
		this.pymt_plan_dt = pymt_plan_dt;
	}

	public void setPrv_pymt_plan_prcp(String prv_pymt_plan_prcp){
		this.prv_pymt_plan_prcp = prv_pymt_plan_prcp;
	}

	public void setPymt_plan_prcp(String pymt_plan_prcp){
		this.pymt_plan_prcp = pymt_plan_prcp;
	}

	public void setPymt_plan_int(String pymt_plan_int){
		this.pymt_plan_int = pymt_plan_int;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setPymt_yn(String pymt_yn){
		this.pymt_yn = pymt_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getPay_cost_clsf(){
		return this.pay_cost_clsf;
	}

	public String getPay_cost_clsf_cdnm(){
		return this.pay_cost_clsf_cdnm;
	}

	public String getHsty_seq(){
		return this.hsty_seq;
	}

	public String getPymt_plan_dt(){
		return this.pymt_plan_dt;
	}

	public String getPrv_pymt_plan_prcp(){
		return this.prv_pymt_plan_prcp;
	}

	public String getPymt_plan_prcp(){
		return this.pymt_plan_prcp;
	}

	public String getPymt_plan_int(){
		return this.pymt_plan_int;
	}

	public String getBal(){
		return this.bal;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getPymt_yn(){
		return this.pymt_yn;
	}
}

/* 작성시간 : Wed Apr 01 11:24:24 KST 2009 */