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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_2001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dspch_enpr_main_clsf;
	public String presi_flnm;
	public String eps_no;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String servcost_calc_rate;
	public String mang_liab_pers_flnm;
	public String mang_liab_pers_prn;
	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;

	public HD_SALY_2001_LCURLISTRecord(){}

	public void setDspch_enpr_main_clsf(String dspch_enpr_main_clsf){
		this.dspch_enpr_main_clsf = dspch_enpr_main_clsf;
	}

	public void setPresi_flnm(String presi_flnm){
		this.presi_flnm = presi_flnm;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setServcost_calc_rate(String servcost_calc_rate){
		this.servcost_calc_rate = servcost_calc_rate;
	}

	public void setMang_liab_pers_flnm(String mang_liab_pers_flnm){
		this.mang_liab_pers_flnm = mang_liab_pers_flnm;
	}

	public void setMang_liab_pers_prn(String mang_liab_pers_prn){
		this.mang_liab_pers_prn = mang_liab_pers_prn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getDspch_enpr_main_clsf(){
		return this.dspch_enpr_main_clsf;
	}

	public String getPresi_flnm(){
		return this.presi_flnm;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getServcost_calc_rate(){
		return this.servcost_calc_rate;
	}

	public String getMang_liab_pers_flnm(){
		return this.mang_liab_pers_flnm;
	}

	public String getMang_liab_pers_prn(){
		return this.mang_liab_pers_prn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Sat Jul 25 13:35:06 KST 2009 */