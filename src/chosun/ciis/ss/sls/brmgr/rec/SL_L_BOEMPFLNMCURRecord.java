/***************************************************************************************************
 * ���ϸ�   : SL_L_BOEMPFLNMCURRecord.java
 * ���     : �����濵-����Ʈ������-�����˻� ���������ȸ
 * �ۼ����� : 2005/10/14
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  �����濵-����Ʈ������-�����˻� ���������ȸ
**/

public class SL_L_BOEMPFLNMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SL_L_BOEMPFLNMCURRecord(){}

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

/* �ۼ��ð� : Fri Oct 14 15:23:20 KST 2005 */