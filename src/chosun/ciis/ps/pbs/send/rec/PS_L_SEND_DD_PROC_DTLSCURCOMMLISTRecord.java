/***************************************************************************************************
* ���ϸ� : 
* ��� :  �߼�-���Ϲ߼� �߼�ó��
* �ۼ����� : 2004-03-02
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
 * �߼�-���Ϲ߼� �߼�ó��
 *
 */

public class PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdrno;
	public String acqnm;
	public String prn;
	public String rdrtel;
	public String subsno;
	public String dlvzip;
	public String addr;

	public PS_L_SEND_DD_PROC_DTLSCURCOMMLISTRecord(){}

	public void setRdrno(String rdrno){
		this.rdrno = rdrno;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRdrtel(String rdrtel){
		this.rdrtel = rdrtel;
	}

	public void setSubsno(String subsno){
		this.subsno = subsno;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public String getRdrno(){
		return this.rdrno;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRdrtel(){
		return this.rdrtel;
	}

	public String getSubsno(){
		return this.subsno;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getAddr(){
		return this.addr;
	}
}

/* �ۼ��ð� : Thu Dec 23 13:52:36 KST 2004 */