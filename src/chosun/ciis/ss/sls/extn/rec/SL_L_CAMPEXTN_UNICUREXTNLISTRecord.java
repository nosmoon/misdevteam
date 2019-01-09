/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2012-02-20
* 작성자 : 
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


public class SL_L_CAMPEXTN_UNICUREXTNLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String rdr_extndt;
	public String rdr_extnno;
	public String aplcdt;
	public int qty;
	public String rdr_extntypecd;
	public String aplcpersnm;
	public String aplcpersemail;
	public String aplcperstel;
	public String aplcpersptph;
	public String aplcperszip;
	public String aplcaddr;
	public String aplcpersmembseq;
	public String aplcpersid;
	public String aplcpersremk;
	public String rdrnm;
	public String rdrtel_no;
	public String rdrptph_no;
	public String rdremail;
	public String bo_headcnfmyn;
	public String bo_headcnfmdt;
	public String subscnfmstatcd;
	public String dlvzip;
	public String rdraddr;
	public String rdr_no;
	public String medicd;
	public String medinm;
	public String valmm;
	public String clamtmthdcd;
	public String clamtnm;
	public int subsuprc;
	public int dscnamt;
	public int subsqty;
	public String subsfr_dt;
	public String suspnm;
	public String suspdt;
	public String aplcpathcd;
	public String freeyn;
	public String remk;
	public String delyn;
	public String svccd;
	public String svcnm;

	public SL_L_CAMPEXTN_UNICUREXTNLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setAplcpersemail(String aplcpersemail){
		this.aplcpersemail = aplcpersemail;
	}

	public void setAplcperstel(String aplcperstel){
		this.aplcperstel = aplcperstel;
	}

	public void setAplcpersptph(String aplcpersptph){
		this.aplcpersptph = aplcpersptph;
	}

	public void setAplcperszip(String aplcperszip){
		this.aplcperszip = aplcperszip;
	}

	public void setAplcaddr(String aplcaddr){
		this.aplcaddr = aplcaddr;
	}

	public void setAplcpersmembseq(String aplcpersmembseq){
		this.aplcpersmembseq = aplcpersmembseq;
	}

	public void setAplcpersid(String aplcpersid){
		this.aplcpersid = aplcpersid;
	}

	public void setAplcpersremk(String aplcpersremk){
		this.aplcpersremk = aplcpersremk;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setBo_headcnfmdt(String bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setRdraddr(String rdraddr){
		this.rdraddr = rdraddr;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtnm(String clamtnm){
		this.clamtnm = clamtnm;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setSubsqty(int subsqty){
		this.subsqty = subsqty;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setSuspnm(String suspnm){
		this.suspnm = suspnm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDelyn(String delyn){
		this.delyn = delyn;
	}

	public void setSvccd(String svccd){
		this.svccd = svccd;
	}

	public void setSvcnm(String svcnm){
		this.svcnm = svcnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public int getQty(){
		return this.qty;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getAplcpersemail(){
		return this.aplcpersemail;
	}

	public String getAplcperstel(){
		return this.aplcperstel;
	}

	public String getAplcpersptph(){
		return this.aplcpersptph;
	}

	public String getAplcperszip(){
		return this.aplcperszip;
	}

	public String getAplcaddr(){
		return this.aplcaddr;
	}

	public String getAplcpersmembseq(){
		return this.aplcpersmembseq;
	}

	public String getAplcpersid(){
		return this.aplcpersid;
	}

	public String getAplcpersremk(){
		return this.aplcpersremk;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getRdraddr(){
		return this.rdraddr;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtnm(){
		return this.clamtnm;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public int getSubsqty(){
		return this.subsqty;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getSuspnm(){
		return this.suspnm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDelyn(){
		return this.delyn;
	}

	public String getSvccd(){
		return this.svccd;
	}

	public String getSvcnm(){
		return this.svcnm;
	}
}

/* 작성시간 : Tue Feb 21 16:54:07 KST 2012 */