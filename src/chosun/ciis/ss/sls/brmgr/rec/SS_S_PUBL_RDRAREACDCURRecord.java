/***************************************************************************************************
 * ���ϸ�   : SP_SS_S_PUBL_RDR
 * ���     : �����濵-�ְ����� ������ȸ
 * �ۼ����� : 2007/06/15
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_S_PUBL_RDR
**/

public class SS_S_PUBL_RDRAREACDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String areacd;
	public String areanm;

	public SS_S_PUBL_RDRAREACDCURRecord(){}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}
}

/* �ۼ��ð� : Fri Jun 15 15:57:09 KST 2007 */