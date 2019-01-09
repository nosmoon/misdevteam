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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_3002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String ern;
	public String presi_nm;
	public String addr;
	public String item;
	public String tel_no;
	public String fax_no;
	public String presi_tel_no_1;
	public String presi_tel_no_2;
	public String presi_email;
	public String presi_prof;
	public String chrg_pers;
	public String chrg_pers_tel_no_1;
	public String chrg_pers_tel_no_2;
	public String chrg_pers_email_1;
	public String trsm_usag_email_yn_1;
	public String chrg_pers_email_2;
	public String trsm_usag_email_yn_2;
	public String chrg_pers_dept;
	public String chrg_pers_prof;
	public String fndt_dt;
	public String cmpy_hmpg;
	public String sale_amt;
	public String mrkt_ocpy_rate;
	public String dlco_pcond;
	public String remk;

	public MT_COMMATR_3002_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setPresi_tel_no_1(String presi_tel_no_1){
		this.presi_tel_no_1 = presi_tel_no_1;
	}

	public void setPresi_tel_no_2(String presi_tel_no_2){
		this.presi_tel_no_2 = presi_tel_no_2;
	}

	public void setPresi_email(String presi_email){
		this.presi_email = presi_email;
	}

	public void setPresi_prof(String presi_prof){
		this.presi_prof = presi_prof;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_tel_no_1(String chrg_pers_tel_no_1){
		this.chrg_pers_tel_no_1 = chrg_pers_tel_no_1;
	}

	public void setChrg_pers_tel_no_2(String chrg_pers_tel_no_2){
		this.chrg_pers_tel_no_2 = chrg_pers_tel_no_2;
	}

	public void setChrg_pers_email_1(String chrg_pers_email_1){
		this.chrg_pers_email_1 = chrg_pers_email_1;
	}

	public void setTrsm_usag_email_yn_1(String trsm_usag_email_yn_1){
		this.trsm_usag_email_yn_1 = trsm_usag_email_yn_1;
	}

	public void setChrg_pers_email_2(String chrg_pers_email_2){
		this.chrg_pers_email_2 = chrg_pers_email_2;
	}

	public void setTrsm_usag_email_yn_2(String trsm_usag_email_yn_2){
		this.trsm_usag_email_yn_2 = trsm_usag_email_yn_2;
	}

	public void setChrg_pers_dept(String chrg_pers_dept){
		this.chrg_pers_dept = chrg_pers_dept;
	}

	public void setChrg_pers_prof(String chrg_pers_prof){
		this.chrg_pers_prof = chrg_pers_prof;
	}

	public void setFndt_dt(String fndt_dt){
		this.fndt_dt = fndt_dt;
	}

	public void setCmpy_hmpg(String cmpy_hmpg){
		this.cmpy_hmpg = cmpy_hmpg;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setMrkt_ocpy_rate(String mrkt_ocpy_rate){
		this.mrkt_ocpy_rate = mrkt_ocpy_rate;
	}

	public void setDlco_pcond(String dlco_pcond){
		this.dlco_pcond = dlco_pcond;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getItem(){
		return this.item;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getPresi_tel_no_1(){
		return this.presi_tel_no_1;
	}

	public String getPresi_tel_no_2(){
		return this.presi_tel_no_2;
	}

	public String getPresi_email(){
		return this.presi_email;
	}

	public String getPresi_prof(){
		return this.presi_prof;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_tel_no_1(){
		return this.chrg_pers_tel_no_1;
	}

	public String getChrg_pers_tel_no_2(){
		return this.chrg_pers_tel_no_2;
	}

	public String getChrg_pers_email_1(){
		return this.chrg_pers_email_1;
	}

	public String getTrsm_usag_email_yn_1(){
		return this.trsm_usag_email_yn_1;
	}

	public String getChrg_pers_email_2(){
		return this.chrg_pers_email_2;
	}

	public String getTrsm_usag_email_yn_2(){
		return this.trsm_usag_email_yn_2;
	}

	public String getChrg_pers_dept(){
		return this.chrg_pers_dept;
	}

	public String getChrg_pers_prof(){
		return this.chrg_pers_prof;
	}

	public String getFndt_dt(){
		return this.fndt_dt;
	}

	public String getCmpy_hmpg(){
		return this.cmpy_hmpg;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getMrkt_ocpy_rate(){
		return this.mrkt_ocpy_rate;
	}

	public String getDlco_pcond(){
		return this.dlco_pcond;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Sat Jul 11 13:16:00 KST 2009 */