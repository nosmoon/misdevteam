/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-담당별 우편번호 변경처리-초기화면
* 작성일자 : 2009-04-28
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * 관리자-담당별 우편번호 변경처리-초기화면
 */

public class SS_L_CHGZIPCODE_INITCURDATELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String workver;
	public String workvernm;

	public SS_L_CHGZIPCODE_INITCURDATELISTRecord(){}

	public void setWorkver(String workver){
		this.workver = workver;
	}

	public void setWorkvernm(String workvernm){
		this.workvernm = workvernm;
	}

	public String getWorkver(){
		return this.workver;
	}

	public String getWorkvernm(){
		return this.workvernm;
	}
}

/* 작성시간 : Tue Apr 28 09:46:54 KST 2009 */