/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.sale.rec;

import java.sql.*;
import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.ds.*;

/**
 * 
 */


public class NM_SALE_1001_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String orgn_dtls_medi_nm;

	public NM_SALE_1001_LCURLIST2Record(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setOrgn_dtls_medi_nm(String orgn_dtls_medi_nm){
		this.orgn_dtls_medi_nm = orgn_dtls_medi_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
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

/* �ۼ��ð� : Fri Jun 21 11:31:13 KST 2013 */