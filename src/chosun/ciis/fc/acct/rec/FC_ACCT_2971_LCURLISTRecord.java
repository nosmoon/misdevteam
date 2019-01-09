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


public class FC_ACCT_2971_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_nm;
	public String budg_cdnm;
	public String amt;
	public String duty_dt;
	public String acct_rmtt_dt;
	public String acct_no;
	public String actu_slip_occr_seqo;
	public String aprv_slip_occr_seqo;

	public FC_ACCT_2971_LCURLISTRecord(){}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setAcct_rmtt_dt(String acct_rmtt_dt){
		this.acct_rmtt_dt = acct_rmtt_dt;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setActu_slip_occr_seqo(String actu_slip_occr_seqo){
		this.actu_slip_occr_seqo = actu_slip_occr_seqo;
	}

	public void setAprv_slip_occr_seqo(String aprv_slip_occr_seqo){
		this.aprv_slip_occr_seqo = aprv_slip_occr_seqo;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getAcct_rmtt_dt(){
		return this.acct_rmtt_dt;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getActu_slip_occr_seqo(){
		return this.actu_slip_occr_seqo;
	}

	public String getAprv_slip_occr_seqo(){
		return this.aprv_slip_occr_seqo;
	}
}

/* 작성시간 : Thu Jul 16 10:45:23 KST 2009 */