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


public class FC_FUNC_6533_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rv_slip_occr_dt;
	public String rv_slip_clsf_cd;
	public String rv_slip_seq;

	public FC_FUNC_6533_ICURLISTRecord(){}

	public void setRv_slip_occr_dt(String rv_slip_occr_dt){
		this.rv_slip_occr_dt = rv_slip_occr_dt;
	}

	public void setRv_slip_clsf_cd(String rv_slip_clsf_cd){
		this.rv_slip_clsf_cd = rv_slip_clsf_cd;
	}

	public void setRv_slip_seq(String rv_slip_seq){
		this.rv_slip_seq = rv_slip_seq;
	}

	public String getRv_slip_occr_dt(){
		return this.rv_slip_occr_dt;
	}

	public String getRv_slip_clsf_cd(){
		return this.rv_slip_clsf_cd;
	}

	public String getRv_slip_seq(){
		return this.rv_slip_seq;
	}
}

/* �ۼ��ð� : Tue Mar 17 17:42:51 KST 2009 */