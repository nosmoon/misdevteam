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


public class FC_ACCT_1021_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insd_acct_cd;
	public String acct_subj_nm;
	public String tot_yn;

	public FC_ACCT_1021_SCURLISTRecord(){}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setTot_yn(String tot_yn){
		this.tot_yn = tot_yn;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getTot_yn(){
		return this.tot_yn;
	}
}

/* �ۼ��ð� : Tue Jan 31 11:20:53 KST 2017 */