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


package chosun.ciis.as.com.rec;

import java.sql.*;
import chosun.ciis.as.com.dm.*;
import chosun.ciis.as.com.ds.*;

/**
 * 
 */


public class AS_COM_1900_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String dlco_nm;

	public AS_COM_1900_LCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* �ۼ��ð� : Thu Jun 18 14:07:36 KST 2009 */