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


package chosun.ciis.is.dep.rec;

import java.sql.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.ds.*;

/**
 * 
 */


public class IS_DEP_1620_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_nm;
	public String dlco_no;
	public String dlco_nm;
	public String misu_amt;
	public String precpt_amt_bal;

	public IS_DEP_1620_LCURLISTRecord(){}

	public void setSlip_clsf_nm(String slip_clsf_nm){
		this.slip_clsf_nm = slip_clsf_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setPrecpt_amt_bal(String precpt_amt_bal){
		this.precpt_amt_bal = precpt_amt_bal;
	}

	public String getSlip_clsf_nm(){
		return this.slip_clsf_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getPrecpt_amt_bal(){
		return this.precpt_amt_bal;
	}
}

/* 작성시간 : Tue May 22 10:50:46 KST 2012 */