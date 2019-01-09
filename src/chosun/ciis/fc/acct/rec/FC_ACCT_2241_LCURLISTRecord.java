/***************************************************************************************************
* 파일명 : .java
* 기능 :  재무회계 - 전표관리  - 수입결의관리  - 통장입금확인
* 작성일자 : 2010-08-13
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 재무회계 - 전표관리  - 수입결의관리  - 통장입금확인
 */


public class FC_ACCT_2241_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acct_num;
	public String bank_name;
	public String tran_date;
	public String remark;
	public String tran_amt;
	public String extnc_amt;
	public String remain_amt;
	public String rcpm_slip_no;
	public String mchrg_pers;

	public FC_ACCT_2241_LCURLISTRecord(){}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setBank_name(String bank_name){
		this.bank_name = bank_name;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setExtnc_amt(String extnc_amt){
		this.extnc_amt = extnc_amt;
	}

	public void setRemain_amt(String remain_amt){
		this.remain_amt = remain_amt;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getBank_name(){
		return this.bank_name;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getRemark(){
		return this.remark;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getExtnc_amt(){
		return this.extnc_amt;
	}

	public String getRemain_amt(){
		return this.remain_amt;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}
}

/* 작성시간 : Mon Oct 25 17:38:30 KST 2010 */