/***************************************************************************************************
* 파일명 : .java
* 기능 : *독자현황-VacationStop-신청 조회(리스트)
* 작성일자 : 2009-03-18
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-VacationStop-신청 조회(리스트)
 */

public class SS_L_VSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String medicdnm;
	public String rdrnm;
	public String areanm;
	public String bonm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public int qty;
	public String aplcdt;
	public String aplcpathnm;
	public int clsfcd;
	public String clsfnm;
	public String suspfrdt;
	public String susptodt;
	public String spcfdlvdt;
	public String vaca_areadlvfrdt;
	public String vaca_areadlvtodt;
	public String vaca_areazip;
	public String vaca_areaaddr;
	public String vaca_areadtlsaddr;
	public String vaca_areaareanm;
	public String vaca_areabonm;
	public String bocnfmyn;
	public String vaca_areadlvofficnfmyn;

	public SS_L_VSCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setClsfcd(int clsfcd){
		this.clsfcd = clsfcd;
	}

	public void setClsfnm(String clsfnm){
		this.clsfnm = clsfnm;
	}

	public void setSuspfrdt(String suspfrdt){
		this.suspfrdt = suspfrdt;
	}

	public void setSusptodt(String susptodt){
		this.susptodt = susptodt;
	}

	public void setSpcfdlvdt(String spcfdlvdt){
		this.spcfdlvdt = spcfdlvdt;
	}

	public void setVaca_areadlvfrdt(String vaca_areadlvfrdt){
		this.vaca_areadlvfrdt = vaca_areadlvfrdt;
	}

	public void setVaca_areadlvtodt(String vaca_areadlvtodt){
		this.vaca_areadlvtodt = vaca_areadlvtodt;
	}

	public void setVaca_areazip(String vaca_areazip){
		this.vaca_areazip = vaca_areazip;
	}

	public void setVaca_areaaddr(String vaca_areaaddr){
		this.vaca_areaaddr = vaca_areaaddr;
	}

	public void setVaca_areadtlsaddr(String vaca_areadtlsaddr){
		this.vaca_areadtlsaddr = vaca_areadtlsaddr;
	}

	public void setVaca_areaareanm(String vaca_areaareanm){
		this.vaca_areaareanm = vaca_areaareanm;
	}

	public void setVaca_areabonm(String vaca_areabonm){
		this.vaca_areabonm = vaca_areabonm;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setVaca_areadlvofficnfmyn(String vaca_areadlvofficnfmyn){
		this.vaca_areadlvofficnfmyn = vaca_areadlvofficnfmyn;
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

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public int getQty(){
		return this.qty;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public int getClsfcd(){
		return this.clsfcd;
	}

	public String getClsfnm(){
		return this.clsfnm;
	}

	public String getSuspfrdt(){
		return this.suspfrdt;
	}

	public String getSusptodt(){
		return this.susptodt;
	}

	public String getSpcfdlvdt(){
		return this.spcfdlvdt;
	}

	public String getVaca_areadlvfrdt(){
		return this.vaca_areadlvfrdt;
	}

	public String getVaca_areadlvtodt(){
		return this.vaca_areadlvtodt;
	}

	public String getVaca_areazip(){
		return this.vaca_areazip;
	}

	public String getVaca_areaaddr(){
		return this.vaca_areaaddr;
	}

	public String getVaca_areadtlsaddr(){
		return this.vaca_areadtlsaddr;
	}

	public String getVaca_areaareanm(){
		return this.vaca_areaareanm;
	}

	public String getVaca_areabonm(){
		return this.vaca_areabonm;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getVaca_areadlvofficnfmyn(){
		return this.vaca_areadlvofficnfmyn;
	}
}

/* 작성시간 : Wed Mar 18 10:37:01 KST 2009 */