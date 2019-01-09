/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.job.rec;

import java.sql.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.ds.*;

/**
 * 
 */


public class HD_JOB_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String emp_no;
	public String dept_nm;
	public String dty_nm;
	public String posi_nm;
	public String frdt;
	public String todt;
	public String part_cd;
	public String part_nm;
	public String cmpy_posk_cd;
	public String cmpy_posk_nm;
	public String chrg_job;
	public String dtls_job;
	public String aprv_stat;
	public String aprv_stat_nm;
	public String occr_dt;
	public String seq;
	public String dtls_cd1_1;
	public String dtls_cd1_2;
	public String dtls_cd2_1;
	public String dtls_cd2_2;
	public String dtls_nm1;
	public String dtls_nm2;

	public HD_JOB_1101_LCURLISTRecord(){}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setCmpy_posk_cd(String cmpy_posk_cd){
		this.cmpy_posk_cd = cmpy_posk_cd;
	}

	public void setCmpy_posk_nm(String cmpy_posk_nm){
		this.cmpy_posk_nm = cmpy_posk_nm;
	}

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public void setDtls_job(String dtls_job){
		this.dtls_job = dtls_job;
	}

	public void setAprv_stat(String aprv_stat){
		this.aprv_stat = aprv_stat;
	}

	public void setAprv_stat_nm(String aprv_stat_nm){
		this.aprv_stat_nm = aprv_stat_nm;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDtls_cd1_1(String dtls_cd1_1){
		this.dtls_cd1_1 = dtls_cd1_1;
	}

	public void setDtls_cd1_2(String dtls_cd1_2){
		this.dtls_cd1_2 = dtls_cd1_2;
	}

	public void setDtls_cd2_1(String dtls_cd2_1){
		this.dtls_cd2_1 = dtls_cd2_1;
	}

	public void setDtls_cd2_2(String dtls_cd2_2){
		this.dtls_cd2_2 = dtls_cd2_2;
	}

	public void setDtls_nm1(String dtls_nm1){
		this.dtls_nm1 = dtls_nm1;
	}

	public void setDtls_nm2(String dtls_nm2){
		this.dtls_nm2 = dtls_nm2;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getCmpy_posk_cd(){
		return this.cmpy_posk_cd;
	}

	public String getCmpy_posk_nm(){
		return this.cmpy_posk_nm;
	}

	public String getChrg_job(){
		return this.chrg_job;
	}

	public String getDtls_job(){
		return this.dtls_job;
	}

	public String getAprv_stat(){
		return this.aprv_stat;
	}

	public String getAprv_stat_nm(){
		return this.aprv_stat_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDtls_cd1_1(){
		return this.dtls_cd1_1;
	}

	public String getDtls_cd1_2(){
		return this.dtls_cd1_2;
	}

	public String getDtls_cd2_1(){
		return this.dtls_cd2_1;
	}

	public String getDtls_cd2_2(){
		return this.dtls_cd2_2;
	}

	public String getDtls_nm1(){
		return this.dtls_nm1;
	}

	public String getDtls_nm2(){
		return this.dtls_nm2;
	}
}

/* 작성시간 : Mon Oct 16 11:38:01 KST 2017 */