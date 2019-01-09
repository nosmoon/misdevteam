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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_COMMATR_9101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cd;
	public String aply_dt;
	public String uprc;

	public MT_COMMATR_9101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setCd(String cd){
		this.cd = cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getCd(){
		return this.cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getUprc(){
		return this.uprc;
	}

}

/* 작성시간 : Mon May 11 15:11:17 KST 2009 */