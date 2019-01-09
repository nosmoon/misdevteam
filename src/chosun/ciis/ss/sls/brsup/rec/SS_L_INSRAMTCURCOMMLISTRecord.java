/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-보험금-목록
* 작성일자 : 2009-04-09
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-상해보험-보험금-목록
 */

public class SS_L_INSRAMTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acpndt;
	public String accdacpnno;
	public String accdcauscd;
	public String accdtypecd;
	public int insramt;
	public String acctyn;
	public String prn;
	public String areanm;
	public String bonm;
	public String flnm;
	public String dutynm;
	public String accddt;
	public String procstat;
	public String procdt;

	public SS_L_INSRAMTCURCOMMLISTRecord(){}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAccdacpnno(String accdacpnno){
		this.accdacpnno = accdacpnno;
	}

	public void setAccdcauscd(String accdcauscd){
		this.accdcauscd = accdcauscd;
	}

	public void setAccdtypecd(String accdtypecd){
		this.accdtypecd = accdtypecd;
	}

	public void setInsramt(int insramt){
		this.insramt = insramt;
	}

	public void setAcctyn(String acctyn){
		this.acctyn = acctyn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setAccddt(String accddt){
		this.accddt = accddt;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAccdacpnno(){
		return this.accdacpnno;
	}

	public String getAccdcauscd(){
		return this.accdcauscd;
	}

	public String getAccdtypecd(){
		return this.accdtypecd;
	}

	public int getInsramt(){
		return this.insramt;
	}

	public String getAcctyn(){
		return this.acctyn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getAccddt(){
		return this.accddt;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getProcdt(){
		return this.procdt;
	}
}

/* 작성시간 : Thu Apr 09 20:19:17 KST 2009 */