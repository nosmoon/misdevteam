/***************************************************************************************************
* ���ϸ� : SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord.java
* ��� : ������-���ϸ���-����-����� ���� Record
* �ۼ����� : 2004-03-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 * ������-���ϸ���-����-����� ���� Record
 */

public class SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String frdt;
	public String todt;
	public String closdt;

	public SS_L_MIGLLMMT_CLOSCURCOMMLISTRecord(){}

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

/* �ۼ��ð� : Mon Mar 22 11:37:23 KST 2004 */