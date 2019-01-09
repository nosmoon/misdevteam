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


package chosun.ciis.hd.dalon.rec;

import java.sql.*;
import chosun.ciis.hd.dalon.dm.*;
import chosun.ciis.hd.dalon.ds.*;

/**
 * 
 */


public class HD_DALON_1407_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cost_flag;
	public String aply_basi_dt;
	public String fee_clsf;
	public String pay_amt;

	public HD_DALON_1407_LCURLISTRecord(){}

	public void setCost_flag(String cost_flag){
		this.cost_flag = cost_flag;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setFee_clsf(String fee_clsf){
		this.fee_clsf = fee_clsf;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public String getCost_flag(){
		return this.cost_flag;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getFee_clsf(){
		return this.fee_clsf;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* 작성시간 : Mon Jul 20 14:04:40 KST 2009 */