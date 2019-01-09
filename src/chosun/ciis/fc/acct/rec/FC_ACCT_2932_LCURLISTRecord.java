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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2932_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String aprv_slip_occr_dt;
	public String aprv_slip_clsf;
	public String aprv_slip_occr_seqo;
	public String aprv_slip_occr_sub_seq;
	public String pch_budg_cdnm;
	public String budg_cd;
	public String pch_count;
	public String amt;
	public String rmtt_dwload_dt;
	public String aprv_slip_no;

	public FC_ACCT_2932_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setAprv_slip_occr_dt(String aprv_slip_occr_dt){
		this.aprv_slip_occr_dt = aprv_slip_occr_dt;
	}

	public void setAprv_slip_clsf(String aprv_slip_clsf){
		this.aprv_slip_clsf = aprv_slip_clsf;
	}

	public void setAprv_slip_occr_seqo(String aprv_slip_occr_seqo){
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
	}

	public void setAprv_slip_occr_sub_seq(String aprv_slip_occr_sub_seq){
		this.aprv_slip_occr_sub_seq = aprv_slip_occr_sub_seq;
	}

	public void setPch_budg_cdnm(String pch_budg_cdnm){
		this.pch_budg_cdnm = pch_budg_cdnm;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRmtt_dwload_dt(String rmtt_dwload_dt){
		this.rmtt_dwload_dt = rmtt_dwload_dt;
	}

	public void setAprv_slip_no(String aprv_slip_no){
		this.aprv_slip_no = aprv_slip_no;
	}

	public String getChk(){
		return this.chk;
	}

	public String getAprv_slip_occr_dt(){
		return this.aprv_slip_occr_dt;
	}

	public String getAprv_slip_clsf(){
		return this.aprv_slip_clsf;
	}

	public String getAprv_slip_occr_seqo(){
		return this.aprv_slip_occr_seqo;
	}

	public String getAprv_slip_occr_sub_seq(){
		return this.aprv_slip_occr_sub_seq;
	}

	public String getPch_budg_cdnm(){
		return this.pch_budg_cdnm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getPch_count(){
		return this.pch_count;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRmtt_dwload_dt(){
		return this.rmtt_dwload_dt;
	}

	public String getAprv_slip_no(){
		return this.aprv_slip_no;
	}
}

/* 작성시간 : Fri Apr 24 13:50:37 KST 2009 */