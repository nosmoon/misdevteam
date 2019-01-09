/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-신청-목록
* 작성일자 : 2009-09-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-상해보험-신청-목록
 */

public class SS_L_INSRAPLCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insrnm;
	public String insrcmpynm;
	public int iygwygbs;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String cntryy;
	public String bocd;
	public int boempqunt;
	public int aplcqunt;
	public int hdqtsplyqunt;
	public String splychrgprocyn;

	public SS_L_INSRAPLCCURCOMMLISTRecord(){}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public void setInsrcmpynm(String insrcmpynm){
		this.insrcmpynm = insrcmpynm;
	}

	public void setIygwygbs(int iygwygbs){
		this.iygwygbs = iygwygbs;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBoempqunt(int boempqunt){
		this.boempqunt = boempqunt;
	}

	public void setAplcqunt(int aplcqunt){
		this.aplcqunt = aplcqunt;
	}

	public void setHdqtsplyqunt(int hdqtsplyqunt){
		this.hdqtsplyqunt = hdqtsplyqunt;
	}

	public void setSplychrgprocyn(String splychrgprocyn){
		this.splychrgprocyn = splychrgprocyn;
	}

	public String getInsrnm(){
		return this.insrnm;
	}

	public String getInsrcmpynm(){
		return this.insrcmpynm;
	}

	public int getIygwygbs(){
		return this.iygwygbs;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getBocd(){
		return this.bocd;
	}

	public int getBoempqunt(){
		return this.boempqunt;
	}

	public int getAplcqunt(){
		return this.aplcqunt;
	}

	public int getHdqtsplyqunt(){
		return this.hdqtsplyqunt;
	}

	public String getSplychrgprocyn(){
		return this.splychrgprocyn;
	}
}

/* 작성시간 : Sun Sep 06 19:35:43 KST 2009 */