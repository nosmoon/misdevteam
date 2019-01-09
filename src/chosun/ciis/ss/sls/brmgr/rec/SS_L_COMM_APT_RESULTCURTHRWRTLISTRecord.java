/***************************************************************************************************
* 파일명 : .java
* 기능 : *아파트투입현황(결과보기)
* 작성일자 : 2009-05-29
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 아파트투입현황(결과보기)
 */

public class SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;
	public String invsgdt;
	public String pyong;
	public String invsgno;
	public String bocd;
	public String bonm;
	public String addrcd;
	public String dongno;
	public String hoscnt;
	public String cho_cnt;
	public String cho_rate;
	public String jung_cnt;
	public String jung_rate;
	public String dong_cnt;
	public String dong_rate;
	public String remkclsf;
	public String invsgpers;
	public String regtype1;
	public String regtype2;

	public SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setPyong(String pyong){
		this.pyong = pyong;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
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

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setCho_cnt(String cho_cnt){
		this.cho_cnt = cho_cnt;
	}

	public void setCho_rate(String cho_rate){
		this.cho_rate = cho_rate;
	}

	public void setJung_cnt(String jung_cnt){
		this.jung_cnt = jung_cnt;
	}

	public void setJung_rate(String jung_rate){
		this.jung_rate = jung_rate;
	}

	public void setDong_cnt(String dong_cnt){
		this.dong_cnt = dong_cnt;
	}

	public void setDong_rate(String dong_rate){
		this.dong_rate = dong_rate;
	}

	public void setRemkclsf(String remkclsf){
		this.remkclsf = remkclsf;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setRegtype1(String regtype1){
		this.regtype1 = regtype1;
	}

	public void setRegtype2(String regtype2){
		this.regtype2 = regtype2;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getPyong(){
		return this.pyong;
	}

	public String getInvsgno(){
		return this.invsgno;
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

	public String getDongno(){
		return this.dongno;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getCho_cnt(){
		return this.cho_cnt;
	}

	public String getCho_rate(){
		return this.cho_rate;
	}

	public String getJung_cnt(){
		return this.jung_cnt;
	}

	public String getJung_rate(){
		return this.jung_rate;
	}

	public String getDong_cnt(){
		return this.dong_cnt;
	}

	public String getDong_rate(){
		return this.dong_rate;
	}

	public String getRemkclsf(){
		return this.remkclsf;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getRegtype1(){
		return this.regtype1;
	}

	public String getRegtype2(){
		return this.regtype2;
	}
}

/* 작성시간 : Fri May 29 17:08:00 KST 2009 */