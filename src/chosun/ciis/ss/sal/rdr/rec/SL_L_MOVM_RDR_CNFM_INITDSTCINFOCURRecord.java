/***************************************************************************************************
* ���ϸ� : SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord.java
* ��� : ����-�̻絶�ڰ���(�μ�)-�ʱ�ȭ�� ���������ڵ�,�ڵ�� ����� ���� Record  
* �ۼ����� : 2004-01-14
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
 * ����-�̻絶�ڰ���(�μ�)-�ʱ�ȭ�� ���������ڵ�,�ڵ�� ����� ���� Record 
 */

public class SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;

	public SL_L_MOVM_RDR_CNFM_INITDSTCINFOCURRecord(){}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
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
}

/* �ۼ��ð� : Sun Jan 18 20:09:16 KST 2004 */