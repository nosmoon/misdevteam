/***************************************************************************************************
* 파일명 : .java
* 기능 : *사이버센터-사이버수당청구-조회
* 작성일자 : 2009-04-27
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.rec;

import java.sql.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.ds.*;

/**
 * 사이버센터-사이버수당청구-조회
 */

public class SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String closyymm;
	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public int rdrcnt;
	public int adjmnoit;
	public int adjmamt;
	public int clamamt;
	public int prvmmacmlun_recp;
	public int clamt;
	public int acmlun_recp;
	public String hdqtcnfmyn;
	public String hdqtcnfmdt;
	public int rnum;

	public SS_L_CYBALON_BOCLAMBOALONCLAMLISTRecord(){}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
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

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setAdjmnoit(int adjmnoit){
		this.adjmnoit = adjmnoit;
	}

	public void setAdjmamt(int adjmamt){
		this.adjmamt = adjmamt;
	}

	public void setClamamt(int clamamt){
		this.clamamt = clamamt;
	}

	public void setPrvmmacmlun_recp(int prvmmacmlun_recp){
		this.prvmmacmlun_recp = prvmmacmlun_recp;
	}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setAcmlun_recp(int acmlun_recp){
		this.acmlun_recp = acmlun_recp;
	}

	public void setHdqtcnfmyn(String hdqtcnfmyn){
		this.hdqtcnfmyn = hdqtcnfmyn;
	}

	public void setHdqtcnfmdt(String hdqtcnfmdt){
		this.hdqtcnfmdt = hdqtcnfmdt;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
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

	public int getRdrcnt(){
		return this.rdrcnt;
	}

	public int getAdjmnoit(){
		return this.adjmnoit;
	}

	public int getAdjmamt(){
		return this.adjmamt;
	}

	public int getClamamt(){
		return this.clamamt;
	}

	public int getPrvmmacmlun_recp(){
		return this.prvmmacmlun_recp;
	}

	public int getClamt(){
		return this.clamt;
	}

	public int getAcmlun_recp(){
		return this.acmlun_recp;
	}

	public String getHdqtcnfmyn(){
		return this.hdqtcnfmyn;
	}

	public String getHdqtcnfmdt(){
		return this.hdqtcnfmdt;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Tue Apr 28 20:31:26 KST 2009 */