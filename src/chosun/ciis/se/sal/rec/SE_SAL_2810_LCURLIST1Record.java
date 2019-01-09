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


public class SE_SAL_2810_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String area_cd;
	public String dept_cd;
	public String sub_dept_cd;
	public String bgn_mm;
	public String end_mm;
	public String damt_decid_amt;
	public String widr_yn;
	public String widr_bgn_mm;
	public String widr_amt;

	public SE_SAL_2810_LCURLIST1Record(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setBgn_mm(String bgn_mm){
		this.bgn_mm = bgn_mm;
	}

	public void setEnd_mm(String end_mm){
		this.end_mm = end_mm;
	}

	public void setDamt_decid_amt(String damt_decid_amt){
		this.damt_decid_amt = damt_decid_amt;
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

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getBgn_mm(){
		return this.bgn_mm;
	}

	public String getEnd_mm(){
		return this.end_mm;
	}

	public String getDamt_decid_amt(){
		return this.damt_decid_amt;
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

/* 작성시간 : Mon Dec 23 11:46:42 KST 2013 */