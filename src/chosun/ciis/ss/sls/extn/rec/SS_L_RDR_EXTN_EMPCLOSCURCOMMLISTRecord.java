/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EMPCLOSCURCOMMLISTRecord.java
* ��� : ���Ȯ�� ��븶�� ����� ���� Record
* �ۼ����� : 2003-12-12
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;

	public SS_L_RDR_EXTN_EMPCLOSCURCOMMLISTRecord(){}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setClosdt(String closdt){
		this.closdt = closdt;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getClosdt(){
		return this.closdt;
	}
}

/* �ۼ��ð� : Sat Dec 13 14:04:30 KST 2003 */