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


public class MC_BUDG_4100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_bgn_yymm;
	public String dept_end_yymm;

	public MC_BUDG_4100_LCURLISTRecord(){}

	public void setDept_bgn_yymm(String dept_bgn_yymm){
		this.dept_bgn_yymm = dept_bgn_yymm;
	}

	public void setDept_end_yymm(String dept_end_yymm){
		this.dept_end_yymm = dept_end_yymm;
	}

	public String getDept_bgn_yymm(){
		return this.dept_bgn_yymm;
	}

	public String getDept_end_yymm(){
		return this.dept_end_yymm;
	}
}

/* 작성시간 : Mon Jun 01 13:53:15 KST 2009 */