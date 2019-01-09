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


public class HD_INFO_1120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String frdt;
	public String todt;
	public String dept_nm;
	public String part_nm;
	public String cur_jobnon_nm;
	public String chrg_job;
	public String dtls_job;
	public String aprv_stat_yn;

	public HD_INFO_1120_LCURLISTRecord(){}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setCur_jobnon_nm(String cur_jobnon_nm){
		this.cur_jobnon_nm = cur_jobnon_nm;
	}

	public void setChrg_job(String chrg_job){
		this.chrg_job = chrg_job;
	}

	public void setDtls_job(String dtls_job){
		this.dtls_job = dtls_job;
	}

	public void setAprv_stat_yn(String aprv_stat_yn){
		this.aprv_stat_yn = aprv_stat_yn;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getCur_jobnon_nm(){
		return this.cur_jobnon_nm;
	}

	public String getChrg_job(){
		return this.chrg_job;
	}

	public String getDtls_job(){
		return this.dtls_job;
	}

	public String getAprv_stat_yn(){
		return this.aprv_stat_yn;
	}
}

/* 작성시간 : Wed Jul 15 21:05:02 KST 2009 */