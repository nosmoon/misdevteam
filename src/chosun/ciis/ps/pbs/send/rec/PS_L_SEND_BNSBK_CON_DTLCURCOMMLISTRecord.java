/***************************************************************************************************
* ���ϸ� : SP_PS_L_SEND_BNSBK_CON_DTL.java
* ��� :   �߼�-���ʽ��Ϲ߼� �߼�ó�� �󼼳��� ��ȸȭ�� 
* �ۼ����� : 2004-02-28
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
 * �߼�-���ʽ��Ϲ߼�  �߼�ó�� �󼼳��� ��ȸȭ�� 
 *
 */ 

 

public class PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String prn;
	public String bnsbk;
	public String rdrtel_no;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;

	public PS_L_SEND_BNSBK_CON_DTLCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setBnsbk(String bnsbk){
		this.bnsbk = bnsbk;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getBnsbk(){
		return this.bnsbk;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}
}

/* �ۼ��ð� : Thu Mar 04 16:39:49 KST 2004 */