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


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yy;
	public String evlu_seq;
	public String evlu_nm;

	public SE_COMM_1510_LCURLISTRecord(){}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setEvlu_seq(String evlu_seq){
		this.evlu_seq = evlu_seq;
	}

	public void setEvlu_nm(String evlu_nm){
		this.evlu_nm = evlu_nm;
	}

	public String getYy(){
		return this.yy;
	}

	public String getEvlu_seq(){
		return this.evlu_seq;
	}

	public String getEvlu_nm(){
		return this.evlu_nm;
	}
}

/* 작성시간 : Wed Apr 08 10:34:45 KST 2009 */