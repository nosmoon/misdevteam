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


public class PL_CLS_1710_LPTCRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String gnr_qty;
	public String amt;
	public String net_sale_amt;
	public String tax_no;
	
	public PL_CLS_1710_LPTCRLISTRecord(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setGnr_qty(String gnr_qty) {
		this.gnr_qty = gnr_qty;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}
	
	public void setTax_no(String tax_no) {
		this.tax_no = tax_no;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}
	
	public String getGnr_qty() {
		return gnr_qty;
	}

	public String getTax_no() {
		return tax_no;
	}


	
}

/* �ۼ��ð� : Wed Mar 22 16:55:47 KST 2017 */