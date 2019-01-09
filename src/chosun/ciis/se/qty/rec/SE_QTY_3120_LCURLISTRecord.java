/***************************************************************************************************
* 파일명 : SE_QTY_3120_LCURLISTRecord.java
* 기능 : 부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_3120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt		;
	public String dept_nm		;
	public String sub_dept_nm	;
	public String area_nm		;
	public String bo_nm			;
	public String before_qty	;
	public String qty			;
	public String after_qty		;

	public SE_QTY_3120_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_nm(String sub_dept_nm){
		this.sub_dept_nm = sub_dept_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBefore_qty(String before_qty){
		this.before_qty = before_qty;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAfter_qty(String after_qty){
		this.after_qty = after_qty;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_nm(){
		return this.sub_dept_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBefore_qty(){
		return this.before_qty;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAfter_qty(){
		return this.after_qty;
	}
}

/* 작성시간 : Wed Mar 11 13:56:42 KST 2009 */