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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_nm;

	public MT_COMMATR_1101_LCURLISTRecord(){}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}
}

/* 작성시간 : Thu Feb 19 20:03:12 KST 2009 */