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


public class FC_ACCT_1049_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String acct_cd;
	public String acct_subj_nm;
	public String insd_acct_cd;

	public FC_ACCT_1049_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public String getChk(){
		return this.chk;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}
}

/* �ۼ��ð� : Wed Jul 29 18:25:44 KST 2009 */