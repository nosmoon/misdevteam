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


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_2710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String dept_nm;
	public String dept_cd;
	public String part_nm;
	public String sub_dept_cd;
	public String area_nm;
	public String area_cd;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String bgn_mm;
	public String end_mm;
	public String months;
	public String src_months;
	public String damt_decid_amt;
	public String result_amt;
	public String widr_yn;
	public String widr_bgn_mm;
	public String widr_amt;

	public SE_SAL_2710_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setBgn_mm(String bgn_mm){
		this.bgn_mm = bgn_mm;
	}

	public void setEnd_mm(String end_mm){
		this.end_mm = end_mm;
	}

	public void setMonths(String months){
		this.months = months;
	}

	public void setSrc_months(String src_months){
		this.src_months = src_months;
	}

	public void setDamt_decid_amt(String damt_decid_amt){
		this.damt_decid_amt = damt_decid_amt;
	}

	public void setResult_amt(String result_amt){
		this.result_amt = result_amt;
	}

	public void setWidr_yn(String widr_yn){
		this.widr_yn = widr_yn;
	}

	public void setWidr_bgn_mm(String widr_bgn_mm){
		this.widr_bgn_mm = widr_bgn_mm;
	}

	public void setWidr_amt(String widr_amt){
		this.widr_amt = widr_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getBgn_mm(){
		return this.bgn_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getMonths(){
		return this.months;
	}

	public String getSrc_months(){
		return this.src_months;
	}

	public String getDamt_decid_amt(){
		return this.damt_decid_amt;
	}

	public String getResult_amt(){
		return this.result_amt;
	}

	public String getWidr_yn(){
		return this.widr_yn;
	}

	public String getWidr_bgn_mm(){
		return this.widr_bgn_mm;
	}

	public String getWidr_amt(){
		return this.widr_amt;
	}
}

/* 작성시간 : Tue Nov 26 17:35:50 KST 2013 */