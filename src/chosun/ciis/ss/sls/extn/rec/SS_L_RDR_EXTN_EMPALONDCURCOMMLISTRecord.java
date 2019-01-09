/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord.java
* 기능 : 사원확장 수당 상세목록을 위한 Record
* 작성일자 : 2003-12-15
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


public class SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medicdnm;
	public int rdr_extnqty;
	public int calcqty;
	public int basialonamt;
	public int alonamt;

	public SS_L_RDR_EXTN_EMPALONDCURCOMMLISTRecord(){}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setRdr_extnqty(int rdr_extnqty){
		this.rdr_extnqty = rdr_extnqty;
	}

	public void setCalcqty(int calcqty){
		this.calcqty = calcqty;
	}

	public void setBasialonamt(int basialonamt){
		this.basialonamt = basialonamt;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public int getRdr_extnqty(){
		return this.rdr_extnqty;
	}

	public int getCalcqty(){
		return this.calcqty;
	}

	public int getBasialonamt(){
		return this.basialonamt;
	}

	public int getAlonamt(){
		return this.alonamt;
	}
}

/* 작성시간 : Tue Dec 16 11:53:45 KST 2003 */