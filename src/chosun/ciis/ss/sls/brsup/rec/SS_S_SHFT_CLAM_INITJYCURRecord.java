/***************************************************************************************************
* 파일명 : .java
* 기능 : *지국업무지원-자동이체-청구-초기화면
* 작성일자 : 2009-04-14
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-자동이체-청구-초기화면
 */

public class SS_S_SHFT_CLAM_INITJYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_S_SHFT_CLAM_INITJYCURRecord(){}

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

/* 작성시간 : Tue Apr 14 14:49:12 KST 2009 */