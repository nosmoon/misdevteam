/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1420_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String rank;
	public String amt;

	public SE_TRG_1420_LCURLIST2Record(){}

	public void setRank(String rank){
		this.rank = rank;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getRank(){
		return this.rank;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu Apr 02 10:17:56 KST 2009 */