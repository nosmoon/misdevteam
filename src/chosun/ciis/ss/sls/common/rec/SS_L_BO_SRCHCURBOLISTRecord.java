/***************************************************************************************************
* 파일명 : .java
* 기능 : *공통-지국검색 목록
* 작성일자 : 2009-05-07
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.common.rec;

import java.sql.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * 공통-지국검색 목록
 */

public class SS_L_BO_SRCHCURBOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String deptnm;
	public String partnm;
	public String partcd;
	public String areacd;
	public String areanm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String fax1;
	public String fax2;
	public String fax3;
	public String bo_headnm;
	public String htel_no1;
	public String htel_no2;
	public String htel_no3;
	public String hptph_no1;
	public String hptph_no2;
	public String hptph_no3;
	public String hemail;
	public String boaddr;
	public String bodtlsaddr;
	public String hboaddr;
	public String hbodtlsaddr;

	public SS_L_BO_SRCHCURBOLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setPartnm(String partnm){
		this.partnm = partnm;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public void setFax1(String fax1){
		this.fax1 = fax1;
	}

	public void setFax2(String fax2){
		this.fax2 = fax2;
	}

	public void setFax3(String fax3){
		this.fax3 = fax3;
	}

	public void setBo_headnm(String bo_headnm){
		this.bo_headnm = bo_headnm;
	}

	public void setHtel_no1(String htel_no1){
		this.htel_no1 = htel_no1;
	}

	public void setHtel_no2(String htel_no2){
		this.htel_no2 = htel_no2;
	}

	public void setHtel_no3(String htel_no3){
		this.htel_no3 = htel_no3;
	}

	public void setHptph_no1(String hptph_no1){
		this.hptph_no1 = hptph_no1;
	}

	public void setHptph_no2(String hptph_no2){
		this.hptph_no2 = hptph_no2;
	}

	public void setHptph_no3(String hptph_no3){
		this.hptph_no3 = hptph_no3;
	}

	public void setHemail(String hemail){
		this.hemail = hemail;
	}

	public void setBoaddr(String boaddr){
		this.boaddr = boaddr;
	}

	public void setBodtlsaddr(String bodtlsaddr){
		this.bodtlsaddr = bodtlsaddr;
	}

	public void setHboaddr(String hboaddr){
		this.hboaddr = hboaddr;
	}

	public void setHbodtlsaddr(String hbodtlsaddr){
		this.hbodtlsaddr = hbodtlsaddr;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getPartnm(){
		return this.partnm;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public String getFax1(){
		return this.fax1;
	}

	public String getFax2(){
		return this.fax2;
	}

	public String getFax3(){
		return this.fax3;
	}

	public String getBo_headnm(){
		return this.bo_headnm;
	}

	public String getHtel_no1(){
		return this.htel_no1;
	}

	public String getHtel_no2(){
		return this.htel_no2;
	}

	public String getHtel_no3(){
		return this.htel_no3;
	}

	public String getHptph_no1(){
		return this.hptph_no1;
	}

	public String getHptph_no2(){
		return this.hptph_no2;
	}

	public String getHptph_no3(){
		return this.hptph_no3;
	}

	public String getHemail(){
		return this.hemail;
	}

	public String getBoaddr(){
		return this.boaddr;
	}

	public String getBodtlsaddr(){
		return this.bodtlsaddr;
	}

	public String getHboaddr(){
		return this.hboaddr;
	}

	public String getHbodtlsaddr(){
		return this.hbodtlsaddr;
	}
}

/* 작성시간 : Fri May 15 11:38:11 KST 2009 */