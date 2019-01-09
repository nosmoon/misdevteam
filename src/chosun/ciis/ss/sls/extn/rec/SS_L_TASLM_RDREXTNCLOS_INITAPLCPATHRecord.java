/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황 - 지국확장마감 목록 초기화 
* 작성일자 : 2009-08-26
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황 - 지국확장마감 목록 초기화 
 */

public class SS_L_TASLM_RDREXTNCLOS_INITAPLCPATHRecord extends java.lang.Object implements java.io.Serializable{

	public String code;
	public String name;

	public SS_L_TASLM_RDREXTNCLOS_INITAPLCPATHRecord(){}

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

/* 작성시간 : Wed Aug 26 17:39:52 KST 2009 */