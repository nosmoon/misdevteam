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


public class AD_PUB_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_stmt_issu_yn;
	public String pubc_dt;
	public String pubc_side;
	public String pubc_slip_no;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_seq;
	public String sect_clas_nm;
	public String sect_nm;
	public String tabl_yn;
	public String chro_clsf;
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
	public String elec_tax_stmt_yn;
	public String advt_clas;
	public String pubc_cnt;
	public String arow;
	public String cm;
	public String dn;
	public String uprc;
	public String coms_rate;
	public String coms;
	public String pubc_clsf_nm;
	public String edt_clsf;
	public String indt_clsf;
	public String indt_clsf_nm;
	public String grp_cmpy_nm;
	public String advt_cont;
	public String side_cd;
	public String ern;

	public AD_PUB_1810_LCURLISTRecord(){}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

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

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setSect_clas_nm(String sect_clas_nm){
		this.sect_clas_nm = sect_clas_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setTabl_yn(String tabl_yn){
		this.tabl_yn = tabl_yn;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
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

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setAdvt_clas(String advt_clas){
		this.advt_clas = advt_clas;
	}

	public void setPubc_cnt(String pubc_cnt){
		this.pubc_cnt = pubc_cnt;
	}

	public void setArow(String arow){
		this.arow = arow;
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

	public void setComs_rate(String coms_rate){
		this.coms_rate = coms_rate;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setPubc_clsf_nm(String pubc_clsf_nm){
		this.pubc_clsf_nm = pubc_clsf_nm;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setIndt_clsf(String indt_clsf){
		this.indt_clsf = indt_clsf;
	}

	public void setIndt_clsf_nm(String indt_clsf_nm){
		this.indt_clsf_nm = indt_clsf_nm;
	}

	public void setGrp_cmpy_nm(String grp_cmpy_nm){
		this.grp_cmpy_nm = grp_cmpy_nm;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setSide_cd(String side_cd){
		this.side_cd = side_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
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

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getSect_clas_nm(){
		return this.sect_clas_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getTabl_yn(){
		return this.tabl_yn;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
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

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getAdvt_clas(){
		return this.advt_clas;
	}

	public String getPubc_cnt(){
		return this.pubc_cnt;
	}

	public String getArow(){
		return this.arow;
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

	public String getComs_rate(){
		return this.coms_rate;
	}

	public String getComs(){
		return this.coms;
	}

	public String getPubc_clsf_nm(){
		return this.pubc_clsf_nm;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getIndt_clsf(){
		return this.indt_clsf;
	}

	public String getIndt_clsf_nm(){
		return this.indt_clsf_nm;
	}

	public String getGrp_cmpy_nm(){
		return this.grp_cmpy_nm;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getSide_cd(){
		return this.side_cd;
	}

	public String getErn(){
		return this.ern;
	}
}

/* 작성시간 : Mon Jan 16 10:12:32 KST 2017 */