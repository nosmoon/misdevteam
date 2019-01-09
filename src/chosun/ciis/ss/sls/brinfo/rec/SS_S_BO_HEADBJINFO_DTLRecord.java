/***************************************************************************************************
 * 파일명   : SS_S_BO_HEADBJINFO_DTLRecord.java
 * 기능     : 지국info-지국장정보-상세조회
 * 작성일자 : 2007/01/11
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
**  SP_SS_S_BO_HEAD
**/

public class SS_S_BO_HEADBJINFO_DTLRecord extends java.lang.Object implements java.io.Serializable{

	public String bjnm;
	public String bjjuminno;
	public String bjtelno;
	public String bjzipcd1;
	public String bjzipcd2;
	public String bjjuso4;

	public SS_S_BO_HEADBJINFO_DTLRecord(){}

	public void setBjnm(String bjnm){
		this.bjnm = bjnm;
	}

	public void setBjjuminno(String bjjuminno){
		this.bjjuminno = bjjuminno;
	}

	public void setBjtelno(String bjtelno){
		this.bjtelno = bjtelno;
	}

	public void setBjzipcd1(String bjzipcd1){
		this.bjzipcd1 = bjzipcd1;
	}

	public void setBjzipcd2(String bjzipcd2){
		this.bjzipcd2 = bjzipcd2;
	}

	public void setBjjuso4(String bjjuso4){
		this.bjjuso4 = bjjuso4;
	}

	public String getBjnm(){
		return this.bjnm;
	}

	public String getBjjuminno(){
		return this.bjjuminno;
	}

	public String getBjtelno(){
		return this.bjtelno;
	}

	public String getBjzipcd1(){
		return this.bjzipcd1;
	}

	public String getBjzipcd2(){
		return this.bjzipcd2;
	}

	public String getBjjuso4(){
		return this.bjjuso4;
	}
}

/* 작성시간 : Thu Jan 11 14:52:18 KST 2007 */