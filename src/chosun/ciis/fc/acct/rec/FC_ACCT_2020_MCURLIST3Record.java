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


public class FC_ACCT_2020_MCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String budg_cd;
	public String budg_abrv_nm;

	public FC_ACCT_2020_MCURLIST3Record(){}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_abrv_nm(String budg_abrv_nm){
		this.budg_abrv_nm = budg_abrv_nm;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_abrv_nm(){
		return this.budg_abrv_nm;
	}
}

/* �ۼ��ð� : Wed Jan 11 17:50:02 KST 2012 */