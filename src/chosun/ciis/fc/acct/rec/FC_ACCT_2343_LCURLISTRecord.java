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


public class FC_ACCT_2343_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hjpsubseq;
	public String fisc_dt;

	public FC_ACCT_2343_LCURLISTRecord(){}

	public void setHjpsubseq(String hjpsubseq){
		this.hjpsubseq = hjpsubseq;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public String getHjpsubseq(){
		return this.hjpsubseq;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}
}

/* 작성시간 : Sat Apr 11 09:54:13 KST 2009 */