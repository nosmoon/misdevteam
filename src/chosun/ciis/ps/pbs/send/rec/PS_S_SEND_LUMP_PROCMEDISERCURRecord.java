/***************************************************************************************************
* ���ϸ� : PS_S_SEND_LUMP_PROC.java
* ���   : ���Ǳ� �߼� ���� ���� �ڵ�
* �ۼ����� : 2006-04-19
* �ۼ��� : ����ǥ
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
 * ���Ǳ� -�߼� ���� �ڵ�
 *
 */

public class PS_S_SEND_LUMP_PROCMEDISERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String mediser_no;
	public String mediser_view;

	public PS_S_SEND_LUMP_PROCMEDISERCURRecord(){}

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

/* �ۼ��ð� : Fri Oct 27 17:45:56 KST 2006 */