/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.trg.rec;

import java.sql.*;
import chosun.ciis.se.trg.dm.*;
import chosun.ciis.se.trg.ds.*;

/**
 * 
 */


public class SE_TRG_1420_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String rank;
	public String amt;

	public SE_TRG_1420_LCURLIST2Record(){}

	public void setRank(String rank){
		this.rank = rank;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getRank(){
		return this.rank;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* �ۼ��ð� : Thu Apr 02 10:17:56 KST 2009 */