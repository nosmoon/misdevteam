/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord.java
* 기능 : 사원확장대회 비용 상세목록 위한 Record
* 작성일자 : 2003-12-13
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicdnm;
	public int acptqty;
	public int calcqty;
	public int basiamt;
	public int costamt;

	public SS_L_RDR_EXTN_EMPCOSTDCURCOMMLISTRecord(){}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setAcptqty(int acptqty){
		this.acptqty = acptqty;
	}

	public void setCalcqty(int calcqty){
		this.calcqty = calcqty;
	}

	public void setBasiamt(int basiamt){
		this.basiamt = basiamt;
	}

	public void setCostamt(int costamt){
		this.costamt = costamt;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getAcptqty(){
		return this.acptqty;
	}

	public int getCalcqty(){
		return this.calcqty;
	}

	public int getBasiamt(){
		return this.basiamt;
	}

	public int getCostamt(){
		return this.costamt;
	}
}

/* 작성시간 : Mon Dec 15 14:11:47 KST 2003 */