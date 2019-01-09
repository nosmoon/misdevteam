/***************************************************************************************************
* 파일명 : .java
* 기능 : 상담원-불편접수검색
* 작성일자 : 2008-07-11
* 작성자 : 노상현
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.rec;

import java.sql.*;
import chosun.ciis.ss.sls.cns.dm.*;
import chosun.ciis.ss.sls.cns.ds.*;

/**
 *상담원-불편접수검색
*/
public class SS_L_RDR_DSCTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public Timestamp acpndt;
	public String boksnm;
	public String areanm;
	public String bonm;
	public String dscttypecdnm;
	public String acpnpathcdnm;
	public String bocnfmyn;
	public String titl;
	public String cns_empid;
	public String cns_empnm;
	public String procpers;
	public Timestamp boprocdt;

	public SS_L_RDR_DSCTCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAcpndt(Timestamp acpndt){
		this.acpndt = acpndt;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDscttypecdnm(String dscttypecdnm){
		this.dscttypecdnm = dscttypecdnm;
	}

	public void setAcpnpathcdnm(String acpnpathcdnm){
		this.acpnpathcdnm = acpnpathcdnm;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public void setBoprocdt(Timestamp boprocdt){
		this.boprocdt = boprocdt;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public Timestamp getAcpndt(){
		return this.acpndt;
	}

	public String getBoksnm(){
		return this.boksnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDscttypecdnm(){
		return this.dscttypecdnm;
	}

	public String getAcpnpathcdnm(){
		return this.acpnpathcdnm;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public Timestamp getBoprocdt(){
		return this.boprocdt;
	}
}

/* 작성시간 : Fri Jul 11 15:36:57 KST 2008 */