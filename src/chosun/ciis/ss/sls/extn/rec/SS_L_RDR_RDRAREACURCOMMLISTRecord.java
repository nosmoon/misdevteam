/***************************************************************************************************
 * 파일명 : SS_L_RDR_RDRAREACURCOMMLISTRecord.java
 * 기능 : 확장현황-센터비독자관리
 * 작성일자 : 2013.06.27
 * 작성자 : 이혁
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


public class SS_L_RDR_RDRAREACURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String areardr_no;
	public String areardrnm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String area_rdrregdt;
	public String subsmedicd;
	public String subsmedinm;
	public long	  qty;
	public String subsfrdt;
	public String substodt;
	public String subsexpdt;
	public String extnyn;

	public SS_L_RDR_RDRAREACURCOMMLISTRecord(){}

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

	public void setAreardr_no(String areardr_no){
		this.areardr_no = areardr_no;
	}

	public void setAreardrnm(String areardrnm){
		this.areardrnm = areardrnm;
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

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setArea_rdrregdt(String area_rdrregdt){
		this.area_rdrregdt = area_rdrregdt;
	}

	public void setSubsmedicd(String subsmedicd){
		this.subsmedicd = subsmedicd;
	}

	public void setSubsmedinm(String subsmedinm){
		this.subsmedinm = subsmedinm;
	}

	public void setQty(long qty){
		this.qty = qty;
	}
	
	public void setSubsfrdt(String subsfrdt){
		this.subsfrdt = subsfrdt;
	}
	
	public void setSubstodt(String substodt){
		this.substodt = substodt;
	}
	
	public void setSubsexpdt(String subsexpdt){
		this.subsexpdt = subsexpdt;
	}

	public void setExtnyn(String extnyn){
		this.extnyn = extnyn;
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
	
	public String getAreardr_no(){
		return this.areardr_no;
	}

	public String getAreardrnm(){
		return this.areardrnm;
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

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getArea_rdrregdt(){
		return this.area_rdrregdt;
	}

	public String getSubsmedicd(){
		return this.subsmedicd;
	}

	public String getSubsmedinm(){
		return this.subsmedinm;
	}

	public long getQty(){
		return this.qty;
	}

	public String getSubsfrdt(){
		return this.subsfrdt;
	}
	
	public String getSubstodt(){
		return this.substodt;
	}
	
	public String getSubsexpdt(){
		return this.subsexpdt;
	}

	public String getExtnyn(){
		return this.extnyn;
	}
}

/* 작성시간 : Tue Jun 18 05:09:41 GMT 2013 */