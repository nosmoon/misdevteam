/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ-����Ȯ��- ��������� ��������
* �ۼ����� : 2009-06-09
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-����Ȯ��- ��������� ��������  
 */

public class SS_L_EXTN_HDQT_ALERTALONLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String count;
	public String sum;

	public SS_L_EXTN_HDQT_ALERTALONLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setCount(String count){
		this.count = count;
	}

	public void setSum(String sum){
		this.sum = sum;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getCount(){
		return this.count;
	}

	public String getSum(){
		return this.sum;
	}
}

/* �ۼ��ð� : Fri Jun 12 11:56:45 KST 2009 */