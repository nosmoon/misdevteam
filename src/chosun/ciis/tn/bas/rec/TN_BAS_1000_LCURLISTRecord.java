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


public class TN_BAS_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String organidx;
	public String organname;
	public String businessno;

	public TN_BAS_1000_LCURLISTRecord(){}

	public void setOrganidx(String organidx){
		this.organidx = organidx;
	}

	public void setOrganname(String organname){
		this.organname = organname;
	}

	public void setBusinessno(String businessno){
		this.businessno = businessno;
	}

	public String getOrganidx(){
		return this.organidx;
	}

	public String getOrganname(){
		return this.organname;
	}

	public String getBusinessno(){
		return this.businessno;
	}
}

/* �ۼ��ð� : Wed Jun 22 18:08:39 KST 2016 */