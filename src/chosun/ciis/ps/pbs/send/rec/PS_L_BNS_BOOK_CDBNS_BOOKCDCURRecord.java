/***************************************************************************************************
* ���ϸ� : SP_PS_L_BNS_BOOK_CD.java
* �߼�-�ݼ۰��� ���õ� ���ڹ�ȣ�� ���ʽ��� ��ȸ
* �ۼ����� : 2004-03-19
* �ۼ��� : ���ȣ 
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
 * �߼�-�ݼ۰��� ���õ� ���ڹ�ȣ�� ���ʽ��� ��ȸ
 *
 */

  

public class PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bns_bookcd;
	public String bns_booknm;
	public String cmpycd;
	public String bgnvdtydt;
	public String endvdtydt;

	public PS_L_BNS_BOOK_CDBNS_BOOKCDCURRecord(){}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public void setBns_booknm(String bns_booknm){
		this.bns_booknm = bns_booknm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBgnvdtydt(String bgnvdtydt){
		this.bgnvdtydt = bgnvdtydt;
	}

	public void setEndvdtydt(String endvdtydt){
		this.endvdtydt = endvdtydt;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}

	public String getBns_booknm(){
		return this.bns_booknm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBgnvdtydt(){
		return this.bgnvdtydt;
	}

	public String getEndvdtydt(){
		return this.endvdtydt;
	}
}

/* �ۼ��ð� : Fri Mar 19 17:09:29 KST 2004 */