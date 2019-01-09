/***************************************************************************************************
* 파일명 : SL_L_APLC_NEWRSLTCURRecord.java
* 기능 : 독자정보관리(이체신청팝업-신규신청 초기화)
* 작성일자 : 2004-07-29
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
 * 독자정보관리(이체신청팝업-신규신청 초기화)
 *
 */

public class SL_L_APLC_NEWRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public int valqty;
	public int no_valqty;
	public int pre_valqty;
	public int realsubsamt;
	public String clamtmthdcd;
	public String clamtmthdnm;

	public SL_L_APLC_NEWRSLTCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setValqty(int valqty){
		this.valqty = valqty;
	}

	public void setNo_valqty(int no_valqty){
		this.no_valqty = no_valqty;
	}

	public void setPre_valqty(int pre_valqty){
		this.pre_valqty = pre_valqty;
	}

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtmthdnm(String clamtmthdnm){
		this.clamtmthdnm = clamtmthdnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getValqty(){
		return this.valqty;
	}

	public int getNo_valqty(){
		return this.no_valqty;
	}

	public int getPre_valqty(){
		return this.pre_valqty;
	}

	public int getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtmthdnm(){
		return this.clamtmthdnm;
	}
}

/* 작성시간 : Fri Aug 06 20:41:47 KST 2004 */