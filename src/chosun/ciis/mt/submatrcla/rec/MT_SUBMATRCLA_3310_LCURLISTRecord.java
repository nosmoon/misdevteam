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


public class MT_SUBMATRCLA_3310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String item_nm;
	public String part_cd;
	public String part_nm;
	public String part_clas1_nm;
	public String part_clas2_nm;
	public String std;
	public String uprc;
	public String clam_qunt;
	public String fix_qunt;
	public String unit;
	public String amt;
	public String usag;
	public String dept_cd;
	public String clam_actu_cd;
	public String res_yn;
	public String acpn_dt;
	public String via_dept_cnfm_yn;
	public String job_cntc_no;
	public String buy_proc_stat;
	public String remk;
	public String dlco_no;
	public String ern;
	public String dlco_nm;
	
	public MT_SUBMATRCLA_3310_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
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

	public void setPart_clas1_nm(String part_clas1_nm){
		this.part_clas1_nm = part_clas1_nm;
	}

	public void setPart_clas2_nm(String part_clas2_nm){
		this.part_clas2_nm = part_clas2_nm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setClam_actu_cd(String clam_actu_cd){
		this.clam_actu_cd = clam_actu_cd;
	}

	public void setRes_yn(String res_yn){
		this.res_yn = res_yn;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setVia_dept_cnfm_yn(String via_dept_cnfm_yn){
		this.via_dept_cnfm_yn = via_dept_cnfm_yn;
	}

	public void setJob_cntc_no(String job_cntc_no){
		this.job_cntc_no = job_cntc_no;
	}

	public void setBuy_proc_stat(String buy_proc_stat){
		this.buy_proc_stat = buy_proc_stat;
	}

	public void setRemk(String remk){
		this.remk = remk;
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
	
	public String getOccr_dt(){
		return this.occr_dt;
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

	public String getPart_clas1_nm(){
		return this.part_clas1_nm;
	}

	public String getPart_clas2_nm(){
		return this.part_clas2_nm;
	}

	public String getStd(){
		return this.std;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getClam_actu_cd(){
		return this.clam_actu_cd;
	}

	public String getRes_yn(){
		return this.res_yn;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getVia_dept_cnfm_yn(){
		return this.via_dept_cnfm_yn;
	}

	public String getJob_cntc_no(){
		return this.job_cntc_no;
	}

	public String getBuy_proc_stat(){
		return this.buy_proc_stat;
	}

	public String getRemk(){
		return this.remk;
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

}

/* 작성시간 : Tue Mar 17 14:44:27 KST 2015 */