/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_ADDR_TO_APT.java
 * ���     : �Ǹű�-�����濵 ����Ʈ ������Ȳ �ּҷ� ����Ʈ��� ��ȸ
 * �ۼ����� : 2006/07/13
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_L_ADDR_TO_APT
**/

public class SS_L_ADDR_TO_APTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String addrcd;
	public String addrnm;
	public String bonm;

	public SS_L_ADDR_TO_APTCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* �ۼ��ð� : Thu Jul 13 16:11:29 KST 2006 */