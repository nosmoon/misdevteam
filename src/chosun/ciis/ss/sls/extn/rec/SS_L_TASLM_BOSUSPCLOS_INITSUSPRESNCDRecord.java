/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황 - 지국중지마감 목록 초기화 
* 작성일자 : 2009-08-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황 - 지국중지마감 목록 초기화 
 */

public class SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord extends java.lang.Object implements java.io.Serializable{

	public String code;
	public String name;

	public SS_L_TASLM_BOSUSPCLOS_INITSUSPRESNCDRecord(){}

	public void setCode(String code){
		this.code = code;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getCode(){
		return this.code;
	}

	public String getName(){
		return this.name;
	}
}

/* 작성시간 : Wed Aug 26 18:21:02 KST 2009 */