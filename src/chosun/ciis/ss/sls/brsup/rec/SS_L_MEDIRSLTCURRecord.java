/***************************************************************************************************
* 파일명 : SS_L_MEDIRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-신청관리-독자별 매체리스트
* 작성일자 : 2004-03-26
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청관리-독자별 매체리스트
 *
 */


public class SS_L_MEDIRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public int dlvqty;
	public int realsubsamt;

	public SS_L_MEDIRSLTCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}

	public int getRealsubsamt(){
		return this.realsubsamt;
	}
}

/* 작성시간 : Tue Mar 30 13:45:09 KST 2004 */