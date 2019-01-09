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


public class FC_FUNC_2011_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_bank_cd_nm;
	public String seci_no;
	public String mtry_dt;
	public String jbgamt;
	public String rcpay_amt;
	public String corp_tax_amt;
	public String jpno;
	public String intamt;
	public String misusuic;
	public String rmks;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String int_rate;
	public String defr_yys;

	public FC_FUNC_2011_LCURLISTRecord(){}

	public void setPay_bank_cd_nm(String pay_bank_cd_nm){
		this.pay_bank_cd_nm = pay_bank_cd_nm;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setJbgamt(String jbgamt){
		this.jbgamt = jbgamt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public void setIntamt(String intamt){
		this.intamt = intamt;
	}

	public void setMisusuic(String misusuic){
		this.misusuic = misusuic;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setDefr_yys(String defr_yys){
		this.defr_yys = defr_yys;
	}

	public String getPay_bank_cd_nm(){
		return this.pay_bank_cd_nm;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getJbgamt(){
		return this.jbgamt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getJpno(){
		return this.jpno;
	}

	public String getIntamt(){
		return this.intamt;
	}

	public String getMisusuic(){
		return this.misusuic;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getDefr_yys(){
		return this.defr_yys;
	}
}

/* 작성시간 : Sat Jun 20 15:29:54 KST 2009 */