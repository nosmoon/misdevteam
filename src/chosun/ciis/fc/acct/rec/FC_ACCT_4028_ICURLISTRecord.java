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


public class FC_ACCT_4028_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adjm_slip_occr_dt;
	public String adjm_slip_clsf_cd;
	public String adjm_slip_seq;
	public String adjm_slip_sub_seq;

	public FC_ACCT_4028_ICURLISTRecord(){}

	public void setAdjm_slip_occr_dt(String adjm_slip_occr_dt){
		this.adjm_slip_occr_dt = adjm_slip_occr_dt;
	}

	public void setAdjm_slip_clsf_cd(String adjm_slip_clsf_cd){
		this.adjm_slip_clsf_cd = adjm_slip_clsf_cd;
	}

	public void setAdjm_slip_seq(String adjm_slip_seq){
		this.adjm_slip_seq = adjm_slip_seq;
	}

	public void setAdjm_slip_sub_seq(String adjm_slip_sub_seq){
		this.adjm_slip_sub_seq = adjm_slip_sub_seq;
	}

	public String getAdjm_slip_occr_dt(){
		return this.adjm_slip_occr_dt;
	}

	public String getAdjm_slip_clsf_cd(){
		return this.adjm_slip_clsf_cd;
	}

	public String getAdjm_slip_seq(){
		return this.adjm_slip_seq;
	}

	public String getAdjm_slip_sub_seq(){
		return this.adjm_slip_sub_seq;
	}
}

/* �ۼ��ð� : Wed Jul 01 16:56:08 KST 2009 */