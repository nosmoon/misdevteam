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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_4602_LDNCOMPLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dncomp;
	public String dncompnm;

	public SS_SLS_EXTN_4602_LDNCOMPLISTRecord(){}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setDncompnm(String dncompnm){
		this.dncompnm = dncompnm;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getDncompnm(){
		return this.dncompnm;
	}
}

/* �ۼ��ð� : Mon Feb 15 19:58:43 KST 2016 */