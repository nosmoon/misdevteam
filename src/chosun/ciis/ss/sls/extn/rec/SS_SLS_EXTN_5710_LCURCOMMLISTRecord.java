/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
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


public class SS_SLS_EXTN_5710_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String subscrpt_cd;
	public String subscrpt_stat;
	public String remk;

	public SS_SLS_EXTN_5710_LCURCOMMLISTRecord(){}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setSubscrpt_stat(String subscrpt_stat){
		this.subscrpt_stat = subscrpt_stat;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getSubscrpt_cd(){
		return this.subscrpt_cd;
	}

	public String getSubscrpt_stat(){
		return this.subscrpt_stat;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* �ۼ��ð� : Wed Jan 10 11:07:43 KST 2018 */