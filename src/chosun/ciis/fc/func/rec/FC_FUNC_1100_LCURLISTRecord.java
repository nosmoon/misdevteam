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


public class FC_FUNC_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stat_dt;
	public String bank_cd;
	public String note_no;
	public String note_seq;

	public FC_FUNC_1100_LCURLISTRecord(){}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}
}

/* �ۼ��ð� : Wed Feb 25 10:43:15 KST 2009 */