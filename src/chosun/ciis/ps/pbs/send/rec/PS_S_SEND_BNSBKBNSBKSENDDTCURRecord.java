/***************************************************************************************************
* ���ϸ� : PS_S_SEND_BNSBK.java
* ��� :   �߼�-���ʽ��Ϲ߼� �ʱ�
* �ۼ����� : 2004-02-26
* �ۼ��� : ���ȯ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.ds.*;

/**
 * �߼�-���ʽ��Ϲ߼� �ʱ�
 *
 */

public class PS_S_SEND_BNSBKBNSBKSENDDTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String brch_offisend_dt;
	public String brch_offisend_dt_view;

	public PS_S_SEND_BNSBKBNSBKSENDDTCURRecord(){}

	public void setBrch_offisend_dt(String brch_offisend_dt){
		this.brch_offisend_dt = brch_offisend_dt;
	}

	public void setBrch_offisend_dt_view(String brch_offisend_dt_view){
		this.brch_offisend_dt_view = brch_offisend_dt_view;
	}

	public String getBrch_offisend_dt(){
		return this.brch_offisend_dt;
	}

	public String getBrch_offisend_dt_view(){
		return this.brch_offisend_dt_view;
	}
}

/* �ۼ��ð� : Tue Nov 29 20:12:16 KST 2005 */