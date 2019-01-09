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


public class AD_NMD_4070_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_stmt_issu_yn;
	public String occr_dt;
	public String chpn_slip_no;
	public String readr_nm;
	public String read_stat;
	public String tax_clsf;
	public String advt_yn;
	public String read_fr_dt;
	public String stplt_time;
	public String sale_amt;
	public String lftvr_amt;
	public String suspns_dt;
	public String refn_time;
	public String refn_amt;
	public String hndl_clsf;
	public String dlco_nm;
	public String dlco_no;
	public String agn;
	public String fee_rate;
	public String fee;
	public String rcpm_clsf;
	public String tot_rcpm_amt;
	public String unclct_amt;
	public String clos_stat;
	public String extn_no;
	public String grp_id;
	public String id;

	public AD_NMD_4070_LCURLISTRecord(){}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setChpn_slip_no(String chpn_slip_no){
		this.chpn_slip_no = chpn_slip_no;
	}

	public void setReadr_nm(String readr_nm){
		this.readr_nm = readr_nm;
	}

	public void setRead_stat(String read_stat){
		this.read_stat = read_stat;
	}

	public void setTax_clsf(String tax_clsf){
		this.tax_clsf = tax_clsf;
	}

	public void setAdvt_yn(String advt_yn){
		this.advt_yn = advt_yn;
	}

	public void setRead_fr_dt(String read_fr_dt){
		this.read_fr_dt = read_fr_dt;
	}

	public void setStplt_time(String stplt_time){
		this.stplt_time = stplt_time;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setLftvr_amt(String lftvr_amt){
		this.lftvr_amt = lftvr_amt;
	}

	public void setSuspns_dt(String suspns_dt){
		this.suspns_dt = suspns_dt;
	}

	public void setRefn_time(String refn_time){
		this.refn_time = refn_time;
	}

	public void setRefn_amt(String refn_amt){
		this.refn_amt = refn_amt;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setTot_rcpm_amt(String tot_rcpm_amt){
		this.tot_rcpm_amt = tot_rcpm_amt;
	}

	public void setUnclct_amt(String unclct_amt){
		this.unclct_amt = unclct_amt;
	}

	public void setClos_stat(String clos_stat){
		this.clos_stat = clos_stat;
	}

	public void setExtn_no(String extn_no){
		this.extn_no = extn_no;
	}

	public void setGrp_id(String grp_id){
		this.grp_id = grp_id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getChpn_slip_no(){
		return this.chpn_slip_no;
	}

	public String getReadr_nm(){
		return this.readr_nm;
	}

	public String getRead_stat(){
		return this.read_stat;
	}

	public String getTax_clsf(){
		return this.tax_clsf;
	}

	public String getAdvt_yn(){
		return this.advt_yn;
	}

	public String getRead_fr_dt(){
		return this.read_fr_dt;
	}

	public String getStplt_time(){
		return this.stplt_time;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getLftvr_amt(){
		return this.lftvr_amt;
	}

	public String getSuspns_dt(){
		return this.suspns_dt;
	}

	public String getRefn_time(){
		return this.refn_time;
	}

	public String getRefn_amt(){
		return this.refn_amt;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getFee(){
		return this.fee;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getTot_rcpm_amt(){
		return this.tot_rcpm_amt;
	}

	public String getUnclct_amt(){
		return this.unclct_amt;
	}

	public String getClos_stat(){
		return this.clos_stat;
	}

	public String getExtn_no(){
		return this.extn_no;
	}

	public String getGrp_id(){
		return this.grp_id;
	}

	public String getId(){
		return this.id;
	}
}

/* 작성시간 : Thu May 08 14:58:31 KST 2014 */