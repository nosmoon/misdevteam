/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국지원-빌링_자동이체-이체신청개선 상세조회 
* 작성일자 :2009/05/21 
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링_자동이체-이체신청개선 상세조회 
 */

public class SS_S_SHFTAPLCSHFTAPLCDETAILRecord extends java.lang.Object implements java.io.Serializable{

	public String sysid;
	public String basidt;
	public String svctype;
	public String aplcclsf;
	public int seq;
	public String insttcd;
	public String aplcdt;
	public String shftaplcclsf;
	public String pymtno1;
	public String pymtno2;
	public String pymthopedt;
	public String feekind;
	public String recpinstt;
	public String acctno;
	public String vdtydt;
	public String prn;
	public String nm;
	public String tel_no;
	public String rdrnm;
	public String rdrtel;
	public String rdrprn;
	public String zipseq;
	public String zip1;
	public String zip2;
	public String zip3;
	public String dlvplacno;
	public String brchptel;
	public String reqbrchcd;
	public String fststrtdt;
	public String reqplacclsf;
	public String elecreqno;
	public String ocomcd;
	public String ocomresn;
	public String remk;

	public SS_S_SHFTAPLCSHFTAPLCDETAILRecord(){}

	public void setSysid(String sysid){
		this.sysid = sysid;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setSvctype(String svctype){
		this.svctype = svctype;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setShftaplcclsf(String shftaplcclsf){
		this.shftaplcclsf = shftaplcclsf;
	}

	public void setPymtno1(String pymtno1){
		this.pymtno1 = pymtno1;
	}

	public void setPymtno2(String pymtno2){
		this.pymtno2 = pymtno2;
	}

	public void setPymthopedt(String pymthopedt){
		this.pymthopedt = pymthopedt;
	}

	public void setFeekind(String feekind){
		this.feekind = feekind;
	}

	public void setRecpinstt(String recpinstt){
		this.recpinstt = recpinstt;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setVdtydt(String vdtydt){
		this.vdtydt = vdtydt;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel(String rdrtel){
		this.rdrtel = rdrtel;
	}

	public void setRdrprn(String rdrprn){
		this.rdrprn = rdrprn;
	}

	public void setZipseq(String zipseq){
		this.zipseq = zipseq;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public void setDlvplacno(String dlvplacno){
		this.dlvplacno = dlvplacno;
	}

	public void setBrchptel(String brchptel){
		this.brchptel = brchptel;
	}

	public void setReqbrchcd(String reqbrchcd){
		this.reqbrchcd = reqbrchcd;
	}

	public void setFststrtdt(String fststrtdt){
		this.fststrtdt = fststrtdt;
	}

	public void setReqplacclsf(String reqplacclsf){
		this.reqplacclsf = reqplacclsf;
	}

	public void setElecreqno(String elecreqno){
		this.elecreqno = elecreqno;
	}

	public void setOcomcd(String ocomcd){
		this.ocomcd = ocomcd;
	}

	public void setOcomresn(String ocomresn){
		this.ocomresn = ocomresn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getSysid(){
		return this.sysid;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSvctype(){
		return this.svctype;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getShftaplcclsf(){
		return this.shftaplcclsf;
	}

	public String getPymtno1(){
		return this.pymtno1;
	}

	public String getPymtno2(){
		return this.pymtno2;
	}

	public String getPymthopedt(){
		return this.pymthopedt;
	}

	public String getFeekind(){
		return this.feekind;
	}

	public String getRecpinstt(){
		return this.recpinstt;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getVdtydt(){
		return this.vdtydt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getNm(){
		return this.nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel(){
		return this.rdrtel;
	}

	public String getRdrprn(){
		return this.rdrprn;
	}

	public String getZipseq(){
		return this.zipseq;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getDlvplacno(){
		return this.dlvplacno;
	}

	public String getBrchptel(){
		return this.brchptel;
	}

	public String getReqbrchcd(){
		return this.reqbrchcd;
	}

	public String getFststrtdt(){
		return this.fststrtdt;
	}

	public String getReqplacclsf(){
		return this.reqplacclsf;
	}

	public String getElecreqno(){
		return this.elecreqno;
	}

	public String getOcomcd(){
		return this.ocomcd;
	}

	public String getOcomresn(){
		return this.ocomresn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu May 21 17:55:54 PDT 2009 */