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


public class FC_ACCT_2125_SCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String g3_rcpm_sub_seq;
	public String g3_budg_cd;
	public String g3_budg_cd_nm;
	public String g3_rcpm_amt;
	public String g3_whco_slip_clsf;
	public String g3_whco_slip_no;

	public FC_ACCT_2125_SCURLIST3Record(){}

	public void setG3_rcpm_sub_seq(String g3_rcpm_sub_seq){
		this.g3_rcpm_sub_seq = g3_rcpm_sub_seq;
	}

	public void setG3_budg_cd(String g3_budg_cd){
		this.g3_budg_cd = g3_budg_cd;
	}

	public void setG3_budg_cd_nm(String g3_budg_cd_nm){
		this.g3_budg_cd_nm = g3_budg_cd_nm;
	}

	public void setG3_rcpm_amt(String g3_rcpm_amt){
		this.g3_rcpm_amt = g3_rcpm_amt;
	}

	public void setG3_whco_slip_clsf(String g3_whco_slip_clsf){
		this.g3_whco_slip_clsf = g3_whco_slip_clsf;
	}

	public void setG3_whco_slip_no(String g3_whco_slip_no){
		this.g3_whco_slip_no = g3_whco_slip_no;
	}

	public String getG3_rcpm_sub_seq(){
		return this.g3_rcpm_sub_seq;
	}

	public String getG3_budg_cd(){
		return this.g3_budg_cd;
	}

	public String getG3_budg_cd_nm(){
		return this.g3_budg_cd_nm;
	}

	public String getG3_rcpm_amt(){
		return this.g3_rcpm_amt;
	}

	public String getG3_whco_slip_clsf(){
		return this.g3_whco_slip_clsf;
	}

	public String getG3_whco_slip_no(){
		return this.g3_whco_slip_no;
	}
}

/* 작성시간 : Fri Aug 14 15:33:11 KST 2009 */