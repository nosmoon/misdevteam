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


public class FC_ACCT_2013_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clsf_yn;
	public String draft_expn_amt;
	public String draft_impt_amt;
	public String dr_amt;
	public String crdt_amt;

	public FC_ACCT_2013_SCURLISTRecord(){}

	public void setClsf_yn(String clsf_yn){
		this.clsf_yn = clsf_yn;
	}

	public void setDraft_expn_amt(String draft_expn_amt){
		this.draft_expn_amt = draft_expn_amt;
	}

	public void setDraft_impt_amt(String draft_impt_amt){
		this.draft_impt_amt = draft_impt_amt;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public String getClsf_yn(){
		return this.clsf_yn;
	}

	public String getDraft_expn_amt(){
		return this.draft_expn_amt;
	}

	public String getDraft_impt_amt(){
		return this.draft_impt_amt;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}
}

/* 작성시간 : Thu Jul 09 11:18:34 KST 2009 */