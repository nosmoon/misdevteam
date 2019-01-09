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

public class PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hdqtsenddt;
	public String hdqtsenddt_view;

	public PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord(){}

	public void setHdqtsenddt(String hdqtsenddt){
		this.hdqtsenddt = hdqtsenddt;
	}

	public void setHdqtsenddt_view(String hdqtsenddt_view){
		this.hdqtsenddt_view = hdqtsenddt_view;
	}

	public String getHdqtsenddt(){
		return this.hdqtsenddt;
	}

	public String getHdqtsenddt_view(){
		return this.hdqtsenddt_view;
	}
}

/* 작성시간 : Mon Nov 03 17:43:01 KST 2008 */