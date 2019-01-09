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


public class SS_L_WORKBOOK_APLCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcname;
	public String dpname;
	public String banknm;
	public String medinm;
	public String recvaddr;
	public String subsqty;
	public String aplcpath;
	public String areanm;
	public String bocd;
	public String bonm;
	public String aplcdt;
	public String collcdt;
	public String status;
	public String incmgpers;
	public String aplcno;
	public String prt_plac_nm;
	public String route_nm;
	public String route_cd;
	public String bo_headcnfmyn;

	public SS_L_WORKBOOK_APLCCURCOMMLISTRecord(){}

	public void setAplcname(String aplcname){
		this.aplcname = aplcname;
	}

	public void setDpname(String dpname){
		this.dpname = dpname;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRecvaddr(String recvaddr){
		this.recvaddr = recvaddr;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}
	
	public void setCollcdt(String collcdt){
		this.collcdt = collcdt;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setPrt_plac_nm(String prt_plac_nm){
		this.prt_plac_nm = prt_plac_nm;
	}

	public void setRoute_nm(String route_nm){
		this.route_nm = route_nm;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}
	
	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public String getAplcname(){
		return this.aplcname;
	}

	public String getDpname(){
		return this.dpname;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRecvaddr(){
		return this.recvaddr;
	}

	public String getSubsqty(){
		return this.subsqty;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}
	
	public String getCollcdt(){
		return this.collcdt;
	}

	public String getStatus(){
		return this.status;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getPrt_plac_nm(){
		return this.prt_plac_nm;
	}

	public String getRoute_nm(){
		return this.route_nm;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}
	
	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}
}

/* 작성시간 : Wed Jan 07 09:42:12 KST 2015 */