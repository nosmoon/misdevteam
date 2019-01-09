/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_obj_clsf;
	public String pay_obj_clsf_nm;
	public String dept_cd;
	public String dept_nm;
	public String sub_dept_cd;
	public String sub_dept_nm;
	public String area_cd;
	public String area_nm;
	public String bo_cd;
	public String bo_nm;
	public String bo_head_nm;
	public String qty;
	public String uprc;
	public String amt;
	public String incm_tax;
	public String res_tax;
	public String real_amt;

	public SE_ETC_1110_LCURLISTRecord(){}

	public void setPay_obj_clsf(String pay_obj_clsf){
		this.pay_obj_clsf = pay_obj_clsf;
	}

	public void setPay_obj_clsf_nm(String pay_obj_clsf_nm){
		this.pay_obj_clsf_nm = pay_obj_clsf_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setSub_dept_nm(String sub_dept_nm){
		this.sub_dept_nm = sub_dept_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setReal_amt(String real_amt){
		this.real_amt = real_amt;
	}

	public String getPay_obj_clsf(){
		return this.pay_obj_clsf;
	}

	public String getPay_obj_clsf_nm(){
		return this.pay_obj_clsf_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getSub_dept_nm(){
		return this.sub_dept_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getReal_amt(){
		return this.real_amt;
	}
}

/* 작성시간 : Thu Sep 17 15:15:20 KST 2009 */