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


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_2012_1221_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prsn_pens;
	public String pens_savg;
	public String hous_subc_savg;
	public String multy_house_plan_savg;
	public String ltrm_hous_savg;
	public String labr_hous_savg;
	public String ltrm_stok_type_savg_incm_dduc1;
	public String ltrm_stok_type_savg_incm_dduc2;
	public String ltrm_stok_type_savg_incm_dduc3;
	public String lvcmpy_pens;

	public HD_YADJM_2012_1221_LCURLISTRecord(){}

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

	public void setLtrm_stok_type_savg_incm_dduc1(String ltrm_stok_type_savg_incm_dduc1){
		this.ltrm_stok_type_savg_incm_dduc1 = ltrm_stok_type_savg_incm_dduc1;
	}

	public void setLtrm_stok_type_savg_incm_dduc2(String ltrm_stok_type_savg_incm_dduc2){
		this.ltrm_stok_type_savg_incm_dduc2 = ltrm_stok_type_savg_incm_dduc2;
	}

	public void setLtrm_stok_type_savg_incm_dduc3(String ltrm_stok_type_savg_incm_dduc3){
		this.ltrm_stok_type_savg_incm_dduc3 = ltrm_stok_type_savg_incm_dduc3;
	}

	public void setLvcmpy_pens(String lvcmpy_pens){
		this.lvcmpy_pens = lvcmpy_pens;
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

	public String getLtrm_stok_type_savg_incm_dduc1(){
		return this.ltrm_stok_type_savg_incm_dduc1;
	}

	public String getLtrm_stok_type_savg_incm_dduc2(){
		return this.ltrm_stok_type_savg_incm_dduc2;
	}

	public String getLtrm_stok_type_savg_incm_dduc3(){
		return this.ltrm_stok_type_savg_incm_dduc3;
	}

	public String getLvcmpy_pens(){
		return this.lvcmpy_pens;
	}
}

/* 작성시간 : Wed Jan 16 02:00:27 KST 2013 */