/***************************************************************************************************
* 파일명 : SL_L_APLC_NEWBANKCURRecord.java
* 기능 : 독자정보관리(이체신청팝업-신규신청 초기화)
* 작성일자 : 2004-07-29
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 독자정보관리(이체신청팝업-신규신청 초기화)
 *
 */

public class SL_L_APLC_NEWBANKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SL_L_APLC_NEWBANKCURRecord(){}

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

/* 작성시간 : Fri Aug 06 20:41:47 KST 2004 */