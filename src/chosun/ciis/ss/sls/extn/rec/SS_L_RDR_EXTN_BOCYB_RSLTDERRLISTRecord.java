/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord.java
* 기능 : 확장현황-사이버확장-실적(지국별)-상세목록
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
 * 확장현황-사이버확장-실적(지국별)-상세목록
 *
 */

public class SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcpersnm;
	public String rdr_extndt;
	public String extnflnm;
	public String subscnfmstatnm;

	public SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord(){}

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setSubscnfmstatnm(String subscnfmstatnm){
		this.subscnfmstatnm = subscnfmstatnm;
	}

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getSubscnfmstatnm(){
		return this.subscnfmstatnm;
	}
}

/* 작성시간 : Thu Apr 08 17:14:59 KST 2004 */