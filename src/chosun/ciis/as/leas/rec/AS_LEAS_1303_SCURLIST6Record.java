/***************************************************************************************************
* 파일명 : .java
* 기능 :  임대 입출금 관리 - 상세조회
* 작성일자 : 2010-06-07
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 임대입출금 관리 - 상세조회
 */


public class AS_LEAS_1303_SCURLIST6Record extends java.lang.Object implements java.io.Serializable{

	public String cntr_no;
	public String clam_yymm;
	public String clam_seq;
	public String leas_clam_amt;
	public String mang_clam_amt;
	public String vat_clam_amt;
	public String clam_tot_amt;
	public String leas_rcpm_amt;
	public String mang_rcpm_amt;
	public String vat_rcpm_amt;
	public String rcpm_tot_amt;

	public AS_LEAS_1303_SCURLIST6Record(){}

	public void setCntr_no(String cntr_no){
		this.cntr_no = cntr_no;
	}

	public void setClam_yymm(String clam_yymm){
		this.clam_yymm = clam_yymm;
	}

	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}

	public void setLeas_clam_amt(String leas_clam_amt){
		this.leas_clam_amt = leas_clam_amt;
	}

	public void setMang_clam_amt(String mang_clam_amt){
		this.mang_clam_amt = mang_clam_amt;
	}

	public void setVat_clam_amt(String vat_clam_amt){
		this.vat_clam_amt = vat_clam_amt;
	}

	public void setClam_tot_amt(String clam_tot_amt){
		this.clam_tot_amt = clam_tot_amt;
	}

	public void setLeas_rcpm_amt(String leas_rcpm_amt){
		this.leas_rcpm_amt = leas_rcpm_amt;
	}

	public void setMang_rcpm_amt(String mang_rcpm_amt){
		this.mang_rcpm_amt = mang_rcpm_amt;
	}

	public void setVat_rcpm_amt(String vat_rcpm_amt){
		this.vat_rcpm_amt = vat_rcpm_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
	}

	public String getCntr_no(){
		return this.cntr_no;
	}

	public String getClam_yymm(){
		return this.clam_yymm;
	}

	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getLeas_clam_amt(){
		return this.leas_clam_amt;
	}

	public String getMang_clam_amt(){
		return this.mang_clam_amt;
	}

	public String getVat_clam_amt(){
		return this.vat_clam_amt;
	}

	public String getClam_tot_amt(){
		return this.clam_tot_amt;
	}

	public String getLeas_rcpm_amt(){
		return this.leas_rcpm_amt;
	}

	public String getMang_rcpm_amt(){
		return this.mang_rcpm_amt;
	}

	public String getVat_rcpm_amt(){
		return this.vat_rcpm_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}
}

/* 작성시간 : Mon Jun 14 19:56:40 KST 2010 */