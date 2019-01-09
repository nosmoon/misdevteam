/***************************************************************************************************
* 파일명 : SS_L_MIGRWORKINFOCURCOMMLISTRecord.java
* 기능 : 관리자-작업-마이그레이션 현황-목록을 위한 Record 
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-작업-마이그레이션 현황-목록을 위한 Record 
 */

public class SS_L_MIGRWORKINFOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String areanm;
	public String bocd;
	public String bonm;
	public Timestamp bodbuptodt;
	public Timestamp billdbuptodt;
	public Timestamp boswittodt;
	public Timestamp billswittodt;
	public String endcnfmyn;
	public Timestamp endcnfmdt;

	public SS_L_MIGRWORKINFOCURCOMMLISTRecord(){}

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

	public void setBodbuptodt(Timestamp bodbuptodt){
		this.bodbuptodt = bodbuptodt;
	}

	public void setBilldbuptodt(Timestamp billdbuptodt){
		this.billdbuptodt = billdbuptodt;
	}

	public void setBoswittodt(Timestamp boswittodt){
		this.boswittodt = boswittodt;
	}

	public void setBillswittodt(Timestamp billswittodt){
		this.billswittodt = billswittodt;
	}

	public void setEndcnfmyn(String endcnfmyn){
		this.endcnfmyn = endcnfmyn;
	}

	public void setEndcnfmdt(Timestamp endcnfmdt){
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

	public Timestamp getBodbuptodt(){
		return this.bodbuptodt;
	}

	public Timestamp getBilldbuptodt(){
		return this.billdbuptodt;
	}

	public Timestamp getBoswittodt(){
		return this.boswittodt;
	}

	public Timestamp getBillswittodt(){
		return this.billswittodt;
	}

	public String getEndcnfmyn(){
		return this.endcnfmyn;
	}

	public Timestamp getEndcnfmdt(){
		return this.endcnfmdt;
	}
}

/* 작성시간 : Sat Mar 13 19:48:55 KST 2004 */