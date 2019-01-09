/***************************************************************************************************
* 파일명 : CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord.java
* 기능 : 독자현황-독자등급부여
* 작성일자 : 2005-02-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * 독자현황-독자등급부여
 */


public class CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public CO_L_RDRCRTS_GRAD_APLCMEDICDCURRecord(){}

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

/* 작성시간 : Tue Feb 22 10:22:58 KST 2005 */