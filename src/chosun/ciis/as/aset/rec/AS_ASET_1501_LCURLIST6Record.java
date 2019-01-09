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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1501_LCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String etc_budg_cd;
	public String etc_budg_nm;
	public String etc_rcpm_amt;
	public String etc_bal_occr_slip_clsf;
	public String etc_bal_occr_slip_no;
	public String etc_sub_seq;

	public AS_ASET_1501_LCURLIST6Record(){}

	public void setEtc_budg_cd(String etc_budg_cd){
		this.etc_budg_cd = etc_budg_cd;
	}

	public void setEtc_budg_nm(String etc_budg_nm){
		this.etc_budg_nm = etc_budg_nm;
	}

	public void setEtc_rcpm_amt(String etc_rcpm_amt){
		this.etc_rcpm_amt = etc_rcpm_amt;
	}

	public void setEtc_bal_occr_slip_clsf(String etc_bal_occr_slip_clsf){
		this.etc_bal_occr_slip_clsf = etc_bal_occr_slip_clsf;
	}

	public void setEtc_bal_occr_slip_no(String etc_bal_occr_slip_no){
		this.etc_bal_occr_slip_no = etc_bal_occr_slip_no;
	}

	public void setEtc_sub_seq(String etc_sub_seq){
		this.etc_sub_seq = etc_sub_seq;
	}

	public String getEtc_budg_cd(){
		return this.etc_budg_cd;
	}

	public String getEtc_budg_nm(){
		return this.etc_budg_nm;
	}

	public String getEtc_rcpm_amt(){
		return this.etc_rcpm_amt;
	}

	public String getEtc_bal_occr_slip_clsf(){
		return this.etc_bal_occr_slip_clsf;
	}

	public String getEtc_bal_occr_slip_no(){
		return this.etc_bal_occr_slip_no;
	}

	public String getEtc_sub_seq(){
		return this.etc_sub_seq;
	}
}

/* 작성시간 : Wed May 27 11:18:13 KST 2009 */