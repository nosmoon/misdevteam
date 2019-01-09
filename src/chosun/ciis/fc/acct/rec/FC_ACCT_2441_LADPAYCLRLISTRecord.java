/***************************************************************************************************
* 파일명 : FC_ACCT_2441_L
* 기능 : 선급금정리내역조회
* 작성일자 : 2009-01-13
* 작성자 : 전현표
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
 * 선급금정리내역조회
 *
 */

public class FC_ACCT_2441_LADPAYCLRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rmks1a;
	public String fisc_dta;
	public int occr_amt;
	public int actu_adpay_bal;
	public String fisc_dtb;
	public String rmks1b;
	public int amt;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String sub_seq;
	public String arow_no;

	public FC_ACCT_2441_LADPAYCLRLISTRecord(){}

	public void setRmks1a(String rmks1a){
		this.rmks1a = rmks1a;
	}

	public void setFisc_dta(String fisc_dta){
		this.fisc_dta = fisc_dta;
	}

	public void setOccr_amt(int occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setActu_adpay_bal(int actu_adpay_bal){
		this.actu_adpay_bal = actu_adpay_bal;
	}

	public void setFisc_dtb(String fisc_dtb){
		this.fisc_dtb = fisc_dtb;
	}

	public void setRmks1b(String rmks1b){
		this.rmks1b = rmks1b;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setArow_no(String arow_no){
		this.arow_no = arow_no;
	}

	public String getRmks1a(){
		return this.rmks1a;
	}

	public String getFisc_dta(){
		return this.fisc_dta;
	}

	public int getOccr_amt(){
		return this.occr_amt;
	}

	public int getActu_adpay_bal(){
		return this.actu_adpay_bal;
	}

	public String getFisc_dtb(){
		return this.fisc_dtb;
	}

	public String getRmks1b(){
		return this.rmks1b;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getArow_no(){
		return this.arow_no;
	}
}

/* 작성시간 : Tue Jan 20 16:52:41 KST 2009 */
