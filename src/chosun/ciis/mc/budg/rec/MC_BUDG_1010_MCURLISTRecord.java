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


public class MC_BUDG_1010_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hsahoicha;

	public MC_BUDG_1010_MCURLISTRecord(){}

	public void setHsahoicha(String hsahoicha){
		this.hsahoicha = hsahoicha;
	}

	public String getHsahoicha(){
		return this.hsahoicha;
	}
}

/* 작성시간 : Fri May 15 16:44:00 KST 2009 */