/***************************************************************************************************
 * ���ϸ�   : SP_SL_S_COMM_APT_QSEARCH.java
 * ���     : �����濵-����������-����Ʈ���� �ٷΰ���
 * �ۼ����� : 2006/06/21
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SL_S_COMM_APT_QSEARCH
**/

public class SL_S_COMM_APT_QSEARCHDONGCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String dongno;

	public SL_S_COMM_APT_QSEARCHDONGCURRecord(){}

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

/* �ۼ��ð� : Thu Jun 22 11:08:44 KST 2006 */