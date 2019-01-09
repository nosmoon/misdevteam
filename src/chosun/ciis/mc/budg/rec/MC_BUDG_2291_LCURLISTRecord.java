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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2291_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String buseonm;
	public String buseocd;
	public String hsanm;
	public String hsacd;
	public String brnm;
	public String brcd;
	public String budg_cd;
	public String yscdnm;
	public String budg_yymm;
	public String medi_cd;
	public String maenm;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String use_dept_cd;
	public String bscdnm;
	public String req_amt_sum;
	public String fix_asin_amt_sum;
	public String fix_asin_qunt;
	public String fix_asin_uprc;
	public String fix_asin_amt;
	public String budg_cndt_amt;
	public String fix_cndt_amt;
	public String rmks;
	public String seq;

	public MC_BUDG_2291_LCURLISTRecord(){}

	public void setBuseonm(String buseonm){
		this.buseonm = buseonm;
	}

	public void setBuseocd(String buseocd){
		this.buseocd = buseocd;
	}

	public void setHsanm(String hsanm){
		this.hsanm = hsanm;
	}

	public void setHsacd(String hsacd){
		this.hsacd = hsacd;
	}

	public void setBrnm(String brnm){
		this.brnm = brnm;
	}

	public void setBrcd(String brcd){
		this.brcd = brcd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setYscdnm(String yscdnm){
		this.yscdnm = yscdnm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMaenm(String maenm){
		this.maenm = maenm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBscdnm(String bscdnm){
		this.bscdnm = bscdnm;
	}

	public void setReq_amt_sum(String req_amt_sum){
		this.req_amt_sum = req_amt_sum;
	}

	public void setFix_asin_amt_sum(String fix_asin_amt_sum){
		this.fix_asin_amt_sum = fix_asin_amt_sum;
	}

	public void setFix_asin_qunt(String fix_asin_qunt){
		this.fix_asin_qunt = fix_asin_qunt;
	}

	public void setFix_asin_uprc(String fix_asin_uprc){
		this.fix_asin_uprc = fix_asin_uprc;
	}

	public void setFix_asin_amt(String fix_asin_amt){
		this.fix_asin_amt = fix_asin_amt;
	}

	public void setBudg_cndt_amt(String budg_cndt_amt){
		this.budg_cndt_amt = budg_cndt_amt;
	}

	public void setFix_cndt_amt(String fix_cndt_amt){
		this.fix_cndt_amt = fix_cndt_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getBuseonm(){
		return this.buseonm;
	}

	public String getBuseocd(){
		return this.buseocd;
	}

	public String getHsanm(){
		return this.hsanm;
	}

	public String getHsacd(){
		return this.hsacd;
	}

	public String getBrnm(){
		return this.brnm;
	}

	public String getBrcd(){
		return this.brcd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getYscdnm(){
		return this.yscdnm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMaenm(){
		return this.maenm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBscdnm(){
		return this.bscdnm;
	}

	public String getReq_amt_sum(){
		return this.req_amt_sum;
	}

	public String getFix_asin_amt_sum(){
		return this.fix_asin_amt_sum;
	}

	public String getFix_asin_qunt(){
		return this.fix_asin_qunt;
	}

	public String getFix_asin_uprc(){
		return this.fix_asin_uprc;
	}

	public String getFix_asin_amt(){
		return this.fix_asin_amt;
	}

	public String getBudg_cndt_amt(){
		return this.budg_cndt_amt;
	}

	public String getFix_cndt_amt(){
		return this.fix_cndt_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Aug 12 16:51:47 KST 2015 */