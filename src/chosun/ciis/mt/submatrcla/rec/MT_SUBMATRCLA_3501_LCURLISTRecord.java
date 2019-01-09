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


public class MT_SUBMATRCLA_3501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String dept_cd;
	public String via_dept;
	public String matr_cd;
	public String matr_nm;
	public String part_cd;
	public String part_nm;
	public String clam_qunt;
	public String fix_qunt;
	public String ewh_qunt;
	public String uprc;
	public String unit;
	public String amt;
	public String std_modl;
	public String acpn_dt;
	public String usag;
	public String stok;
	public String ewh_clsf;
	public String dlco_no;
	public String ern;
	public String dlco_nm;
	public String part_clas1_nm;
	public String maker;

	public MT_SUBMATRCLA_3501_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setVia_dept(String via_dept){
		this.via_dept = via_dept;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setClam_qunt(String clam_qunt){
		this.clam_qunt = clam_qunt;
	}

	public void setFix_qunt(String fix_qunt){
		this.fix_qunt = fix_qunt;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setStd_modl(String std_modl){
		this.std_modl = std_modl;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setStok(String stok){
		this.stok = stok;
	}

	public void setEwh_clsf(String ewh_clsf){
		this.ewh_clsf = ewh_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPart_clas1_nm(String part_clas1_nm){
		this.part_clas1_nm = part_clas1_nm;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getVia_dept(){
		return this.via_dept;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getClam_qunt(){
		return this.clam_qunt;
	}

	public String getFix_qunt(){
		return this.fix_qunt;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getStd_modl(){
		return this.std_modl;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getStok(){
		return this.stok;
	}

	public String getEwh_clsf(){
		return this.ewh_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPart_clas1_nm(){
		return this.part_clas1_nm;
	}

	public String getMaker() {
		return maker;
	}
	
}

/* 작성시간 : Fri Jul 29 18:47:30 KST 2016 */