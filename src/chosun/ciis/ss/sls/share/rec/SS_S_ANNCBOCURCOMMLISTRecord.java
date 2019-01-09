/***************************************************************************************************
* 파일명 : .java
* 기능 : 정보공유-실시간공지-지국공지 상세조회
* 작성일자 : 2009-04-16
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유-실시간공지-지국공지 상세조회
 */

public class SS_S_ANNCBOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_ANNCBOCURCOMMLISTRecord(){}

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

/* 작성시간 : Thu Apr 16 15:05:47 KST 2009 */