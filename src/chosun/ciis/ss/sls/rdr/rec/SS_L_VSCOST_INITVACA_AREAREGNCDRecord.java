/***************************************************************************************************
* 파일명 : SS_L_VSCOST_INITVACA_AREAREGNCDRecord.java
* 기능 : 독자현황 VacationStop 비용 초기화
* 작성일자 : 2004-01-17
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
 * 독자현황 VacationStop 비용 초기화
 *
 */


public class SS_L_VSCOST_INITVACA_AREAREGNCDRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_arearegnnm;

	public SS_L_VSCOST_INITVACA_AREAREGNCDRecord(){}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegnnm(String vaca_arearegnnm){
		this.vaca_arearegnnm = vaca_arearegnnm;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_arearegnnm(){
		return this.vaca_arearegnnm;
	}
}

/* 작성시간 : Sat Jan 17 19:40:01 KST 2004 */