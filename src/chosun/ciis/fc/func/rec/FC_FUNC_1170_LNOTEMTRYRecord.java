/***************************************************************************************************
* ���ϸ� : SP_CO_L_RDRCRTS_GRAD_APLC.java
* ��� :  ����-����������û ��ȸ
* �ۼ����� : 2004-05-17
* �ۼ��� : ����ǥ
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
 * ����-����������û ��ȸ
 */

public class FC_FUNC_1170_LNOTEMTRYRecord extends java.lang.Object implements java.io.Serializable{

	public String mtry_dt;
	public String note_amtsum;

	public FC_FUNC_1170_LNOTEMTRYRecord(){}

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

/* �ۼ��ð� : Thu Feb 05 14:42:56 KST 2009 */