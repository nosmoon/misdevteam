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


package chosun.ciis.fc.co.rec;

import java.sql.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

/**
 * 
 */


public class FC_CO_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cdnm;

	public FC_CO_1002_LCURLISTRecord(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}
}

/* �ۼ��ð� : Fri Feb 06 17:30:50 KST 2009 */