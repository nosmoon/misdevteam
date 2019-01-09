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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3014_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String advt_fee_1;
	public String vat_1;
	public String pubc_tot_amt_1;
	public String cnt_1;
	public String advt_fee_2;
	public String vat_2;
	public String pubc_tot_amt_2;
	public String cnt_2;
	public String advt_fee_3;
	public String vat_3;
	public String pubc_tot_amt_3;
	public String cnt_3;
	public String diff_1;
	public String diff_2;
	public String diff_ratio_1;
	public String diff_ratio_2;
	public String max_pubc_dt;

	public AD_PUB_3014_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setAdvt_fee_1(String advt_fee_1){
		this.advt_fee_1 = advt_fee_1;
	}

	public void setVat_1(String vat_1){
		this.vat_1 = vat_1;
	}

	public void setPubc_tot_amt_1(String pubc_tot_amt_1){
		this.pubc_tot_amt_1 = pubc_tot_amt_1;
	}

	public void setCnt_1(String cnt_1){
		this.cnt_1 = cnt_1;
	}

	public void setAdvt_fee_2(String advt_fee_2){
		this.advt_fee_2 = advt_fee_2;
	}

	public void setVat_2(String vat_2){
		this.vat_2 = vat_2;
	}

	public void setPubc_tot_amt_2(String pubc_tot_amt_2){
		this.pubc_tot_amt_2 = pubc_tot_amt_2;
	}

	public void setCnt_2(String cnt_2){
		this.cnt_2 = cnt_2;
	}

	public void setAdvt_fee_3(String advt_fee_3){
		this.advt_fee_3 = advt_fee_3;
	}

	public void setVat_3(String vat_3){
		this.vat_3 = vat_3;
	}

	public void setPubc_tot_amt_3(String pubc_tot_amt_3){
		this.pubc_tot_amt_3 = pubc_tot_amt_3;
	}

	public void setCnt_3(String cnt_3){
		this.cnt_3 = cnt_3;
	}

	public void setDiff_1(String diff_1){
		this.diff_1 = diff_1;
	}

	public void setDiff_2(String diff_2){
		this.diff_2 = diff_2;
	}

	public void setDiff_ratio_1(String diff_ratio_1){
		this.diff_ratio_1 = diff_ratio_1;
	}

	public void setDiff_ratio_2(String diff_ratio_2){
		this.diff_ratio_2 = diff_ratio_2;
	}

	public void setMax_pubc_dt(String max_pubc_dt){
		this.max_pubc_dt = max_pubc_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getAdvt_fee_1(){
		return this.advt_fee_1;
	}

	public String getVat_1(){
		return this.vat_1;
	}

	public String getPubc_tot_amt_1(){
		return this.pubc_tot_amt_1;
	}

	public String getCnt_1(){
		return this.cnt_1;
	}

	public String getAdvt_fee_2(){
		return this.advt_fee_2;
	}

	public String getVat_2(){
		return this.vat_2;
	}

	public String getPubc_tot_amt_2(){
		return this.pubc_tot_amt_2;
	}

	public String getCnt_2(){
		return this.cnt_2;
	}

	public String getAdvt_fee_3(){
		return this.advt_fee_3;
	}

	public String getVat_3(){
		return this.vat_3;
	}

	public String getPubc_tot_amt_3(){
		return this.pubc_tot_amt_3;
	}

	public String getCnt_3(){
		return this.cnt_3;
	}

	public String getDiff_1(){
		return this.diff_1;
	}

	public String getDiff_2(){
		return this.diff_2;
	}

	public String getDiff_ratio_1(){
		return this.diff_ratio_1;
	}

	public String getDiff_ratio_2(){
		return this.diff_ratio_2;
	}

	public String getMax_pubc_dt(){
		return this.max_pubc_dt;
	}
}

/* 작성시간 : Thu Nov 22 17:50:02 KST 2012 */