/***************************************************************************************************
* 파일명 : .java
* 기능 : 아파트투입률 조회
* 작성일자 : 2009-08-13
* 작성자 : 권정윤
***************************************************************************************************/
 

package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 아파트투입률 조회
 */

public class SS_L_APTDONGUNITTHRWDONGCURRecord extends java.lang.Object implements java.io.Serializable{

	public String invsgdt;
	public String deptcd;
	public String deptnm;
	public String partcd;
	public String partnm;
	public String areacd;
	public String areanm;
	public String bocd;
	public String bonm;
	public String addrcd;
	public String addrcdnm;
	public String dongno;
	public String pyong;
	public String hoscnt;
	public int chothrwqty;
	public String cho_rate;
	public int jungthrwqty;
	public String jung_rate;
	public int dongthrwqty;
	public String dong_rate;
	public int etcthrwqty;
	public String etc_rate;
	public String check1;

	public SS_L_APTDONGUNITTHRWDONGCURRecord(){}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
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

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrcdnm(String addrcdnm){
		this.addrcdnm = addrcdnm;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setChothrwqty(int chothrwqty){
		this.chothrwqty = chothrwqty;
	}

	public void setCho_rate(String cho_rate){
		this.cho_rate = cho_rate;
	}

	public void setJungthrwqty(int jungthrwqty){
		this.jungthrwqty = jungthrwqty;
	}

	public void setJung_rate(String jung_rate){
		this.jung_rate = jung_rate;
	}

	public void setDongthrwqty(int dongthrwqty){
		this.dongthrwqty = dongthrwqty;
	}

	public void setDong_rate(String dong_rate){
		this.dong_rate = dong_rate;
	}

	public void setEtcthrwqty(int etcthrwqty){
		this.etcthrwqty = etcthrwqty;
	}

	public void setEtc_rate(String etc_rate){
		this.etc_rate = etc_rate;
	}

	public void setCheck1(String check1){
		this.check1 = check1;
	}

	public String getInvsgdt(){
		return this.invsgdt;
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

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrcdnm(){
		return this.addrcdnm;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public int getChothrwqty(){
		return this.chothrwqty;
	}

	public String getCho_rate(){
		return this.cho_rate;
	}

	public int getJungthrwqty(){
		return this.jungthrwqty;
	}

	public String getJung_rate(){
		return this.jung_rate;
	}

	public int getDongthrwqty(){
		return this.dongthrwqty;
	}

	public String getDong_rate(){
		return this.dong_rate;
	}

	public int getEtcthrwqty(){
		return this.etcthrwqty;
	}

	public String getEtc_rate(){
		return this.etc_rate;
	}

	public String getCheck1(){
		return this.check1;
	}
}

/* 작성시간 : Fri Aug 14 11:09:28 KST 2009 */