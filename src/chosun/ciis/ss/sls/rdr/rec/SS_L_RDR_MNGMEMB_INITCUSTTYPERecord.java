/***************************************************************************************************
* 파일명 : .java
* 기능 : 비독자관리 초기화면
* 작성일자 : 2009-08-07
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 비독자관리 초기화면 
 */

public class SS_L_RDR_MNGMEMB_INITCUSTTYPERecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_RDR_MNGMEMB_INITCUSTTYPERecord(){}

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

/* 작성시간 : Fri Aug 07 16:31:16 KST 2009 */