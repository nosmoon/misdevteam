/***************************************************************************************************
* ���ϸ� : SS_L_CMPY_MEDICDCURCOMMLISTRecord.java
* ��� : ����-��ü�ڵ�˻�(ȸ�纰)�� ���� Record
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.common.rec;

import java.sql.*;
import chosun.ciis.ss.sls.common.dm.*;
import chosun.ciis.ss.sls.common.ds.*;

/**
 * ����-��ü�ڵ�˻�(ȸ�纰)�� ���� Record
 */

public class SS_L_CMPY_MEDICDCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_CMPY_MEDICDCURCOMMLISTRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Sat Mar 20 14:45:18 KST 2004 */