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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 *
 */


public class MT_SUBMATROUT_2002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_seq;
	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String hjg_cnt;
	public String hjg_amt;
	public String mov_inout_dt;
	public String mov_out_fac_cd;
	public String mov_out_deptcd;
	public String mov_out_budg_cd;
	public String mov_out_budg_acctcd;
	public String mov_out_budg_cd_nm;
	public String mov_out_budg_acctcdnm;
	public String mov_out_qunt;
	public String mov_out_unit;
	public String mov_out_uprc;
	public String mov_out_amt;
	public String mov_in_fac_cd;
	public String mov_in_deptcd;
	public String mov_in_budg_cd;
	public String mov_in_budg_acctcd;
	public String mov_in_budg_cd_nm;
	public String mov_in_budg_acctcdnm;
	public String mov_in_qunt;
	public String mov_in_unit;
	public String mov_in_uprc;
	public String mov_in_amt;
	public String medi_cd;
	public String medi_cd_nm;
	public String medi_ser_no;
	public String remk;

	public MT_SUBMATROUT_2002_LCURLISTRecord(){}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setHjg_cnt(String hjg_cnt){
		this.hjg_cnt = hjg_cnt;
	}

	public void setHjg_amt(String hjg_amt){
		this.hjg_amt = hjg_amt;
	}

	public void setMov_inout_dt(String mov_inout_dt){
		this.mov_inout_dt = mov_inout_dt;
	}

	public void setMov_out_fac_cd(String mov_out_fac_cd){
		this.mov_out_fac_cd = mov_out_fac_cd;
	}

	public void setMov_out_deptcd(String mov_out_deptcd){
		this.mov_out_deptcd = mov_out_deptcd;
	}

	public void setMov_out_budg_cd(String mov_out_budg_cd){
		this.mov_out_budg_cd = mov_out_budg_cd;
	}

	public void setMov_out_budg_acctcd(String mov_out_budg_acctcd){
		this.mov_out_budg_acctcd = mov_out_budg_acctcd;
	}

	public void setMov_out_budg_cd_nm(String mov_out_budg_cd_nm){
		this.mov_out_budg_cd_nm = mov_out_budg_cd_nm;
	}

	public void setMov_out_budg_acctcdnm(String mov_out_budg_acctcdnm){
		this.mov_out_budg_acctcdnm = mov_out_budg_acctcdnm;
	}

	public void setMov_out_qunt(String mov_out_qunt){
		this.mov_out_qunt = mov_out_qunt;
	}

	public void setMov_out_unit(String mov_out_unit){
		this.mov_out_unit = mov_out_unit;
	}

	public void setMov_out_uprc(String mov_out_uprc){
		this.mov_out_uprc = mov_out_uprc;
	}

	public void setMov_out_amt(String mov_out_amt){
		this.mov_out_amt = mov_out_amt;
	}

	public void setMov_in_fac_cd(String mov_in_fac_cd){
		this.mov_in_fac_cd = mov_in_fac_cd;
	}

	public void setMov_in_deptcd(String mov_in_deptcd){
		this.mov_in_deptcd = mov_in_deptcd;
	}

	public void setMov_in_budg_cd(String mov_in_budg_cd){
		this.mov_in_budg_cd = mov_in_budg_cd;
	}

	public void setMov_in_budg_acctcd(String mov_in_budg_acctcd){
		this.mov_in_budg_acctcd = mov_in_budg_acctcd;
	}

	public void setMov_in_budg_cd_nm(String mov_in_budg_cd_nm){
		this.mov_in_budg_cd_nm = mov_in_budg_cd_nm;
	}

	public void setMov_in_budg_acctcdnm(String mov_in_budg_acctcdnm){
		this.mov_in_budg_acctcdnm = mov_in_budg_acctcdnm;
	}

	public void setMov_in_qunt(String mov_in_qunt){
		this.mov_in_qunt = mov_in_qunt;
	}

	public void setMov_in_unit(String mov_in_unit){
		this.mov_in_unit = mov_in_unit;
	}

	public void setMov_in_uprc(String mov_in_uprc){
		this.mov_in_uprc = mov_in_uprc;
	}

	public void setMov_in_amt(String mov_in_amt){
		this.mov_in_amt = mov_in_amt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getHjg_cnt(){
		return this.hjg_cnt;
	}

	public String getHjg_amt(){
		return this.hjg_amt;
	}

	public String getMov_inout_dt(){
		return this.mov_inout_dt;
	}

	public String getMov_out_fac_cd(){
		return this.mov_out_fac_cd;
	}

	public String getMov_out_deptcd(){
		return this.mov_out_deptcd;
	}

	public String getMov_out_budg_cd(){
		return this.mov_out_budg_cd;
	}

	public String getMov_out_budg_acctcd(){
		return this.mov_out_budg_acctcd;
	}

	public String getMov_out_budg_cd_nm(){
		return this.mov_out_budg_cd_nm;
	}

	public String getMov_out_budg_acctcdnm(){
		return this.mov_out_budg_acctcdnm;
	}

	public String getMov_out_qunt(){
		return this.mov_out_qunt;
	}

	public String getMov_out_unit(){
		return this.mov_out_unit;
	}

	public String getMov_out_uprc(){
		return this.mov_out_uprc;
	}

	public String getMov_out_amt(){
		return this.mov_out_amt;
	}

	public String getMov_in_fac_cd(){
		return this.mov_in_fac_cd;
	}

	public String getMov_in_deptcd(){
		return this.mov_in_deptcd;
	}

	public String getMov_in_budg_cd(){
		return this.mov_in_budg_cd;
	}

	public String getMov_in_budg_acctcd(){
		return this.mov_in_budg_acctcd;
	}

	public String getMov_in_budg_cd_nm(){
		return this.mov_in_budg_cd_nm;
	}

	public String getMov_in_budg_acctcdnm(){
		return this.mov_in_budg_acctcdnm;
	}

	public String getMov_in_qunt(){
		return this.mov_in_qunt;
	}

	public String getMov_in_unit(){
		return this.mov_in_unit;
	}

	public String getMov_in_uprc(){
		return this.mov_in_uprc;
	}

	public String getMov_in_amt(){
		return this.mov_in_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Mar 31 13:58:39 KST 2009 */