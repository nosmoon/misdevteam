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


package chosun.ciis.co.cocd.rec;

import java.sql.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.ds.*;

/**
 * 
 */


public class CO_COCD_2020_SCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String zip;
	public String juso;

	public CO_COCD_2020_SCURCOMMLISTRecord(){}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setJuso(String juso){
		this.juso = juso;
	}

	public String getZip(){
		return this.zip;
	}

	public String getJuso(){
		return this.juso;
	}
}

/* 작성시간 : Mon Feb 06 10:09:07 KST 2012 */