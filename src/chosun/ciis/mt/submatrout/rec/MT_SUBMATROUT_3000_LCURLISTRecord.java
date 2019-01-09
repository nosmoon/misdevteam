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


public class MT_SUBMATROUT_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sub_seq;
	public String matr_cd;
	public String item_nm;
	public String std_modl;
	public String unit;
	public String ordr_qunt;
	public String ordr_uprc;
	public String ordr_amt;
	public String ordr_req_dd;
	public String remk_ar;

	public MT_SUBMATROUT_3000_LCURLISTRecord(){}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setOrdr_qunt(String ordr_qunt){
		this.ordr_qunt = ordr_qunt;
	}

	public void setOrdr_uprc(String ordr_uprc){
		this.ordr_uprc = ordr_uprc;
	}

	public void setOrdr_amt(String ordr_amt){
		this.ordr_amt = ordr_amt;
	}

	public void setOrdr_req_dd(String ordr_req_dd){
		this.ordr_req_dd = ordr_req_dd;
	}

	public void setRemk_ar(String remk_ar){
		this.remk_ar = remk_ar;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getOrdr_qunt(){
		return this.ordr_qunt;
	}

	public String getOrdr_uprc(){
		return this.ordr_uprc;
	}

	public String getOrdr_amt(){
		return this.ordr_amt;
	}

	public String getOrdr_req_dd(){
		return this.ordr_req_dd;
	}

	public String getRemk_ar(){
		return this.remk_ar;
	}
}

/* 작성시간 : Fri May 08 11:43:23 KST 2009 */