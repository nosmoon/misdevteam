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


package chosun.ciis.sp.dep.rec;

import java.sql.*;
import chosun.ciis.sp.dep.dm.*;
import chosun.ciis.sp.dep.ds.*;

/**
 * 
 */


public class SP_DEP_1051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_suply_amt;
	public String rcpm_vat;
	public String sale_yymm;
	public String sale_seq;
	public String sale_item_cd_nm;
	public String suply_amt;
	public String vat_amt;
	public String unrcpm_suply_amt;
	public String unrcpm_vat_amt;

	public SP_DEP_1051_LCURLISTRecord(){}

	public void setRcpm_suply_amt(String rcpm_suply_amt){
		this.rcpm_suply_amt = rcpm_suply_amt;
	}

	public void setRcpm_vat(String rcpm_vat){
		this.rcpm_vat = rcpm_vat;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSale_seq(String sale_seq){
		this.sale_seq = sale_seq;
	}

	public void setSale_item_cd_nm(String sale_item_cd_nm){
		this.sale_item_cd_nm = sale_item_cd_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setUnrcpm_suply_amt(String unrcpm_suply_amt){
		this.unrcpm_suply_amt = unrcpm_suply_amt;
	}

	public void setUnrcpm_vat_amt(String unrcpm_vat_amt){
		this.unrcpm_vat_amt = unrcpm_vat_amt;
	}

	public String getRcpm_suply_amt(){
		return this.rcpm_suply_amt;
	}

	public String getRcpm_vat(){
		return this.rcpm_vat;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getSale_seq(){
		return this.sale_seq;
	}

	public String getSale_item_cd_nm(){
		return this.sale_item_cd_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getUnrcpm_suply_amt(){
		return this.unrcpm_suply_amt;
	}

	public String getUnrcpm_vat_amt(){
		return this.unrcpm_vat_amt;
	}
}

/* 작성시간 : Fri Jul 27 19:41:10 KST 2012 */