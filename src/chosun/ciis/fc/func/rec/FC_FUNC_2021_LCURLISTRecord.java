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


public class FC_FUNC_2021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_bank_cdnm;
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
	public String yugaint;

	public FC_FUNC_2021_LCURLISTRecord(){}

	public void setPay_bank_cdnm(String pay_bank_cdnm){
		this.pay_bank_cdnm = pay_bank_cdnm;
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

	public void setYugaint(String yugaint){
		this.yugaint = yugaint;
	}

	public String getPay_bank_cdnm(){
		return this.pay_bank_cdnm;
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

	public String getYugaint(){
		return this.yugaint;
	}
}

/* 작성시간 : Thu Mar 12 14:03:13 KST 2009 */