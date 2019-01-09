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


public class FC_ACCT_2041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String slip_no;
	public String rmks1;
	public String fisc_dt;
	public String occr_amt;
	public String actu_adpay_bal;
	public String rest_amt;
	public String evnt_cd;
	public String dept_nm;

	public FC_ACCT_2041_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setActu_adpay_bal(String actu_adpay_bal){
		this.actu_adpay_bal = actu_adpay_bal;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getChk(){
		return this.chk;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getActu_adpay_bal(){
		return this.actu_adpay_bal;
	}

	public String getRest_amt(){
		return this.rest_amt;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
}

/* 작성시간 : Wed Feb 04 17:28:13 KST 2009 */