/***************************************************************************************************
* 파일명 : .java
* 기능 : 우편번호 리스트 
* 작성일자 : 2009-08-27
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.co.post.rec;

import java.sql.*;
import chosun.ciis.co.post.dm.*;
import chosun.ciis.co.post.ds.*;

/**
 * 우편번호 리스트 
 */

public class CO_L_ZIP_ALLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String zip;
	public String addr;
	public String bgnn;
	public String endn;
	public String bocd;
	public String bonm;
	public String telno1;
	public String telno2;
	public String telno3;

	public CO_L_ZIP_ALLCURCOMMLISTRecord(){}

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
}

/* 작성시간 : Thu Aug 27 11:53:48 KST 2009 */