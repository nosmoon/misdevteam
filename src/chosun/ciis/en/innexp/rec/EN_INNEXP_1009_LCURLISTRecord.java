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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1009_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String reven_amt;
	public String vat_amt;
	public String rcpm_amt;

	public EN_INNEXP_1009_LCURLISTRecord(){}

	public void setReven_amt(String reven_amt){
		this.reven_amt = reven_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public String getReven_amt(){
		return this.reven_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}
}

/* 작성시간 : Thu Apr 23 14:33:22 KST 2009 */