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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_9203_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String ewh_dt;
	public String matr_cd;
	public String ewh_wgt;
	public String ewh_amt;

	public MT_PAPINOUT_9203_LCURLIST1Record(){}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}
}

/* �ۼ��ð� : Wed May 20 08:58:24 KST 2009 */