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


public class FC_ACCT_5831_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String acacctnm;
	public String mang_clsf_cd;
	public String jbgwgbnm;
	public String kind;
	public String prvdd_bal;
	public String dr_amt;
	public String crdt_amt;
	public String curdd_bal;

	public FC_ACCT_5831_LCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcacctnm(String acacctnm){
		this.acacctnm = acacctnm;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setJbgwgbnm(String jbgwgbnm){
		this.jbgwgbnm = jbgwgbnm;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public void setPrvdd_bal(String prvdd_bal){
		this.prvdd_bal = prvdd_bal;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setCurdd_bal(String curdd_bal){
		this.curdd_bal = curdd_bal;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcacctnm(){
		return this.acacctnm;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getJbgwgbnm(){
		return this.jbgwgbnm;
	}

	public String getKind(){
		return this.kind;
	}

	public String getPrvdd_bal(){
		return this.prvdd_bal;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getCurdd_bal(){
		return this.curdd_bal;
	}
}

/* 작성시간 : Tue Mar 10 21:19:09 KST 2009 */