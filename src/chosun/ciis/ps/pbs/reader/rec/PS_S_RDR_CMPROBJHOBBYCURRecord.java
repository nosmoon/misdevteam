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


public class PS_S_RDR_CMPROBJHOBBYCURRecord extends java.lang.Object implements java.io.Serializable{

	public String hbycd;
	public String hbyseq;

	public PS_S_RDR_CMPROBJHOBBYCURRecord(){}

	public void setHbycd(String hbycd){
		this.hbycd = hbycd;
	}

	public void setHbyseq(String hbyseq){
		this.hbyseq = hbyseq;
	}

	public String getHbycd(){
		return this.hbycd;
	}

	public String getHbyseq(){
		return this.hbyseq;
	}
}

/* �ۼ��ð� : Fri Feb 27 15:39:41 KST 2004 */