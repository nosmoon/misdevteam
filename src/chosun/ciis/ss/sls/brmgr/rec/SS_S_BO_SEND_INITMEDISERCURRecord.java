/***************************************************************************************************
 * ���ϸ�   : SP_SS_S_BO_SEND_INIT
 * ���     : �����濵-�ְ������߼۰���
 * �ۼ����� : 2007/04/25
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_S_BO_SEND_INIT
**/

public class SS_S_BO_SEND_INITMEDISERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String mediser_no;
	public String mediser_view;

	public SS_S_BO_SEND_INITMEDISERCURRecord(){}

	public void setMediser_no(String mediser_no){
		this.mediser_no = mediser_no;
	}

	public void setMediser_view(String mediser_view){
		this.mediser_view = mediser_view;
	}

	public String getMediser_no(){
		return this.mediser_no;
	}

	public String getMediser_view(){
		return this.mediser_view;
	}
}

/* �ۼ��ð� : Wed Apr 25 10:07:11 KST 2007 */