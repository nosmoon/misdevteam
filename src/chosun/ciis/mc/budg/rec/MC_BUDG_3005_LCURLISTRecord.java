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


public class MC_BUDG_3005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String tms_nm;

	public MC_BUDG_3005_LCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setTms_nm(String tms_nm){
		this.tms_nm = tms_nm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getTms_nm(){
		return this.tms_nm;
	}
}

/* 작성시간 : Mon Jul 13 11:38:18 KST 2009 */