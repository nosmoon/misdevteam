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


public class FC_ACCT_2343_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String hjpsubseq;
	public String fisc_dt;

	public FC_ACCT_2343_LCURLISTRecord(){}

	public void setHjpsubseq(String hjpsubseq){
		this.hjpsubseq = hjpsubseq;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public String getHjpsubseq(){
		return this.hjpsubseq;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}
}

/* �ۼ��ð� : Sat Apr 11 09:54:13 KST 2009 */