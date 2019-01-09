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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_7000_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;

	public MT_PAPORD_7000_LCURLIST1Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}
}

/* 작성시간 : Wed Nov 25 10:58:57 KST 2009 */