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


public class HD_AFFR_1614_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String scl_exps_clsf;
	public String fix_rate_clsf;
	public String pay_ratio_emp;
	public String pay_ratio_ofcr;
	public String pay_amt;

	public HD_AFFR_1614_MCURLIST1Record(){}

	public void setScl_exps_clsf(String scl_exps_clsf){
		this.scl_exps_clsf = scl_exps_clsf;
	}

	public void setFix_rate_clsf(String fix_rate_clsf){
		this.fix_rate_clsf = fix_rate_clsf;
	}

	public void setPay_ratio_emp(String pay_ratio_emp){
		this.pay_ratio_emp = pay_ratio_emp;
	}

	public void setPay_ratio_ofcr(String pay_ratio_ofcr){
		this.pay_ratio_ofcr = pay_ratio_ofcr;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public String getScl_exps_clsf(){
		return this.scl_exps_clsf;
	}

	public String getFix_rate_clsf(){
		return this.fix_rate_clsf;
	}

	public String getPay_ratio_emp(){
		return this.pay_ratio_emp;
	}

	public String getPay_ratio_ofcr(){
		return this.pay_ratio_ofcr;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* �ۼ��ð� : Mon Dec 10 17:19:56 KST 2012 */