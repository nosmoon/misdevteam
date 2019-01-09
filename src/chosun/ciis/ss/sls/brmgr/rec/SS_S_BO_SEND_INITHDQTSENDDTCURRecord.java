/***************************************************************************************************
 * 파일명   : SP_SS_S_BO_SEND_INIT
 * 기능     : 지국경영-주간조선발송관리
 * 작성일자 : 2007/04/25
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_S_BO_SEND_INIT
**/

public class SS_S_BO_SEND_INITHDQTSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hdqtsenddt;
	public String hdqtsenddt_view;

	public SS_S_BO_SEND_INITHDQTSENDDTCURRecord(){}

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

/* 작성시간 : Wed Apr 25 10:07:11 KST 2007 */