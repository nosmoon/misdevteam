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

public class PS_S_SEND_LUMP_CNFMMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public PS_S_SEND_LUMP_CNFMMEDICDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* �ۼ��ð� : Mon Nov 03 17:43:01 KST 2008 */