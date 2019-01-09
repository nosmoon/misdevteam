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


public class MC_COST_1020_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_cym;

	public MC_COST_1020_MCURLISTRecord(){}

	public void setWork_cym(String work_cym){
		this.work_cym = work_cym;
	}

	public String getWork_cym(){
		return this.work_cym;
	}
}

/* 작성시간 : Tue Apr 28 11:35:53 KST 2009 */