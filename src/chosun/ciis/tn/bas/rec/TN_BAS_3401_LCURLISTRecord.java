/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.tn.bas.rec;

import java.sql.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.ds.*;

/**
 * 
 */


public class TN_BAS_3401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fundidx;
	public String supportidx;

	public TN_BAS_3401_LCURLISTRecord(){}

	public void setFundidx(String fundidx){
		this.fundidx = fundidx;
	}

	public void setSupportidx(String supportidx){
		this.supportidx = supportidx;
	}

	public String getFundidx(){
		return this.fundidx;
	}

	public String getSupportidx(){
		return this.supportidx;
	}
}

/* �ۼ��ð� : Tue Jul 19 15:48:59 KST 2016 */