/***************************************************************************************************
 * ���ϸ�   : SL_L_COMM_APT_RESULTCURCOUNTRecord.java
 * ���     : �����濵-����Ʈ������-���԰����ȸ
 * �ۼ����� : 2005/11/07
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  �����濵-����Ʈ������-���԰����ȸ
**/

public class SL_L_COMM_APT_RESULTCURCOUNTRecord extends java.lang.Object implements java.io.Serializable{

	public int count;
	public int tmp;

	public SL_L_COMM_APT_RESULTCURCOUNTRecord(){}

	public void setCount(int count){
		this.count = count;
	}

	public void setTmp(int tmp){
		this.tmp = tmp;
	}

	public int getCount(){
		return this.count;
	}

	public int getTmp(){
		return this.tmp;
	}
}

/* �ۼ��ð� : Mon Nov 07 19:57:00 KST 2005 */