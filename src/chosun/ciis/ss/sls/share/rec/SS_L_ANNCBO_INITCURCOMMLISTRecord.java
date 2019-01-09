/***************************************************************************************************
* 파일명 : .java
* 기능 : *정보공유-실시간지국공지사항-초기화면
* 작성일자 : 2009-06-12
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-실시간지국공지사항-초기화면
 */

public class SS_L_ANNCBO_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_ANNCBO_INITCURCOMMLISTRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoksnm(){
		return this.boksnm;
	}
}

/* 작성시간 : Fri Jun 12 16:51:28 KST 2009 */