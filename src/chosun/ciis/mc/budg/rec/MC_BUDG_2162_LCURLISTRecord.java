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


public class MC_BUDG_2162_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String before_budg_yymm;

	public MC_BUDG_2162_LCURLISTRecord(){}

	public void setBefore_budg_yymm(String before_budg_yymm){
		this.before_budg_yymm = before_budg_yymm;
	}

	public String getBefore_budg_yymm(){
		return this.before_budg_yymm;
	}
}

/* 작성시간 : Wed Jun 24 19:53:32 KST 2009 */