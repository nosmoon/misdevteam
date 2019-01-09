/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
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
 * 
 */


public class SS_SLS_BRSUP_3010_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String basidt;
	public String rdr_no;
	public String rdrnm;
	public String medinm;
	public String bgnmappli;
	public String endmappli;
	public String elecpymtno;
	public String pymtinamt;
	public String remk;

	public SS_SLS_BRSUP_3010_LCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
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

	public void setBgnmappli(String bgnmappli){
		this.bgnmappli = bgnmappli;
	}

	public void setEndmappli(String endmappli){
		this.endmappli = endmappli;
	}

	public void setElecpymtno(String elecpymtno){
		this.elecpymtno = elecpymtno;
	}

	public void setPymtinamt(String pymtinamt){
		this.pymtinamt = pymtinamt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBasidt(){
		return this.basidt;
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

	public String getBgnmappli(){
		return this.bgnmappli;
	}

	public String getEndmappli(){
		return this.endmappli;
	}

	public String getElecpymtno(){
		return this.elecpymtno;
	}

	public String getPymtinamt(){
		return this.pymtinamt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Dec 27 09:42:25 KST 2017 */