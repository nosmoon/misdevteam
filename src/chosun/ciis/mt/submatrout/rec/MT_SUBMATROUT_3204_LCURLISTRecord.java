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


public class MT_SUBMATROUT_3204_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ordr_dt;
	public String dlco_no;
	public String dlco_nm;
	public String ordr_per;
	public String ordr_per_nm;
	public String ordr_per_email;
	public String dlvs_dt;
	public String dlvs_fac_cd;
	public String dlco_per;
	public String dlco_telno;
	public String dlco_email;
	public String amt_pay_mthd;
	public String remk;
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

	public MT_SUBMATROUT_3204_LCURLISTRecord(){}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setOrdr_per(String ordr_per){
		this.ordr_per = ordr_per;
	}

	public void setOrdr_per_nm(String ordr_per_nm){
		this.ordr_per_nm = ordr_per_nm;
	}

	public void setOrdr_per_email(String ordr_per_email){
		this.ordr_per_email = ordr_per_email;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setDlvs_fac_cd(String dlvs_fac_cd){
		this.dlvs_fac_cd = dlvs_fac_cd;
	}

	public void setDlco_per(String dlco_per){
		this.dlco_per = dlco_per;
	}

	public void setDlco_telno(String dlco_telno){
		this.dlco_telno = dlco_telno;
	}

	public void setDlco_email(String dlco_email){
		this.dlco_email = dlco_email;
	}

	public void setAmt_pay_mthd(String amt_pay_mthd){
		this.amt_pay_mthd = amt_pay_mthd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

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

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getOrdr_per(){
		return this.ordr_per;
	}

	public String getOrdr_per_nm(){
		return this.ordr_per_nm;
	}

	public String getOrdr_per_email(){
		return this.ordr_per_email;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getDlvs_fac_cd(){
		return this.dlvs_fac_cd;
	}

	public String getDlco_per(){
		return this.dlco_per;
	}

	public String getDlco_telno(){
		return this.dlco_telno;
	}

	public String getDlco_email(){
		return this.dlco_email;
	}

	public String getAmt_pay_mthd(){
		return this.amt_pay_mthd;
	}

	public String getRemk(){
		return this.remk;
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

/* 작성시간 : Fri May 08 13:39:15 KST 2009 */