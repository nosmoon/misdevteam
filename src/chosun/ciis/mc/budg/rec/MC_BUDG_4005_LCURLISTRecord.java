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


public class MC_BUDG_4005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String max_yymm;

	public MC_BUDG_4005_LCURLISTRecord(){}

	public void setMax_yymm(String max_yymm){
		this.max_yymm = max_yymm;
	}

	public String getMax_yymm(){
		return this.max_yymm;
	}
}

/* 작성시간 : Tue May 19 21:35:33 KST 2009 */