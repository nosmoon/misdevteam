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


public class FC_FUNC_8063_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String leas_no;
	public String pay_plan_dt;
	public String lciyul;
	public String frex_cd_nm;
	public String repay_prcp;
	public String repay_int;
	public String sum_repay_prcp;
	public String exrate;
	public String won_amt;
	public String libo_int_rate;
	public String dedu_int_rate;
	public String frex_cd;
	public String frex_nm;

	public FC_FUNC_8063_LCURLISTRecord(){}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setPay_plan_dt(String pay_plan_dt){
		this.pay_plan_dt = pay_plan_dt;
	}

	public void setLciyul(String lciyul){
		this.lciyul = lciyul;
	}

	public void setFrex_cd_nm(String frex_cd_nm){
		this.frex_cd_nm = frex_cd_nm;
	}

	public void setRepay_prcp(String repay_prcp){
		this.repay_prcp = repay_prcp;
	}

	public void setRepay_int(String repay_int){
		this.repay_int = repay_int;
	}

	public void setSum_repay_prcp(String sum_repay_prcp){
		this.sum_repay_prcp = sum_repay_prcp;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setDedu_int_rate(String dedu_int_rate){
		this.dedu_int_rate = dedu_int_rate;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setFrex_nm(String frex_nm){
		this.frex_nm = frex_nm;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getPay_plan_dt(){
		return this.pay_plan_dt;
	}

	public String getLciyul(){
		return this.lciyul;
	}

	public String getFrex_cd_nm(){
		return this.frex_cd_nm;
	}

	public String getRepay_prcp(){
		return this.repay_prcp;
	}

	public String getRepay_int(){
		return this.repay_int;
	}

	public String getSum_repay_prcp(){
		return this.sum_repay_prcp;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getDedu_int_rate(){
		return this.dedu_int_rate;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getFrex_nm(){
		return this.frex_nm;
	}
}

/* 작성시간 : Sat Apr 11 13:18:30 KST 2009 */