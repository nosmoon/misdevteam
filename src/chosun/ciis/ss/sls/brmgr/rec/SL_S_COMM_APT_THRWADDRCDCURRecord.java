/***************************************************************************************************
 * ���ϸ�   : SP_SL_S_COMM_APT_THRW.java
 * ���     : ����������
 * �ۼ����� : 2006/03/08
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  ����������-��Ȳ���
**/

public class SL_S_COMM_APT_THRWADDRCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;

	public SL_S_COMM_APT_THRWADDRCDCURRecord(){}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}
}

/* �ۼ��ð� : Mon Mar 13 16:22:03 KST 2006 */