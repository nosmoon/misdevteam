/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_STAFCYB_RSLTCURCOMMLISTRecord.java
* 기능 : 확장현황-사이버확장-실적(요원별)-목록
* 작성일자 : 2004-04-08
* 작성자 : 고윤홍
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
 * 확장현황-사이버확장-실적(요원별)-목록
 *
 */

public class SS_L_RDR_EXTN_STAFCYB_RSLTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafno;
	public String extnflnm;
	public int extnqty;
	public int cnfmqty;
	public int uncnfmqty;
	public int errqty;
	public int rsltqty;

	public SS_L_RDR_EXTN_STAFCYB_RSLTCURCOMMLISTRecord(){}

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

/* 작성시간 : Thu Apr 08 17:11:09 KST 2004 */