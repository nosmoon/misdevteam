/***************************************************************************************************
 * ���ϸ�   : SP_SL_S_COMM_APT_QSEARCH.java
 * ���     : �����濵-����������-����Ʈ���� �ٷΰ���
 * �ۼ����� : 2006/06/21
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SL_S_COMM_APT_QSEARCH
**/

public class SL_S_COMM_APT_QSEARCHCRDRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String dlvdong;
	public String dlvser_no;

	public SL_S_COMM_APT_QSEARCHCRDRCURRecord(){}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}
}

/* �ۼ��ð� : Thu Jun 22 11:08:44 KST 2006 */