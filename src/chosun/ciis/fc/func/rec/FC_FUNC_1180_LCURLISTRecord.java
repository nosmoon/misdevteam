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


public class FC_FUNC_1180_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlcocd;
	public String pch_compnm;
	public String sbbsamt;
	public String pch_amt2;
	public String cash_amt;
	public String slip_no;
	public String pch_count;
	public String out_msg;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_FUNC_1180_LCURLISTRecord(){}

	public void setDlcocd(String dlcocd){
		this.dlcocd = dlcocd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setSbbsamt(String sbbsamt){
		this.sbbsamt = sbbsamt;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
	}

	public void setCash_amt(String cash_amt){
		this.cash_amt = cash_amt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public void setOut_msg(String out_msg){
		this.out_msg = out_msg;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getDlcocd(){
		return this.dlcocd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getSbbsamt(){
		return this.sbbsamt;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
	}

	public String getCash_amt(){
		return this.cash_amt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getPch_count(){
		return this.pch_count;
	}

	public String getOut_msg(){
		return this.out_msg;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Fri Mar 27 14:19:21 KST 2009 */