/***************************************************************************************************
* 파일명 : SE_QTY_2910_LCURLISTRecord.java
* 기능 : 부수관리 - 발송부수 - 발송부수변동현황
* 작성일자 : 2009-03-09
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


public class SE_QTY_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_cd   ;
	public String dept_nm   ;	
	public String part_cd   ;
	public String part_nm   ;
	public String area_cd   ;
	public String area_nm   ;
	public String bo_cd     ;
	public String bo_seq    ;
	public String bo_nm     ;
	public String issu_dt	;
	public String icdc_qty	;
	public String send_qty	;

	public SE_QTY_2910_LCURLISTRecord(){}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}
	
	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
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

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}
	
	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}
	
	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setSend_qty(String send_qty){
		this.send_qty = send_qty;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}
	
	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
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

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}
	
	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getSend_qty(){
		return this.send_qty;
	}
}

/* 작성시간 : Mon Mar 09 15:32:49 KST 2009 */