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


public class FC_FUNC_1053_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_no;

	public FC_FUNC_1053_ICURLISTRecord(){}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* �ۼ��ð� : Wed Aug 26 14:37:53 KST 2009 */