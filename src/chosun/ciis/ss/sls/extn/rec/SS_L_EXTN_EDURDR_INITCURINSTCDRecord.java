/***************************************************************************************************
* 파일명 : .java
* 기능 : 에듀/제휴 확장 독자 등록 초기화면(팝업) 
* 작성일자 : 2009-05-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 에듀/제휴 확장 독자 등록 초기화면(팝업) 
 */

public class SS_L_EXTN_EDURDR_INITCURINSTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String insttcd;
	public String insttnm;

	public SS_L_EXTN_EDURDR_INITCURINSTCDRecord(){}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setInsttnm(String insttnm){
		this.insttnm = insttnm;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getInsttnm(){
		return this.insttnm;
	}
}

/* 작성시간 : Thu May 28 14:40:01 KST 2009 */