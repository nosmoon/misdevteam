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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3600_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String offi_nm;
	public String emp_no;
	public String nm_korn;
	public String lon_dduc_seq;
	public String prcp_dduc_amt;
	public String int_dduc_amt;
	public String lon_dt;
	public String lon_prcp;

	public HD_SALY_3600_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setOffi_nm(String offi_nm){
		this.offi_nm = offi_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setLon_dduc_seq(String lon_dduc_seq){
		this.lon_dduc_seq = lon_dduc_seq;
	}

	public void setPrcp_dduc_amt(String prcp_dduc_amt){
		this.prcp_dduc_amt = prcp_dduc_amt;
	}

	public void setInt_dduc_amt(String int_dduc_amt){
		this.int_dduc_amt = int_dduc_amt;
	}

	public void setLon_dt(String lon_dt){
		this.lon_dt = lon_dt;
	}

	public void setLon_prcp(String lon_prcp){
		this.lon_prcp = lon_prcp;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getOffi_nm(){
		return this.offi_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getLon_dduc_seq(){
		return this.lon_dduc_seq;
	}

	public String getPrcp_dduc_amt(){
		return this.prcp_dduc_amt;
	}

	public String getInt_dduc_amt(){
		return this.int_dduc_amt;
	}

	public String getLon_dt(){
		return this.lon_dt;
	}

	public String getLon_prcp(){
		return this.lon_prcp;
	}
}

/* 작성시간 : Mon Oct 26 11:32:04 KST 2009 */