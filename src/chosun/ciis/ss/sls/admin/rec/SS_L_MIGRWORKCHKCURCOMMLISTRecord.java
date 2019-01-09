/***************************************************************************************************
* 파일명	:
* 기능		:
* 작성일자	: 2004-01-13
* 작성자	: 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업		:
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *
 *
 */


public class SS_L_MIGRWORKCHKCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bocd;
	public String bonm;
	public String bodbuptodt;
	public String billdbuptodt;
	public String boswittodt;
	public String billswittodt;
	public String endcnfmyn;
	public String endcnfmdt;

	public SS_L_MIGRWORKCHKCURCOMMLISTRecord(){}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
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

	public void setBodbuptodt(String bodbuptodt){
		this.bodbuptodt = bodbuptodt;
	}

	public void setBilldbuptodt(String billdbuptodt){
		this.billdbuptodt = billdbuptodt;
	}

	public void setBoswittodt(String boswittodt){
		this.boswittodt = boswittodt;
	}

	public void setBillswittodt(String billswittodt){
		this.billswittodt = billswittodt;
	}

	public void setEndcnfmyn(String endcnfmyn){
		this.endcnfmyn = endcnfmyn;
	}

	public void setEndcnfmdt(String endcnfmdt){
		this.endcnfmdt = endcnfmdt;
	}

	public String getDeptnm(){
		return this.deptnm;
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

	public String getBodbuptodt(){
		return this.bodbuptodt;
	}

	public String getBilldbuptodt(){
		return this.billdbuptodt;
	}

	public String getBoswittodt(){
		return this.boswittodt;
	}

	public String getBillswittodt(){
		return this.billswittodt;
	}

	public String getEndcnfmyn(){
		return this.endcnfmyn;
	}

	public String getEndcnfmdt(){
		return this.endcnfmdt;
	}
}

/* 작성시간 : Fri Mar 19 16:41:18 KST 2004 */