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


package chosun.ciis.pl.cls.rec;

import java.sql.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */


public class PL_CLS_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String amt;
	public String suply_amt;
	public String rcpm_status;
	public String actu_slip_no;

	public PL_CLS_1810_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setRcpm_status(String rcpm_status){
		this.rcpm_status = rcpm_status;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getRcpm_status(){
		return this.rcpm_status;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}
}

/* �ۼ��ð� : Tue Apr 04 18:28:13 KST 2017 */