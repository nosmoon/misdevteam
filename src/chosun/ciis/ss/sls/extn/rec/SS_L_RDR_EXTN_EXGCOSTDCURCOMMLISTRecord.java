/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord.java
* 기능 : 품앗이확장 비용 상세목록을 위한 Record
* 작성일자 : 2003-12-02
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


public class SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicdnm;
	public int trsfqty;
	public int acptqty;
	public int uncalctrsfqty;
	public int uncalcacptqty;
	public int calcqty;
	public int basiamt;
	public int costamt;

	public SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord(){}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setTrsfqty(int trsfqty){
		this.trsfqty = trsfqty;
	}

	public void setAcptqty(int acptqty){
		this.acptqty = acptqty;
	}

	public void setUncalctrsfqty(int uncalctrsfqty){
		this.uncalctrsfqty = uncalctrsfqty;
	}

	public void setUncalcacptqty(int uncalcacptqty){
		this.uncalcacptqty = uncalcacptqty;
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

	public int getTrsfqty(){
		return this.trsfqty;
	}

	public int getAcptqty(){
		return this.acptqty;
	}

	public int getUncalctrsfqty(){
		return this.uncalctrsfqty;
	}

	public int getUncalcacptqty(){
		return this.uncalcacptqty;
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

/* 작성시간 : Wed Dec 03 21:44:39 KST 2003 */