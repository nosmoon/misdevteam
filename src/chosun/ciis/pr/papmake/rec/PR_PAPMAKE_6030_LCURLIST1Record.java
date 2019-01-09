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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_6030_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String sub_rumn;
	public String prt;
	public String prt_total;
	public String make;
	public String make_total;
	public String yymm;
	public String fac_clsf;
	public String slip_proc_occr_dt;
	public String slip_proc_seq;
	public String tax_stmt_dt;
	public String tax_stmt_seq;
	public String total;
	public String vat_total;

	public PR_PAPMAKE_6030_LCURLIST1Record(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setSub_rumn(String sub_rumn){
		this.sub_rumn = sub_rumn;
	}

	public void setPrt(String prt){
		this.prt = prt;
	}

	public void setPrt_total(String prt_total){
		this.prt_total = prt_total;
	}

	public void setMake(String make){
		this.make = make;
	}

	public void setMake_total(String make_total){
		this.make_total = make_total;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setTax_stmt_dt(String tax_stmt_dt){
		this.tax_stmt_dt = tax_stmt_dt;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setVat_total(String vat_total){
		this.vat_total = vat_total;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSub_rumn(){
		return this.sub_rumn;
	}

	public String getPrt(){
		return this.prt;
	}

	public String getPrt_total(){
		return this.prt_total;
	}

	public String getMake(){
		return this.make;
	}

	public String getMake_total(){
		return this.make_total;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getTax_stmt_dt(){
		return this.tax_stmt_dt;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}

	public String getTotal(){
		return this.total;
	}

	public String getVat_total(){
		return this.vat_total;
	}
}

/* 작성시간 : Sun May 31 18:28:57 KST 2009 */