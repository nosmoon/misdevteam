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


public class MC_BUDG_4091_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String work_dt;

	public MC_BUDG_4091_LCURLISTRecord(){}

	public void setWork_dt(String work_dt){
		this.work_dt = work_dt;
	}

	public String getWork_dt(){
		return this.work_dt;
	}
}

/* 작성시간 : Wed Jul 15 16:38:51 KST 2009 */