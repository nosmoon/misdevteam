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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7031_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String prelae_pay_clsf_cd;
	public String shggbnm;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String janaeg;

	public FC_FUNC_7031_LCURLIST2Record(){}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setShggbnm(String shggbnm){
		this.shggbnm = shggbnm;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setJanaeg(String janaeg){
		this.janaeg = janaeg;
	}

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getShggbnm(){
		return this.shggbnm;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getJanaeg(){
		return this.janaeg;
	}
}

/* �ۼ��ð� : Tue Apr 07 14:11:00 KST 2009 */