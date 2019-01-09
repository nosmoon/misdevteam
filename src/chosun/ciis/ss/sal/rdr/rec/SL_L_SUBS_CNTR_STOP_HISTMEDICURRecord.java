/***************************************************************************************************
* 파일명 : SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord.java
* 기능 : 독자정보관리(중지내역팝업)(목록조회)
* 작성일자 : 2004-04-01
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자정보관리(중지내역팝업)(목록조회)
 *
 */

public class SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String abrv;
	public int dlvqty;

	public SL_L_SUBS_CNTR_STOP_HISTMEDICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAbrv(String abrv){
		this.abrv = abrv;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getAbrv(){
		return this.abrv;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}
}

/* 작성시간 : Sat Apr 03 21:58:52 KST 2004 */