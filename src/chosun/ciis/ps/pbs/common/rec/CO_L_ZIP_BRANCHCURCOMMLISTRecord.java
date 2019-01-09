/***************************************************************************************************
* 파일명 : CO_L_ZIP_BRANCH.java
* 기능 :   우편번호 검색 관련 - 지국정보도 가져옮
* 작성일자 : 2006-12-05
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.common.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 *  우편번호 검색 관련 - 지국정보도 가져옮
 *
 **/

public class CO_L_ZIP_BRANCHCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String zip;
	public String addr;
	public String bgnn;
	public String endn;
	public String bocd;
	public String bonm;
	public String telno1;
	public String telno2;
	public String telno3;
	public String sendyn;

	public CO_L_ZIP_BRANCHCURCOMMLISTRecord(){}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBgnn(String bgnn){
		this.bgnn = bgnn;
	}

	public void setEndn(String endn){
		this.endn = endn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBgnn(){
		return this.bgnn;
	}

	public String getEndn(){
		return this.endn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
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
}

/* 작성시간 : Thu Mar 29 18:19:39 KST 2007 */