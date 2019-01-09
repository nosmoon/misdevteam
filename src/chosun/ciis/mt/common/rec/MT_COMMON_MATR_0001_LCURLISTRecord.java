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


package chosun.ciis.mt.common.rec;

import java.sql.*;
import chosun.ciis.mt.common.dm.*;
import chosun.ciis.mt.common.ds.*;

/**
 * 
 */


public class MT_COMMON_MATR_0001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_nm;

	public MT_COMMON_MATR_0001_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}
}

/* 작성시간 : Thu Apr 02 10:51:55 KST 2009 */