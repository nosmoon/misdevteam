/***************************************************************************************************
* ���ϸ�   : SP_PS_S_SEND_LUMP_CNFM.java
* ���     : �߼�-�ϰ��߼� �ʱ�
* �ۼ����� : 2004-02-26
* �ۼ���   : ���ȯ
***************************************************************************************************/
/***************************************************************************************************
* �������� : ��������(���� ������������) out�Ķ���� �߰�
* ������   : ������
* �������� : 2008/11/03
* ���     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-�ϰ��߼� �ʱ�ȭ��
 *
 */

public class PS_S_SEND_LUMP_CNFMBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_S_SEND_LUMP_CNFMBOCDCURRecord(){}

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

/* �ۼ��ð� : Mon Nov 03 17:43:01 KST 2008 */