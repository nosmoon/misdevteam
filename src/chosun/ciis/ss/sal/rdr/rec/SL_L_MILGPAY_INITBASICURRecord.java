/***************************************************************************************************
* ���ϸ� : SL_L_MILGPAY_INITBASICURRecord.java
* ��� : ������������(���ϸ������޳����˾�-�ʱ�ȭ��)
* �ۼ����� : 2004-06-03
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ������������(���ϸ������޳����˾�-�ʱ�ȭ��)
 *
 */

public class SL_L_MILGPAY_INITBASICURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String medinm;
	public String paybasicd;
	public String paybasinm;

	public SL_L_MILGPAY_INITBASICURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setPaybasicd(String paybasicd){
		this.paybasicd = paybasicd;
	}

	public void setPaybasinm(String paybasinm){
		this.paybasinm = paybasinm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getPaybasicd(){
		return this.paybasicd;
	}

	public String getPaybasinm(){
		return this.paybasinm;
	}
}

/* �ۼ��ð� : Sun Jun 06 20:37:00 KST 2004 */