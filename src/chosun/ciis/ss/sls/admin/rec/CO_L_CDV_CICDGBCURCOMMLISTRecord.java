/***************************************************************************************************
* ���ϸ� : CO_L_CDV_CICDGBCURCOMMLISTRecord.java
* ��� : ������-�����ڵ�-�ڵ屸�� ����� ���� Record
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-�����ڵ�-�ڵ屸�� ����� ���� Record
 */

public class CO_L_CDV_CICDGBCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdgb;
	public String cicdnm;

	public CO_L_CDV_CICDGBCURCOMMLISTRecord(){}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Tue Mar 09 13:57:19 KST 2004 */