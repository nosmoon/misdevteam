/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국지원-빌링-지로EDI수납관리-초기화면
* 작성일자 : 2009-04-13
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국지원-빌링-지로EDI수납관리-초기화면
 */

public class SS_L_EDI_INITJYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_L_EDI_INITJYCURRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}
}

/* 작성시간 : Mon Apr 13 21:52:28 KST 2009 */