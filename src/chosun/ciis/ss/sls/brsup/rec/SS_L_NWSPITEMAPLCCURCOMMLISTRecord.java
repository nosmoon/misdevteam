/***************************************************************************************************
* 파일명 : .java
* 기능 : 검색조건에 따라 신문지원물품 신청목록을 리턴한다.
* 작성일자 :2009/07/03  
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-신문지원물품-신청-목록
 */

public class SS_L_NWSPITEMAPLCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String aplcno;
	public String itemcd;
	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String itemclsfnm;
	public String itemnm;
	public int uprc;
	public int aplcqunt;
	public int amt;
	public String senddt;
	public String closyn;
	public int owhqunt;
	public String owhdd;
	public String owhproc;
	public int promseqreg;

	public SS_L_NWSPITEMAPLCCURCOMMLISTRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
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

	public void setItemclsfnm(String itemclsfnm){
		this.itemclsfnm = itemclsfnm;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setAplcqunt(int aplcqunt){
		this.aplcqunt = aplcqunt;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setClosyn(String closyn){
		this.closyn = closyn;
	}

	public void setOwhqunt(int owhqunt){
		this.owhqunt = owhqunt;
	}

	public void setOwhdd(String owhdd){
		this.owhdd = owhdd;
	}

	public void setOwhproc(String owhproc){
		this.owhproc = owhproc;
	}

	public void setPromseqreg(int promseqreg){
		this.promseqreg = promseqreg;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getItemcd(){
		return this.itemcd;
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

	public String getItemclsfnm(){
		return this.itemclsfnm;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getAplcqunt(){
		return this.aplcqunt;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getClosyn(){
		return this.closyn;
	}

	public int getOwhqunt(){
		return this.owhqunt;
	}

	public String getOwhdd(){
		return this.owhdd;
	}

	public String getOwhproc(){
		return this.owhproc;
	}

	public int getPromseqreg(){
		return this.promseqreg;
	}
}

/* 작성시간 : Fri Jul 03 15:43:38 PDT 2009 */