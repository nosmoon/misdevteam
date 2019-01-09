/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2015_1221_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prsn_pens;
	public String pens_savg;
	public String hous_subc_savg;
	public String multy_house_plan_savg;
	public String ltrm_hous_savg;
	public String labr_hous_savg;
	public String lvcmpy_pens;
	public String ltrm_invsm_stock_amt;

	public HD_YADJM_2015_1221_LCURLISTRecord(){}

	public void setPrsn_pens(String prsn_pens){
		this.prsn_pens = prsn_pens;
	}

	public void setPens_savg(String pens_savg){
		this.pens_savg = pens_savg;
	}

	public void setHous_subc_savg(String hous_subc_savg){
		this.hous_subc_savg = hous_subc_savg;
	}

	public void setMulty_house_plan_savg(String multy_house_plan_savg){
		this.multy_house_plan_savg = multy_house_plan_savg;
	}

	public void setLtrm_hous_savg(String ltrm_hous_savg){
		this.ltrm_hous_savg = ltrm_hous_savg;
	}

	public void setLabr_hous_savg(String labr_hous_savg){
		this.labr_hous_savg = labr_hous_savg;
	}

	public void setLvcmpy_pens(String lvcmpy_pens){
		this.lvcmpy_pens = lvcmpy_pens;
	}

	public void setLtrm_invsm_stock_amt(String ltrm_invsm_stock_amt){
		this.ltrm_invsm_stock_amt = ltrm_invsm_stock_amt;
	}

	public String getPrsn_pens(){
		return this.prsn_pens;
	}

	public String getPens_savg(){
		return this.pens_savg;
	}

	public String getHous_subc_savg(){
		return this.hous_subc_savg;
	}

	public String getMulty_house_plan_savg(){
		return this.multy_house_plan_savg;
	}

	public String getLtrm_hous_savg(){
		return this.ltrm_hous_savg;
	}

	public String getLabr_hous_savg(){
		return this.labr_hous_savg;
	}

	public String getLvcmpy_pens(){
		return this.lvcmpy_pens;
	}

	public String getLtrm_invsm_stock_amt(){
		return this.ltrm_invsm_stock_amt;
	}
}

/* 작성시간 : Thu Jan 14 19:52:30 KST 2016 */