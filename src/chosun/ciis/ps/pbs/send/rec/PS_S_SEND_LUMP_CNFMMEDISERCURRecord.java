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

public class PS_S_SEND_LUMP_CNFMMEDISERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String mediser_no;
	public String mediser_view;

	public PS_S_SEND_LUMP_CNFMMEDISERCURRecord(){}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMediser_view(String mediser_view){
		this.mediser_view = mediser_view;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMediser_view(){
		return this.mediser_view;
	}
}

/* �ۼ��ð� : Mon Nov 03 17:43:01 KST 2008 */