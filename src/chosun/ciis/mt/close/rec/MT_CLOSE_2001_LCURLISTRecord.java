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


public class MT_CLOSE_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_yymm;

	public MT_CLOSE_2001_LCURLISTRecord(){}

	public void setOccr_yymm(String occr_yymm){
		this.occr_yymm = occr_yymm;
	}

	public String getOccr_yymm(){
		return this.occr_yymm;
	}
}

/* 작성시간 : Tue Jul 21 09:53:26 KST 2009 */