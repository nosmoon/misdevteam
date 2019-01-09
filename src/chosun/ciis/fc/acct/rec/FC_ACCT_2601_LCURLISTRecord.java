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


public class FC_ACCT_2601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_levl;
	public String acct_cd;
	public String acct_subj_nm;
	public long acct_amt1;
	public long acct_amt2;

	public FC_ACCT_2601_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_levl(String acct_levl){
		this.acct_levl = acct_levl;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setAcct_amt1(long acct_amt1){
		this.acct_amt1 = acct_amt1;
	}

	public void setAcct_amt2(long acct_amt2){
		this.acct_amt2 = acct_amt2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_levl(){
		return this.acct_levl;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public long getAcct_amt1(){
		return this.acct_amt1;
	}

	public long getAcct_amt2(){
		return this.acct_amt2;
	}
}

/* 작성시간 : Fri Jul 04 11:43:37 KST 2014 */