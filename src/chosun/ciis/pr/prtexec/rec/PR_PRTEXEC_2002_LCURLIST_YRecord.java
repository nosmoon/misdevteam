/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_2002_LCURLIST_YRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String issu_wk;

	public PR_PRTEXEC_2002_LCURLIST_YRecord(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_wk(String issu_wk){
		this.issu_wk = issu_wk;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_wk(){
		return this.issu_wk;
	}
}

/* 작성시간 : Fri Jun 19 18:31:15 KST 2009 */