/***************************************************************************************************
 * ���ϸ�   : SL_L_COMM_APT_DONGNODONGCURRecord.java
 * ���     : �����濵-����Ʈ������-�����
 * �ۼ����� : 2005/10/14
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  �����濵-����Ʈ������-�����
**/

public class SL_L_COMM_APT_DONGNODONGCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String dongno;

	public SL_L_COMM_APT_DONGNODONGCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}
}

/* �ۼ��ð� : Fri Oct 14 14:11:02 KST 2005 */