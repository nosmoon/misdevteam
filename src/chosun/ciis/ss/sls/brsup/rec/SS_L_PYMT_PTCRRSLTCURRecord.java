/***************************************************************************************************
* 파일명 : SS_L_PYMT_PTCRRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부내역목록
* 작성일자 : 2004-03-18
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
 * 지국업무지원-Billing자동이체-납부내역목록
 *
 */


public class SS_L_PYMT_PTCRRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String basidt;
	public String shftclsfnm;
	public String rdr_no;
	public String rdrnm;
	public String medinm;
	public int clamqty;
	public String subsmappli;
	public int realsubsamt;
	public String erryn;
	public String recpocomnm;

	public SS_L_PYMT_PTCRRSLTCURRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setClamqty(int clamqty){
		this.clamqty = clamqty;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public void setRecpocomnm(String recpocomnm){
		this.recpocomnm = recpocomnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getClamqty(){
		return this.clamqty;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public int getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getErryn(){
		return this.erryn;
	}

	public String getRecpocomnm(){
		return this.recpocomnm;
	}
}

/* 작성시간 : Mon Mar 22 22:04:30 KST 2004 */