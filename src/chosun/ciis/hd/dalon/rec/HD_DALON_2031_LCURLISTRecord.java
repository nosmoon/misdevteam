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


public class HD_DALON_2031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String prvdd_prsnt_tm_prv;
	public String finish_dd_clsf;
	public String prvdd_finish_tm_aft;
	public String prvdd_finish_tm_prv;
	public String thdd_prsnt_tm_aft;
	public String thdd_prsnt_tm_prv;
	public String pay_amt;

	public HD_DALON_2031_LCURLISTRecord(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPrvdd_prsnt_tm_prv(String prvdd_prsnt_tm_prv){
		this.prvdd_prsnt_tm_prv = prvdd_prsnt_tm_prv;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setPrvdd_finish_tm_aft(String prvdd_finish_tm_aft){
		this.prvdd_finish_tm_aft = prvdd_finish_tm_aft;
	}

	public void setPrvdd_finish_tm_prv(String prvdd_finish_tm_prv){
		this.prvdd_finish_tm_prv = prvdd_finish_tm_prv;
	}

	public void setThdd_prsnt_tm_aft(String thdd_prsnt_tm_aft){
		this.thdd_prsnt_tm_aft = thdd_prsnt_tm_aft;
	}

	public void setThdd_prsnt_tm_prv(String thdd_prsnt_tm_prv){
		this.thdd_prsnt_tm_prv = thdd_prsnt_tm_prv;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPrvdd_prsnt_tm_prv(){
		return this.prvdd_prsnt_tm_prv;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getPrvdd_finish_tm_aft(){
		return this.prvdd_finish_tm_aft;
	}

	public String getPrvdd_finish_tm_prv(){
		return this.prvdd_finish_tm_prv;
	}

	public String getThdd_prsnt_tm_aft(){
		return this.thdd_prsnt_tm_aft;
	}

	public String getThdd_prsnt_tm_prv(){
		return this.thdd_prsnt_tm_prv;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}
}

/* 작성시간 : Fri Jan 27 10:12:03 KST 2012 */