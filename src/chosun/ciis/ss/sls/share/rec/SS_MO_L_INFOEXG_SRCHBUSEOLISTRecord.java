/***************************************************************************************************
* 파일명 : SS_MO_L_INFOEXG_SRCHBUSEOLISTRecord.java
* 기능 : CIIS-판매-센터관리-정보공유-공지사항-리스트_모바일용
* 작성일자 : 2017-01-24
* 작성자 : 장선희
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
 *
 */


public class SS_MO_L_INFOEXG_SRCHBUSEOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_MO_L_INFOEXG_SRCHBUSEOLISTRecord(){}

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

/* 작성시간 : Tue Jan 24 17:40:46 KST 2017 */