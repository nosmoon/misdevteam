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


public class SE_QTY_2680_PCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String sell_clsf_nm;
	public String medi_info;
	public String prt_rfl_qty;
	public String arvl_clsf_nm;
	public String remk;

	public SE_QTY_2680_PCURLIST_ARecord(){}

	public void setSell_clsf_nm(String sell_clsf_nm){
		this.sell_clsf_nm = sell_clsf_nm;
	}

	public void setMedi_info(String medi_info){
		this.medi_info = medi_info;
	}

	public void setPrt_rfl_qty(String prt_rfl_qty){
		this.prt_rfl_qty = prt_rfl_qty;
	}

	public void setArvl_clsf_nm(String arvl_clsf_nm){
		this.arvl_clsf_nm = arvl_clsf_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getSell_clsf_nm(){
		return this.sell_clsf_nm;
	}

	public String getMedi_info(){
		return this.medi_info;
	}

	public String getPrt_rfl_qty(){
		return this.prt_rfl_qty;
	}

	public String getArvl_clsf_nm(){
		return this.arvl_clsf_nm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Jun 15 17:52:07 KST 2009 */