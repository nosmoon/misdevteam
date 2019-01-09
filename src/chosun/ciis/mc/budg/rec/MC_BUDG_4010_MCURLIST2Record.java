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


public class MC_BUDG_4010_MCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String max_yymm;

	public MC_BUDG_4010_MCURLIST2Record(){}

	public void setMax_yymm(String max_yymm){
		this.max_yymm = max_yymm;
	}

	public String getMax_yymm(){
		return this.max_yymm;
	}
}

/* 작성시간 : Tue May 26 19:40:24 KST 2009 */