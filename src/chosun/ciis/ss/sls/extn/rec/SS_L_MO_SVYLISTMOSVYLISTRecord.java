/***************************************************************************************************
* ���ϸ� : SS_L_MO_SVYLISTMOSVYLISTRecord.java
* ��� :
* �ۼ����� : 2016.02.29
* �ۼ��� : �弱��
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
 *
 */


public class SS_L_MO_SVYLISTMOSVYLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String svyid;
	public String svynm;

	public SS_L_MO_SVYLISTMOSVYLISTRecord(){}

	public void setSvyid(String svyid){
		this.svyid = svyid;
	}

	public void setSvynm(String svynm){
		this.svynm = svynm;
	}

	public String getSvyid(){
		return this.svyid;
	}

	public String getSvynm(){
		return this.svynm;
	}
}

/* �ۼ��ð� : Mon Feb 29 18:14:36 KST 2016 */