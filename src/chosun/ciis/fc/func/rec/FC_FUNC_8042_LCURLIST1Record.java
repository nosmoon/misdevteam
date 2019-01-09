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


public class FC_FUNC_8042_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pymt_plan_dt;
	public String pymt_plan_prcp;
	public String pymt_plan_int;
	public String bal;
	public String pymt_yn;
	public String pymt_dt;
	public String pymt_prcp;
	public String pymt_int;
	public String pay_cost_clsf;
	public String hsty_seq;

	public FC_FUNC_8042_LCURLIST1Record(){}

	public void setPymt_plan_dt(String pymt_plan_dt){
		this.pymt_plan_dt = pymt_plan_dt;
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

	public void setPymt_yn(String pymt_yn){
		this.pymt_yn = pymt_yn;
	}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
	}

	public void setPymt_prcp(String pymt_prcp){
		this.pymt_prcp = pymt_prcp;
	}

	public void setPymt_int(String pymt_int){
		this.pymt_int = pymt_int;
	}

	public void setPay_cost_clsf(String pay_cost_clsf){
		this.pay_cost_clsf = pay_cost_clsf;
	}

	public void setHsty_seq(String hsty_seq){
		this.hsty_seq = hsty_seq;
	}

	public String getPymt_plan_dt(){
		return this.pymt_plan_dt;
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

	public String getPymt_yn(){
		return this.pymt_yn;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
	}

	public String getPymt_prcp(){
		return this.pymt_prcp;
	}

	public String getPymt_int(){
		return this.pymt_int;
	}

	public String getPay_cost_clsf(){
		return this.pay_cost_clsf;
	}

	public String getHsty_seq(){
		return this.hsty_seq;
	}
}

/* 작성시간 : Thu Apr 09 16:58:52 KST 2009 */