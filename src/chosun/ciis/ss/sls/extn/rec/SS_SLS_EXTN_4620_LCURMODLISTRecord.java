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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_4620_LCURMODLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dncomp;
	public String dncompnm;
	public String empseq;
	public String deptnm;
	public String extnnm;
	public String rdrnm;
	public String bocd;
	public String bonm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String refaddr;
	public String telno1;
	public String telno2;
	public String telno3;
	public String ptphno1;
	public String ptphno2;
	public String ptphno3;
	public String qty;
	public String fr_yymm;
	public String to_yymm;
	public String subsuprc;
	public String remk;
	public String bldmngnn;
	public String extngb;
	public String aplcdt;
	public String aplcno;
	public String closdt;

	public SS_SLS_EXTN_4620_LCURMODLISTRecord(){}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setRefaddr(String refaddr){
		this.refaddr = refaddr;
	}

	public void setTelno1(String telno1){
		this.telno1 = telno1;
	}

	public void setTelno2(String telno2){
		this.telno2 = telno2;
	}

	public void setTelno3(String telno3){
		this.telno3 = telno3;
	}

	public void setPtphno1(String ptphno1){
		this.ptphno1 = ptphno1;
	}

	public void setPtphno2(String ptphno2){
		this.ptphno2 = ptphno2;
	}

	public void setPtphno3(String ptphno3){
		this.ptphno3 = ptphno3;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setSubsuprc(String subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setExtngb(String extngb){
		this.extngb = extngb;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getRefaddr(){
		return this.refaddr;
	}

	public String getTelno1(){
		return this.telno1;
	}

	public String getTelno2(){
		return this.telno2;
	}

	public String getTelno3(){
		return this.telno3;
	}

	public String getPtphno1(){
		return this.ptphno1;
	}

	public String getPtphno2(){
		return this.ptphno2;
	}

	public String getPtphno3(){
		return this.ptphno3;
	}

	public String getQty(){
		return this.qty;
	}

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getSubsuprc(){
		return this.subsuprc;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getExtngb(){
		return this.extngb;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getClosdt(){
		return this.closdt;
	}
}

/* 작성시간 : Tue Oct 10 11:34:17 KST 2017 */