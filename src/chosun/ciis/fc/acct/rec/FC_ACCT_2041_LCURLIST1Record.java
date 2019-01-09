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


public class FC_ACCT_2041_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String occr_amt;
	public String actu_adpay_bal;
	public String rest_amt;

	public FC_ACCT_2041_LCURLIST1Record(){}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setActu_adpay_bal(String actu_adpay_bal){
		this.actu_adpay_bal = actu_adpay_bal;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
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
}

/* 작성시간 : Wed Feb 04 17:28:13 KST 2009 */