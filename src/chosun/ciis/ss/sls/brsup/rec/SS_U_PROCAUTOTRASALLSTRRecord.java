/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�����-���� 
* �ۼ����� : 2009-08-28
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * �Ǹ�����-���� //
 */

public class SS_U_PROCAUTOTRASALLSTRRecord extends java.lang.Object implements java.io.Serializable{

	public String allstr;
	public String temp; 

	public SS_U_PROCAUTOTRASALLSTRRecord(){}

	public void setAllstr(String allstr){
		this.allstr = allstr;
	}

	public void setTemp(String temp){
		this.temp = temp;
	}

	public String getAllstr(){
		return this.allstr;
	}

	public String getTemp(){
		return this.temp;
	}
}

/* �ۼ��ð� : Fri Aug 28 22:09:53 KST 2009 */