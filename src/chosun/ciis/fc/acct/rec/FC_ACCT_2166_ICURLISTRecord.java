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


public class FC_ACCT_2166_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String out_slip_occr_dt;
	public String out_slip_clsf_cd;
	public String out_slip_seq;

	public FC_ACCT_2166_ICURLISTRecord(){}

	public void setOut_slip_occr_dt(String out_slip_occr_dt){
		this.out_slip_occr_dt = out_slip_occr_dt;
	}

	public void setOut_slip_clsf_cd(String out_slip_clsf_cd){
		this.out_slip_clsf_cd = out_slip_clsf_cd;
	}

	public void setOut_slip_seq(String out_slip_seq){
		this.out_slip_seq = out_slip_seq;
	}

	public String getOut_slip_occr_dt(){
		return this.out_slip_occr_dt;
	}

	public String getOut_slip_clsf_cd(){
		return this.out_slip_clsf_cd;
	}

	public String getOut_slip_seq(){
		return this.out_slip_seq;
	}
}

/* �ۼ��ð� : Fri May 01 11:51:55 KST 2009 */