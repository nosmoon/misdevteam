/***************************************************************************************************
* ���ϸ� : .java
* ��� : * Ȯ����Ȳ-Ȯ������-�ʱ�ȭ��
* �ۼ����� : 2009-09-08
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 *  Ȯ����Ȳ-Ȯ������-�ʱ�ȭ��
 */

public class SS_L_EXTN_RES_INITDSTCINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dstccd;
	public String dstcnm;
	public String teamcd;

	public SS_L_EXTN_RES_INITDSTCINFOCURRecord(){}

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

/* �ۼ��ð� : Tue Sep 08 16:35:57 KST 2009 */