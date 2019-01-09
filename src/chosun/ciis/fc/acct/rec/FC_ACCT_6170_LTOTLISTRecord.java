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


public class FC_ACCT_6170_LTOTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tax_clsf;
	public String clsf;
	public String erp;
	public String ksc;
	public String erp_ksc;

	public FC_ACCT_6170_LTOTLISTRecord(){}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setErp(String erp){
		this.erp = erp;
	}

	public void setKsc(String ksc){
		this.ksc = ksc;
	}

	public void setErp_ksc(String erp_ksc){
		this.erp_ksc = erp_ksc;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getErp(){
		return this.erp;
	}

	public String getKsc(){
		return this.ksc;
	}

	public String getErp_ksc(){
		return this.erp_ksc;
	}
}

/* 작성시간 : Tue Apr 21 11:09:30 KST 2015 */