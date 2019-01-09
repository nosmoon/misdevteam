/***************************************************************************************************
* 파일명 : SE_QTY_2810_LCURLISTRecord.java
* 기능 : 부수관리 - 발송부수 - 본지일자별발행부수
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


public class SE_QTY_2810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt	;
	public String pcnt		;
	public String qty		;
	public String qty_11	;
	public String qty_21	;
	public String qty_31	;
	public String qty_41	;
	public String qty_51	;
	public String qty_61	;
	public String qty_71	;
	public String qty_81	;
	public String qty_91	;

	public SE_QTY_2810_LCURLISTRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setQty_11(String qty_11){
		this.qty_11 = qty_11;
	}

	public void setQty_21(String qty_21){
		this.qty_21 = qty_21;
	}

	public void setQty_31(String qty_31){
		this.qty_31 = qty_31;
	}

	public void setQty_41(String qty_41){
		this.qty_41 = qty_41;
	}

	public void setQty_51(String qty_51){
		this.qty_51 = qty_51;
	}

	public void setQty_61(String qty_61){
		this.qty_61 = qty_61;
	}

	public void setQty_71(String qty_71){
		this.qty_71 = qty_71;
	}

	public void setQty_81(String qty_81){
		this.qty_81 = qty_81;
	}

	public void setQty_91(String qty_91){
		this.qty_91 = qty_91;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getQty(){
		return this.qty;
	}

	public String getQty_11(){
		return this.qty_11;
	}

	public String getQty_21(){
		return this.qty_21;
	}

	public String getQty_31(){
		return this.qty_31;
	}

	public String getQty_41(){
		return this.qty_41;
	}

	public String getQty_51(){
		return this.qty_51;
	}

	public String getQty_61(){
		return this.qty_61;
	}

	public String getQty_71(){
		return this.qty_71;
	}

	public String getQty_81(){
		return this.qty_81;
	}

	public String getQty_91(){
		return this.qty_91;
	}

	public String getPcnt() {
		return pcnt;
	}

	public void setPcnt(String pcnt) {
		this.pcnt = pcnt;
	}
}

/* 작성시간 : Wed Mar 11 21:05:21 KST 2009 */