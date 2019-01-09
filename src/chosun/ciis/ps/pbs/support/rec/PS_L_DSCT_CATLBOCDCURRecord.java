/***************************************************************************************************
* 파일명 : PS_L_DSCT_CATL.java
* 기능   :  불편접수 - 조회리스트 
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편접수 - 조회 리스트
 *
 */

public class PS_L_DSCT_CATLBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_L_DSCT_CATLBOCDCURRecord(){}

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

/* 작성시간 : Tue Oct 11 20:48:34 KST 2005 */