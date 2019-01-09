/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
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


public class FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String prof_type_cd;
	public String prof_type_cdnm;
	public String suply_amt;
	public String vat_amt;

	public FC_ACCT_6211_SCUR_VATDECLSTMT_LIST_1Record(){}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setProf_type_cdnm(String prof_type_cdnm){
		this.prof_type_cdnm = prof_type_cdnm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getProf_type_cdnm(){
		return this.prof_type_cdnm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}
}

/* 작성시간 : Tue Apr 21 11:14:03 KST 2015 */