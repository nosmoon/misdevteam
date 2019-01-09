/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_5610_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String subscrpt_cd;
	public String in_dt;
	public String pub_dt;
	public String out_dt;
	public String subscrpt_gb;
	public String buy_amt;
	public String buyer_info1;
	public String buyer_info2;
	public String buyer_info3;
	public String buyer_info4;
	public String buyer_info5;

	public SS_SLS_EXTN_5610_LCURCOMMLISTRecord(){}

	public void setSubscrpt_cd(String subscrpt_cd){
		this.subscrpt_cd = subscrpt_cd;
	}

	public void setIn_dt(String in_dt){
		this.in_dt = in_dt;
	}

	public void setPub_dt(String pub_dt){
		this.pub_dt = pub_dt;
	}

	public void setOut_dt(String out_dt){
		this.out_dt = out_dt;
	}

	public void setSubscrpt_gb(String subscrpt_gb){
		this.subscrpt_gb = subscrpt_gb;
	}

	public void setBuy_amt(String buy_amt){
		this.buy_amt = buy_amt;
	}

	public void setBuyer_info1(String buyer_info1){
		this.buyer_info1 = buyer_info1;
	}

	public void setBuyer_info2(String buyer_info2){
		this.buyer_info2 = buyer_info2;
	}

	public void setBuyer_info3(String buyer_info3){
		this.buyer_info3 = buyer_info3;
	}

	public void setBuyer_info4(String buyer_info4){
		this.buyer_info4 = buyer_info4;
	}

	public void setBuyer_info5(String buyer_info5){
		this.buyer_info5 = buyer_info5;
	}

	public String getSubscrpt_cd(){
		return this.subscrpt_cd;
	}

	public String getIn_dt(){
		return this.in_dt;
	}

	public String getPub_dt(){
		return this.pub_dt;
	}

	public String getOut_dt(){
		return this.out_dt;
	}

	public String getSubscrpt_gb(){
		return this.subscrpt_gb;
	}

	public String getBuy_amt(){
		return this.buy_amt;
	}

	public String getBuyer_info1(){
		return this.buyer_info1;
	}

	public String getBuyer_info2(){
		return this.buyer_info2;
	}

	public String getBuyer_info3(){
		return this.buyer_info3;
	}

	public String getBuyer_info4(){
		return this.buyer_info4;
	}

	public String getBuyer_info5(){
		return this.buyer_info5;
	}
}

/* 작성시간 : Mon Jan 08 10:03:16 KST 2018 */