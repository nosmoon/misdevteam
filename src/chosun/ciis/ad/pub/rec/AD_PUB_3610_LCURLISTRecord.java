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


public class AD_PUB_3610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String pubc_side;
	public String pubc_slip_no;
	public String medi_cd;
	public String medi_nm;
	public String slcrg_nm;
	public String mchrg_nm;
	public String cslcrg_nm;
	public String dlco_nm;
	public String agn;
	public String hndl_plac_nm;
	public String advt_fee;
	public String vat;
	public String tot_rcpm_amt;
	public String misu_tot_amt;
	public String fee;
	public String cm;
	public String dn;
	public String uprc;
	public String coms;

	public AD_PUB_3610_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSlcrg_nm(String slcrg_nm){
		this.slcrg_nm = slcrg_nm;
	}

	public void setMchrg_nm(String mchrg_nm){
		this.mchrg_nm = mchrg_nm;
	}

	public void setCslcrg_nm(String cslcrg_nm){
		this.cslcrg_nm = cslcrg_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setHndl_plac_nm(String hndl_plac_nm){
		this.hndl_plac_nm = hndl_plac_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setTot_rcpm_amt(String tot_rcpm_amt){
		this.tot_rcpm_amt = tot_rcpm_amt;
	}

	public void setMisu_tot_amt(String misu_tot_amt){
		this.misu_tot_amt = misu_tot_amt;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}

	public String getMchrg_nm(){
		return this.mchrg_nm;
	}

	public String getCslcrg_nm(){
		return this.cslcrg_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getHndl_plac_nm(){
		return this.hndl_plac_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getTot_rcpm_amt(){
		return this.tot_rcpm_amt;
	}

	public String getMisu_tot_amt(){
		return this.misu_tot_amt;
	}

	public String getFee(){
		return this.fee;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getComs(){
		return this.coms;
	}
}

/* 작성시간 : Mon Mar 02 14:07:44 KST 2015 */