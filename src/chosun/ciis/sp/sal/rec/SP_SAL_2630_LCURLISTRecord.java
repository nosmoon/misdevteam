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


public class SP_SAL_2630_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_item_cd_sort;
	public String sale_item_cd_nm;
	public String gds_nm;
	public String sale_amt;
	public String vat_amt;
	public String stot_amt;

	public SP_SAL_2630_LCURLISTRecord(){}

	public void setSale_item_cd_sort(String sale_item_cd_sort){
		this.sale_item_cd_sort = sale_item_cd_sort;
	}

	public void setSale_item_cd_nm(String sale_item_cd_nm){
		this.sale_item_cd_nm = sale_item_cd_nm;
	}

	public void setGds_nm(String gds_nm){
		this.gds_nm = gds_nm;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public String getSale_item_cd_sort(){
		return this.sale_item_cd_sort;
	}

	public String getSale_item_cd_nm(){
		return this.sale_item_cd_nm;
	}

	public String getGds_nm(){
		return this.gds_nm;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}
}

/* 작성시간 : Tue Aug 21 20:13:43 KST 2012 */