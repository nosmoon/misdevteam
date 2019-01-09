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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_3825_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String a_sale_yymm;
	public String a_sale_seq;
	public String a_sale_item_cd_nm;
	public String a_suply_amt;
	public String a_vat_amt;
	public String a_tot_rvord_amt;

	public SP_SAL_3825_SCURLISTRecord(){}

	public void setA_sale_yymm(String a_sale_yymm){
		this.a_sale_yymm = a_sale_yymm;
	}

	public void setA_sale_seq(String a_sale_seq){
		this.a_sale_seq = a_sale_seq;
	}

	public void setA_sale_item_cd_nm(String a_sale_item_cd_nm){
		this.a_sale_item_cd_nm = a_sale_item_cd_nm;
	}

	public void setA_suply_amt(String a_suply_amt){
		this.a_suply_amt = a_suply_amt;
	}

	public void setA_vat_amt(String a_vat_amt){
		this.a_vat_amt = a_vat_amt;
	}

	public void setA_tot_rvord_amt(String a_tot_rvord_amt){
		this.a_tot_rvord_amt = a_tot_rvord_amt;
	}

	public String getA_sale_yymm(){
		return this.a_sale_yymm;
	}

	public String getA_sale_seq(){
		return this.a_sale_seq;
	}

	public String getA_sale_item_cd_nm(){
		return this.a_sale_item_cd_nm;
	}

	public String getA_suply_amt(){
		return this.a_suply_amt;
	}

	public String getA_vat_amt(){
		return this.a_vat_amt;
	}

	public String getA_tot_rvord_amt(){
		return this.a_tot_rvord_amt;
	}
}

/* 작성시간 : Thu Aug 02 17:57:43 KST 2012 */