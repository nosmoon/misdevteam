/***************************************************************************************************
* ���ϸ� :
* ��� :
* �ۼ����� : 2015-10-21
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_S_RDR_INFOVACTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String acct_no;

	public SL_MO_S_RDR_INFOVACTCURRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}
}

/* �ۼ��ð� : Mon Dec 05 11:41:10 KST 2016 */