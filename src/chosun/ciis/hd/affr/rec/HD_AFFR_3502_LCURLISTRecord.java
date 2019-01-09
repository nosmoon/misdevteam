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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_3502_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sch_yyyy;
	public String affr_gb;
	public String affr_type_nm;
	public String affr_amt;

	public HD_AFFR_3502_LCURLISTRecord(){}

	public void setSch_yyyy(String sch_yyyy){
		this.sch_yyyy = sch_yyyy;
	}

	public void setAffr_gb(String affr_gb){
		this.affr_gb = affr_gb;
	}

	public void setAffr_type_nm(String affr_type_nm){
		this.affr_type_nm = affr_type_nm;
	}

	public void setAffr_amt(String affr_amt){
		this.affr_amt = affr_amt;
	}

	public String getSch_yyyy(){
		return this.sch_yyyy;
	}

	public String getAffr_gb(){
		return this.affr_gb;
	}

	public String getAffr_type_nm(){
		return this.affr_type_nm;
	}

	public String getAffr_amt(){
		return this.affr_amt;
	}
}

/* 작성시간 : Mon Nov 02 20:06:03 KST 2009 */