/***************************************************************************************************
* ���ϸ� : PS_L_INFOEXG_INIT.java
* ��� : �������� �Խ��� - ��������,�������(Ȯ����,����,��������,�̻��û)
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * ���Ǳ�- �������� �Խ��� ��������,�������(Ȯ����,����,��������,�̻��û)
 *
 */

public class PS_L_INFOEXG_INITEXTTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_L_INFOEXG_INITEXTTLISTRecord(){}

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

/* �ۼ��ð� : Tue Jul 25 16:28:23 KST 2006 */