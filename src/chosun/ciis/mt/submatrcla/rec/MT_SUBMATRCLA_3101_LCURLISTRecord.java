/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.submatrcla.rec;

import java.sql.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.ds.*;

/**
 * 
 */


public class MT_SUBMATRCLA_3101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String dept_cd_nm;
	public String clam_actu_cd_nm;
	public String aplc_pers_nm;
	public String via_dept_nm;
	public String via_dept_cnfm_yn;
	public String misno_actu;
	public String misno_matr;
	public String clam_clsf;
	public String wcl_issu_yn;
	public String seq;
	public String dept_cd;
	public String clam_actu_cd;
	public String aplc_pers;
	public String via_dept;
	public String remk;
	public String part_clas1;
	public String part_clas2;
	public String part_clas1_nm;
	public String part_clas2_nm;
	public String title;
	

	public MT_SUBMATRCLA_3101_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setClam_actu_cd_nm(String clam_actu_cd_nm){
		this.clam_actu_cd_nm = clam_actu_cd_nm;
	}

	public void setAplc_pers_nm(String aplc_pers_nm){
		this.aplc_pers_nm = aplc_pers_nm;
	}

	public void setVia_dept_nm(String via_dept_nm){
		this.via_dept_nm = via_dept_nm;
	}

	public void setVia_dept_cnfm_yn(String via_dept_cnfm_yn){
		this.via_dept_cnfm_yn = via_dept_cnfm_yn;
	}

	public void setMisno_actu(String misno_actu){
		this.misno_actu = misno_actu;
	}

	public void setMisno_matr(String misno_matr){
		this.misno_matr = misno_matr;
	}

	public void setClam_clsf(String clam_clsf){
		this.clam_clsf = clam_clsf;
	}

	public void setWcl_issu_yn(String wcl_issu_yn){
		this.wcl_issu_yn = wcl_issu_yn;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setClam_actu_cd(String clam_actu_cd){
		this.clam_actu_cd = clam_actu_cd;
	}

	public void setAplc_pers(String aplc_pers){
		this.aplc_pers = aplc_pers;
	}

	public void setVia_dept(String via_dept){
		this.via_dept = via_dept;
	}

	public void setPart_clas1(String part_clas1) {
		this.part_clas1 = part_clas1;
	}

	public void setPart_clas2(String part_clas2) {
		this.part_clas2 = part_clas2;
	}
	
	public void setRemk(String remk) {
		this.remk = remk;
	}

	public void setPart_clas1_nm(String part_clas1_nm) {
		this.part_clas1_nm = part_clas1_nm;
	}

	public void setPart_clas2_nm(String part_clas2_nm) {
		this.part_clas2_nm = part_clas2_nm;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getClam_actu_cd_nm(){
		return this.clam_actu_cd_nm;
	}

	public String getAplc_pers_nm(){
		return this.aplc_pers_nm;
	}

	public String getVia_dept_nm(){
		return this.via_dept_nm;
	}

	public String getVia_dept_cnfm_yn(){
		return this.via_dept_cnfm_yn;
	}

	public String getMisno_actu(){
		return this.misno_actu;
	}

	public String getMisno_matr(){
		return this.misno_matr;
	}

	public String getClam_clsf(){
		return this.clam_clsf;
	}

	public String getWcl_issu_yn(){
		return this.wcl_issu_yn;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getClam_actu_cd(){
		return this.clam_actu_cd;
	}

	public String getAplc_pers(){
		return this.aplc_pers;
	}

	public String getVia_dept(){
		return this.via_dept;
	}
	
	public String getPart_clas1() {
		return part_clas1;
	}

	public String getPart_clas2() {
		return part_clas2;
	}

	public String getRemk() {
		return remk;
	}

	public String getPart_clas1_nm() {
		return part_clas1_nm;
	}

	public String getPart_clas2_nm() {
		return part_clas2_nm;
	}
	
	public String getTitle() {
		return title;
	}

	


}

/* �ۼ��ð� : Thu Jul 09 13:38:09 KST 2009 */