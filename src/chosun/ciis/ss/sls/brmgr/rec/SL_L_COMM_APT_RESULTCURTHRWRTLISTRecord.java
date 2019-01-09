/***************************************************************************************************
 * 파일명   : SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord.java
 * 기능     : 지국경영-아파트투입율-투입결과조회
 * 작성일자 : 2005/11/07
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  지국경영-아파트투입율-투입결과조회
**/

public class SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String invsgdt;
	public String pyong;
	public String invsgno;
	public String bocd;
	public String addrcd;
	public String dongno;
	public String hoscnt;
	public String cho_cnt;
	public String cho_rate;
	public String jung_cnt;
	public String jung_rate;
	public String dong_cnt;
	public String dong_rate;

	public SL_L_COMM_APT_RESULTCURTHRWRTLISTRecord(){}

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
}

/* 작성시간 : Mon Nov 07 19:57:00 KST 2005 */