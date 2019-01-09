/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_STAF_RSLTCURCOMMLISTRecord.java
* 기능 : 확장용역비용 조선IS 실적조회 목록(요원별)을 위한 Record
* 작성일자 : 2003-12-23
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


public class SS_L_RDR_EXTN_STAF_RSLTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafno;
	public String extnflnm;
	public int extnqty;
	public int cnfmqty;
	public int uncnfmqty;
	public int errqty;
	public int rsltqty;

	public SS_L_RDR_EXTN_STAF_RSLTCURCOMMLISTRecord(){}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtnqty(int extnqty){
		this.extnqty = extnqty;
	}

	public void setCnfmqty(int cnfmqty){
		this.cnfmqty = cnfmqty;
	}

	public void setUncnfmqty(int uncnfmqty){
		this.uncnfmqty = uncnfmqty;
	}

	public void setErrqty(int errqty){
		this.errqty = errqty;
	}

	public void setRsltqty(int rsltqty){
		this.rsltqty = rsltqty;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public int getExtnqty(){
		return this.extnqty;
	}

	public int getCnfmqty(){
		return this.cnfmqty;
	}

	public int getUncnfmqty(){
		return this.uncnfmqty;
	}

	public int getErrqty(){
		return this.errqty;
	}

	public int getRsltqty(){
		return this.rsltqty;
	}
}

/* 작성시간 : Tue Dec 23 11:03:52 KST 2003 */