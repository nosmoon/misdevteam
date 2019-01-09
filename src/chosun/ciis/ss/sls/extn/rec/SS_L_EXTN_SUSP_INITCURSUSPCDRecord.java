/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-중지현황-초기화면
* 작성일자 : 2009-05-14
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-중지현황-초기화면
 */

public class SS_L_EXTN_SUSP_INITCURSUSPCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_EXTN_SUSP_INITCURSUSPCDRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Thu May 14 13:41:00 KST 2009 */