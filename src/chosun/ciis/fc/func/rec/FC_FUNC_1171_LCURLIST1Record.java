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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1171_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String mtry_dt;
	public String note_amtsum;

	public FC_FUNC_1171_LCURLIST1Record(){}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amtsum(String note_amtsum){
		this.note_amtsum = note_amtsum;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amtsum(){
		return this.note_amtsum;
	}
}

/* �ۼ��ð� : Tue Jul 14 15:07:18 KST 2009 */