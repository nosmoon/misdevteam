/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_IMTMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdr_extndt;
	public String custno;
	public String rdrnm;
	public String bocd;
	public String bonm;
	public String ptphno;

	public SS_L_IMTMCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setCustno(String custno){
		this.custno = custno;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getCustno(){
		return this.custno;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getPtphno(){
		return this.ptphno;
	}
}

/* �ۼ��ð� : Fri Feb 12 18:14:13 KST 2016 */