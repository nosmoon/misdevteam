/***************************************************************************************************
* 파일명 : SE_SAL_2210_LCURLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 매체별매출현황
* 작성일자 : 2009-04-07
* 작성자 : 김대준
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


public class SE_SAL_2210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm			;
	public String sub_dept_cd		;
	public String sub_dept_nm		;
	public String area_cd			;
	public String area_nm			;
	public String bo_cd				;
	public String bo_nm				;
	public String bo_head_nm		;
	public String val_qty_110		;
	public String sale_amt_110		;
	public String net_sale_amt_110	;
	public String val_qty_130		;
	public String sale_amt_130		;
	public String net_sale_amt_130	;
	public String sale_amt			;
	public String net_sale_amt		;

	public SE_SAL_2210_LCURLISTRecord(){}

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

	public void setVal_qty_110(String val_qty_110){
		this.val_qty_110 = val_qty_110;
	}

	public void setSale_amt_110(String sale_amt_110){
		this.sale_amt_110 = sale_amt_110;
	}

	public void setNet_sale_amt_110(String net_sale_amt_110){
		this.net_sale_amt_110 = net_sale_amt_110;
	}

	public void setVal_qty_130(String val_qty_130){
		this.val_qty_130 = val_qty_130;
	}

	public void setSale_amt_130(String sale_amt_130){
		this.sale_amt_130 = sale_amt_130;
	}

	public void setNet_sale_amt_130(String net_sale_amt_130){
		this.net_sale_amt_130 = net_sale_amt_130;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
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

	public String getVal_qty_110(){
		return this.val_qty_110;
	}

	public String getSale_amt_110(){
		return this.sale_amt_110;
	}

	public String getNet_sale_amt_110(){
		return this.net_sale_amt_110;
	}

	public String getVal_qty_130(){
		return this.val_qty_130;
	}

	public String getSale_amt_130(){
		return this.sale_amt_130;
	}

	public String getNet_sale_amt_130(){
		return this.net_sale_amt_130;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}
}

/* 작성시간 : Tue Apr 07 14:54:25 KST 2009 */