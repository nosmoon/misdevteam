/***************************************************************************************************
* ���ϸ� : SS_S_INSRAPLCCURCOMMLISTRecord.java
* ��� : ��������-���غ���-�űԽ�û-�󼼸���� ���� Record
* �ۼ����� : 2004-02-19
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
 * ��������-���غ���-�űԽ�û-�󼼸���� ���� Record
 */

public class SS_S_INSRAPLCCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flnm;
	public String prn;
	public String dutynm;
	public String insrnm;

	public SS_S_INSRAPLCCURCOMMLISTRecord(){}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setDutynm(String dutynm){
		this.dutynm = dutynm;
	}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getDutynm(){
		return this.dutynm;
	}

	public String getInsrnm(){
		return this.insrnm;
	}
}

/* �ۼ��ð� : Thu Feb 19 19:09:38 KST 2004 */