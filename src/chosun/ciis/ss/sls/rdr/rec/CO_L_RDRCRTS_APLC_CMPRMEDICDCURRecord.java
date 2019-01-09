/***************************************************************************************************
 * 파일명   : CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord.java
 * 기능     : 독자-독자등급관리-구독자비교대상검색을 위한 Record
 * 작성일자 : 2004-04-22
 * 작성자   : 김대섭
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자-독자등급관리-구독자비교대상검색을 위한 Record
 */

public class CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* 작성시간 : Fri Apr 23 16:36:20 KST 2004 */