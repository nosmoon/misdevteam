/***************************************************************************************************
* ���ϸ� : SS_S_RDR_MOVMWORKCURCOMMLIST1Record.java
* ��� : �����濵-������������-��
* �ۼ����� : 2004-03-19
* �ۼ��� : �迵��
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
 * �����濵-������������-���
 *
 */


public class SS_S_RDR_MOVMWORKCURCOMMLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public int rdrcnt;
	public String bgndlvno;
	public String enddlvno;

	public SS_S_RDR_MOVMWORKCURCOMMLIST1Record(){}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setBgndlvno(String bgndlvno){
		this.bgndlvno = bgndlvno;
	}

	public void setEnddlvno(String enddlvno){
		this.enddlvno = enddlvno;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDstcnm(){
		return this.dstcnm;
	}

	public int getRdrcnt(){
		return this.rdrcnt;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}
}

/* �ۼ��ð� : Sat Mar 20 13:52:25 KST 2004 */