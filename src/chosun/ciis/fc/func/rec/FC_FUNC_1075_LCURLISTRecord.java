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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1075_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_cd;
	public String drcr_clsf;
	public String dr_amt;
	public String crdt_amt;
	public String acct_drcr_no;

	public FC_FUNC_1075_LCURLISTRecord(){}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setAcct_drcr_no(String acct_drcr_no){
		this.acct_drcr_no = acct_drcr_no;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getAcct_drcr_no(){
		return this.acct_drcr_no;
	}
}

/* 작성시간 : Wed Feb 18 16:09:35 KST 2009 */