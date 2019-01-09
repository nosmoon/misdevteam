/***************************************************************************************************
* 파일명 : .java
* 기능 : 본사확장 초기화 
* 작성일자 : 2009-07-23
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 본사확장 초기화 
 */

public class SS_L_EXTN_HDQT_INITCURONLINECDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_EXTN_HDQT_INITCURONLINECDRecord(){}

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

/* 작성시간 : Thu Jul 23 13:32:35 KST 2009 */