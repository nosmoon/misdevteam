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


public class FC_ACCT_2620_MCUR_CLSF_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_clsf_nm;

	public FC_ACCT_2620_MCUR_CLSF_LISTRecord(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}
}

/* �ۼ��ð� : Tue Dec 16 11:50:31 KST 2014 */