/***************************************************************************************************
* ���ϸ� : SS_L_BO_HEADIDEACURCOMMLISTRecord.java
* ��� : ����Info-������-������Ұ� ����� ���� Record
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * ����Info-������-������Ұ� ����� ���� Record
 */

public class SS_L_BO_HEADIDEACURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prn;
	public String seq;
	public String makedt;
	public String makepersnm;
	public String idea1;

	public SS_L_BO_HEADIDEACURCOMMLISTRecord(){}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMakedt(String makedt){
		this.makedt = makedt;
	}

	public void setMakepersnm(String makepersnm){
		this.makepersnm = makepersnm;
	}

	public void setIdea1(String idea1){
		this.idea1 = idea1;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMakedt(){
		return this.makedt;
	}

	public String getMakepersnm(){
		return this.makepersnm;
	}

	public String getIdea1(){
		return this.idea1;
	}
}

/* �ۼ��ð� : Fri May 21 15:01:42 KST 2004 */