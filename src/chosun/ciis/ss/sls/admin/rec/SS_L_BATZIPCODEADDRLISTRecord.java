/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-일괄 우편번호 변경처리-조회
* 작성일자 : 2009-05-08
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-일괄 우편번호 변경처리-조회
 */

public class SS_L_BATZIPCODEADDRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String newzip1;
	public String newzip2;
	public String newzip3;
	public String newzip4;
	public String zipcode;
	public String dtladdr;
	public String newbgnbnji;
	public String newendbnji;
	public String bocd;
	public String bonm;
	public String chgresn;

	public SS_L_BATZIPCODEADDRLISTRecord(){}

	public void setNewzip1(String newzip1){
		this.newzip1 = newzip1;
	}

	public void setNewzip2(String newzip2){
		this.newzip2 = newzip2;
	}

	public void setNewzip3(String newzip3){
		this.newzip3 = newzip3;
	}

	public void setNewzip4(String newzip4){
		this.newzip4 = newzip4;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setDtladdr(String dtladdr){
		this.dtladdr = dtladdr;
	}

	public void setNewbgnbnji(String newbgnbnji){
		this.newbgnbnji = newbgnbnji;
	}

	public void setNewendbnji(String newendbnji){
		this.newendbnji = newendbnji;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setChgresn(String chgresn){
		this.chgresn = chgresn;
	}

	public String getNewzip1(){
		return this.newzip1;
	}

	public String getNewzip2(){
		return this.newzip2;
	}

	public String getNewzip3(){
		return this.newzip3;
	}

	public String getNewzip4(){
		return this.newzip4;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getDtladdr(){
		return this.dtladdr;
	}

	public String getNewbgnbnji(){
		return this.newbgnbnji;
	}

	public String getNewendbnji(){
		return this.newendbnji;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getChgresn(){
		return this.chgresn;
	}
}

/* 작성시간 : Fri May 08 14:33:51 KST 2009 */