/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리 상세조회
* 작성일자 : 2009-05-01
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-담당별 우편번호 변경처리 상세조회
 */

public class SS_S_CHGZIPCODEDETAILLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String newzip1;
	public String newzip2;
	public String newzip3;
	public String zipcode;
	public String newaddr1;
	public String newaddr2;
	public String newaddr3;
	public String newaddr4;
	public String newbgnbnji;
	public String newendbnji;
	public String bocd;
	public String bonm;

	public SS_S_CHGZIPCODEDETAILLISTRecord(){}

	public void setNewzip1(String newzip1){
		this.newzip1 = newzip1;
	}

	public void setNewzip2(String newzip2){
		this.newzip2 = newzip2;
	}

	public void setNewzip3(String newzip3){
		this.newzip3 = newzip3;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setNewaddr1(String newaddr1){
		this.newaddr1 = newaddr1;
	}

	public void setNewaddr2(String newaddr2){
		this.newaddr2 = newaddr2;
	}

	public void setNewaddr3(String newaddr3){
		this.newaddr3 = newaddr3;
	}

	public void setNewaddr4(String newaddr4){
		this.newaddr4 = newaddr4;
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

	public String getNewzip1(){
		return this.newzip1;
	}

	public String getNewzip2(){
		return this.newzip2;
	}

	public String getNewzip3(){
		return this.newzip3;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getNewaddr1(){
		return this.newaddr1;
	}

	public String getNewaddr2(){
		return this.newaddr2;
	}

	public String getNewaddr3(){
		return this.newaddr3;
	}

	public String getNewaddr4(){
		return this.newaddr4;
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
}

/* 작성시간 : Wed May 06 16:18:06 KST 2009 */