/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_7034_ECURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prelae_pay_clsf_cd;
	public String prelae_pay_clsf_nm;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String janaeg;

	public FC_FUNC_7034_ECURLISTRecord(){}

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setPrelae_pay_clsf_nm(String prelae_pay_clsf_nm){
		this.prelae_pay_clsf_nm = prelae_pay_clsf_nm;
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

	public String getPrelae_pay_clsf_nm(){
		return this.prelae_pay_clsf_nm;
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

/* 작성시간 : Tue Apr 07 11:17:52 KST 2009 */