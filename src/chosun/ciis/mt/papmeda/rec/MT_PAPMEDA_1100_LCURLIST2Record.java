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


package chosun.ciis.mt.papmeda.rec;

import java.sql.*;
import chosun.ciis.mt.papmeda.dm.*;
import chosun.ciis.mt.papmeda.ds.*;

/**
 * 
 */


public class MT_PAPMEDA_1100_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String paper_amt;

	public MT_PAPMEDA_1100_LCURLIST2Record(){}

	public void setPaper_amt(String paper_amt){
		this.paper_amt = paper_amt;
	}

	public String getPaper_amt(){
		return this.paper_amt;
	}
}

/* �ۼ��ð� : Fri May 08 17:19:56 KST 2009 */