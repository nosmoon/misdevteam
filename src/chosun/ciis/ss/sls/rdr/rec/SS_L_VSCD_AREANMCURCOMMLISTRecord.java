/***************************************************************************************************
* 파일명 : SS_L_VSCD_AREANMCURCOMMLISTRecord.java
* 기능 : 독자현황 VacationStop 비용 휴가지코드, 코드명 조회
* 작성일자 : 2004-01-16
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황 VacationStop 비용 휴가지코드, 코드명 조회
 *
 */


public class SS_L_VSCD_AREANMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_areacd;
	public String vaca_areanm;

	public SS_L_VSCD_AREANMCURCOMMLISTRecord(){}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_areanm(String vaca_areanm){
		this.vaca_areanm = vaca_areanm;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getVaca_areanm(){
		return this.vaca_areanm;
	}
}

/* 작성시간 : Sat Jan 17 19:13:37 KST 2004 */