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


public class IS_RPT_1720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mm_nm;
	public String amt;

	public IS_RPT_1720_LCURLISTRecord(){}

	public void setMm_nm(String mm_nm){
		this.mm_nm = mm_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getMm_nm(){
		return this.mm_nm;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu May 31 16:39:14 KST 2012 */