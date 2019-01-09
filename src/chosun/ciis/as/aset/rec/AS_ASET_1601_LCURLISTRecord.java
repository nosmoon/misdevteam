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


public class AS_ASET_1601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String sale_now_acqr_amt;
	public String sale_redm_tot_amt;
	public String sale_un_redm_amt;
	public String sale_pfls_amt;

	public AS_ASET_1601_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setSale_now_acqr_amt(String sale_now_acqr_amt){
		this.sale_now_acqr_amt = sale_now_acqr_amt;
	}

	public void setSale_redm_tot_amt(String sale_redm_tot_amt){
		this.sale_redm_tot_amt = sale_redm_tot_amt;
	}

	public void setSale_un_redm_amt(String sale_un_redm_amt){
		this.sale_un_redm_amt = sale_un_redm_amt;
	}

	public void setSale_pfls_amt(String sale_pfls_amt){
		this.sale_pfls_amt = sale_pfls_amt;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getSale_now_acqr_amt(){
		return this.sale_now_acqr_amt;
	}

	public String getSale_redm_tot_amt(){
		return this.sale_redm_tot_amt;
	}

	public String getSale_un_redm_amt(){
		return this.sale_un_redm_amt;
	}

	public String getSale_pfls_amt(){
		return this.sale_pfls_amt;
	}
}

/* 작성시간 : Mon Sep 14 15:00:13 KST 2009 */