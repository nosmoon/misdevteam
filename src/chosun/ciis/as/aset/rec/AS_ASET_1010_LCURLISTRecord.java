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


public class AS_ASET_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_yymm;

	public AS_ASET_1010_LCURLISTRecord(){}

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public String getClos_yymm(){
		return this.clos_yymm;
	}
}

/* 작성시간 : Tue May 12 09:48:12 KST 2009 */