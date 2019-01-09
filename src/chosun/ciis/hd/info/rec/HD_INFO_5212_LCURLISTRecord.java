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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_5212_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String faml_seq;
	public String faml_rshp_cd;
	public String faml_rshp_nm;
	public String faml_flnm;
	public String faml_prn;
	public String ocpn_cd;
	public String ocpn_nm;
	public String offi_nm;
	public String posi;
	public String schir_cd;
	public String schir_nm;
	public String nmat_yn;
	public String nmat_yn_nm;
	public String dth_dt;
	public String occr_dt;
	public String seq;
	public String proc_stat;
	public String proc_stat_nm;

	public HD_INFO_5212_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFaml_seq(String faml_seq){
		this.faml_seq = faml_seq;
	}

	public void setFaml_rshp_cd(String faml_rshp_cd){
		this.faml_rshp_cd = faml_rshp_cd;
	}

	public void setFaml_rshp_nm(String faml_rshp_nm){
		this.faml_rshp_nm = faml_rshp_nm;
	}

	public void setFaml_flnm(String faml_flnm){
		this.faml_flnm = faml_flnm;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setOcpn_cd(String ocpn_cd){
		this.ocpn_cd = ocpn_cd;
	}

	public void setOcpn_nm(String ocpn_nm){
		this.ocpn_nm = ocpn_nm;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setPosi(String posi){
		this.posi = posi;
	}

	public void setSchir_cd(String schir_cd){
		this.schir_cd = schir_cd;
	}

	public void setSchir_nm(String schir_nm){
		this.schir_nm = schir_nm;
	}

	public void setNmat_yn(String nmat_yn){
		this.nmat_yn = nmat_yn;
	}

	public void setNmat_yn_nm(String nmat_yn_nm){
		this.nmat_yn_nm = nmat_yn_nm;
	}

	public void setDth_dt(String dth_dt){
		this.dth_dt = dth_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFaml_seq(){
		return this.faml_seq;
	}

	public String getFaml_rshp_cd(){
		return this.faml_rshp_cd;
	}

	public String getFaml_rshp_nm(){
		return this.faml_rshp_nm;
	}

	public String getFaml_flnm(){
		return this.faml_flnm;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getOcpn_cd(){
		return this.ocpn_cd;
	}

	public String getOcpn_nm(){
		return this.ocpn_nm;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getPosi(){
		return this.posi;
	}

	public String getSchir_cd(){
		return this.schir_cd;
	}

	public String getSchir_nm(){
		return this.schir_nm;
	}

	public String getNmat_yn(){
		return this.nmat_yn;
	}

	public String getNmat_yn_nm(){
		return this.nmat_yn_nm;
	}

	public String getDth_dt(){
		return this.dth_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}
}

/* 작성시간 : Sat Jul 11 16:56:56 KST 2009 */