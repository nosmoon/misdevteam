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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3602_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String offi_nm;
	public String dept_nm;
	public String emp_no;
	public String flnm;
	public String non_tax_stot;

	public HD_SALY_3602_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setNon_tax_stot(String non_tax_stot){
		this.non_tax_stot = non_tax_stot;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getNon_tax_stot(){
		return this.non_tax_stot;
	}
}

/* �ۼ��ð� : Mon Oct 26 11:37:08 KST 2009 */