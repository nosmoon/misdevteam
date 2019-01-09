/***************************************************************************************************
* 파일명 : SS_S_FCT_FRFTDEPTLISTRecord.java
* 기능 : 지국 경영 - 공정위위약금 - 상세
* 작성일자 : 2004-04-16
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 지국 경영 - 공정위위약금 - 상세
 *
 */

public class SS_S_FCT_FRFTDEPTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_S_FCT_FRFTDEPTLISTRecord(){}

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

/* 작성시간 : Mon Apr 19 15:24:37 KST 2004 */