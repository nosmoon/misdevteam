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


public class FC_ACCT_6034_LCURLIST11Record extends java.lang.Object implements java.io.Serializable{

	public String data_clsf;
	public String tax_clsf;
	public String ern;
	public String ern_nm;
	public String cnt;
	public String suply_amt;
	public String vat_amt;
	public String total_amt;

	public FC_ACCT_6034_LCURLIST11Record(){}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErn_nm(String ern_nm){
		this.ern_nm = ern_nm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTotal_amt(String total_amt){
		this.total_amt = total_amt;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErn_nm(){
		return this.ern_nm;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTotal_amt(){
		return this.total_amt;
	}
}

/* 작성시간 : Thu Jul 23 16:22:59 KST 2015 */