/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-확장용역비용-지국별-목록
* 작성일자 : 2009-06-18
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-확장용역비용-지국별-목록
 */

public class SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public int h_qty;
	public int a_qty;
	public int s_qyt;
	public int t_qty;
	public int amt;

	public SS_L_RDR_EXTN_BO_RSLTCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
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

	public void setH_qty(int h_qty){
		this.h_qty = h_qty;
	}

	public void setA_qty(int a_qty){
		this.a_qty = a_qty;
	}

	public void setS_qyt(int s_qyt){
		this.s_qyt = s_qyt;
	}

	public void setT_qty(int t_qty){
		this.t_qty = t_qty;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
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

	public int getH_qty(){
		return this.h_qty;
	}

	public int getA_qty(){
		return this.a_qty;
	}

	public int getS_qyt(){
		return this.s_qyt;
	}

	public int getT_qty(){
		return this.t_qty;
	}

	public int getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Fri Jun 19 15:13:37 KST 2009 */