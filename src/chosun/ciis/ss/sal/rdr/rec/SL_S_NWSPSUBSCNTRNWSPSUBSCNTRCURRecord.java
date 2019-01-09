/***************************************************************************************************
* 파일명 : SL_S_NWSPSUBSCNTRDataSet.java
* 기능 : 독자정보관리(구독추가변경팝업-구독상세보기)
* 작성일자 : 2004-06-30
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자	: 
* 수정일자	: 
* 백업		: 
***************************************************************************************************/



package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자정보관리(구독추가변경팝업-구독상세보기)
 */

public class SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String rdr_extnno;
	public String rdr_extntypecd;
	public String extnnm;
	public int rdr_extncost;
	public String subsfr_dt;
	public String freeyn;
	public String freeclsf;
	public String valmm;
	public int subsuprc;
	public int subsqty;
	public int dscnamt;
	public int post_dlvfee;
	public String extnblngcd;
	public String bodutycd;
	public String boposicd;
	public String stafclsfcd;
	public String stafno;
	public String rdr_extnbocd;
	public String boemp_no;
	public String extnid;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String extnemail;
	public String aplcpathcd;
	public String bns_itemcd;
	public String bns_itemnm;
	public String remk;
	public String incmgdt;

	public SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord(){}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setRdr_extncost(int rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setSubsqty(int subsqty){
		this.subsqty = subsqty;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setPost_dlvfee(int post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setBodutycd(String bodutycd){
		this.bodutycd = bodutycd;
	}

	public void setBoposicd(String boposicd){
		this.boposicd = boposicd;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setRdr_extnbocd(String rdr_extnbocd){
		this.rdr_extnbocd = rdr_extnbocd;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setExtnid(String extnid){
		this.extnid = extnid;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtntel1(String extntel1){
		this.extntel1 = extntel1;
	}

	public void setExtntel2(String extntel2){
		this.extntel2 = extntel2;
	}

	public void setExtntel3(String extntel3){
		this.extntel3 = extntel3;
	}

	public void setExtnptph_no1(String extnptph_no1){
		this.extnptph_no1 = extnptph_no1;
	}

	public void setExtnptph_no2(String extnptph_no2){
		this.extnptph_no2 = extnptph_no2;
	}

	public void setExtnptph_no3(String extnptph_no3){
		this.extnptph_no3 = extnptph_no3;
	}

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setExtnemail(String extnemail){
		this.extnemail = extnemail;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public int getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getValmm(){
		return this.valmm;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public int getSubsqty(){
		return this.subsqty;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public int getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getBodutycd(){
		return this.bodutycd;
	}

	public String getBoposicd(){
		return this.boposicd;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getRdr_extnbocd(){
		return this.rdr_extnbocd;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getExtnid(){
		return this.extnid;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtntel1(){
		return this.extntel1;
	}

	public String getExtntel2(){
		return this.extntel2;
	}

	public String getExtntel3(){
		return this.extntel3;
	}

	public String getExtnptph_no1(){
		return this.extnptph_no1;
	}

	public String getExtnptph_no2(){
		return this.extnptph_no2;
	}

	public String getExtnptph_no3(){
		return this.extnptph_no3;
	}

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getExtnemail(){
		return this.extnemail;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}
}

/* 작성시간 : Thu Mar 15 16:44:52 KST 2007 */