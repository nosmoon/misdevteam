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

public class SL_S_COMM_APT_QSEARCHBOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;

	public SL_S_COMM_APT_QSEARCHBOLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* �ۼ��ð� : Thu Jun 22 11:08:44 KST 2006 */