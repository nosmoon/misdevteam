/***************************************************************************************************
* ���ϸ�   : PS_S_PRINT_INIT.java
* ���     : ��� - �ʱ� ȭ��
* �ۼ����� : 2006-02-01
* �ۼ���   : ����ǥ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :   
* ���     :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.print.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.print.dm.*;
import chosun.ciis.ps.pbs.print.ds.*;

/**
 * ��� - �ʱ� ȭ��
 *
 */

public class PS_S_PRINT_INITHDQTSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hdqtsenddt;
	public String hdqtsenddt_view;

	public PS_S_PRINT_INITHDQTSENDDTCURRecord(){}

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

/* �ۼ��ð� : Wed May 06 11:07:41 KST 2009 */