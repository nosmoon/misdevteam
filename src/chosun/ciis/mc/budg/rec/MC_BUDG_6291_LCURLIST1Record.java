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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6291_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pcnt;
	public String pcnt_fee;
	public String d_fee;
	public String m_fee;
	public String y_fee;
	public String pcnt1;

	public MC_BUDG_6291_LCURLIST1Record(){}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setPcnt_fee(String pcnt_fee){
		this.pcnt_fee = pcnt_fee;
	}

	public void setD_fee(String d_fee){
		this.d_fee = d_fee;
	}

	public void setM_fee(String m_fee){
		this.m_fee = m_fee;
	}

	public void setY_fee(String y_fee){
		this.y_fee = y_fee;
	}

	public void setPcnt1(String pcnt1){
		this.pcnt1 = pcnt1;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getPcnt_fee(){
		return this.pcnt_fee;
	}

	public String getD_fee(){
		return this.d_fee;
	}

	public String getM_fee(){
		return this.m_fee;
	}

	public String getY_fee(){
		return this.y_fee;
	}

	public String getPcnt1(){
		return this.pcnt1;
	}
}

/* 작성시간 : Wed Sep 16 10:36:58 KST 2009 */