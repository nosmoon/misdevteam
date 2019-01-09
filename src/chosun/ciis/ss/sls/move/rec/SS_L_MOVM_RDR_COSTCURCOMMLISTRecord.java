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


package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * 
 */


public class SS_L_MOVM_RDR_COSTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptnm;
	public String partnm;
	public String areanm;
	public String bonm;
	public String bocd;
	public String deptcd;
	public String partcd;
	public String areacd;
	public String trsfqty;
	public String trsfamt;
	public String acptqty;
	public String acptamt;
	public String sumamt;
	public String sendamt;
	public String bankcd;
	public String banknm;
	public String deps_persnm;
	public String acctno;
	public String closmm;

	public SS_L_MOVM_RDR_COSTCURCOMMLISTRecord(){}

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

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setTrsfqty(String trsfqty){
		this.trsfqty = trsfqty;
	}

	public void setTrsfamt(String trsfamt){
		this.trsfamt = trsfamt;
	}

	public void setAcptqty(String acptqty){
		this.acptqty = acptqty;
	}

	public void setAcptamt(String acptamt){
		this.acptamt = acptamt;
	}

	public void setSumamt(String sumamt){
		this.sumamt = sumamt;
	}

	public void setSendamt(String sendamt){
		this.sendamt = sendamt;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
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

	public String getBocd(){
		return this.bocd;
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

	public String getTrsfqty(){
		return this.trsfqty;
	}

	public String getTrsfamt(){
		return this.trsfamt;
	}

	public String getAcptqty(){
		return this.acptqty;
	}

	public String getAcptamt(){
		return this.acptamt;
	}

	public String getSumamt(){
		return this.sumamt;
	}

	public String getSendamt(){
		return this.sendamt;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getClosmm(){
		return this.closmm;
	}
}

/* 작성시간 : Tue Jun 24 08:44:43 GMT 2014 */