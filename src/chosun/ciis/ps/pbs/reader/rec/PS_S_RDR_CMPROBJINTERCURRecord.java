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


public class PS_S_RDR_CMPROBJINTERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String conccd;
	public String concseq;

	public PS_S_RDR_CMPROBJINTERCURRecord(){}

	public void setConccd(String conccd){
		this.conccd = conccd;
	}

	public void setConcseq(String concseq){
		this.concseq = concseq;
	}

	public String getConccd(){
		return this.conccd;
	}

	public String getConcseq(){
		return this.concseq;
	}
}

/* �ۼ��ð� : Fri Feb 27 15:39:41 KST 2004 */