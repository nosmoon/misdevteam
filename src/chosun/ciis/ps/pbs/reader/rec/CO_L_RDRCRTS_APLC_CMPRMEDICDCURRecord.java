/***************************************************************************************************
 * ���ϸ�   : CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord.java
 * ���     : ����-���ڵ�ް��� �����ں񱳴��˻�
 * �ۼ����� : 2004-04-22
 * �ۼ���   : ����
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-���ڵ�ް��� �����ں񱳴��˻�
 */

public class CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Fri Apr 23 16:36:20 KST 2004 */