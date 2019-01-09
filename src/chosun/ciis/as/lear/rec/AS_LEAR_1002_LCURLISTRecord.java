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


package chosun.ciis.as.lear.rec;

import java.sql.*;
import chosun.ciis.as.lear.dm.*;
import chosun.ciis.as.lear.ds.*;

/**
 * 
 */


public class AS_LEAR_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hire_dlco_ern;
	public String hire_dlco_nm;
	public String hire_dlco_ern_nm;

	public AS_LEAR_1002_LCURLISTRecord(){}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setHire_dlco_nm(String hire_dlco_nm){
		this.hire_dlco_nm = hire_dlco_nm;
	}

	public void setHire_dlco_ern_nm(String hire_dlco_ern_nm){
		this.hire_dlco_ern_nm = hire_dlco_ern_nm;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getHire_dlco_nm(){
		return this.hire_dlco_nm;
	}

	public String getHire_dlco_ern_nm(){
		return this.hire_dlco_ern_nm;
	}
}

/* 작성시간 : Mon Jul 13 11:08:57 KST 2009 */