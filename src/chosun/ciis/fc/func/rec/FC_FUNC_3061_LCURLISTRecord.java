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


public class FC_FUNC_3061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dd;
	public String newspap_cash;
	public String newspap_bill_90;
	public String newspap_bill_120;
	public String newspap_bill_125;
	public String publis_cash;
	public String publis_bill_90;
	public String publis_bill_120;
	public String publis_bill_125;
	public String newspap_sale;
	public String publis_sale;
	public String lent_amt;
	public String etc_amt;

	public FC_FUNC_3061_LCURLISTRecord(){}

	public void setRcpm_dd(String rcpm_dd){
		this.rcpm_dd = rcpm_dd;
	}

	public void setNewspap_cash(String newspap_cash){
		this.newspap_cash = newspap_cash;
	}

	public void setNewspap_bill_90(String newspap_bill_90){
		this.newspap_bill_90 = newspap_bill_90;
	}

	public void setNewspap_bill_120(String newspap_bill_120){
		this.newspap_bill_120 = newspap_bill_120;
	}

	public void setNewspap_bill_125(String newspap_bill_125){
		this.newspap_bill_125 = newspap_bill_125;
	}

	public void setPublis_cash(String publis_cash){
		this.publis_cash = publis_cash;
	}

	public void setPublis_bill_90(String publis_bill_90){
		this.publis_bill_90 = publis_bill_90;
	}

	public void setPublis_bill_120(String publis_bill_120){
		this.publis_bill_120 = publis_bill_120;
	}

	public void setPublis_bill_125(String publis_bill_125){
		this.publis_bill_125 = publis_bill_125;
	}

	public void setNewspap_sale(String newspap_sale){
		this.newspap_sale = newspap_sale;
	}

	public void setPublis_sale(String publis_sale){
		this.publis_sale = publis_sale;
	}

	public void setLent_amt(String lent_amt){
		this.lent_amt = lent_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
	}

	public String getRcpm_dd(){
		return this.rcpm_dd;
	}

	public String getNewspap_cash(){
		return this.newspap_cash;
	}

	public String getNewspap_bill_90(){
		return this.newspap_bill_90;
	}

	public String getNewspap_bill_120(){
		return this.newspap_bill_120;
	}

	public String getNewspap_bill_125(){
		return this.newspap_bill_125;
	}

	public String getPublis_cash(){
		return this.publis_cash;
	}

	public String getPublis_bill_90(){
		return this.publis_bill_90;
	}

	public String getPublis_bill_120(){
		return this.publis_bill_120;
	}

	public String getPublis_bill_125(){
		return this.publis_bill_125;
	}

	public String getNewspap_sale(){
		return this.newspap_sale;
	}

	public String getPublis_sale(){
		return this.publis_sale;
	}

	public String getLent_amt(){
		return this.lent_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}
}

/* 작성시간 : Tue Mar 31 16:32:04 KST 2009 */