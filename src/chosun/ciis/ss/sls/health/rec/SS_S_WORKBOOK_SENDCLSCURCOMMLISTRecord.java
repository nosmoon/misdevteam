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


package chosun.ciis.ss.sls.health.rec;

import java.sql.*;
import chosun.ciis.ss.sls.health.dm.*;
import chosun.ciis.ss.sls.health.ds.*;

/**
 * 
 */


public class SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medinm;
	public String area_nm;
	public String bonm;
	public String subsno;
	public String clstotqty;
	public String clstotamt;
	public String route_cd;
	public String route_nm;
	public String prt_plac_cd;
	public String prt_plac_nm;

	public SS_S_WORKBOOK_SENDCLSCURCOMMLISTRecord(){}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSubsno(String subsno){
		this.subsno = subsno;
	}

	public void setClstotqty(String clstotqty){
		this.clstotqty = clstotqty;
	}
	
	public void setClstotamt(String clstotamt){
		this.clstotamt = clstotamt;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSubsno(){
		return this.subsno;
	}

	public String getClstotqty(){
		return this.clstotqty;
	}
	
	public String getClstotamt(){
		return this.clstotamt;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}
}

/* 작성시간 : Mon Jan 05 13:53:59 KST 2015 */