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


public class FC_FUNC_3073_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String expn_dt;
	public String expn_dt_u;
	public String fund_cd;
	public String pay_wkdy;
	public String expn_amt;
	public String expn_yymm;

	public FC_FUNC_3073_LCURLISTRecord(){}

	public void setExpn_dt(String expn_dt){
		this.expn_dt = expn_dt;
	}

	public void setExpn_dt_u(String expn_dt_u){
		this.expn_dt_u = expn_dt_u;
	}

	public void setFund_cd(String fund_cd){
		this.fund_cd = fund_cd;
	}

	public void setPay_wkdy(String pay_wkdy){
		this.pay_wkdy = pay_wkdy;
	}

	public void setExpn_amt(String expn_amt){
		this.expn_amt = expn_amt;
	}

	public void setExpn_yymm(String expn_yymm){
		this.expn_yymm = expn_yymm;
	}

	public String getExpn_dt(){
		return this.expn_dt;
	}

	public String getExpn_dt_u(){
		return this.expn_dt_u;
	}

	public String getFund_cd(){
		return this.fund_cd;
	}

	public String getPay_wkdy(){
		return this.pay_wkdy;
	}

	public String getExpn_amt(){
		return this.expn_amt;
	}

	public String getExpn_yymm(){
		return this.expn_yymm;
	}
}

/* 작성시간 : Mon Mar 30 14:18:03 KST 2009 */