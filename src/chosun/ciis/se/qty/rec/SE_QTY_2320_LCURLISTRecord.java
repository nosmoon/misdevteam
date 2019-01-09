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


public class SE_QTY_2320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String sect_nm;
	public String pcnt;
	public String rptv_route_prt_plac_nm;
	public String prt_plac_nm;
	public String ecnt_nm;
	public String ledt_nm;
	public int gnr_qty;
	public int spsl_qty;
	public int tot_qty;

	public SE_QTY_2320_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setRptv_route_prt_plac_nm(String rptv_route_prt_plac_nm){
		this.rptv_route_prt_plac_nm = rptv_route_prt_plac_nm;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public void setEcnt_nm(String ecnt_nm){
		this.ecnt_nm = ecnt_nm;
	}

	public void setLedt_nm(String ledt_nm){
		this.ledt_nm = ledt_nm;
	}

	public void setGnr_qty(int gnr_qty){
		this.gnr_qty = gnr_qty;
	}

	public void setSpsl_qty(int spsl_qty){
		this.spsl_qty = spsl_qty;
	}

	public void setTot_qty(int tot_qty){
		this.tot_qty = tot_qty;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getRptv_route_prt_plac_nm(){
		return this.rptv_route_prt_plac_nm;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}

	public String getEcnt_nm(){
		return this.ecnt_nm;
	}

	public String getLedt_nm(){
		return this.ledt_nm;
	}

	public int getGnr_qty(){
		return this.gnr_qty;
	}

	public int getSpsl_qty(){
		return this.spsl_qty;
	}

	public int getTot_qty(){
		return this.tot_qty;
	}
}

/* 작성시간 : Tue Jun 09 15:55:35 KST 2009 */