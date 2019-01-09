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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_4100_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clam_dt;
	public String use_dt;
	public String car_no;
	public String cmpy_mang_nm;
	public String clam_item_kind;
	public String item_nm;
	public String oil_clsf;
	public int unit_prc;
	public int qunt;
	public int clam_amt;
	public String dlco;
	public String dlco_nm;
	public String remk;
	public String occr_dt;
	public String seq;
	public String clos_dt;
	public String itemclam_dt;
	public String itemclam_seq;
	public String itemclam_sub_seq;
	public String clam_yn;

	public MT_ETCCAR_4100_LCURLIST1Record(){}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setClam_item_kind(String clam_item_kind){
		this.clam_item_kind = clam_item_kind;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setOil_clsf(String oil_clsf){
		this.oil_clsf = oil_clsf;
	}

	public void setUnit_prc(int unit_prc){
		this.unit_prc = unit_prc;
	}

	public void setQunt(int qunt){
		this.qunt = qunt;
	}

	public void setClam_amt(int clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setDlco(String dlco){
		this.dlco = dlco;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setItemclam_dt(String itemclam_dt){
		this.itemclam_dt = itemclam_dt;
	}

	public void setItemclam_seq(String itemclam_seq){
		this.itemclam_seq = itemclam_seq;
	}

	public void setItemclam_sub_seq(String itemclam_sub_seq){
		this.itemclam_sub_seq = itemclam_sub_seq;
	}

	public void setClam_yn(String clam_yn){
		this.clam_yn = clam_yn;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getClam_item_kind(){
		return this.clam_item_kind;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getOil_clsf(){
		return this.oil_clsf;
	}

	public int getUnit_prc(){
		return this.unit_prc;
	}

	public int getQunt(){
		return this.qunt;
	}

	public int getClam_amt(){
		return this.clam_amt;
	}

	public String getDlco(){
		return this.dlco;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getItemclam_dt(){
		return this.itemclam_dt;
	}

	public String getItemclam_seq(){
		return this.itemclam_seq;
	}

	public String getItemclam_sub_seq(){
		return this.itemclam_sub_seq;
	}

	public String getClam_yn(){
		return this.clam_yn;
	}
}

/* 작성시간 : Thu May 24 10:12:55 KST 2012 */