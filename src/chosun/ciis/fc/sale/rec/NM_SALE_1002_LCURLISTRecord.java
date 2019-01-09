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


package chosun.ciis.fc.sale.rec;

import java.sql.*;
import chosun.ciis.fc.sale.dm.*;
import chosun.ciis.fc.sale.ds.*;

/**
 * 
 */


public class NM_SALE_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String seq;
	public String sub_seq;
	public String medi_cd;
	public String medi_clsf;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String orgn_dtls_medi_nm;
	public String tms;
	public String uprc;
	public String sale_amt;
	public String divn_per;
	public String suply_amt;
	public String tax_amt;
	public String tot_amt;
	public String rmks;

	public NM_SALE_1002_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setOrgn_dtls_medi_nm(String orgn_dtls_medi_nm){
		this.orgn_dtls_medi_nm = orgn_dtls_medi_nm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDivn_per(String divn_per){
		this.divn_per = divn_per;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setTax_amt(String tax_amt){
		this.tax_amt = tax_amt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getOrgn_dtls_medi_nm(){
		return this.orgn_dtls_medi_nm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDivn_per(){
		return this.divn_per;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getTax_amt(){
		return this.tax_amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getRmks(){
		return this.rmks;
	}
}

/* 작성시간 : Thu Jun 20 14:24:32 KST 2013 */