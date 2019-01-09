/***************************************************************************************************
 * 파일명 : CO_MO_L_NEW_ADDRCURCOMMLISTRecord.java_모바일용
 * 기능 : 공통-우편번호검색
 * 작성일자 : 2017-02-17
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 *
 */


public class CO_MO_L_NEW_ADDRCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String zip;
	public String rd_addr;
	public String bldgnm;
	public String rd_fulladdr;
	public String bj_addr;
	public String bj_addr_fst;
	public String bj_addr_lst;
	public String bonm;
	public String bldmngnn;
	public String bocd;
	public String telno1;
	public String telno2;
	public String telno3;
	public String sendyn;
	public String sellnetclsf;

	public CO_MO_L_NEW_ADDRCURCOMMLISTRecord(){}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setRd_addr(String rd_addr){
		this.rd_addr = rd_addr;
	}

	public void setBldgnm(String bldgnm){
		this.bldgnm = bldgnm;
	}

	public void setRd_fulladdr(String rd_fulladdr){
		this.rd_fulladdr = rd_fulladdr;
	}

	public void setBj_addr(String bj_addr){
		this.bj_addr = bj_addr;
	}

	public void setBj_addr_fst(String bj_addr_fst){
		this.bj_addr_fst = bj_addr_fst;
	}

	public void setBj_addr_lst(String bj_addr_lst){
		this.bj_addr_lst = bj_addr_lst;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setTelno1(String telno1){
		this.telno1 = telno1;
	}

	public void setTelno2(String telno2){
		this.telno2 = telno2;
	}

	public void setTelno3(String telno3){
		this.telno3 = telno3;
	}

	public void setSendyn(String sendyn){
		this.sendyn = sendyn;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public String getZip(){
		return this.zip;
	}

	public String getRd_addr(){
		return this.rd_addr;
	}

	public String getBldgnm(){
		return this.bldgnm;
	}

	public String getRd_fulladdr(){
		return this.rd_fulladdr;
	}

	public String getBj_addr(){
		return this.bj_addr;
	}

	public String getBj_addr_fst(){
		return this.bj_addr_fst;
	}

	public String getBj_addr_lst(){
		return this.bj_addr_lst;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getTelno1(){
		return this.telno1;
	}

	public String getTelno2(){
		return this.telno2;
	}

	public String getTelno3(){
		return this.telno3;
	}

	public String getSendyn(){
		return this.sendyn;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}
}

/* 작성시간 : Tue Jan 10 10:47:17 KST 2017 */