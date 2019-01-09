/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-에듀/제휴확장 초기화면
* 작성일자 : 2009-05-25
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-에듀/제휴확장 초기화면
 */

public class SS_L_EXTN_EDU_INITCURJEHUCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_EXTN_EDU_INITCURJEHUCDRecord(){}

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

/* 작성시간 : Mon May 25 19:46:41 KST 2009 */