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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_1101_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String tot_amt;
	public String month_tot_amt;

	public MT_SUBMATRCLA_1101_LCURLIST2Record(){}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setMonth_tot_amt(String month_tot_amt){
		this.month_tot_amt = month_tot_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getMonth_tot_amt(){
		return this.month_tot_amt;
	}
}

/* 작성시간 : Fri Jul 10 19:49:01 KST 2009 */