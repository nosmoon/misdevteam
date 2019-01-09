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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1009_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String item_cd;
	public String item_nm;
	public String unit_cd;
	public String unit_nm;
	public String redm_clsf;
	public String redm_nm;
	public String redm_mthd_cd;
	public String redm_mthd_nm;
	public String svc_yys_cnt;
	public String budg_cd;
	public String budg_nm;

	public AS_ASET_1009_LCURLISTRecord(){}

	public void setItem_cd(String item_cd){
		this.item_cd = item_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setUnit_cd(String unit_cd){
		this.unit_cd = unit_cd;
	}

	public void setUnit_nm(String unit_nm){
		this.unit_nm = unit_nm;
	}

	public void setRedm_clsf(String redm_clsf){
		this.redm_clsf = redm_clsf;
	}

	public void setRedm_nm(String redm_nm){
		this.redm_nm = redm_nm;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setRedm_mthd_nm(String redm_mthd_nm){
		this.redm_mthd_nm = redm_mthd_nm;
	}

	public void setSvc_yys_cnt(String svc_yys_cnt){
		this.svc_yys_cnt = svc_yys_cnt;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public String getItem_cd(){
		return this.item_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getUnit_cd(){
		return this.unit_cd;
	}

	public String getUnit_nm(){
		return this.unit_nm;
	}

	public String getRedm_clsf(){
		return this.redm_clsf;
	}

	public String getRedm_nm(){
		return this.redm_nm;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getRedm_mthd_nm(){
		return this.redm_mthd_nm;
	}

	public String getSvc_yys_cnt(){
		return this.svc_yys_cnt;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}
}

/* 작성시간 : Tue Mar 03 17:55:31 KST 2009 */