/***************************************************************************************************
* ���ϸ� : SS_L_SHFT_PYMTRSLTCURRecord.java
* ��� : ������������-Billing�ڵ���ü-�����ڰ���-�����ڸ��
* �ۼ����� : 2004-04-01
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-Billing�ڵ���ü-�����ڰ���-�����ڸ��
 *
 */


public class SS_L_SHFT_PYMTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String pymtseq;
	public String shftclsf;
	public String shftclsfnm;
	public String prn;
	public String pymtnm;
	public String acctno;
	public String cardno;
	public String cnfm;

	public SS_L_SHFT_PYMTRSLTCURRecord(){}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setCnfm(String cnfm){
		this.cnfm = cnfm;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getCnfm(){
		return this.cnfm;
	}
}

/* �ۼ��ð� : Fri Apr 09 13:58:55 KST 2004 */