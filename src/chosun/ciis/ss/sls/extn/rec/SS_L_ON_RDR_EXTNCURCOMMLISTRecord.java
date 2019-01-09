/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-온라인확장-신청현황 목록
* 작성일자 : 2009-04-03
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-온라인확장-신청현황 목록
 */

public class SS_L_ON_RDR_EXTNCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String extnflnm;
	public String aplcpersnm;
	public String rdrnm;
	public String pymtflnm;
	public String medicdnm;
	public String aplcpathcd;
	public String aplcpathnm;
	public String rdr_extntypecd;
	public String cmpynm;
	public int qty;
	public String areacd;
	public String areacdnm;
	public String corrbocd;
	public String corrbocdnm;
	public String extnareanm;
	public String extnbocdnm;
	public String dlvhopedt;
	public String aplcdt;
	public Timestamp bo_headcnfmdt;
	public String bo_headcnfmyn;
	public String subscnfmstatcd;
	public String subscnfmstatcdnm;
	public String rdr_extndt;
	public String rdr_extnno;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String valmm;
	public String aplcclsf;
	public String advtpathcd;

	public SS_L_ON_RDR_EXTNCURCOMMLISTRecord(){}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPymtflnm(String pymtflnm){
		this.pymtflnm = pymtflnm;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreacdnm(String areacdnm){
		this.areacdnm = areacdnm;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setCorrbocdnm(String corrbocdnm){
		this.corrbocdnm = corrbocdnm;
	}

	public void setExtnareanm(String extnareanm){
		this.extnareanm = extnareanm;
	}

	public void setExtnbocdnm(String extnbocdnm){
		this.extnbocdnm = extnbocdnm;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setBo_headcnfmdt(Timestamp bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setSubscnfmstatcdnm(String subscnfmstatcdnm){
		this.subscnfmstatcdnm = subscnfmstatcdnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
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

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setAdvtpathcd(String advtpathcd){
		this.advtpathcd = advtpathcd;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPymtflnm(){
		return this.pymtflnm;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public int getQty(){
		return this.qty;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreacdnm(){
		return this.areacdnm;
	}

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getCorrbocdnm(){
		return this.corrbocdnm;
	}

	public String getExtnareanm(){
		return this.extnareanm;
	}

	public String getExtnbocdnm(){
		return this.extnbocdnm;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public Timestamp getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getSubscnfmstatcdnm(){
		return this.subscnfmstatcdnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
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

	public String getValmm(){
		return this.valmm;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getAdvtpathcd(){
		return this.advtpathcd;
	}
}

/* 작성시간 : Fri Apr 03 16:56:14 KST 2009 */