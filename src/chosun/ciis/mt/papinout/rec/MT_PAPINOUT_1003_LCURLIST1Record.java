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


public class MT_PAPINOUT_1003_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pj_kind;
	public String qunt;
	public String wgt;

	public MT_PAPINOUT_1003_LCURLIST1Record(){}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getWgt(){
		return this.wgt;
	}
}

/* 작성시간 : Tue Apr 14 20:36:25 KST 2009 */