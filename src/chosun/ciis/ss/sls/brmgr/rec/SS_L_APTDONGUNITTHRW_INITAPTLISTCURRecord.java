/***************************************************************************************************
* 파일명 : .java
* 기능 : 아파트투입률 초기조회
* 작성일자 : 2009-08-14
* 작성자 : 권정윤
***************************************************************************************************/

 
package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 아파트투입률 초기조회
 */

public class SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;

	public SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}
}

/* 작성시간 : Fri Aug 14 16:16:54 KST 2009 */