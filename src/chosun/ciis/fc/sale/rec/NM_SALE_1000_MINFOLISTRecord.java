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


package chosun.ciis.fc.sale.rec;

import java.sql.*;
import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.ds.*;

/**
 * 
 */


public class NM_SALE_1000_MINFOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String orgn_dtls_medi_nm;

	public NM_SALE_1000_MINFOLISTRecord(){}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setOrgn_dtls_medi_nm(String orgn_dtls_medi_nm){
		this.orgn_dtls_medi_nm = orgn_dtls_medi_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getOrgn_dtls_medi_nm(){
		return this.orgn_dtls_medi_nm;
	}
}

/* 작성시간 : Tue Jun 18 18:31:12 KST 2013 */