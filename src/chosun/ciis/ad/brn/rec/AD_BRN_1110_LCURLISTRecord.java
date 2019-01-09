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


package chosun.ciis.ad.brn.rec;

import java.sql.*;
import chosun.ciis.ad.brn.dm.*;
import chosun.ciis.ad.brn.ds.*;

/**
 * 
 */


public class AD_BRN_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_stmt_issu_yn;
	public String pubc_dt;
	public String pubc_slip_no;
	public String medi_nm;
	public String sect_cd;
	public String sect_seq;
	public String dn;
	public String cm;
	public String arow;
	public String sect_clas_nm;
	public String sect_nm;
	public String tabl_yn;
	public String slcrg_pers_nm;
	public String mchrg_pers_nm;
	public String dlco_nm;
	public String advt_fee;
	public String vat;
	public String coms_rate;
	public String coms;

	public AD_BRN_1110_LCURLISTRecord(){}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
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

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setArow(String arow){
		this.arow = arow;
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

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setMchrg_pers_nm(String mchrg_pers_nm){
		this.mchrg_pers_nm = mchrg_pers_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setComs_rate(String coms_rate){
		this.coms_rate = coms_rate;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
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

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getArow(){
		return this.arow;
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

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getMchrg_pers_nm(){
		return this.mchrg_pers_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getComs_rate(){
		return this.coms_rate;
	}

	public String getComs(){
		return this.coms;
	}
}

/* 작성시간 : Wed Apr 08 17:27:43 KST 2015 */