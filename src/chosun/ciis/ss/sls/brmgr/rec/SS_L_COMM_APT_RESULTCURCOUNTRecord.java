/***************************************************************************************************
* ���ϸ� : .java
* ��� : *����Ʈ������Ȳ(�������)
* �ۼ����� : 2009-05-29
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * ����Ʈ������Ȳ(�������)
 */

public class SS_L_COMM_APT_RESULTCURCOUNTRecord extends java.lang.Object implements java.io.Serializable{

	public int count;
	public int tmp;

	public SS_L_COMM_APT_RESULTCURCOUNTRecord(){}

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

/* �ۼ��ð� : Fri May 29 17:08:00 KST 2009 */