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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_1420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prof_type_nm;
	public String cnt;
	public String suply_amt;
	public String vat_amt;

	public IS_SAL_1420_LCURLISTRecord(){}

	public void setProf_type_nm(String prof_type_nm){
		this.prof_type_nm = prof_type_nm;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public String getProf_type_nm(){
		return this.prof_type_nm;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}
}

/* 작성시간 : Mon May 14 14:07:35 KST 2012 */