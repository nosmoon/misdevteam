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


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_5210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String dept_cd;
	public String sub_dept_cd;
	public String part_nm;
	public String part_cd;
	public String area_nm;
	public String area_cd;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String bo_telno;
	public String pdlv_rdr_qty;
	public String qty;
	public String pdlv_fee;
	public String uprc;
	public String pdlv_altn_amt;
	public String qty_uprc;

	public SE_RCP_5210_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
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

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_telno(String bo_telno){
		this.bo_telno = bo_telno;
	}

	public void setPdlv_rdr_qty(String pdlv_rdr_qty){
		this.pdlv_rdr_qty = pdlv_rdr_qty;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setPdlv_fee(String pdlv_fee){
		this.pdlv_fee = pdlv_fee;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public void setQty_uprc(String qty_uprc){
		this.qty_uprc = qty_uprc;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
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

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_telno(){
		return this.bo_telno;
	}

	public String getPdlv_rdr_qty(){
		return this.pdlv_rdr_qty;
	}

	public String getQty(){
		return this.qty;
	}

	public String getPdlv_fee(){
		return this.pdlv_fee;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}

	public String getQty_uprc(){
		return this.qty_uprc;
	}
}

/* 작성시간 : Tue Feb 05 14:28:25 KST 2013 */