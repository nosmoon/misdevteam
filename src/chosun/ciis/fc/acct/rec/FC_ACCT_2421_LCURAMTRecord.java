/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2421_LCURAMTRecord extends java.lang.Object implements java.io.Serializable{

	public String fajcbamt;
	public String fajdbamt;
	public String fdajcbamt;
	public String fdajdbamt;
	public String fcbjan;
	public String fdbjan;

	public FC_ACCT_2421_LCURAMTRecord(){}

	public void setFajcbamt(String fajcbamt){
		this.fajcbamt = fajcbamt;
	}

	public void setFajdbamt(String fajdbamt){
		this.fajdbamt = fajdbamt;
	}

	public void setFdajcbamt(String fdajcbamt){
		this.fdajcbamt = fdajcbamt;
	}

	public void setFdajdbamt(String fdajdbamt){
		this.fdajdbamt = fdajdbamt;
	}

	public void setFcbjan(String fcbjan){
		this.fcbjan = fcbjan;
	}

	public void setFdbjan(String fdbjan){
		this.fdbjan = fdbjan;
	}

	public String getFajcbamt(){
		return this.fajcbamt;
	}

	public String getFajdbamt(){
		return this.fajdbamt;
	}

	public String getFdajcbamt(){
		return this.fdajcbamt;
	}

	public String getFdajdbamt(){
		return this.fdajdbamt;
	}

	public String getFcbjan(){
		return this.fcbjan;
	}

	public String getFdbjan(){
		return this.fdbjan;
	}
}

/* �ۼ��ð� : Mon Feb 23 12:17:17 KST 2009 */