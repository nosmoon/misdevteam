/***************************************************************************************************
* ���ϸ� : SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord.java
* ��� : ����������������-�ΰ�-�ʱ�ȭ��-��������
* �ۼ����� : 2003-12-27
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
 * ����������������-�ΰ�-�ʱ�ȭ��-��������
 *
 */


public class SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;
	public String bgndlvno;
	public String enddlvno;

	public SL_L_RDR_MOVM_TRSF_INITDSTCINFOCURRecord(){}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
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

	public String getTeamcd(){
		return this.teamcd;
	}

	public String getBgndlvno(){
		return this.bgndlvno;
	}

	public String getEnddlvno(){
		return this.enddlvno;
	}
}

/* �ۼ��ð� : Mon Feb 02 21:48:01 KST 2004 */