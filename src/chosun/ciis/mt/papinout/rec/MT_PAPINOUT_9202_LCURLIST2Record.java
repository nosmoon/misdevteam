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


public class MT_PAPINOUT_9202_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String ewh_dt;

	public MT_PAPINOUT_9202_LCURLIST2Record(){}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}
}

/* 작성시간 : Wed May 20 08:58:24 KST 2009 */