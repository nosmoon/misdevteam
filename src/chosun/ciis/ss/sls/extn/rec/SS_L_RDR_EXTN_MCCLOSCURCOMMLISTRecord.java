/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_MCCLOSCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-MCȮ��
* �ۼ����� : 2005-02-19
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
 * Ȯ����Ȳ-����ISȮ��-MCȮ��
 */


public class SS_L_RDR_EXTN_MCCLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;

	public SS_L_RDR_EXTN_MCCLOSCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Sat Feb 19 17:26:38 KST 2005 */