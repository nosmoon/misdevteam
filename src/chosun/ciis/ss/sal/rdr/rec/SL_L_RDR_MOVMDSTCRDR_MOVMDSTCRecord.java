/***************************************************************************************************
* ���ϸ� : SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord.java
* ��� : ����������������-�μ�(�����)
* �ۼ����� : 2004-02-07
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ����������������-�μ�(�����)
 *
 */


public class SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String seq;
	public String dstccd;
	public String dstcnm;
	public int rdrcnt;
	public String bgndlvno;
	public String enddlvno;

	public SL_L_RDR_MOVMDSTCRDR_MOVMDSTCRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

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

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getSeq(){
		return this.seq;
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

/* �ۼ��ð� : Mon Feb 09 16:14:11 KST 2004 */