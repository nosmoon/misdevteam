/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.move.rec;

import java.sql.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.ds.*;

/**
 * 
 */


public class SS_S_MOVM_RDR_CLOSCURMEDIQTYRecord extends java.lang.Object implements java.io.Serializable{

	public String medinm;
	public int qty;

	public SS_S_MOVM_RDR_CLOSCURMEDIQTYRecord(){}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getQty(){
		return this.qty;
	}
}

/* �ۼ��ð� : Fri Jul 25 13:52:11 KST 2014 */