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


public class FC_ACCT_2231_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String ask_dept_nm;
	public String stmt_slip_no;
	public String tax_amt;
	public String rcpm_amt;
	public String diff_amt;
	public String diff_amt1;

	public FC_ACCT_2231_LCURLISTRecord(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAsk_dept_nm(String ask_dept_nm){
		this.ask_dept_nm = ask_dept_nm;
	}

	public void setStmt_slip_no(String stmt_slip_no){
		this.stmt_slip_no = stmt_slip_no;
	}

	public void setTax_amt(String tax_amt){
		this.tax_amt = tax_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setDiff_amt1(String diff_amt1){
		this.diff_amt1 = diff_amt1;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAsk_dept_nm(){
		return this.ask_dept_nm;
	}

	public String getStmt_slip_no(){
		return this.stmt_slip_no;
	}

	public String getTax_amt(){
		return this.tax_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getDiff_amt1(){
		return this.diff_amt1;
	}
}

/* 작성시간 : Fri Aug 14 17:51:21 KST 2009 */