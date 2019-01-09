/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-신문지원물품-사고-목록
* 작성일자 : 2009-04-07
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-신문지원물품-사고-목록
 */

public class SS_L_NWSPITEMACCDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String aplcno;
	public String accdno;
	public String accddt;
	public String itemcd;
	public String itemnm;
	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public int accdqunt;
	public String regdt;

	public SS_L_NWSPITEMACCDCURCOMMLISTRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setAccdno(String accdno){
		this.accdno = accdno;
	}

	public void setAccddt(String accddt){
		this.accddt = accddt;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
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

	public void setAccdqunt(int accdqunt){
		this.accdqunt = accdqunt;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getAccdno(){
		return this.accdno;
	}

	public String getAccddt(){
		return this.accddt;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
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

	public int getAccdqunt(){
		return this.accdqunt;
	}

	public String getRegdt(){
		return this.regdt;
	}
}

/* 작성시간 : Tue Apr 07 19:55:56 KST 2009 */