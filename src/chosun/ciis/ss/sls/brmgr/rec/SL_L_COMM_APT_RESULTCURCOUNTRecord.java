/***************************************************************************************************
 * 파일명   : SL_L_COMM_APT_RESULTCURCOUNTRecord.java
 * 기능     : 지국경영-아파트투입율-투입결과조회
 * 작성일자 : 2005/11/07
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  지국경영-아파트투입율-투입결과조회
**/

public class SL_L_COMM_APT_RESULTCURCOUNTRecord extends java.lang.Object implements java.io.Serializable{

	public int count;
	public int tmp;

	public SL_L_COMM_APT_RESULTCURCOUNTRecord(){}

	public void setCount(int count){
		this.count = count;
	}

	public void setTmp(int tmp){
		this.tmp = tmp;
	}

	public int getCount(){
		return this.count;
	}

	public int getTmp(){
		return this.tmp;
	}
}

/* 작성시간 : Mon Nov 07 19:57:00 KST 2005 */