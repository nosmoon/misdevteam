/***************************************************************************************************
* ���ϸ� : SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord.java
* ��� : ������������(���˹������˾�-�����ȸ)
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
 * ������������(���˹������˾�-�����ȸ)
 *
 */

public class SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String payno;
	public String paydt;
	public String bns_itemcd;
	public String bns_itemnm;
	public int qunt;
	public int amt;
	public String bocd;
	public String bonm;

	public SL_L_BNS_ITEMPAYBNSITEMPAYCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setPayno(String payno){
		this.payno = payno;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setQunt(int qunt){
		this.qunt = qunt;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getPayno(){
		return this.payno;
	}

	public String getPaydt(){
		return this.paydt;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public int getQunt(){
		return this.qunt;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}
}

/* �ۼ��ð� : Fri Jun 04 11:40:03 KST 2004 */