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


public class AS_COM_1200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_nm;

	public AS_COM_1200_LCURLISTRecord(){}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}
}

/* 작성시간 : Fri Feb 27 14:28:07 KST 2009 */