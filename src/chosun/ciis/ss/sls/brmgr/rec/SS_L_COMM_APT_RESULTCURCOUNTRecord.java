/***************************************************************************************************
* 파일명 : .java
* 기능 : *아파트투입현황(결과보기)
* 작성일자 : 2009-05-29
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 아파트투입현황(결과보기)
 */

public class SS_L_COMM_APT_RESULTCURCOUNTRecord extends java.lang.Object implements java.io.Serializable{

	public int count;
	public int tmp;

	public SS_L_COMM_APT_RESULTCURCOUNTRecord(){}

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

/* 작성시간 : Fri May 29 17:08:00 KST 2009 */