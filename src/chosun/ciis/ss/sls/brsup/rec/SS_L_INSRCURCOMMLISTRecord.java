/***************************************************************************************************
* ���ϸ� : SS_L_INSRCURCOMMLISTRecord.java
* ��� : ��������-���غ���-����� ���� Record
* �ۼ����� : 2004-02-10
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
 * ��������-���غ���-��� ���� Record
 */

public class SS_L_INSRCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cntryy;
	public String insrnm;
	public String insrcmpynm;
	public String aplcfrdt;
	public String aplctodt;

	public SS_L_INSRCURCOMMLISTRecord(){}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public void setInsrnm(String insrnm){
		this.insrnm = insrnm;
	}

	public void setInsrcmpynm(String insrcmpynm){
		this.insrcmpynm = insrcmpynm;
	}

	public void setAplcfrdt(String aplcfrdt){
		this.aplcfrdt = aplcfrdt;
	}

	public void setAplctodt(String aplctodt){
		this.aplctodt = aplctodt;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getInsrnm(){
		return this.insrnm;
	}

	public String getInsrcmpynm(){
		return this.insrcmpynm;
	}

	public String getAplcfrdt(){
		return this.aplcfrdt;
	}

	public String getAplctodt(){
		return this.aplctodt;
	}
}

/* �ۼ��ð� : Mon Feb 16 13:13:33 KST 2004 */