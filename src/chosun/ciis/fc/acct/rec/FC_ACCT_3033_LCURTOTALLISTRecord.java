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


public class FC_ACCT_3033_LCURTOTALLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tot_prvmm_bal;
	public String tot_thmm_dr;
	public String tot_thmm_crdt;
	public String tot_thmm_bal;

	public FC_ACCT_3033_LCURTOTALLISTRecord(){}

	public void setTot_prvmm_bal(String tot_prvmm_bal){
		this.tot_prvmm_bal = tot_prvmm_bal;
	}

	public void setTot_thmm_dr(String tot_thmm_dr){
		this.tot_thmm_dr = tot_thmm_dr;
	}

	public void setTot_thmm_crdt(String tot_thmm_crdt){
		this.tot_thmm_crdt = tot_thmm_crdt;
	}

	public void setTot_thmm_bal(String tot_thmm_bal){
		this.tot_thmm_bal = tot_thmm_bal;
	}

	public String getTot_prvmm_bal(){
		return this.tot_prvmm_bal;
	}

	public String getTot_thmm_dr(){
		return this.tot_thmm_dr;
	}

	public String getTot_thmm_crdt(){
		return this.tot_thmm_crdt;
	}

	public String getTot_thmm_bal(){
		return this.tot_thmm_bal;
	}
}

/* �ۼ��ð� : Thu Feb 05 10:37:49 KST 2009 */