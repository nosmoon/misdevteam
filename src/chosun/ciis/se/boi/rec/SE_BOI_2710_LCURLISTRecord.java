/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_2710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_nm;
	public String bo_cd;
	public String yymm;
	public String rdr_qty;
	public String vari_qty;
	public String extn_qty;
	public String susp_qty;
	public String clamt;
	public String sale_amt;
	public String leaf_sales;
	public String leaf_purc;
	public String re_freeqty;
	public String meda_amt;

	public SE_BOI_2710_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setRdr_qty(String rdr_qty){
		this.rdr_qty = rdr_qty;
	}

	public void setVari_qty(String vari_qty){
		this.vari_qty = vari_qty;
	}

	public void setExtn_qty(String extn_qty){
		this.extn_qty = extn_qty;
	}

	public void setSusp_qty(String susp_qty){
		this.susp_qty = susp_qty;
	}

	public void setClamt(String clamt){
		this.clamt = clamt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setLeaf_sales(String leaf_sales){
		this.leaf_sales = leaf_sales;
	}

	public void setLeaf_purc(String leaf_purc){
		this.leaf_purc = leaf_purc;
	}

	public void setRe_freeqty(String re_freeqty){
		this.re_freeqty = re_freeqty;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getRdr_qty(){
		return this.rdr_qty;
	}

	public String getVari_qty(){
		return this.vari_qty;
	}

	public String getExtn_qty(){
		return this.extn_qty;
	}

	public String getSusp_qty(){
		return this.susp_qty;
	}

	public String getClamt(){
		return this.clamt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getLeaf_sales(){
		return this.leaf_sales;
	}

	public String getLeaf_purc(){
		return this.leaf_purc;
	}

	public String getRe_freeqty(){
		return this.re_freeqty;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}
}

/* 작성시간 : Mon Jan 19 10:12:22 KST 2015 */