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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1709_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_nm;

	public AS_ASET_1709_LCURLISTRecord(){}

	public void setBudg_nm(String budg_nm){
		this.budg_nm = budg_nm;
	}

	public String getBudg_nm(){
		return this.budg_nm;
	}
}

/* 작성시간 : Mon Jun 15 09:54:08 KST 2009 */