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


package chosun.ciis.mt.close.rec;

import java.sql.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.ds.*;

/**
 * 
 */


public class MT_CLOSE_8001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_yymm;

	public MT_CLOSE_8001_LCURLISTRecord(){}

	public void setClos_yymm(String clos_yymm){
		this.clos_yymm = clos_yymm;
	}

	public String getClos_yymm(){
		return this.clos_yymm;
	}
}

/* 작성시간 : Tue May 12 16:07:54 KST 2009 */