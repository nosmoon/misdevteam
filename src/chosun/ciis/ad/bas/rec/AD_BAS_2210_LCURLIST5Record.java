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


public class AD_BAS_2210_LCURLIST5Record extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String pubc_dt;
	public String advt_cont;
	public String advt_size;
	public String remk;
	public String pubc_clsf;

	public AD_BAS_2210_LCURLIST5Record(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setAdvt_size(String advt_size){
		this.advt_size = advt_size;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getAdvt_size(){
		return this.advt_size;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}
}

/* 작성시간 : Thu Jul 23 16:17:31 KST 2009 */