/***************************************************************************************************
* 파일명 : SS_L_INFOEXG_SRCHBUSEOLISTRecord.java
* 기능 : 정보공유 게시판 조회
* 작성일자 : 2004-05-20
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * 정보공유 게시판 조회
 *
 */

public class SS_L_INFOEXG_SRCHBUSEOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_INFOEXG_SRCHBUSEOLISTRecord(){}

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

/* 작성시간 : Fri May 21 16:00:40 KST 2004 */