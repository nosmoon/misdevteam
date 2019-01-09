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


public class SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String rdrnm;
	public Timestamp aplcdt;
	public String movmdt;
	public String dlvhopedt;
	public String addr;
	public String dtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String movmaddr;
	public String movmdtlsaddr;
	public String movmtel_no1;
	public String movmtel_no2;
	public String movmtel_no3;
	public String trsfdeptnm;
	public String trsfareanm;
	public String trsfbonm;
	public String acptdeptnm;
	public String acptareanm;
	public String acptbonm;
	public String trsfbocnfmstat;
	public String acptbocnfmstat;
	public String aplcpathnm;
	public Timestamp cns_empcnfmdt;
	public String onlmembid;
	public String medinm;
	public String movmrdrtype;
	public String rstsubsmonths;
	public String post_dlvyn;
	public String sellnetclsf;
	public String thmmsendqty;
	public String cns_empacpndtm;
	public String suspdt;
	public String trsfbocd;
	public String trsfbocnfmdt_tm;
	public String acptbocd;
	public String acptbocnfmdt_tm;
	public String movmlinkalon_plan;
	public String movmlinkalon_fix;
	public String movmlinkalon_ptcr;
	public String trsfboremk;
	public String acptboremk;
	public String chrgqty;
	public String zip;
	public String movmzip;

	public SS_L_MOVM_RDR_CLOSCURCOMMLISTRecord(){}

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

	public void setAplcdt(Timestamp aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setMovmdt(String movmdt){
		this.movmdt = movmdt;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setMovmaddr(String movmaddr){
		this.movmaddr = movmaddr;
	}

	public void setMovmdtlsaddr(String movmdtlsaddr){
		this.movmdtlsaddr = movmdtlsaddr;
	}

	public void setMovmtel_no1(String movmtel_no1){
		this.movmtel_no1 = movmtel_no1;
	}

	public void setMovmtel_no2(String movmtel_no2){
		this.movmtel_no2 = movmtel_no2;
	}

	public void setMovmtel_no3(String movmtel_no3){
		this.movmtel_no3 = movmtel_no3;
	}

	public void setTrsfdeptnm(String trsfdeptnm){
		this.trsfdeptnm = trsfdeptnm;
	}

	public void setTrsfareanm(String trsfareanm){
		this.trsfareanm = trsfareanm;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setAcptdeptnm(String acptdeptnm){
		this.acptdeptnm = acptdeptnm;
	}

	public void setAcptareanm(String acptareanm){
		this.acptareanm = acptareanm;
	}

	public void setAcptbonm(String acptbonm){
		this.acptbonm = acptbonm;
	}

	public void setTrsfbocnfmstat(String trsfbocnfmstat){
		this.trsfbocnfmstat = trsfbocnfmstat;
	}

	public void setAcptbocnfmstat(String acptbocnfmstat){
		this.acptbocnfmstat = acptbocnfmstat;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setCns_empcnfmdt(Timestamp cns_empcnfmdt){
		this.cns_empcnfmdt = cns_empcnfmdt;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setMovmrdrtype(String movmrdrtype){
		this.movmrdrtype = movmrdrtype;
	}

	public void setRstsubsmonths(String rstsubsmonths){
		this.rstsubsmonths = rstsubsmonths;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public void setThmmsendqty(String thmmsendqty){
		this.thmmsendqty = thmmsendqty;
	}

	public void setCns_empacpndtm(String cns_empacpndtm){
		this.cns_empacpndtm = cns_empacpndtm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setTrsfbocnfmdt_tm(String trsfbocnfmdt_tm){
		this.trsfbocnfmdt_tm = trsfbocnfmdt_tm;
	}

	public void setAcptbocd(String acptbocd){
		this.acptbocd = acptbocd;
	}

	public void setAcptbocnfmdt_tm(String acptbocnfmdt_tm){
		this.acptbocnfmdt_tm = acptbocnfmdt_tm;
	}

	public void setMovmlinkalon_plan(String movmlinkalon_plan){
		this.movmlinkalon_plan = movmlinkalon_plan;
	}

	public void setMovmlinkalon_fix(String movmlinkalon_fix){
		this.movmlinkalon_fix = movmlinkalon_fix;
	}

	public void setMovmlinkalon_ptcr(String movmlinkalon_ptcr){
		this.movmlinkalon_ptcr = movmlinkalon_ptcr;
	}

	public void setTrsfboremk(String trsfboremk){
		this.trsfboremk = trsfboremk;
	}

	public void setAcptboremk(String acptboremk){
		this.acptboremk = acptboremk;
	}

	public void setChrgqty(String chrgqty){
		this.chrgqty = chrgqty;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setMovmzip(String movmzip){
		this.movmzip = movmzip;
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

	public Timestamp getAplcdt(){
		return this.aplcdt;
	}

	public String getMovmdt(){
		return this.movmdt;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getMovmaddr(){
		return this.movmaddr;
	}

	public String getMovmdtlsaddr(){
		return this.movmdtlsaddr;
	}

	public String getMovmtel_no1(){
		return this.movmtel_no1;
	}

	public String getMovmtel_no2(){
		return this.movmtel_no2;
	}

	public String getMovmtel_no3(){
		return this.movmtel_no3;
	}

	public String getTrsfdeptnm(){
		return this.trsfdeptnm;
	}

	public String getTrsfareanm(){
		return this.trsfareanm;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getAcptdeptnm(){
		return this.acptdeptnm;
	}

	public String getAcptareanm(){
		return this.acptareanm;
	}

	public String getAcptbonm(){
		return this.acptbonm;
	}

	public String getTrsfbocnfmstat(){
		return this.trsfbocnfmstat;
	}

	public String getAcptbocnfmstat(){
		return this.acptbocnfmstat;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public Timestamp getCns_empcnfmdt(){
		return this.cns_empcnfmdt;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getMovmrdrtype(){
		return this.movmrdrtype;
	}

	public String getRstsubsmonths(){
		return this.rstsubsmonths;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}

	public String getThmmsendqty(){
		return this.thmmsendqty;
	}

	public String getCns_empacpndtm(){
		return this.cns_empacpndtm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getTrsfbocnfmdt_tm(){
		return this.trsfbocnfmdt_tm;
	}

	public String getAcptbocd(){
		return this.acptbocd;
	}

	public String getAcptbocnfmdt_tm(){
		return this.acptbocnfmdt_tm;
	}

	public String getMovmlinkalon_plan(){
		return this.movmlinkalon_plan;
	}

	public String getMovmlinkalon_fix(){
		return this.movmlinkalon_fix;
	}

	public String getMovmlinkalon_ptcr(){
		return this.movmlinkalon_ptcr;
	}

	public String getTrsfboremk(){
		return this.trsfboremk;
	}

	public String getAcptboremk(){
		return this.acptboremk;
	}

	public String getChrgqty(){
		return this.chrgqty;
	}

	public String getZip(){
		return this.zip;
	}

	public String getMovmzip(){
		return this.movmzip;
	}
}

/* 작성시간 : Mon Jun 30 05:05:25 GMT 2014 */