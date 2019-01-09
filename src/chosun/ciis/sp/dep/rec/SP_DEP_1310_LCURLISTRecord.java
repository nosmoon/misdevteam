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


public class SP_DEP_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_yymm;
	public String dlco_nm;
	public String dlco_no;
	public String sale_item_cd_nm;
	public String stot_amt;
	public String clamt;
	public String misu_amt;
	public String sp_comp_chrg_pers_emp_nm;

	public SP_DEP_1310_LCURLISTRecord(){}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSale_item_cd_nm(String sale_item_cd_nm){
		this.sale_item_cd_nm = sale_item_cd_nm;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setClamt(String clamt){
		this.clamt = clamt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setSp_comp_chrg_pers_emp_nm(String sp_comp_chrg_pers_emp_nm){
		this.sp_comp_chrg_pers_emp_nm = sp_comp_chrg_pers_emp_nm;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSale_item_cd_nm(){
		return this.sale_item_cd_nm;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getClamt(){
		return this.clamt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getSp_comp_chrg_pers_emp_nm(){
		return this.sp_comp_chrg_pers_emp_nm;
	}
}

/* 작성시간 : Tue Aug 21 19:31:59 KST 2012 */