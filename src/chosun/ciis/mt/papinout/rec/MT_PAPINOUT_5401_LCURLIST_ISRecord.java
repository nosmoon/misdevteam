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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_5401_LCURLIST_ISRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;

	public MT_PAPINOUT_5401_LCURLIST_ISRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}
}

/* 작성시간 : Fri May 15 13:49:58 KST 2009 */