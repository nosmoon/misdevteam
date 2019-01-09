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


public class FC_ACCT_2232_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_rcpm_dt;
	public String rcpm_amt;
	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String rcpm_slip_no;
	public String tax_no;
	public String rcpm_no;

	public FC_ACCT_2232_SCURLISTRecord(){}

	public void setSlip_rcpm_dt(String slip_rcpm_dt){
		this.slip_rcpm_dt = slip_rcpm_dt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setTax_no(String tax_no){
		this.tax_no = tax_no;
	}

	public void setRcpm_no(String rcpm_no){
		this.rcpm_no = rcpm_no;
	}

	public String getSlip_rcpm_dt(){
		return this.slip_rcpm_dt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getTax_no(){
		return this.tax_no;
	}

	public String getRcpm_no(){
		return this.rcpm_no;
	}
}

/* 작성시간 : Fri Aug 14 17:55:52 KST 2009 */