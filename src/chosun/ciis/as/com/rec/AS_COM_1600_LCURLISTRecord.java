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


public class AS_COM_1600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_nm;

	public AS_COM_1600_LCURLISTRecord(){}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}
}

/* 작성시간 : Mon Mar 02 11:56:04 KST 2009 */