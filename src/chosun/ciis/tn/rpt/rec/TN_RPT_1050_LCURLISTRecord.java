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


package chosun.ciis.tn.rpt.rec;

import java.sql.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.ds.*;

/**
 * 
 */


public class TN_RPT_1050_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cdnm;
	public String cdnm;
	public String acct_num;
	public String acct_clsf;
	public String remk;
	public String tran_date;
	public String bank_id;
	public String bank_name;
	public String today_amt;
	public String in_amt;
	public String out_amt;
	public String yes_amt;

	public TN_RPT_1050_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cdnm(String acct_cdnm){
		this.acct_cdnm = acct_cdnm;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setAcct_clsf(String acct_clsf){
		this.acct_clsf = acct_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setBank_name(String bank_name){
		this.bank_name = bank_name;
	}

	public void setToday_amt(String today_amt){
		this.today_amt = today_amt;
	}

	public void setIn_amt(String in_amt){
		this.in_amt = in_amt;
	}

	public void setOut_amt(String out_amt){
		this.out_amt = out_amt;
	}

	public void setYes_amt(String yes_amt){
		this.yes_amt = yes_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cdnm(){
		return this.acct_cdnm;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getAcct_clsf(){
		return this.acct_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getBank_name(){
		return this.bank_name;
	}

	public String getToday_amt(){
		return this.today_amt;
	}

	public String getIn_amt(){
		return this.in_amt;
	}

	public String getOut_amt(){
		return this.out_amt;
	}

	public String getYes_amt(){
		return this.yes_amt;
	}
}

/* 작성시간 : Tue Oct 18 13:57:05 KST 2016 */