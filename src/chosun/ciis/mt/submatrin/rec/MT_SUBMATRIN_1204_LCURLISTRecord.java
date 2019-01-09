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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1204_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ewh_dt;
	public String purc_clsf;
	public String fac_clsf;
	public String matr_cd;
	public String ewh_qunt;
	public String ewh_unit;
	public String ewh_uprc;
	public String ewh_amt;
	public String use_deptcd;
	public String remk;
	public String owh_dt;
	public String owh_seq;
	public String owh_sub_seq;
	public String incmg_slip_dt;
	public String ewh_budg_cd;
	public String chg_pers;
	public String medi_cd;
	public String medi_ser_no;
	public String bo_item_yn;
	public String matr_nm;
	public String owh_budg_cd;
	public String factcdnm;
	public String bimccdnm;
	public String ern;
	public String dlco_cd;
	public String addr;
	public String dlco_nm;
	public String part_cd;
	public String part_nm;
	public String part_clas1_nm;

	
	
	public MT_SUBMATRIN_1204_LCURLISTRecord(){}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setEwh_unit(String ewh_unit){
		this.ewh_unit = ewh_unit;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setOwh_seq(String owh_seq){
		this.owh_seq = owh_seq;
	}

	public void setOwh_sub_seq(String owh_sub_seq){
		this.owh_sub_seq = owh_sub_seq;
	}

	public void setIncmg_slip_dt(String incmg_slip_dt){
		this.incmg_slip_dt = incmg_slip_dt;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setBo_item_yn(String bo_item_yn){
		this.bo_item_yn = bo_item_yn;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setFactcdnm(String factcdnm){
		this.factcdnm = factcdnm;
	}

	public void setBimccdnm(String bimccdnm){
		this.bimccdnm = bimccdnm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}
	
	public void setPart_cd(String part_cd) {
		this.part_cd = part_cd;
	}
	
	public void setPart_nm(String part_nm) {
		this.part_nm = part_nm;
	}
	
	public void setPart_clas1_nm(String part_clas1_nm) {
		this.part_clas1_nm = part_clas1_nm;
	}
	
	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_unit(){
		return this.ewh_unit;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getOwh_seq(){
		return this.owh_seq;
	}

	public String getOwh_sub_seq(){
		return this.owh_sub_seq;
	}

	public String getIncmg_slip_dt(){
		return this.incmg_slip_dt;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getBo_item_yn(){
		return this.bo_item_yn;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getFactcdnm(){
		return this.factcdnm;
	}

	public String getBimccdnm(){
		return this.bimccdnm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPart_cd() {
		return part_cd;
	}

	public String getPart_nm() {
		return part_nm;
	}
	
	public String getPart_clas1_nm() {
		return part_clas1_nm;
	}

}

/* 작성시간 : Fri Apr 10 11:40:18 KST 2009 */