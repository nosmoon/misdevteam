/***************************************************************************************************
* ���ϸ� : PS_S_SEND_LUMP_PROC.java
* ���   : ���Ǳ� �߼� ���� ���� �ڵ�
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * ���Ǳ� -�߼� ���� �ڵ�
 *
 */

public class PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hdqtsenddt;
	public String hdqtsenddt_view;

	public PS_S_SEND_LUMP_PROCHDQTSENDDTCURRecord(){}

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

/* �ۼ��ð� : Fri Oct 27 17:45:56 KST 2006 */