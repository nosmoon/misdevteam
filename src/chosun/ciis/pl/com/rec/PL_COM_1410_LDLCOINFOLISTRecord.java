/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pl.com.rec;

import java.sql.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */


public class PL_COM_1410_LDLCOINFOLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String dlco_nm;
	public String dlco_abrv_nm;
	public String send_plac_seq;
	public String send_plac_nm;
	public String comn_mang_no;
	public String rptv_flnm;
	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String area;
	public String area_nm;
	public String prv_curr_clsf;
	public String prv_curr_clsf_nm;
	public String tel_no;
	public String ptph_no;
	public String fax_no;
	public String email;
	public String addr;
	public String magz_deal_yn;
	public String sep_book_deal_yn;

	public PL_COM_1410_LDLCOINFOLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setComn_mang_no(String comn_mang_no){
		this.comn_mang_no = comn_mang_no;
	}

	public void setRptv_flnm(String rptv_flnm){
		this.rptv_flnm = rptv_flnm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setArea(String area){
		this.area = area;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setPrv_curr_clsf(String prv_curr_clsf){
		this.prv_curr_clsf = prv_curr_clsf;
	}

	public void setPrv_curr_clsf_nm(String prv_curr_clsf_nm){
		this.prv_curr_clsf_nm = prv_curr_clsf_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setMagz_deal_yn(String magz_deal_yn){
		this.magz_deal_yn = magz_deal_yn;
	}

	public void setSep_book_deal_yn(String sep_book_deal_yn){
		this.sep_book_deal_yn = sep_book_deal_yn;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getComn_mang_no(){
		return this.comn_mang_no;
	}

	public String getRptv_flnm(){
		return this.rptv_flnm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getArea(){
		return this.area;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getPrv_curr_clsf(){
		return this.prv_curr_clsf;
	}

	public String getPrv_curr_clsf_nm(){
		return this.prv_curr_clsf_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getMagz_deal_yn(){
		return this.magz_deal_yn;
	}

	public String getSep_book_deal_yn(){
		return this.sep_book_deal_yn;
	}
}

/* �ۼ��ð� : Thu Mar 26 16:25:38 KST 2009 */