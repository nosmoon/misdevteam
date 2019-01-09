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


public class MC_BUDG_6281_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String pcnt;
	public String pcnt_amt;
	public String d_amt;
	public String m_amt;
	public String y_amt;

	public MC_BUDG_6281_LCURLIST1Record(){}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setPcnt_amt(String pcnt_amt){
		this.pcnt_amt = pcnt_amt;
	}

	public void setD_amt(String d_amt){
		this.d_amt = d_amt;
	}

	public void setM_amt(String m_amt){
		this.m_amt = m_amt;
	}

	public void setY_amt(String y_amt){
		this.y_amt = y_amt;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getPcnt_amt(){
		return this.pcnt_amt;
	}

	public String getD_amt(){
		return this.d_amt;
	}

	public String getM_amt(){
		return this.m_amt;
	}

	public String getY_amt(){
		return this.y_amt;
	}
}

/* 작성시간 : Sat May 23 17:08:27 KST 2009 */