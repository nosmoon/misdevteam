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


package chosun.ciis.tn.lnk.rec;

import java.sql.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.ds.*;

/**
 * 
 */


public class TN_LNK_1220_DCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String xls_nm;

	public TN_LNK_1220_DCURLISTRecord(){}

	public void setXls_nm(String xls_nm){
		this.xls_nm = xls_nm;
	}

	public String getXls_nm(){
		return this.xls_nm;
	}
}

/* 작성시간 : Fri Sep 30 14:06:40 KST 2016 */