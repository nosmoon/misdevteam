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


public class FC_FUNC_8034_ICURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String flu_altn_slip_occr_dt;
	public String flu_altn_slip_clsf_cd;
	public String flu_altn_slip_seq;

	public FC_FUNC_8034_ICURLIST1Record(){}

	public void setFlu_altn_slip_occr_dt(String flu_altn_slip_occr_dt){
		this.flu_altn_slip_occr_dt = flu_altn_slip_occr_dt;
	}

	public void setFlu_altn_slip_clsf_cd(String flu_altn_slip_clsf_cd){
		this.flu_altn_slip_clsf_cd = flu_altn_slip_clsf_cd;
	}

	public void setFlu_altn_slip_seq(String flu_altn_slip_seq){
		this.flu_altn_slip_seq = flu_altn_slip_seq;
	}

	public String getFlu_altn_slip_occr_dt(){
		return this.flu_altn_slip_occr_dt;
	}

	public String getFlu_altn_slip_clsf_cd(){
		return this.flu_altn_slip_clsf_cd;
	}

	public String getFlu_altn_slip_seq(){
		return this.flu_altn_slip_seq;
	}
}

/* �ۼ��ð� : Thu May 28 15:15:30 KST 2009 */