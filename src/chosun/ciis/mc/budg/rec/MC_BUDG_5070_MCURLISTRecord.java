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


public class MC_BUDG_5070_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String exec_no;

	public MC_BUDG_5070_MCURLISTRecord(){}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public String getExec_no(){
		return this.exec_no;
	}
}

/* 작성시간 : Wed Apr 15 17:21:09 KST 2009 */