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


public class FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String decl_unit_clsf_cd;
	public String erplace_cd;
	public String ernm_tax;
	public String ern;
	public String clos_yn;

	public FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record(){}

	public void setDecl_unit_clsf_cd(String decl_unit_clsf_cd){
		this.decl_unit_clsf_cd = decl_unit_clsf_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErnm_tax(String ernm_tax){
		this.ernm_tax = ernm_tax;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getDecl_unit_clsf_cd(){
		return this.decl_unit_clsf_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErnm_tax(){
		return this.ernm_tax;
	}

	public String getErn(){
		return this.ern;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}
}

/* 작성시간 : Fri Jun 27 18:10:34 KST 2014 */