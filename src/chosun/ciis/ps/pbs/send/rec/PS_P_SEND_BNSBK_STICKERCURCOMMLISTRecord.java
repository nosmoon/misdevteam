/***************************************************************************************************
* ���ϸ� : PS_P_SEND_BNSBK_STICKER.java
* ��� : ���� ���ʽ��� �߼� ���(Excel)
* �ۼ����� : 2005-12-08
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
 * ���Ǳ�- ���� ���ʽ��� �߼� ���(Excel)
 *
 */

public class PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String rdr_no;
	public String rdrnm;
	public String bnsbk;
	public String rdrtel_no;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String subsfrdt;
	public String medinm;
	public int rnum;

	public PS_P_SEND_BNSBK_STICKERCURCOMMLISTRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
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

	public void setSubsfrdt(String subsfrdt){
		this.subsfrdt = subsfrdt;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
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

	public String getSubsfrdt(){
		return this.subsfrdt;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* �ۼ��ð� : Fri Dec 09 10:59:05 KST 2005 */