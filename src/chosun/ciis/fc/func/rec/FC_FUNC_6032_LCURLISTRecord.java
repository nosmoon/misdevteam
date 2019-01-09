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


public class FC_FUNC_6032_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String recp_dt;
	public String tot_int_amt;
	public String corp_tax_amt;
	public String aft_tax_int_amt;
	public String rmks;
	public String unrcp_precpt_bal;
	public String jpno;

	public FC_FUNC_6032_LCURLISTRecord(){}

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
	}

	public void setTot_int_amt(String tot_int_amt){
		this.tot_int_amt = tot_int_amt;
	}

	public void setCorp_tax_amt(String corp_tax_amt){
		this.corp_tax_amt = corp_tax_amt;
	}

	public void setAft_tax_int_amt(String aft_tax_int_amt){
		this.aft_tax_int_amt = aft_tax_int_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setUnrcp_precpt_bal(String unrcp_precpt_bal){
		this.unrcp_precpt_bal = unrcp_precpt_bal;
	}

	public void setJpno(String jpno){
		this.jpno = jpno;
	}

	public String getRecp_dt(){
		return this.recp_dt;
	}

	public String getTot_int_amt(){
		return this.tot_int_amt;
	}

	public String getCorp_tax_amt(){
		return this.corp_tax_amt;
	}

	public String getAft_tax_int_amt(){
		return this.aft_tax_int_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getUnrcp_precpt_bal(){
		return this.unrcp_precpt_bal;
	}

	public String getJpno(){
		return this.jpno;
	}
}

/* 작성시간 : Tue Mar 17 15:47:29 KST 2009 */