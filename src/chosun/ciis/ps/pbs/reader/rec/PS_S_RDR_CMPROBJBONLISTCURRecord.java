/***************************************************************************************************
* ���ϸ� : SP_PS_S_RDR_CMPROBJ.java
* ��� :   ����-����ó�� �񱳴�󳻿� ����ȸȭ��
* �ۼ����� : 2004-02-23
* �ۼ��� : ���ȣ 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :   
* ��� :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * ����-����ó�� �񱳴�󳻿� ����ȸȭ��
 *
 */


public class PS_S_RDR_CMPROBJBONLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcseq;
	public String bns_bookseq;
	public String bns_bookcd;

	public PS_S_RDR_CMPROBJBONLISTCURRecord(){}

	public void setAplcseq(String aplcseq){
		this.aplcseq = aplcseq;
	}

	public void setBns_bookseq(String bns_bookseq){
		this.bns_bookseq = bns_bookseq;
	}

	public void setBns_bookcd(String bns_bookcd){
		this.bns_bookcd = bns_bookcd;
	}

	public String getAplcseq(){
		return this.aplcseq;
	}

	public String getBns_bookseq(){
		return this.bns_bookseq;
	}

	public String getBns_bookcd(){
		return this.bns_bookcd;
	}
}

/* �ۼ��ð� : Fri Feb 27 15:39:41 KST 2004 */