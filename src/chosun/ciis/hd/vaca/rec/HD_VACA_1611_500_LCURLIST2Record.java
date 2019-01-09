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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_1611_500_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String proc_stat;
	public String proc_stat_nm;
	public String delchk;
	public String vaca_clsf;
	public String vaca_clsf_nm;
	public String vaca_dtls_clsf;
	public String vaca_dtls_clsf_nm;
	public String alvc_use_dt;
	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;
	public String remk;
	public String occr_dt;
	public String seq;

	public HD_VACA_1611_500_LCURLIST2Record(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setDelchk(String delchk){
		this.delchk = delchk;
	}

	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public void setVaca_clsf_nm(String vaca_clsf_nm){
		this.vaca_clsf_nm = vaca_clsf_nm;
	}

	public void setVaca_dtls_clsf(String vaca_dtls_clsf){
		this.vaca_dtls_clsf = vaca_dtls_clsf;
	}

	public void setVaca_dtls_clsf_nm(String vaca_dtls_clsf_nm){
		this.vaca_dtls_clsf_nm = vaca_dtls_clsf_nm;
	}

	public void setAlvc_use_dt(String alvc_use_dt){
		this.alvc_use_dt = alvc_use_dt;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getDelchk(){
		return this.delchk;
	}

	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

	public String getVaca_clsf_nm(){
		return this.vaca_clsf_nm;
	}

	public String getVaca_dtls_clsf(){
		return this.vaca_dtls_clsf;
	}

	public String getVaca_dtls_clsf_nm(){
		return this.vaca_dtls_clsf_nm;
	}

	public String getAlvc_use_dt(){
		return this.alvc_use_dt;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getVaca_dds(){
		return this.vaca_dds;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Mar 13 19:54:35 KST 2013 */