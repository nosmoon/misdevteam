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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_5004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun;

	public HD_SALY_5004_LCURLISTRecord(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getGubun(){
		return this.gubun;
	}
}

/* 작성시간 : Mon Sep 21 13:39:53 KST 2009 */