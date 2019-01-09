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


public class MC_BUDG_6304_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_mm;

	public MC_BUDG_6304_LCURLISTRecord(){}

	public void setClos_mm(String clos_mm){
		this.clos_mm = clos_mm;
	}

	public String getClos_mm(){
		return this.clos_mm;
	}
}

/* 작성시간 : Sat May 23 13:10:02 KST 2009 */