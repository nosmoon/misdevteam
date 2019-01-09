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


package chosun.ciis.ad.tax.rec;


/**
 * 
 */


public class AD_TAX_1810_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String tax_stmt_no;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String clamt_stat;
	public String clamt_stat_nm;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;

	public AD_TAX_1810_LCURLIST2Record(){}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setClamt_stat(String clamt_stat){
		this.clamt_stat = clamt_stat;
	}

	public void setClamt_stat_nm(String clamt_stat_nm){
		this.clamt_stat_nm = clamt_stat_nm;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getClamt_stat(){
		return this.clamt_stat;
	}

	public String getClamt_stat_nm(){
		return this.clamt_stat_nm;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Tue Mar 31 18:03:48 KST 2009 */