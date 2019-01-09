/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-상해보험-사고-목록
* 작성일자 : 2009-04-09
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-상해보험-사고-목록
 */

public class SS_L_INSRACCDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acpndt;
	public String accdacpnno;
	public String boemp_no;
	public String flnm;
	public String dutynm;
	public String prn;
	public String deptnm;
	public String areanm;
	public String bonm;
	public String accddt;
	public String procstat;
	public String procdt;

	public SS_L_INSRACCDCURCOMMLISTRecord(){}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAccdacpnno(String accdacpnno){
		this.accdacpnno = accdacpnno;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
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

/* 작성시간 : Thu Apr 09 19:41:38 KST 2009 */