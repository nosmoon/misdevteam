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


public class MC_BUDG_6041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String exec_no;

	public MC_BUDG_6041_LCURLISTRecord(){}

	public void setExec_no(String exec_no){
		this.exec_no = exec_no;
	}

	public String getExec_no(){
		return this.exec_no;
	}
}

/* 작성시간 : Mon May 18 17:23:07 KST 2009 */