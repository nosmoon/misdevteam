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


public class FC_ACCT_2213_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String happen_slipno;
	public String in_slipno;
	public String slip_rcpm_dt;
	public String rcpm_dept_cd;
	public String rcpm_amt;

	public FC_ACCT_2213_LCURLISTRecord(){}

	public void setHappen_slipno(String happen_slipno){
		this.happen_slipno = happen_slipno;
	}

	public void setIn_slipno(String in_slipno){
		this.in_slipno = in_slipno;
	}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setRcpm_dept_cd(String rcpm_dept_cd){
		this.rcpm_dept_cd = rcpm_dept_cd;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public String getHappen_slipno(){
		return this.happen_slipno;
	}

	public String getIn_slipno(){
		return this.in_slipno;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getRcpm_dept_cd(){
		return this.rcpm_dept_cd;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}
}

/* 작성시간 : Fri Apr 17 17:52:42 KST 2009 */