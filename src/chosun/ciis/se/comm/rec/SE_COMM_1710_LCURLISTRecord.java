/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_1710_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tax_no;
	public String dlco_nm;
	public String presi_nm;
	public String suply_amt;
	public String vat_amt;
	public String remk;

	public SE_COMM_1710_LCURLISTRecord(){}

	public void setTax_no(String tax_no){
		this.tax_no = tax_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getTax_no(){
		return this.tax_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Jul 22 14:03:02 KST 2009 */