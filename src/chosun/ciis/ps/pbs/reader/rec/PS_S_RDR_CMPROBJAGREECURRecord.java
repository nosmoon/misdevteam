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


public class PS_S_RDR_CMPROBJAGREECURRecord extends java.lang.Object implements java.io.Serializable{

	public String agrmntdt;
	public String agrmntamt;
	public String agrmntseq;

	public PS_S_RDR_CMPROBJAGREECURRecord(){}

	public void setAgrmntdt(String agrmntdt){
		this.agrmntdt = agrmntdt;
	}

	public void setAgrmntamt(String agrmntamt){
		this.agrmntamt = agrmntamt;
	}

	public void setAgrmntseq(String agrmntseq){
		this.agrmntseq = agrmntseq;
	}

	public String getAgrmntdt(){
		return this.agrmntdt;
	}

	public String getAgrmntamt(){
		return this.agrmntamt;
	}

	public String getAgrmntseq(){
		return this.agrmntseq;
	}
}

/* �ۼ��ð� : Fri Feb 27 15:39:41 KST 2004 */