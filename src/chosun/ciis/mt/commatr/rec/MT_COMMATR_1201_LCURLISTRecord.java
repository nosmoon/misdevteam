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


public class MT_COMMATR_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String matr_nm;
	public String unit;
	public String purc_uprc;
	public String std_modl;
	public String usag;
	public String chg_pers;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String dstb_rat_cd;
	public String eps_no;
	public String abc_clas;
	public String prt_seq;
	public String daily_rept_yn;
	public String impt_yn;
	public String wste_yn;
	public String wste_dt;
	public String stok_mang_yn;
	public String via_dept_yn;
	public String item_req_mand_yn;
	public String item_req_mt_yn;

	public MT_COMMATR_1201_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setAbc_clas(String abc_clas){
		this.abc_clas = abc_clas;
	}

	public void setPrt_seq(String prt_seq){
		this.prt_seq = prt_seq;
	}

	public void setDaily_rept_yn(String daily_rept_yn){
		this.daily_rept_yn = daily_rept_yn;
	}

	public void setImpt_yn(String impt_yn){
		this.impt_yn = impt_yn;
	}

	public void setWste_yn(String wste_yn){
		this.wste_yn = wste_yn;
	}

	public void setWste_dt(String wste_dt){
		this.wste_dt = wste_dt;
	}

	public void setStok_mang_yn(String stok_mang_yn){
		this.stok_mang_yn = stok_mang_yn;
	}

	public void setVia_dept_yn(String via_dept_yn){
		this.via_dept_yn = via_dept_yn;
	}

	public void setItem_req_mand_yn(String item_req_mand_yn){
		this.item_req_mand_yn = item_req_mand_yn;
	}

	public void setItem_req_mt_yn(String item_req_mt_yn){
		this.item_req_mt_yn = item_req_mt_yn;
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

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getAbc_clas(){
		return this.abc_clas;
	}

	public String getPrt_seq(){
		return this.prt_seq;
	}

	public String getDaily_rept_yn(){
		return this.daily_rept_yn;
	}

	public String getImpt_yn(){
		return this.impt_yn;
	}

	public String getWste_yn(){
		return this.wste_yn;
	}

	public String getWste_dt(){
		return this.wste_dt;
	}

	public String getStok_mang_yn(){
		return this.stok_mang_yn;
	}

	public String getVia_dept_yn(){
		return this.via_dept_yn;
	}

	public String getItem_req_mand_yn(){
		return this.item_req_mand_yn;
	}

	public String getItem_req_mt_yn(){
		return this.item_req_mt_yn;
	}
}

/* 작성시간 : Fri Mar 20 16:38:20 KST 2009 */