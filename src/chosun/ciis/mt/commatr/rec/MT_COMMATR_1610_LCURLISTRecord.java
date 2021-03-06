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


public class MT_COMMATR_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String part_cd;
	public String part_nm;
	public String part_dtl_nm;
	public String barcode;
	public String maker;
	public String std_modl;
	public String prt_seq;
	public String usag;
	public String purc_info;
	public String use_yn;
	public String purc_uprc;
	public String chg_pers;
	public String chg_dt_tm;
	public String stok_10;
	public String stok_22;
	public String stok_25;

	public MT_COMMATR_1610_LCURLISTRecord(){}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_dtl_nm(String part_dtl_nm){
		this.part_dtl_nm = part_dtl_nm;
	}

	public void setBarcode(String barcode){
		this.barcode = barcode;
	}

	public void setMaker(String maker){
		this.maker = maker;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setPrt_seq(String prt_seq){
		this.prt_seq = prt_seq;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setPurc_info(String purc_info){
		this.purc_info = purc_info;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setStok_10(String stok_10){
		this.stok_10 = stok_10;
	}

	public void setStok_22(String stok_22){
		this.stok_22 = stok_22;
	}

	public void setStok_25(String stok_25){
		this.stok_25 = stok_25;
	}
	
	public void setPurc_uprc(String purc_uprc) {
		this.purc_uprc = purc_uprc;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getPart_dtl_nm(){
		return this.part_dtl_nm;
	}

	public String getBarcode(){
		return this.barcode;
	}

	public String getMaker(){
		return this.maker;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getPrt_seq(){
		return this.prt_seq;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getPurc_info(){
		return this.purc_info;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getPurc_uprc() {
		return purc_uprc;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getStok_10(){
		return this.stok_10;
	}

	public String getStok_22(){
		return this.stok_22;
	}

	public String getStok_25(){
		return this.stok_25;
	}
}

/* 작성시간 : Wed Feb 04 15:16:03 KST 2015 */