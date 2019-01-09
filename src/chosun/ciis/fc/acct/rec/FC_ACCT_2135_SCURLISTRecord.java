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


public class FC_ACCT_2135_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_no;
	public String rcpm_slip_no;
	public String slip_no;
	public String occr_slip_no;
	public String rcpm_amt;

	public FC_ACCT_2135_SCURLISTRecord(){}

	public void setRcpm_no(String rcpm_no){
		this.rcpm_no = rcpm_no;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setOccr_slip_no(String occr_slip_no){
		this.occr_slip_no = occr_slip_no;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public String getRcpm_no(){
		return this.rcpm_no;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getOccr_slip_no(){
		return this.occr_slip_no;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}
}

/* 작성시간 : Sat Aug 08 11:15:42 KST 2009 */