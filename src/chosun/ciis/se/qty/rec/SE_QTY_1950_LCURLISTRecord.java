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


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_1950_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String dept_cd;
	public String part_nm;
	public String part_cd;
	public String area_nm;
	public String area_cd;
	public String bo_cd;
	public String bo_nm;
	public String qty;
	public String thmmqty;

	public SE_QTY_1950_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
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

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setThmmqty(String thmmqty){
		this.thmmqty = thmmqty;
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

	public String getPart_cd(){
		return this.part_cd;
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

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getThmmqty(){
		return this.thmmqty;
	}
}

/* 작성시간 : Thu Feb 20 19:14:22 KST 2014 */