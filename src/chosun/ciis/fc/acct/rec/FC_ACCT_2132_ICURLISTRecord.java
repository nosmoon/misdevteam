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


public class FC_ACCT_2132_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tax_stmt_no;

	public FC_ACCT_2132_ICURLISTRecord(){}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}
}

/* �ۼ��ð� : Tue Jun 16 11:17:07 KST 2009 */