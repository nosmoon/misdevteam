/***************************************************************************************************
* ���ϸ� : CO_L_CDV_INITCURCOMMLISTRecord.java
* ��� : ������-�����ڵ�-�ʱ�ȭ��-���������ڵ�,�ڵ�� ����� ���� Record
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
 * ������-�����ڵ�-�ʱ�ȭ��-���������ڵ�,�ڵ�� ����� ���� Record
 */

public class CO_L_CDV_INITCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdnm;

	public CO_L_CDV_INITCURCOMMLISTRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Tue Mar 09 13:57:19 KST 2004 */