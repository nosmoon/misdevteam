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


package chosun.ciis.mc.cost.rec;

import java.sql.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.ds.*;

/**
 * 
 */


public class MC_COST_3010_ACURLIST_04Record extends java.lang.Object implements java.io.Serializable{

	public String budg_cdnm;

	public MC_COST_3010_ACURLIST_04Record(){}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}
}

/* 작성시간 : Mon May 11 14:20:32 KST 2009 */