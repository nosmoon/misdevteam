/***************************************************************************************************
 * ���ϸ�   : CO_L_RDRCRTS_APLC_CMPRMEDICDCURRecord.java
 * ���     : ����-���ڵ�ް���-�����ں񱳴��˻��� ���� Record
 * �ۼ����� : 2004-04-22
 * �ۼ���   : ��뼷
 **************************************************************************************************/
 /**************************************************************************************************
 * �������� :
 * ������   :
 * �������� :
 * ���     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ����-���ڵ�ް���-�����ں񱳴��˻��� ���� Record
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