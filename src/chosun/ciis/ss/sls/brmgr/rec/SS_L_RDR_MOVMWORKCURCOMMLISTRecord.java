/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국경영-관할지국조정-목록
* 작성일자 : 2009-03-12
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국경영-관할지국조정-목록
 */

public class SS_L_RDR_MOVMWORKCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String trsfdt_tm;
	public String trsfbocd;
	public String trsfbonm;
	public String acptbocd;
	public String acptbonm;
	public int rdrcnt;
	public String medabasidt;
	public String chrgcnfmdt_tm;
	public String acptdt_tm;
	public String procstat;
	public String procstatnm;

	public SS_L_RDR_MOVMWORKCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setTrsfdt_tm(String trsfdt_tm){
		this.trsfdt_tm = trsfdt_tm;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setMedabasidt(String medabasidt){
		this.medabasidt = medabasidt;
	}

	public void setChrgcnfmdt_tm(String chrgcnfmdt_tm){
		this.chrgcnfmdt_tm = chrgcnfmdt_tm;
	}

	public void setAcptdt_tm(String acptdt_tm){
		this.acptdt_tm = acptdt_tm;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setProcstatnm(String procstatnm){
		this.procstatnm = procstatnm;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getTrsfdt_tm(){
		return this.trsfdt_tm;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}

	public int getRdrcnt(){
		return this.rdrcnt;
	}

	public String getMedabasidt(){
		return this.medabasidt;
	}

	public String getChrgcnfmdt_tm(){
		return this.chrgcnfmdt_tm;
	}

	public String getAcptdt_tm(){
		return this.acptdt_tm;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getProcstatnm(){
		return this.procstatnm;
	}
}

/* 작성시간 : Thu Mar 12 20:26:11 KST 2009 */