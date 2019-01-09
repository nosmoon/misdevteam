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


package chosun.ciis.ad.nmd.rec;

import java.sql.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */


public class AD_NMD_4081_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clos_stat;
	public String make_dt;
	public String semuro_no;
	public String tax_stmt_no;
	public String agn;
	public String agn_nm;
	public String fee;
	public String fee_vat;
	public String tot_fee;
	public String tax_item;
	public String medi_cd;
	public String slip_occr_dt;
	public String slip_seq;

	public AD_NMD_4081_LCURLISTRecord(){}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setTax_item(String tax_item){
		this.tax_item = tax_item;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getFee(){
		return this.fee;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getTax_item(){
		return this.tax_item;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Mon Jul 20 20:22:31 KST 2015 */