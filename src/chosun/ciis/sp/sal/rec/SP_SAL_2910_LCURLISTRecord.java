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


public class SP_SAL_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_item_cd_nm;
	public String pre_misu;
	public String cur_stot_amt;
	public String sale_cost;
	public String sale_profit;
	public String cur_in_amt;
	public String misu_amt;

	public SP_SAL_2910_LCURLISTRecord(){}

	public void setSale_item_cd_nm(String sale_item_cd_nm){
		this.sale_item_cd_nm = sale_item_cd_nm;
	}

	public void setPre_misu(String pre_misu){
		this.pre_misu = pre_misu;
	}

	public void setCur_stot_amt(String cur_stot_amt){
		this.cur_stot_amt = cur_stot_amt;
	}

	public void setSale_cost(String sale_cost){
		this.sale_cost = sale_cost;
	}

	public void setSale_profit(String sale_profit){
		this.sale_profit = sale_profit;
	}

	public void setCur_in_amt(String cur_in_amt){
		this.cur_in_amt = cur_in_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public String getSale_item_cd_nm(){
		return this.sale_item_cd_nm;
	}

	public String getPre_misu(){
		return this.pre_misu;
	}

	public String getCur_stot_amt(){
		return this.cur_stot_amt;
	}

	public String getSale_cost(){
		return this.sale_cost;
	}

	public String getSale_profit(){
		return this.sale_profit;
	}

	public String getCur_in_amt(){
		return this.cur_in_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}
}

/* 작성시간 : Sun Jul 22 16:31:36 KST 2012 */