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


public class MT_COMMATR_2200_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;

	public MT_COMMATR_2200_LCURLIST1Record(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}
}

/* 작성시간 : Tue Jul 07 21:17:21 KST 2009 */