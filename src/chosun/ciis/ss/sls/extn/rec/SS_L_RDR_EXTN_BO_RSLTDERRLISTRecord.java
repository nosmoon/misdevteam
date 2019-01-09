/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord.java
* 기능 : 확장용역비용 조선IS 확장실적(지국별) 오류항목 목록을 위한 Record
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


public class SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcpersnm;
	public String rdr_extndt;
	public String extnflnm;
	public String subscnfmstatnm;

	public SS_L_RDR_EXTN_BO_RSLTDERRLISTRecord(){}

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

/* 작성시간 : Tue Dec 23 15:02:05 KST 2003 */