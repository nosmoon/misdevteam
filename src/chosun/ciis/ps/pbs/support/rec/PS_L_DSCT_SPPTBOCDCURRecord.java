/***************************************************************************************************
* 파일명 : PS_L_DSCT_SPPT.java
* 기능   : 불편관리 - 초기화면
* 작성일자 : 2005-12-13
* 작성자 : 전현표
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
 * 불편관리 - 초기화면
 *
 */

public class PS_L_DSCT_SPPTBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_L_DSCT_SPPTBOCDCURRecord(){}

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

/* 작성시간 : Mon Jan 02 19:29:44 KST 2006 */