/***************************************************************************************************
* ���ϸ� : SE_SAL_1740_ASENDLISTRecord.java
* ��� : �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-21
* �ۼ��� : �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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

/* �ۼ��ð� : Tue Apr 21 18:02:01 KST 2009 */