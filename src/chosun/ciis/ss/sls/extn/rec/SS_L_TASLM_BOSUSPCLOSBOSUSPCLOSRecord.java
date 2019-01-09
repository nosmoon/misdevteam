/***************************************************************************************************
* 파일명 : .java
* 기능 : * 확장현황-지국중지마감-목록조회
* 작성일자 : 2010-01-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 *  확장현황-지국중지마감-목록조회
 */

public class SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String cmpycd;
	public String closmm;
	public String seq;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String rdr_no;
	public String addr;
	public String rdrnm;
	public String dstc;
	public String medi;
	public String subsbgndd;
	public String valmm;
	public String freeclsf;
	public String resitype;
	public String tel_no;
	public String rdr_extndt;
	public String rdr_extntype1;
	public String rdr_extntype2;
	public String camprdr_extnnm;
	public String aplcpath;
	public String camptype;
	public String extnnm;
	public int uprc;
	public int qty;
	public String clamtmatt;
	public int clamtmonth;
	public int totsubsmonth;
	public int subsmonth200407aft;
	public String clamtmthd;
	public String suspresncd;
	public String suspdt;
	public String vexcboyn;
	public String suspexclyn;

	public SS_L_TASLM_BOSUSPCLOSBOSUSPCLOSRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setDstc(String dstc){
		this.dstc = dstc;
	}

	public void setMedi(String medi){
		this.medi = medi;
	}

	public void setSubsbgndd(String subsbgndd){
		this.subsbgndd = subsbgndd;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setResitype(String resitype){
		this.resitype = resitype;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extntype1(String rdr_extntype1){
		this.rdr_extntype1 = rdr_extntype1;
	}

	public void setRdr_extntype2(String rdr_extntype2){
		this.rdr_extntype2 = rdr_extntype2;
	}

	public void setCamprdr_extnnm(String camprdr_extnnm){
		this.camprdr_extnnm = camprdr_extnnm;
	}

	public void setAplcpath(String aplcpath){
		this.aplcpath = aplcpath;
	}

	public void setCamptype(String camptype){
		this.camptype = camptype;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setUprc(int uprc){
		this.uprc = uprc;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setClamtmatt(String clamtmatt){
		this.clamtmatt = clamtmatt;
	}

	public void setClamtmonth(int clamtmonth){
		this.clamtmonth = clamtmonth;
	}

	public void setTotsubsmonth(int totsubsmonth){
		this.totsubsmonth = totsubsmonth;
	}

	public void setSubsmonth200407aft(int subsmonth200407aft){
		this.subsmonth200407aft = subsmonth200407aft;
	}

	public void setClamtmthd(String clamtmthd){
		this.clamtmthd = clamtmthd;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setVexcboyn(String vexcboyn){
		this.vexcboyn = vexcboyn;
	}

	public void setSuspexclyn(String suspexclyn){
		this.suspexclyn = suspexclyn;
	}

	public String getDeptcd(){
		return this.deptcd;
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

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getDstc(){
		return this.dstc;
	}

	public String getMedi(){
		return this.medi;
	}

	public String getSubsbgndd(){
		return this.subsbgndd;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getResitype(){
		return this.resitype;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extntype1(){
		return this.rdr_extntype1;
	}

	public String getRdr_extntype2(){
		return this.rdr_extntype2;
	}

	public String getCamprdr_extnnm(){
		return this.camprdr_extnnm;
	}

	public String getAplcpath(){
		return this.aplcpath;
	}

	public String getCamptype(){
		return this.camptype;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public int getUprc(){
		return this.uprc;
	}

	public int getQty(){
		return this.qty;
	}

	public String getClamtmatt(){
		return this.clamtmatt;
	}

	public int getClamtmonth(){
		return this.clamtmonth;
	}

	public int getTotsubsmonth(){
		return this.totsubsmonth;
	}

	public int getSubsmonth200407aft(){
		return this.subsmonth200407aft;
	}

	public String getClamtmthd(){
		return this.clamtmthd;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getVexcboyn(){
		return this.vexcboyn;
	}

	public String getSuspexclyn(){
		return this.suspexclyn;
	}
}

/* 작성시간 : Wed Jan 06 16:14:22 KST 2010 */