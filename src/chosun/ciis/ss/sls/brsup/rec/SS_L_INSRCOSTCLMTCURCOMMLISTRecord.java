/***************************************************************************************************
* ���ϸ� : SS_L_INSRCOSTCLMTCURCOMMLISTRecord.java
* ��� : ��������-���غ���-���(�������)-�󼼸���� ���� Record
* �ۼ����� : 2004-02-20
* �ۼ��� : ��뼷
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
 * ��������-���غ���-���(�������)-�󼼸���� ���� Record
 */

public class SS_L_INSRCOSTCLMTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public int clamt;
	public String rcpmpersnm;
	public int clamtbal;
	public String clamtdt;

	public SS_L_INSRCOSTCLMTCURCOMMLISTRecord(){}

	public void setClamt(int clamt){
		this.clamt = clamt;
	}

	public void setRcpmpersnm(String rcpmpersnm){
		this.rcpmpersnm = rcpmpersnm;
	}

	public void setClamtbal(int clamtbal){
		this.clamtbal = clamtbal;
	}

	public void setClamtdt(String clamtdt){
		this.clamtdt = clamtdt;
	}

	public int getClamt(){
		return this.clamt;
	}

	public String getRcpmpersnm(){
		return this.rcpmpersnm;
	}

	public int getClamtbal(){
		return this.clamtbal;
	}

	public String getClamtdt(){
		return this.clamtdt;
	}
}

/* �ۼ��ð� : Sat Feb 21 21:51:30 KST 2004 */