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


package chosun.ciis.is.rpt.rec;

import java.sql.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.ds.*;

/**
 * 
 */


public class IS_RPT_1420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dt_nm;
	public String suply_amt;
	public String amt;

	public IS_RPT_1420_LCURLISTRecord(){}

	public void setDt_nm(String dt_nm){
		this.dt_nm = dt_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getDt_nm(){
		return this.dt_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu May 31 14:32:34 KST 2012 */