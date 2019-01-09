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


public class MC_BUDG_4051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bjamt;
	public String eramt;
	public String jhamt;
	public String cgamt;

	public MC_BUDG_4051_LCURLISTRecord(){}

	public void setBjamt(String bjamt){
		this.bjamt = bjamt;
	}

	public void setEramt(String eramt){
		this.eramt = eramt;
	}

	public void setJhamt(String jhamt){
		this.jhamt = jhamt;
	}

	public void setCgamt(String cgamt){
		this.cgamt = cgamt;
	}

	public String getBjamt(){
		return this.bjamt;
	}

	public String getEramt(){
		return this.eramt;
	}

	public String getJhamt(){
		return this.jhamt;
	}

	public String getCgamt(){
		return this.cgamt;
	}
}

/* 작성시간 : Fri May 29 19:39:59 KST 2009 */