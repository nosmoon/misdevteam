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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String erplace_addr;
	public String mc_amt_01;
	public String mc_vat_01;
	public String mc_amt_02;
	public String mc_vat_02;
	public String mi_amt_01;
	public String mi_vat_01;
	public String mi_amt_02;
	public String mi_vat_02;
	public String me_vat_01;
	public String me_vat_02;
	public String me_vat_03;
	public String mt_amt_01;
	public String mt_amt_02;

	public FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setErplace_addr(String erplace_addr){
		this.erplace_addr = erplace_addr;
	}

	public void setMc_amt_01(String mc_amt_01){
		this.mc_amt_01 = mc_amt_01;
	}

	public void setMc_vat_01(String mc_vat_01){
		this.mc_vat_01 = mc_vat_01;
	}

	public void setMc_amt_02(String mc_amt_02){
		this.mc_amt_02 = mc_amt_02;
	}

	public void setMc_vat_02(String mc_vat_02){
		this.mc_vat_02 = mc_vat_02;
	}

	public void setMi_amt_01(String mi_amt_01){
		this.mi_amt_01 = mi_amt_01;
	}

	public void setMi_vat_01(String mi_vat_01){
		this.mi_vat_01 = mi_vat_01;
	}

	public void setMi_amt_02(String mi_amt_02){
		this.mi_amt_02 = mi_amt_02;
	}

	public void setMi_vat_02(String mi_vat_02){
		this.mi_vat_02 = mi_vat_02;
	}

	public void setMe_vat_01(String me_vat_01){
		this.me_vat_01 = me_vat_01;
	}

	public void setMe_vat_02(String me_vat_02){
		this.me_vat_02 = me_vat_02;
	}

	public void setMe_vat_03(String me_vat_03){
		this.me_vat_03 = me_vat_03;
	}

	public void setMt_amt_01(String mt_amt_01){
		this.mt_amt_01 = mt_amt_01;
	}

	public void setMt_amt_02(String mt_amt_02){
		this.mt_amt_02 = mt_amt_02;
	}

	public String getErn(){
		return this.ern;
	}

	public String getErplace_addr(){
		return this.erplace_addr;
	}

	public String getMc_amt_01(){
		return this.mc_amt_01;
	}

	public String getMc_vat_01(){
		return this.mc_vat_01;
	}

	public String getMc_amt_02(){
		return this.mc_amt_02;
	}

	public String getMc_vat_02(){
		return this.mc_vat_02;
	}

	public String getMi_amt_01(){
		return this.mi_amt_01;
	}

	public String getMi_vat_01(){
		return this.mi_vat_01;
	}

	public String getMi_amt_02(){
		return this.mi_amt_02;
	}

	public String getMi_vat_02(){
		return this.mi_vat_02;
	}

	public String getMe_vat_01(){
		return this.me_vat_01;
	}

	public String getMe_vat_02(){
		return this.me_vat_02;
	}

	public String getMe_vat_03(){
		return this.me_vat_03;
	}

	public String getMt_amt_01(){
		return this.mt_amt_01;
	}

	public String getMt_amt_02(){
		return this.mt_amt_02;
	}
}

/* 작성시간 : Mon Jun 30 19:38:33 KST 2014 */