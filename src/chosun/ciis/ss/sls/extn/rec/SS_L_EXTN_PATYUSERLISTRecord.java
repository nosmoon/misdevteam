/***************************************************************************************************
* ���ϸ� : .java
* ��� : Ȯ����Ȳ/��üȮ��/���ã��  
* �ۼ����� : 2009-06-02
* �ۼ��� : ������
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ/��üȮ��/���ã��
 */

public class SS_L_EXTN_PATYUSERLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String flnm;
	public String dept_cd;
	public String dept_nm;
	public String bank_nm;
	public String acct_no;

	public SS_L_EXTN_PATYUSERLISTRecord(){}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getAcct_no(){
		return this.acct_no;
	}
}

/* �ۼ��ð� : Tue Jun 02 17:41:22 KST 2009 */