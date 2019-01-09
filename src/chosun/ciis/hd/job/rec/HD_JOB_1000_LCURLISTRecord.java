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


package chosun.ciis.hd.job.rec;

import java.sql.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.ds.*;

/**
 * 
 */


public class HD_JOB_1000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String frdt;
	public String todt;
	public String part_cd;
	public String part_nm;
	public String chrg_job;
	public String dtls_job;
	public String aprv_stat;
	public String aprv_stat_yn;
	public String seq;
	public String cur_jobnon_cd;
	public String cur_jobnon_nm;

	public HD_JOB_1000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
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

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public void setDtls_job(String dtls_job){
		this.dtls_job = dtls_job;
	}

	public void setAprv_stat(String aprv_stat){
		this.aprv_stat = aprv_stat;
	}

	public void setAprv_stat_yn(String aprv_stat_yn){
		this.aprv_stat_yn = aprv_stat_yn;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCur_jobnon_cd(String cur_jobnon_cd){
		this.cur_jobnon_cd = cur_jobnon_cd;
	}

	public void setCur_jobnon_nm(String cur_jobnon_nm){
		this.cur_jobnon_nm = cur_jobnon_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
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

	public String getChrg_job(){
		return this.chrg_job;
	}

	public String getDtls_job(){
		return this.dtls_job;
	}

	public String getAprv_stat(){
		return this.aprv_stat;
	}

	public String getAprv_stat_yn(){
		return this.aprv_stat_yn;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCur_jobnon_cd(){
		return this.cur_jobnon_cd;
	}

	public String getCur_jobnon_nm(){
		return this.cur_jobnon_nm;
	}
}

/* 작성시간 : Fri Apr 24 17:31:28 KST 2009 */