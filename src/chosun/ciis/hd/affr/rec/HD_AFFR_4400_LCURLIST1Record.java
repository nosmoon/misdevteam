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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_4400_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String category_clsf;
	public String emp_no_cnt;
	public String category_clsf_cnt;
	public String use_amt_sum;

	public HD_AFFR_4400_LCURLIST1Record(){}

	public void setCategory_clsf(String category_clsf){
		this.category_clsf = category_clsf;
	}

	public void setEmp_no_cnt(String emp_no_cnt){
		this.emp_no_cnt = emp_no_cnt;
	}

	public void setCategory_clsf_cnt(String category_clsf_cnt){
		this.category_clsf_cnt = category_clsf_cnt;
	}

	public void setUse_amt_sum(String use_amt_sum){
		this.use_amt_sum = use_amt_sum;
	}

	public String getCategory_clsf(){
		return this.category_clsf;
	}

	public String getEmp_no_cnt(){
		return this.emp_no_cnt;
	}

	public String getCategory_clsf_cnt(){
		return this.category_clsf_cnt;
	}

	public String getUse_amt_sum(){
		return this.use_amt_sum;
	}
}

/* �ۼ��ð� : Wed Jun 10 11:41:22 KST 2009 */