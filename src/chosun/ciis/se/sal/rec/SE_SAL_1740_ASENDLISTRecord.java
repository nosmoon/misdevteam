/***************************************************************************************************
* 파일명 : SE_SAL_1740_ASENDLISTRecord.java
* 기능 : 판매 - 지대관리 - 매출관리 - 계산서 발행
* 작성일자 : 2009-04-21
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_1740_ASENDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String col			;
	public String slip_occr_dt	;
	public String slip_occr_cd	;
	public String slip_seq		;

	public SE_SAL_1740_ASENDLISTRecord(){}

	public void setCol(String col){
		this.col = col;
	}

	public String getSlip_occr_cd() {
		return slip_occr_cd;
	}

	public void setSlip_occr_cd(String slip_occr_cd) {
		this.slip_occr_cd = slip_occr_cd;
	}

	public String getSlip_occr_dt() {
		return slip_occr_dt;
	}

	public void setSlip_occr_dt(String slip_occr_dt) {
		this.slip_occr_dt = slip_occr_dt;
	}

	public String getSlip_seq() {
		return slip_seq;
	}

	public void setSlip_seq(String slip_seq) {
		this.slip_seq = slip_seq;
	}

	public String getCol(){
		return this.col;
	}
}

/* 작성시간 : Tue Apr 21 18:02:01 KST 2009 */