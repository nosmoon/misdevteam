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


public class MC_BUDG_6111_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String last_yyyymm;

	public MC_BUDG_6111_LCURLIST2Record(){}

	public void setLast_yyyymm(String last_yyyymm){
		this.last_yyyymm = last_yyyymm;
	}

	public String getLast_yyyymm(){
		return this.last_yyyymm;
	}
}

/* 작성시간 : Mon Apr 06 15:18:52 KST 2009 */