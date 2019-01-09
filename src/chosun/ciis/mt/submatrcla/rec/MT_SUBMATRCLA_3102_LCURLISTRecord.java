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


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_3102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String part_cd;
	public String part_nm;
	public String std_modl;
	public String unit;
	public String usag;
	public String purc_uprc;
	public String clam_qunt;
	public String fix_qunt;
	public String amt;
	public String res_yn;
	public String buy_proc_stat;
	public String sub_seq;
	public String dlco_no;
	public String ern;
	public String dlco_nm;
	public String part_clas1;
	public String part_clas1_nm;
	public String frex_unit;
	
	public MT_SUBMATRCLA_3102_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}
	
	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRes_yn(String res_yn){
		this.res_yn = res_yn;
	}

	public void setBuy_proc_stat(String buy_proc_stat){
		this.buy_proc_stat = buy_proc_stat;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern) {
		this.ern = ern;
	}
	
	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}
	
	public void setPart_clas1(String part_clas1) {
		this.part_clas1 = part_clas1;
	}
	
	public void setPart_clas1_nm(String part_clas1_nm) {
		this.part_clas1_nm = part_clas1_nm;
	}

	public void setFrex_unit(String frex_unit) {
		this.frex_unit = frex_unit;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRes_yn(){
		return this.res_yn;
	}

	public String getBuy_proc_stat(){
		return this.buy_proc_stat;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getDlco_no() {
		return dlco_no;
	}

	public String getErn() {
		return ern;
	}
	
	public String getDlco_nm() {
		return dlco_nm;
	}
	
	public String getPart_clas1() {
		return part_clas1;
	}

	public String getPart_clas1_nm() {
		return part_clas1_nm;
	}

	public String getFrex_unit() {
		return frex_unit;
	}

}

/* 작성시간 : Wed Jul 08 19:54:28 KST 2009 */