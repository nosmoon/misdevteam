/***************************************************************************************************
* ���ϸ� : .java
* ��� : �����繫��ǥ-Ȯ����󿬰� �ʱ�ȭ��
* �ۼ����� : 2014.12.16
* �ۼ��� : ����
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


public class FC_ACCT_2620_MCUR_DLCO_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cmpy_cd;
	public String dlco_nm;

	public FC_ACCT_2620_MCUR_DLCO_LISTRecord(){}

	public void setDlco_cmpy_cd(String dlco_cmpy_cd){
		this.dlco_cmpy_cd = dlco_cmpy_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getDlco_cmpy_cd(){
		return this.dlco_cmpy_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* �ۼ��ð� : Tue Dec 16 11:50:31 KST 2014 */