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


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_3200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_dtls_clsf_nm;
	public String tot_cnt;
	public String in_lv_cmpy_cnt;
	public String year_cnt;
	public String tot_amt;
	public String in_lv_cmpy_amt;
	public String year_amt;

	public HD_LVCMPY_3200_LCURLISTRecord(){}

	public void setEmp_dtls_clsf_nm(String emp_dtls_clsf_nm){
		this.emp_dtls_clsf_nm = emp_dtls_clsf_nm;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setIn_lv_cmpy_cnt(String in_lv_cmpy_cnt){
		this.in_lv_cmpy_cnt = in_lv_cmpy_cnt;
	}

	public void setYear_cnt(String year_cnt){
		this.year_cnt = year_cnt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setIn_lv_cmpy_amt(String in_lv_cmpy_amt){
		this.in_lv_cmpy_amt = in_lv_cmpy_amt;
	}

	public void setYear_amt(String year_amt){
		this.year_amt = year_amt;
	}

	public String getEmp_dtls_clsf_nm(){
		return this.emp_dtls_clsf_nm;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getIn_lv_cmpy_cnt(){
		return this.in_lv_cmpy_cnt;
	}

	public String getYear_cnt(){
		return this.year_cnt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getIn_lv_cmpy_amt(){
		return this.in_lv_cmpy_amt;
	}

	public String getYear_amt(){
		return this.year_amt;
	}
}

/* �ۼ��ð� : Wed Jun 17 10:50:16 KST 2009 */