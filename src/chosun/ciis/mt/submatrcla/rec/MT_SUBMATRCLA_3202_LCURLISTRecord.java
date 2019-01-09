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


public class MT_SUBMATRCLA_3202_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String item_nm;
	public String part_cd;
	public String part_nm;
	public String std;
	public String unit;
	public String clam_qunt;
	public String usag;
	public String pay_posb_dt;
	public String fix_qunt;
	public String uprc;
	public String amt;
	public String res_yn;
	public String recp_pers;
	public String nm_korn;
	public String job_cntc_no;
	public String remk;
	public String sub_seq;
	public String seq;
	public String occr_dt;
	public String misno_matr;
	public String acpn_dt;
	public String clam_clsf;
	public String paper_clsf;
	public String dlco_no;
	public String ern;
	public String dlco_nm;
	public String frex_unit;
	public String frex_uprc;
	
	public MT_SUBMATRCLA_3202_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}
	
	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setPay_posb_dt(String pay_posb_dt){
		this.pay_posb_dt = pay_posb_dt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRes_yn(String res_yn){
		this.res_yn = res_yn;
	}

	public void setRecp_pers(String recp_pers){
		this.recp_pers = recp_pers;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setJob_cntc_no(String job_cntc_no){
		this.job_cntc_no = job_cntc_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setMisno_matr(String misno_matr){
		this.misno_matr = misno_matr;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setClam_clsf(String clam_clsf){
		this.clam_clsf = clam_clsf;
	}

	public void setPaper_clsf(String paper_clsf){
		this.paper_clsf = paper_clsf;
	}

	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}
	
	public void setFrex_unit(String frex_unit) {
		this.frex_unit = frex_unit;
	}

	public void setFrex_uprc(String frex_uprc) {
		this.frex_uprc = frex_uprc;
	}

	public void setErn(String ern) {
		this.ern = ern;
	}
	
	public void setDlco_nm(String dlco_nm) {
		this.dlco_nm = dlco_nm;
	}
	
	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getItem_nm(){
		return this.item_nm;
	}
	
	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}
	
	public String getStd(){
		return this.std;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getPay_posb_dt(){
		return this.pay_posb_dt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRes_yn(){
		return this.res_yn;
	}

	public String getRecp_pers(){
		return this.recp_pers;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getJob_cntc_no(){
		return this.job_cntc_no;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getMisno_matr(){
		return this.misno_matr;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getClam_clsf(){
		return this.clam_clsf;
	}

	public String getPaper_clsf(){
		return this.paper_clsf;
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
	
	public String getFrex_unit() {
		return frex_unit;
	}

	public String getFrex_uprc() {
		return frex_uprc;
	}
	
	
}

/* 작성시간 : Tue Mar 10 17:59:16 KST 2015 */