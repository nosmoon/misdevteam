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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_3012_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String stlm_dt;

	public FC_ACCT_3012_LCURLIST2Record(){}

	public void setStlm_dt(String stlm_dt){
		this.stlm_dt = stlm_dt;
	}

	public String getStlm_dt(){
		return this.stlm_dt;
	}
}

/* 작성시간 : Tue Feb 17 16:28:02 KST 2009 */