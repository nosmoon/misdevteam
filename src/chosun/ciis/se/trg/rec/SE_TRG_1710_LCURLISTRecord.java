/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yy;
	public String evlu_seq;
	public String evlu_dt;
	public String evlu_nm;
	public String clos_yn;
	public String clos_dt;

	public SE_TRG_1710_LCURLISTRecord(){}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setEvlu_seq(String evlu_seq){
		this.evlu_seq = evlu_seq;
	}

	public void setEvlu_dt(String evlu_dt){
		this.evlu_dt = evlu_dt;
	}

	public void setEvlu_nm(String evlu_nm){
		this.evlu_nm = evlu_nm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public String getYy(){
		return this.yy;
	}

	public String getEvlu_seq(){
		return this.evlu_seq;
	}

	public String getEvlu_dt(){
		return this.evlu_dt;
	}

	public String getEvlu_nm(){
		return this.evlu_nm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}
}

/* 작성시간 : Mon Jul 13 14:45:17 KST 2009 */