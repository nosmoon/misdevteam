/***************************************************************************************************
* ���ϸ� : .java
* ��� : �����繫��ǥ-ä��ä�� Ȯ����󿬰� (�����ȸ)
* �ۼ����� : 2015.01.05
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


public class FC_ACCT_2641_LGRPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String nm;

	public FC_ACCT_2641_LGRPLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getNm(){
		return this.nm;
	}
}

/* �ۼ��ð� : Mon Jan 05 17:39:06 KST 2015 */