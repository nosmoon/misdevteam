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


public class FC_ACCT_1211_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_cd;
	public String dr;
	public String cr;

	public FC_ACCT_1211_LCURLISTRecord(){}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setDr(String dr){
		this.dr = dr;
	}

	public void setCr(String cr){
		this.cr = cr;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getDr(){
		return this.dr;
	}

	public String getCr(){
		return this.cr;
	}
}

/* �ۼ��ð� : Mon Mar 02 16:49:19 KST 2009 */