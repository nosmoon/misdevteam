/***************************************************************************************************
 * ���ϸ�   : PS_L_BOEMP_ALON_KINDEMPALONKINDCURRecord.java
 * ���     : ����-������������ �ʱ�
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
 *   ����-������������ �ʱ�
 *
 **/

public class PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String deptnm;

	public PS_L_BOEMP_ALON_KINDDEPTLISTCURRecord(){}

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

/* �ۼ��ð� : Wed Mar 21 18:40:03 KST 2007 */