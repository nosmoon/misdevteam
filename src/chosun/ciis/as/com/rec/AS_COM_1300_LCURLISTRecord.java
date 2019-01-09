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


package chosun.ciis.as.com.rec;

import java.sql.*;
import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */


public class AS_COM_1300_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String abrv_nm;

	public AS_COM_1300_LCURLISTRecord(){}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}
}

/* 작성시간 : Mon Mar 02 10:46:15 KST 2009 */