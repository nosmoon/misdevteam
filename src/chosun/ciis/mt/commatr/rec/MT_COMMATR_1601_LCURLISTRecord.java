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


public class MT_COMMATR_1601_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String part_cd;
	public String part_nm;
	public String part_dtl_nm;
	public String part_clas1;
	public String part_clas2;
	public String purc_uprc;
	public String std_modl;
	public String unit;
	public String prt_seq;
	public String usag;
	public String purc_info;
	public String barcode;
	public String maker;
	public String use_yn;

	public MT_COMMATR_1601_LCURLISTRecord(){}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setPart_dtl_nm(String part_dtl_nm){
		this.part_dtl_nm = part_dtl_nm;
	}

	public void setPart_clas1(String part_clas1){
		this.part_clas1 = part_clas1;
	}

	public void setPart_clas2(String part_clas2){
		this.part_clas2 = part_clas2;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUnit(String unit){
		this.unit = unit;
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

	public void setBarcode(String barcode){
		this.barcode = barcode;
	}

	public void setMaker(String maker){
		this.maker = maker;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
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

	public String getPart_clas1(){
		return this.part_clas1;
	}

	public String getPart_clas2(){
		return this.part_clas2;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUnit(){
		return this.unit;
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

	public String getBarcode(){
		return this.barcode;
	}

	public String getMaker(){
		return this.maker;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Fri Jan 30 17:37:44 KST 2015 */