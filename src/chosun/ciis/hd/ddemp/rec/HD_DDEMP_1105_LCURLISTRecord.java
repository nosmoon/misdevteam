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


package chosun.ciis.hd.ddemp.rec;

import java.sql.*;
import chosun.ciis.hd.ddemp.dm.*;
import chosun.ciis.hd.ddemp.ds.*;

/**
 * 
 */


public class HD_DDEMP_1105_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_insr_amt;
	public String np_amt;
	public String hlth_insr_amt;
	public String hlth_insr_med_care_insr_amt;

	public HD_DDEMP_1105_LCURLISTRecord(){}

	public void setEmp_insr_amt(String emp_insr_amt){
		this.emp_insr_amt = emp_insr_amt;
	}

	public void setNp_amt(String np_amt){
		this.np_amt = np_amt;
	}

	public void setHlth_insr_amt(String hlth_insr_amt){
		this.hlth_insr_amt = hlth_insr_amt;
	}

	public void setHlth_insr_med_care_insr_amt(String hlth_insr_med_care_insr_amt){
		this.hlth_insr_med_care_insr_amt = hlth_insr_med_care_insr_amt;
	}

	public String getEmp_insr_amt(){
		return this.emp_insr_amt;
	}

	public String getNp_amt(){
		return this.np_amt;
	}

	public String getHlth_insr_amt(){
		return this.hlth_insr_amt;
	}

	public String getHlth_insr_med_care_insr_amt(){
		return this.hlth_insr_med_care_insr_amt;
	}
}

/* �ۼ��ð� : Fri Nov 24 16:18:47 KST 2017 */