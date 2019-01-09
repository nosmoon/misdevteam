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


public class MT_SUBMATRIN_1103_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sub_seq;
	public String matr_cd;
	public String matr_nm;
	public String owh_budg_cd;
	public String ewh_unit;
	public String ewh_uprc;
	public String ewh_qunt;
	public String ewh_amt;
	public String ewh_vat;
	public String ewh_budg_cd;
	public String bo_item_yn;
	public String medi_cd;
	public String medi_ser_no;
	public String usedeptcd;
	public String usedeptnm;
	public String remk;
	public String owh_dt;
	public String owh_seq;
	public String owh_sub_seq;
	public String chg_pers;
	public String incmg_dt_tm;
	public String dstb_rat_cd;
	public String mc_flag;
	public String clam_yn;

	public MT_SUBMATRIN_1103_LCURLIST1Record(){}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setEwh_unit(String ewh_unit){
		this.ewh_unit = ewh_unit;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setEwh_vat(String ewh_vat){
		this.ewh_vat = ewh_vat;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setBo_item_yn(String bo_item_yn){
		this.bo_item_yn = bo_item_yn;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setUsedeptcd(String usedeptcd){
		this.usedeptcd = usedeptcd;
	}

	public void setUsedeptnm(String usedeptnm){
		this.usedeptnm = usedeptnm;
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

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setMc_flag(String mc_flag){
		this.mc_flag = mc_flag;
	}

	public void setClam_yn(String clam_yn){
		this.clam_yn = clam_yn;
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

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getEwh_unit(){
		return this.ewh_unit;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getEwh_vat(){
		return this.ewh_vat;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getBo_item_yn(){
		return this.bo_item_yn;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getUsedeptcd(){
		return this.usedeptcd;
	}

	public String getUsedeptnm(){
		return this.usedeptnm;
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

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getMc_flag(){
		return this.mc_flag;
	}
	
	public String getClam_yn(){
		return this.clam_yn;
	}
}

/* 작성시간 : Thu Aug 20 10:57:51 KST 2009 */