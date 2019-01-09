/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황 - 지국확장마감 조회 
* 작성일자 : 2009-08-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황 - 지국확장마감 조회 
 */

public class SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String closmm;
	public String seq;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String vexcyn;
	public String rdrnm;
	public String rdr_no;
	public int qty;
	public String addrcdnm;
	public String addr;
	public String dtlsaddr;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdr_extndt;
	public String incmgdt;
	public String valmm;
	public int dscnamt;
	public String clamtmthd;
	public String rdr_extntype1;
	public String rdr_extntype2;
	public String camptype;
	public String extnnm;
	public String aplcpath;
	public String resitype;
	public String mvindt;
	public String mvintodt;
	public String reconfyn;
	public String mormembid;
	public String rdr_extnprvlastsuspdt;
	public String remk;
	public String suspdt;
	public String suspresn;
	public String bns_itemclsf;
	public String bns_itemnm;
	public String rdr_extnexclyn;
	public String clsf;
	public String clsf1;
	public String clsf2;
	public String clsf3;
	public String clsf4;
	public String cntrno;
	public String medicd;

	public SS_L_TASLM_RDREXTNCLOSRDREXTNCLOSRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
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

	public void setVexcyn(String vexcyn){
		this.vexcyn = vexcyn;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAddrcdnm(String addrcdnm){
		this.addrcdnm = addrcdnm;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setClamtmthd(String clamtmthd){
		this.clamtmthd = clamtmthd;
	}

	public void setRdr_extntype1(String rdr_extntype1){
		this.rdr_extntype1 = rdr_extntype1;
	}

	public void setRdr_extntype2(String rdr_extntype2){
		this.rdr_extntype2 = rdr_extntype2;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setMvindt(String mvindt){
		this.mvindt = mvindt;
	}

	public void setMvintodt(String mvintodt){
		this.mvintodt = mvintodt;
	}

	public void setReconfyn(String reconfyn){
		this.reconfyn = reconfyn;
	}

	public void setMormembid(String mormembid){
		this.mormembid = mormembid;
	}

	public void setRdr_extnprvlastsuspdt(String rdr_extnprvlastsuspdt){
		this.rdr_extnprvlastsuspdt = rdr_extnprvlastsuspdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresn(String suspresn){
		this.suspresn = suspresn;
	}

	public void setBns_itemclsf(String bns_itemclsf){
		this.bns_itemclsf = bns_itemclsf;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setRdr_extnexclyn(String rdr_extnexclyn){
		this.rdr_extnexclyn = rdr_extnexclyn;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setClsf1(String clsf1){
		this.clsf1 = clsf1;
	}

	public void setClsf2(String clsf2){
		this.clsf2 = clsf2;
	}

	public void setClsf3(String clsf3){
		this.clsf3 = clsf3;
	}

	public void setClsf4(String clsf4){
		this.clsf4 = clsf4;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getAreacd(){
		return this.areacd;
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

	public String getVexcyn(){
		return this.vexcyn;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public int getQty(){
		return this.qty;
	}

	public String getAddrcdnm(){
		return this.addrcdnm;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public String getClamtmthd(){
		return this.clamtmthd;
	}

	public String getRdr_extntype1(){
		return this.rdr_extntype1;
	}

	public String getRdr_extntype2(){
		return this.rdr_extntype2;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getMvindt(){
		return this.mvindt;
	}

	public String getMvintodt(){
		return this.mvintodt;
	}

	public String getReconfyn(){
		return this.reconfyn;
	}

	public String getMormembid(){
		return this.mormembid;
	}

	public String getRdr_extnprvlastsuspdt(){
		return this.rdr_extnprvlastsuspdt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresn(){
		return this.suspresn;
	}

	public String getBns_itemclsf(){
		return this.bns_itemclsf;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public String getRdr_extnexclyn(){
		return this.rdr_extnexclyn;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getClsf1(){
		return this.clsf1;
	}

	public String getClsf2(){
		return this.clsf2;
	}

	public String getClsf3(){
		return this.clsf3;
	}

	public String getClsf4(){
		return this.clsf4;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMedicd(){
		return this.medicd;
	}
}

/* 작성시간 : Wed Aug 26 12:20:11 KST 2009 */