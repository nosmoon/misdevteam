/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
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


public class SE_QTY_2420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String area_nm;
	public String send_plac_nm;
	public String medi_nm;
	public String sect_nm;
	public String prt_rfl_qty;
	public String amt;
	public String aplc_pers_nm;

	public SE_QTY_2420_LCURLISTRecord(){}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPrt_rfl_qty(String prt_rfl_qty){
		this.prt_rfl_qty = prt_rfl_qty;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setAplc_pers_nm(String aplc_pers_nm){
		this.aplc_pers_nm = aplc_pers_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPrt_rfl_qty(){
		return this.prt_rfl_qty;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getAplc_pers_nm(){
		return this.aplc_pers_nm;
	}
}

/* 작성시간 : Thu Jul 09 21:03:55 KST 2009 */