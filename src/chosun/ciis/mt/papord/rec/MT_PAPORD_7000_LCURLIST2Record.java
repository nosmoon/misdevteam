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


public class MT_PAPORD_7000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String ordr_roll;
	public String ordr_wgt;

	public MT_PAPORD_7000_LCURLIST2Record(){}

	public void setOrdr_roll(String ordr_roll){
		this.ordr_roll = ordr_roll;
	}

	public void setOrdr_wgt(String ordr_wgt){
		this.ordr_wgt = ordr_wgt;
	}

	public String getOrdr_roll(){
		return this.ordr_roll;
	}

	public String getOrdr_wgt(){
		return this.ordr_wgt;
	}
}

/* 작성시간 : Wed Nov 25 10:58:57 KST 2009 */