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


public class MT_SUBMATROUT_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_seq;
	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String hjg_cnt;
	public String hjg_amt;
	public String owh_dt;
	public String fac_clsf;
	public String owh_dept;
	public String owh_budg_cd;
	public String bccgacctcd;
	public String igacctcdnm;
	public String owh_qunt;
	public String owh_unit;
	public String owh_uprc;
	public String owh_amt;
	public String medi_cd;
	public String medi_ser_no;
	public String remk;
	public String ewh_budg_cd;
	public String bcigaccntcd;
	public String bcigaccntcdnm;
	public String ewh_dt;
	public String ewh_seq;
	public String ewh_sub_seq;
	public String owh_budg_cd_nm;
	public String curdd_ewh_qunt;
	public String plan_dt;
	public String prv_cnt;
	public String owh_type;
	public String mm_qunt;

	public MT_SUBMATROUT_1104_LCURLISTRecord(){}

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

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setOwh_dept(String owh_dept){
		this.owh_dept = owh_dept;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setBccgacctcd(String bccgacctcd){
		this.bccgacctcd = bccgacctcd;
	}

	public void setIgacctcdnm(String igacctcdnm){
		this.igacctcdnm = igacctcdnm;
	}

	public void setOwh_qunt(String owh_qunt){
		this.owh_qunt = owh_qunt;
	}

	public void setOwh_unit(String owh_unit){
		this.owh_unit = owh_unit;
	}

	public void setOwh_uprc(String owh_uprc){
		this.owh_uprc = owh_uprc;
	}

	public void setOwh_amt(String owh_amt){
		this.owh_amt = owh_amt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setBcigaccntcd(String bcigaccntcd){
		this.bcigaccntcd = bcigaccntcd;
	}

	public void setBcigaccntcdnm(String bcigaccntcdnm){
		this.bcigaccntcdnm = bcigaccntcdnm;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_seq(String ewh_seq){
		this.ewh_seq = ewh_seq;
	}

	public void setEwh_sub_seq(String ewh_sub_seq){
		this.ewh_sub_seq = ewh_sub_seq;
	}

	public void setOwh_budg_cd_nm(String owh_budg_cd_nm){
		this.owh_budg_cd_nm = owh_budg_cd_nm;
	}

	public void setCurdd_ewh_qunt(String curdd_ewh_qunt){
		this.curdd_ewh_qunt = curdd_ewh_qunt;
	}

	public void setPlan_dt(String plan_dt){
		this.plan_dt = plan_dt;
	}

	public void setPrv_cnt(String prv_cnt){
		this.prv_cnt = prv_cnt;
	}

	public void setOwh_type(String owh_type){
		this.owh_type = owh_type;
	}

	public void setMm_qunt(String mm_qunt){
		this.mm_qunt = mm_qunt;
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

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getOwh_dept(){
		return this.owh_dept;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getBccgacctcd(){
		return this.bccgacctcd;
	}

	public String getIgacctcdnm(){
		return this.igacctcdnm;
	}

	public String getOwh_qunt(){
		return this.owh_qunt;
	}

	public String getOwh_unit(){
		return this.owh_unit;
	}

	public String getOwh_uprc(){
		return this.owh_uprc;
	}

	public String getOwh_amt(){
		return this.owh_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getBcigaccntcd(){
		return this.bcigaccntcd;
	}

	public String getBcigaccntcdnm(){
		return this.bcigaccntcdnm;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_seq(){
		return this.ewh_seq;
	}

	public String getEwh_sub_seq(){
		return this.ewh_sub_seq;
	}

	public String getOwh_budg_cd_nm(){
		return this.owh_budg_cd_nm;
	}

	public String getCurdd_ewh_qunt(){
		return this.curdd_ewh_qunt;
	}

	public String getPlan_dt(){
		return this.plan_dt;
	}

	public String getPrv_cnt(){
		return this.prv_cnt;
	}

	public String getOwh_type(){
		return this.owh_type;
	}

	public String getMm_qunt(){
		return this.mm_qunt;
	}
}

/* 작성시간 : Tue Oct 06 15:55:37 KST 2009 */