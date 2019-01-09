/***************************************************************************************************
* 파일명 : SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord.java
* 기능 : 정보공유 게시판 초기화면 리스트
* 작성일자 : 2004-05-18
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
 * 정보공유 게시판 초기화면 리스트
 *
 */

public class SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_INFOEXG_INITRMSGEXTTCD_LISTRecord(){}

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

/* 작성시간 : Tue May 18 16:37:41 KST 2004 */