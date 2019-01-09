/***************************************************************************************************
* 파일명   : SP_PS_S_SEND_LUMP_CNFM.java
* 기능     : 발송-일괄발송 초기
* 작성일자 : 2004-02-26
* 작성자   : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 기준일자(전월 기준종료일자) out파라미터 추가
* 수정자   : 김재일
* 수정일자 : 2008/11/03
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-일괄발송 초기화면
 *
 */

public class PS_S_SEND_LUMP_CNFMBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_S_SEND_LUMP_CNFMBOCDCURRecord(){}

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

/* 작성시간 : Mon Nov 03 17:43:01 KST 2008 */