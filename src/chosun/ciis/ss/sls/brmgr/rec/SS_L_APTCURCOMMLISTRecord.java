/***************************************************************************************************
* ���ϸ� : SS_L_APTCURCOMMLISTRecord.java
* ��� : �����濵-����Ʈ���Է�-���(����Ʈ)�� ���� Record
* �ۼ����� : 2004-11-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * �����濵-����Ʈ���Է�-���(����Ʈ)�� ���� Record
 */


public class SS_L_APTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String addrcd;
	public String addrnm;
	public String dongno;
	public int hoscnt;
	public int rdrcnt;

	public SS_L_APTCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setHoscnt(int hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getDongno(){
		return this.dongno;
	}

	public int getHoscnt(){
		return this.hoscnt;
	}

	public int getRdrcnt(){
		return this.rdrcnt;
	}
}

/* �ۼ��ð� : Sat Nov 20 16:06:35 KST 2004 */