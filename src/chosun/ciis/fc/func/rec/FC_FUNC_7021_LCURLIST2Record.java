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


public class FC_FUNC_7021_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String repay_dt;
	public String repay_amt;
	public String repay_rmks;
	public String repay_slip_no;
	public String nomach_adpay_bal;

	public FC_FUNC_7021_LCURLIST2Record(){}

	public void setRepay_dt(String repay_dt){
		this.repay_dt = repay_dt;
	}

	public void setRepay_amt(String repay_amt){
		this.repay_amt = repay_amt;
	}

	public void setRepay_rmks(String repay_rmks){
		this.repay_rmks = repay_rmks;
	}

	public void setRepay_slip_no(String repay_slip_no){
		this.repay_slip_no = repay_slip_no;
	}

	public void setNomach_adpay_bal(String nomach_adpay_bal){
		this.nomach_adpay_bal = nomach_adpay_bal;
	}

	public String getRepay_dt(){
		return this.repay_dt;
	}

	public String getRepay_amt(){
		return this.repay_amt;
	}

	public String getRepay_rmks(){
		return this.repay_rmks;
	}

	public String getRepay_slip_no(){
		return this.repay_slip_no;
	}

	public String getNomach_adpay_bal(){
		return this.nomach_adpay_bal;
	}
}

/* 작성시간 : Mon Apr 13 15:59:36 KST 2009 */