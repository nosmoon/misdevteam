/***************************************************************************************************
* ���ϸ� : 
* ��� :  �߼�-�����߰� �߼�ó��
* �ۼ����� : 2004-03-15
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
 * �߼�-�����߰��߼� �߼�ó��
 *
 */

public class PS_L_SEND_GIROADDMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String bonm;
	public String termsubsno;
	public String issuseq;
	public String rdrnm;
	public String medinm;
	public String agrmntdt;
	public int agrmntamt;
	public String senddt;

	public PS_L_SEND_GIROADDMCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setIssuseq(String issuseq){
		this.issuseq = issuseq;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setAgrmntdt(String agrmntdt){
		this.agrmntdt = agrmntdt;
	}

	public void setAgrmntamt(int agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getIssuseq(){
		return this.issuseq;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getAgrmntdt(){
		return this.agrmntdt;
	}

	public int getAgrmntamt(){
		return this.agrmntamt;
	}

	public String getSenddt(){
		return this.senddt;
	}
}

/* �ۼ��ð� : Mon Mar 15 13:23:13 KST 2004 */