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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2305_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_abrv_nm;
	public String dlco_nm;

	public FC_ACCT_2305_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* �ۼ��ð� : Tue Apr 28 14:23:37 KST 2009 */