/***************************************************************************************************
* 파일명 : SE_QTY_3110_LCURLISTRecord.java
* 기능 : 부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_3110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt	;
	public String before_qty;
	public String qty		;
	public String after_qty	;

	public SE_QTY_3110_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setBefore_qty(String before_qty){
		this.before_qty = before_qty;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAfter_qty(String after_qty){
		this.after_qty = after_qty;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getBefore_qty(){
		return this.before_qty;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAfter_qty(){
		return this.after_qty;
	}
}

/* 작성시간 : Tue Mar 10 21:14:10 KST 2009 */