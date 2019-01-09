/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-스포츠부수현황-목록
* 작성일자 : 2009-05-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-스포츠부수현황-목록
 */

public class SS_L_QTY_SPCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String deptcd;
	public String partnm;
	public String partcd;
	public String areanm;
	public String areacd;
	public String bocd;
	public String bonm;
	public int iygwygbs;
	public int iygwmgbs;
	public int iygwsdbs;
	public int dntnwsp;
	public int cupn;

	public SS_L_QTY_SPCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setIygwygbs(int iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setIygwmgbs(int iygwmgbs){
		this.iygwmgbs = iygwmgbs;
	}

	public void setIygwsdbs(int iygwsdbs){
		this.iygwsdbs = iygwsdbs;
	}

	public void setDntnwsp(int dntnwsp){
		this.dntnwsp = dntnwsp;
	}

	public void setCupn(int cupn){
		this.cupn = cupn;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public int getIygwygbs(){
		return this.iygwygbs;
	}

	public int getIygwmgbs(){
		return this.iygwmgbs;
	}

	public int getIygwsdbs(){
		return this.iygwsdbs;
	}

	public int getDntnwsp(){
		return this.dntnwsp;
	}

	public int getCupn(){
		return this.cupn;
	}
}

/* 작성시간 : Wed May 06 16:01:21 KST 2009 */