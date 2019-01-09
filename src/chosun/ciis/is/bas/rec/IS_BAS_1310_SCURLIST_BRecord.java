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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1310_SCURLIST_BRecord extends java.lang.Object implements java.io.Serializable{

	public String b_cmpy_cd;
	public String b_dlco_clsf;
	public String b_dlco_cd;
	public String b_dlco_seq;
	public String b_sale_item_cd;
	public String b_sale_item_nm;
	public String b_cntr_dt;
	public String b_expy_dt;
	public String b_fst_clamt_mm;
	public String b_amt;
	public String b_clamt_mthd_cd;
	public String b_pay_cntr_clsf;
	public String b_remk;
	public String b_chg_pers;

	public IS_BAS_1310_SCURLIST_BRecord(){}

	public void setB_cmpy_cd(String b_cmpy_cd){
		this.b_cmpy_cd = b_cmpy_cd;
	}

	public void setB_dlco_clsf(String b_dlco_clsf){
		this.b_dlco_clsf = b_dlco_clsf;
	}

	public void setB_dlco_cd(String b_dlco_cd){
		this.b_dlco_cd = b_dlco_cd;
	}

	public void setB_dlco_seq(String b_dlco_seq){
		this.b_dlco_seq = b_dlco_seq;
	}

	public void setB_sale_item_cd(String b_sale_item_cd){
		this.b_sale_item_cd = b_sale_item_cd;
	}

	public void setB_sale_item_nm(String b_sale_item_nm){
		this.b_sale_item_nm = b_sale_item_nm;
	}

	public void setB_cntr_dt(String b_cntr_dt){
		this.b_cntr_dt = b_cntr_dt;
	}

	public void setB_expy_dt(String b_expy_dt){
		this.b_expy_dt = b_expy_dt;
	}

	public void setB_fst_clamt_mm(String b_fst_clamt_mm){
		this.b_fst_clamt_mm = b_fst_clamt_mm;
	}

	public void setB_amt(String b_amt){
		this.b_amt = b_amt;
	}

	public void setB_clamt_mthd_cd(String b_clamt_mthd_cd){
		this.b_clamt_mthd_cd = b_clamt_mthd_cd;
	}

	public void setB_pay_cntr_clsf(String b_pay_cntr_clsf){
		this.b_pay_cntr_clsf = b_pay_cntr_clsf;
	}

	public void setB_remk(String b_remk){
		this.b_remk = b_remk;
	}

	public void setB_chg_pers(String b_chg_pers){
		this.b_chg_pers = b_chg_pers;
	}

	public String getB_cmpy_cd(){
		return this.b_cmpy_cd;
	}

	public String getB_dlco_clsf(){
		return this.b_dlco_clsf;
	}

	public String getB_dlco_cd(){
		return this.b_dlco_cd;
	}

	public String getB_dlco_seq(){
		return this.b_dlco_seq;
	}

	public String getB_sale_item_cd(){
		return this.b_sale_item_cd;
	}

	public String getB_sale_item_nm(){
		return this.b_sale_item_nm;
	}

	public String getB_cntr_dt(){
		return this.b_cntr_dt;
	}

	public String getB_expy_dt(){
		return this.b_expy_dt;
	}

	public String getB_fst_clamt_mm(){
		return this.b_fst_clamt_mm;
	}

	public String getB_amt(){
		return this.b_amt;
	}

	public String getB_clamt_mthd_cd(){
		return this.b_clamt_mthd_cd;
	}

	public String getB_pay_cntr_clsf(){
		return this.b_pay_cntr_clsf;
	}

	public String getB_remk(){
		return this.b_remk;
	}

	public String getB_chg_pers(){
		return this.b_chg_pers;
	}
}

/* 작성시간 : Mon May 21 14:51:43 KST 2012 */