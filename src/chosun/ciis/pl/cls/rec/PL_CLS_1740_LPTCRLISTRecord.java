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


public class PL_CLS_1740_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String gnr_qty;
	public String amt;
	public String net_sale_amt;
	public String slip_yn;
	public String incmg_dt_tm;
	public String slip_occr_dt;
	public String slip_seq;
	public String slip_clsf_cd;

	public PL_CLS_1740_LPTCRLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setGnr_qty(String gnr_qty){
		this.gnr_qty = gnr_qty;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setSlip_yn(String slip_yn){
		this.slip_yn = slip_yn;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getGnr_qty(){
		return this.gnr_qty;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getSlip_yn(){
		return this.slip_yn;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}
}

/* �ۼ��ð� : Fri Mar 31 10:54:08 KST 2017 */