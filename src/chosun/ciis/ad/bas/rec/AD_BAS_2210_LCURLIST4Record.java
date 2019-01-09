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


package chosun.ciis.ad.bas.rec;


/**
 * 
 */


public class AD_BAS_2210_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String rept_clsf;
	public String make_dt;
	public String medi_clsf;
	public String advcs_clsf;
	public String rept_no;
	public String dlco_no;
	public String dlco_nm;
	public String titl;

	public AD_BAS_2210_LCURLIST4Record(){}

	public void setRept_clsf(String rept_clsf){
		this.rept_clsf = rept_clsf;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setAdvcs_clsf(String advcs_clsf){
		this.advcs_clsf = advcs_clsf;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public String getRept_clsf(){
		return this.rept_clsf;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getAdvcs_clsf(){
		return this.advcs_clsf;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getTitl(){
		return this.titl;
	}
}

/* 작성시간 : Thu Jul 23 16:17:31 KST 2009 */