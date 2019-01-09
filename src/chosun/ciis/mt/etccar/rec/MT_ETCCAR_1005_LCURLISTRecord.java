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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_yn;

	public MT_ETCCAR_1005_LCURLISTRecord(){}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}
}

/* 작성시간 : Wed Sep 09 11:13:19 KST 2009 */