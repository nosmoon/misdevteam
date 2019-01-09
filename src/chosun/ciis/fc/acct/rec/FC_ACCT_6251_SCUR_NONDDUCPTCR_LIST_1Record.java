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


public class FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String non_dduc_resn_clsf;
	public String non_dduc_resn_clsf_nm;
	public int tax_stmt_num_shet;
	public long suply_amt;
	public int vat_amt;

	public FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record(){}

	public void setNon_dduc_resn_clsf(String non_dduc_resn_clsf){
		this.non_dduc_resn_clsf = non_dduc_resn_clsf;
	}

	public void setNon_dduc_resn_clsf_nm(String non_dduc_resn_clsf_nm){
		this.non_dduc_resn_clsf_nm = non_dduc_resn_clsf_nm;
	}

	public void setTax_stmt_num_shet(int tax_stmt_num_shet){
		this.tax_stmt_num_shet = tax_stmt_num_shet;
	}

	public void setSuply_amt(long suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(int vat_amt){
		this.vat_amt = vat_amt;
	}

	public String getNon_dduc_resn_clsf(){
		return this.non_dduc_resn_clsf;
	}

	public String getNon_dduc_resn_clsf_nm(){
		return this.non_dduc_resn_clsf_nm;
	}

	public int getTax_stmt_num_shet(){
		return this.tax_stmt_num_shet;
	}

	public long getSuply_amt(){
		return this.suply_amt;
	}

	public int getVat_amt(){
		return this.vat_amt;
	}
}

/* 작성시간 : Tue Jan 12 16:31:29 KST 2016 */