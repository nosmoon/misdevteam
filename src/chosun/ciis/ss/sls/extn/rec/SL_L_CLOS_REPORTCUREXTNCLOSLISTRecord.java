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


public class SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String oprenvclsf;
	public String rdrnm;
	public String rdr_no;
	public int qty;
	public String addrcdnm;
	public String addrs;
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
	public String stafno;
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
	public int svcmm;
	public int scqty;
	public int scsubsuprc;
	public int hkqty;
	public int hksubsuprc;
	public int boyqty;
	public int boysubsuprc;
	public int hanqty;
	public int hansubsuprc;
	public String trsfdeptnm;
	public String trsfbocd;
	public String trsfbonm;
	public String dlvmthd;
	public int post_dlvfee;
	public int subsuprc;
	public String shftyn;
	public String ccempyn;
	public String trgtyn_j;
	public String thrwyn_j;

	public SL_L_CLOS_REPORTCUREXTNCLOSLISTRecord(){}

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

	public void setOprenvclsf(String oprenvclsf){
		this.oprenvclsf = oprenvclsf;
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

	public void setAddrs(String addrs){
		this.addrs = addrs;
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

	public void setStafno(String stafno){
		this.stafno = stafno;
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

	public void setSvcmm(int svcmm){
		this.svcmm = svcmm;
	}

	public void setScqty(int scqty){
		this.scqty = scqty;
	}

	public void setScsubsuprc(int scsubsuprc){
		this.scsubsuprc = scsubsuprc;
	}

	public void setHkqty(int hkqty){
		this.hkqty = hkqty;
	}

	public void setHksubsuprc(int hksubsuprc){
		this.hksubsuprc = hksubsuprc;
	}

	public void setBoyqty(int boyqty){
		this.boyqty = boyqty;
	}

	public void setBoysubsuprc(int boysubsuprc){
		this.boysubsuprc = boysubsuprc;
	}

	public void setHanqty(int hanqty){
		this.hanqty = hanqty;
	}

	public void setHansubsuprc(int hansubsuprc){
		this.hansubsuprc = hansubsuprc;
	}

	public void setTrsfdeptnm(String trsfdeptnm){
		this.trsfdeptnm = trsfdeptnm;
	}

	public void setTrsfbocd(String trsfbocd){
		this.trsfbocd = trsfbocd;
	}

	public void setTrsfbonm(String trsfbonm){
		this.trsfbonm = trsfbonm;
	}

	public void setDlvmthd(String dlvmthd){
		this.dlvmthd = dlvmthd;
	}

	public void setPost_dlvfee(int post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setShftyn(String shftyn){
		this.shftyn = shftyn;
	}

	public void setCcempyn(String ccempyn){
		this.ccempyn = ccempyn;
	}

	public void setTrgtyn_j(String trgtyn_j){
		this.trgtyn_j = trgtyn_j;
	}

	public void setThrwyn_j(String thrwyn_j){
		this.thrwyn_j = thrwyn_j;
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

	public String getOprenvclsf(){
		return this.oprenvclsf;
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

	public String getAddrs(){
		return this.addrs;
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

	public String getStafno(){
		return this.stafno;
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

	public int getSvcmm(){
		return this.svcmm;
	}

	public int getScqty(){
		return this.scqty;
	}

	public int getScsubsuprc(){
		return this.scsubsuprc;
	}

	public int getHkqty(){
		return this.hkqty;
	}

	public int getHksubsuprc(){
		return this.hksubsuprc;
	}

	public int getBoyqty(){
		return this.boyqty;
	}

	public int getBoysubsuprc(){
		return this.boysubsuprc;
	}

	public int getHanqty(){
		return this.hanqty;
	}

	public int getHansubsuprc(){
		return this.hansubsuprc;
	}

	public String getTrsfdeptnm(){
		return this.trsfdeptnm;
	}

	public String getTrsfbocd(){
		return this.trsfbocd;
	}

	public String getTrsfbonm(){
		return this.trsfbonm;
	}

	public String getDlvmthd(){
		return this.dlvmthd;
	}

	public int getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public String getShftyn(){
		return this.shftyn;
	}

	public String getCcempyn(){
		return this.ccempyn;
	}

	public String getTrgtyn_j(){
		return this.trgtyn_j;
	}

	public String getThrwyn_j(){
		return this.thrwyn_j;
	}
}

/* 작성시간 : Thu Aug 17 13:55:12 KST 2017 */