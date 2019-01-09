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


public class FC_ACCT_5003_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String incmg_dt;

	public FC_ACCT_5003_SCURLISTRecord(){}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}
}

/* 작성시간 : Mon Mar 09 15:54:13 KST 2009 */