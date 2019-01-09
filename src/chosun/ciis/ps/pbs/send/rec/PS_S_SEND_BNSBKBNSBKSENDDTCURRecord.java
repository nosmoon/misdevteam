/***************************************************************************************************
* 파일명 : PS_S_SEND_BNSBK.java
* 기능 :   발송-보너스북발송 초기
* 작성일자 : 2004-02-26
* 작성자 : 장수환
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * 발송-보너스북발송 초기
 *
 */

public class PS_S_SEND_BNSBKBNSBKSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String brch_offisend_dt;
	public String brch_offisend_dt_view;

	public PS_S_SEND_BNSBKBNSBKSENDDTCURRecord(){}

	public void setBrch_offisend_dt(String brch_offisend_dt){
		this.brch_offisend_dt = brch_offisend_dt;
	}

	public void setBrch_offisend_dt_view(String brch_offisend_dt_view){
		this.brch_offisend_dt_view = brch_offisend_dt_view;
	}

	public String getBrch_offisend_dt(){
		return this.brch_offisend_dt;
	}

	public String getBrch_offisend_dt_view(){
		return this.brch_offisend_dt_view;
	}
}

/* 작성시간 : Tue Nov 29 20:12:16 KST 2005 */