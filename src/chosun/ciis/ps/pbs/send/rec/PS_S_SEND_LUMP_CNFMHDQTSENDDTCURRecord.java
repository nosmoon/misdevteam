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

public class PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hdqtsenddt;
	public String hdqtsenddt_view;

	public PS_S_SEND_LUMP_CNFMHDQTSENDDTCURRecord(){}

	public void setHdqtsenddt(String hdqtsenddt){
		this.hdqtsenddt = hdqtsenddt;
	}

	public void setHdqtsenddt_view(String hdqtsenddt_view){
		this.hdqtsenddt_view = hdqtsenddt_view;
	}

	public String getHdqtsenddt(){
		return this.hdqtsenddt;
	}

	public String getHdqtsenddt_view(){
		return this.hdqtsenddt_view;
	}
}

/* �ۼ��ð� : Mon Nov 03 17:43:01 KST 2008 */