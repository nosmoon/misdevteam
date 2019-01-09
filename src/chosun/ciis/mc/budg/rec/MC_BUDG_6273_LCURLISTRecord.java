/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6273_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String t1_yscd;
	public String t1_ysnm;
	public String t1_buseocd;
	public String t1_buseocdnm;
	public String t1_yscym;
	public String t1_ht1;
	public String t1_ht2;
	public String biyul;
	public String t1_ht3;

	public MC_BUDG_6273_LCURLISTRecord(){}

	public void setT1_yscd(String t1_yscd){
		this.t1_yscd = t1_yscd;
	}

	public void setT1_ysnm(String t1_ysnm){
		this.t1_ysnm = t1_ysnm;
	}

	public void setT1_buseocd(String t1_buseocd){
		this.t1_buseocd = t1_buseocd;
	}

	public void setT1_buseocdnm(String t1_buseocdnm){
		this.t1_buseocdnm = t1_buseocdnm;
	}

	public void setT1_yscym(String t1_yscym){
		this.t1_yscym = t1_yscym;
	}

	public void setT1_ht1(String t1_ht1){
		this.t1_ht1 = t1_ht1;
	}

	public void setT1_ht2(String t1_ht2){
		this.t1_ht2 = t1_ht2;
	}

	public void setBiyul(String biyul){
		this.biyul = biyul;
	}

	public void setT1_ht3(String t1_ht3){
		this.t1_ht3 = t1_ht3;
	}

	public String getT1_yscd(){
		return this.t1_yscd;
	}

	public String getT1_ysnm(){
		return this.t1_ysnm;
	}

	public String getT1_buseocd(){
		return this.t1_buseocd;
	}

	public String getT1_buseocdnm(){
		return this.t1_buseocdnm;
	}

	public String getT1_yscym(){
		return this.t1_yscym;
	}

	public String getT1_ht1(){
		return this.t1_ht1;
	}

	public String getT1_ht2(){
		return this.t1_ht2;
	}

	public String getBiyul(){
		return this.biyul;
	}

	public String getT1_ht3(){
		return this.t1_ht3;
	}
}

/* 작성시간 : Wed May 13 12:09:14 KST 2009 */