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


public class MC_BUDG_1062_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yscd;

	public MC_BUDG_1062_LCURLISTRecord(){}

	public void setYscd(String yscd){
		this.yscd = yscd;
	}

	public String getYscd(){
		return this.yscd;
	}
}

/* 작성시간 : Mon Apr 06 16:10:00 KST 2009 */