/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-독자등급관리-조회
* 작성일자 : 2009-04-10
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-독자등급관리-조회
 */

public class SS_L_RDRCRTSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areanm;
	public String bocd;
	public String bonm;
	public String regdt;
	public String regno;
	public String rdr_no;
	public String medinm;
	public String dtlsprocstatnm;
	public String errresncdnm;
	public String recstatnm;
	public String onlmembid;
	public String onlmembseq;
	public String rdrnm;
	public String memb_nm_korn;
	public String prn;
	public String email;
	public String ceph_no_1;
	public String ceph_no_2;
	public String home_tel_no;
	public String memb_kind_cd;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String procdt;
	public String recdt;
	public String mblefrdt;
	public String mbleexpydt;
	public String mblestatcd;
	public String mblenonrsmgcd;
	public String ireaderstat;

	public SS_L_RDRCRTSCURCOMMLISTRecord(){}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setDtlsprocstatnm(String dtlsprocstatnm){
		this.dtlsprocstatnm = dtlsprocstatnm;
	}

	public void setErrresncdnm(String errresncdnm){
		this.errresncdnm = errresncdnm;
	}

	public void setRecstatnm(String recstatnm){
		this.recstatnm = recstatnm;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setOnlmembseq(String onlmembseq){
		this.onlmembseq = onlmembseq;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMemb_nm_korn(String memb_nm_korn){
		this.memb_nm_korn = memb_nm_korn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setCeph_no_1(String ceph_no_1){
		this.ceph_no_1 = ceph_no_1;
	}

	public void setCeph_no_2(String ceph_no_2){
		this.ceph_no_2 = ceph_no_2;
	}

	public void setHome_tel_no(String home_tel_no){
		this.home_tel_no = home_tel_no;
	}

	public void setMemb_kind_cd(String memb_kind_cd){
		this.memb_kind_cd = memb_kind_cd;
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

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setRecdt(String recdt){
		this.recdt = recdt;
	}

	public void setMblefrdt(String mblefrdt){
		this.mblefrdt = mblefrdt;
	}

	public void setMbleexpydt(String mbleexpydt){
		this.mbleexpydt = mbleexpydt;
	}

	public void setMblestatcd(String mblestatcd){
		this.mblestatcd = mblestatcd;
	}

	public void setMblenonrsmgcd(String mblenonrsmgcd){
		this.mblenonrsmgcd = mblenonrsmgcd;
	}

	public void setIreaderstat(String ireaderstat){
		this.ireaderstat = ireaderstat;
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

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getDtlsprocstatnm(){
		return this.dtlsprocstatnm;
	}

	public String getErrresncdnm(){
		return this.errresncdnm;
	}

	public String getRecstatnm(){
		return this.recstatnm;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getOnlmembseq(){
		return this.onlmembseq;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMemb_nm_korn(){
		return this.memb_nm_korn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getCeph_no_1(){
		return this.ceph_no_1;
	}

	public String getCeph_no_2(){
		return this.ceph_no_2;
	}

	public String getHome_tel_no(){
		return this.home_tel_no;
	}

	public String getMemb_kind_cd(){
		return this.memb_kind_cd;
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

	public String getProcdt(){
		return this.procdt;
	}

	public String getRecdt(){
		return this.recdt;
	}

	public String getMblefrdt(){
		return this.mblefrdt;
	}

	public String getMbleexpydt(){
		return this.mbleexpydt;
	}

	public String getMblestatcd(){
		return this.mblestatcd;
	}

	public String getMblenonrsmgcd(){
		return this.mblenonrsmgcd;
	}

	public String getIreaderstat(){
		return this.ireaderstat;
	}
}

/* 작성시간 : Sat Apr 11 13:17:02 KST 2009 */