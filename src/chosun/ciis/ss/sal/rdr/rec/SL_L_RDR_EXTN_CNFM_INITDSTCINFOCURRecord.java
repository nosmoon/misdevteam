/***************************************************************************************************
* ���ϸ� : SL_L_RDR_EXTN_CNFM_INITDSTCINFOCURRecord.java
* ��� : �ܺ�Ȯ��Ȯ�ΰ���(�ʱ�ȭ��)
* �ۼ����� : 2004-06-03
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
 * �ܺ�Ȯ��Ȯ�ΰ���(�ʱ�ȭ��)
 *
 */

public class SL_L_RDR_EXTN_CNFM_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;

	public SL_L_RDR_EXTN_CNFM_INITDSTCINFOCURRecord(){}

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

/* �ۼ��ð� : Wed Jun 09 10:06:17 KST 2004 */