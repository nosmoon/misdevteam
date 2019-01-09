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


public class MC_COST_2022_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String msg;

	public MC_COST_2022_ICURLISTRecord(){}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return this.msg;
	}
}

/* 작성시간 : Mon May 11 14:20:30 KST 2009 */