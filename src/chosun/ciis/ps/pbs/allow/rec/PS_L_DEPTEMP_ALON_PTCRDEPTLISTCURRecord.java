/***************************************************************************************************
 * ���ϸ�   : PS_L_DEPTEMP_ALON_PTCR.java
 * ���     : ����-��������� ��ȸ
 * �ۼ����� : 2004-03-08
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * ����-��������� �˻�
 */

public class PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;

	public PS_L_DEPTEMP_ALON_PTCRDEPTLISTCURRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* �ۼ��ð� : Wed Mar 21 17:43:19 KST 2007 */