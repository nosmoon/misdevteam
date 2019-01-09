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


package chosun.ciis.fc.co.rec;

import java.sql.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

/**
 * 
 */


public class FC_CO_8040_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_subj_nm;

	public FC_CO_8040_SCURLISTRecord(){}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}
}

/* 작성시간 : Thu Apr 02 11:29:00 KST 2009 */