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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1160_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String nm_korn;

	public MT_SUBMATRCLA_1160_LCURLISTRecord(){}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}
}

/* 작성시간 : Thu May 28 11:06:02 KST 2009 */