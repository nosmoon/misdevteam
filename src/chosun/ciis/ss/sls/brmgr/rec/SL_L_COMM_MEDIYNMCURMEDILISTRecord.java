/***************************************************************************************************
 * ���ϸ�   : SL_L_COMM_MEDIYNMCURMEDILISTRecord.java
 * ���     : �����濵-����Ʈ������-��ü ���ǥ
 * �ۼ����� : 2005/10/07
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  �����濵-����Ʈ������-��ü ���ǥ
**/

public class SL_L_COMM_MEDIYNMCURMEDILISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicdnm;
	public String cimgtcd2;

	public SL_L_COMM_MEDIYNMCURMEDILISTRecord(){}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCimgtcd2(String cimgtcd2){
		this.cimgtcd2 = cimgtcd2;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCimgtcd2(){
		return this.cimgtcd2;
	}
}

/* �ۼ��ð� : Fri Oct 07 17:27:42 KST 2005 */