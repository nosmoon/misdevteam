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

public class PS_S_SEND_LUMP_CNFMMEDISERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String mediser_no;
	public String mediser_view;

	public PS_S_SEND_LUMP_CNFMMEDISERCURRecord(){}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMediser_view(String mediser_view){
		this.mediser_view = mediser_view;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMediser_view(){
		return this.mediser_view;
	}
}

/* 작성시간 : Mon Nov 03 17:43:01 KST 2008 */