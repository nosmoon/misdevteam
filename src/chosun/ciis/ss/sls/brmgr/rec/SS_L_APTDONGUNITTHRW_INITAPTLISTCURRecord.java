/***************************************************************************************************
* ���ϸ� : .java
* ��� : ����Ʈ���Է� �ʱ���ȸ
* �ۼ����� : 2009-08-14
* �ۼ��� : ������
***************************************************************************************************/

 
package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * ����Ʈ���Է� �ʱ���ȸ
 */

public class SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String addrcd;
	public String addrnm;

	public SS_L_APTDONGUNITTHRW_INITAPTLISTCURRecord(){}

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

/* �ۼ��ð� : Fri Aug 14 16:16:54 KST 2009 */